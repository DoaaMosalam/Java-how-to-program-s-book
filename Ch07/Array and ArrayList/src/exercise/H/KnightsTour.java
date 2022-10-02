package exercise.H;

import java.util.Arrays;
import java.util.Random;

public class KnightsTour {
    // part <B>.
    private static final int[][] board = new int[8][8];
    private static final int[] horizontal = {2, 1, -1, -2, -2, -1, 1, 2};
    private static final int[] vertical = {-1, -2, -2, -1, 1, 2, 2, 1};
    private static int currentRow;
    private static int currentColumn;
    private static int moveNumber = 0;
    private static final Random randomKing = new Random();

    // This method display contains 2D Array init=0 Column and Row.
    public static int[][] printArray(int[][] b) {
        int row;
        int col;
        //This loop display column in array.
        for (col = 0; col < b.length; col++) {
            System.out.printf("\t%d", col);
        }
        System.out.println("\n");
        //This loop display contains array.
        for (row = 0; row < b.length; row++) {
            System.out.print(row);
            for (col = 0; col < b[row].length; col++) {
                System.out.printf("\t%d|", b[row][col]);

            }
            System.out.println();
        }
        return b;
    }

    //this method random number move king K
    public static void kingTour(int[][] boa) {
        // row Vertical |
        // column horizontal ___
        int row, col;
        for (col = 0; col < boa.length; col++) {
            System.out.printf("\t%d", col);
        }
        System.out.println("\n");
        currentRow = randomKing.nextInt(vertical.length);
        currentColumn = randomKing.nextInt(horizontal.length);
        boa = new int[currentRow][currentColumn];
        for (row = 0; row < boa.length; row++) {
            for (col = 0; col < boa[row].length; col++) {
                System.out.printf("\t%d|", boa[row][col] = randomKing.nextInt(8));
           }
            System.out.println();
        }
    }

    public static boolean isSafe(int row, int column) {
        /**
         * Test each potential move to see if the knight has already visited that square. Test every
         * potential move to ensure that the knight does not land off the chessboard.
         */
        return row >= 0 && row < 8 && column >= 0 && column < 8 && board[row][column] == -1;
    }

    public static boolean solveKTUtil(int row, int column, int moveI, int[] v_Move, int[] h_Move) {
        int next_Row, next_Column;
        if (moveI == 8 * 8) {
            return true;
        }
        for (int i = 0; i < 8; i++) {
            next_Row = row + v_Move[i];
            next_Column = column + h_Move[i];
            if (isSafe(next_Row, next_Column)) {
                board[next_Row][next_Column] = moveI;
                if (solveKTUtil(next_Row, next_Column, moveI + 1, v_Move, h_Move)) {
                    return true;
                } else {
                    board[next_Row][next_Column] = -1;
                }

            }
        }
        return false;
    }


    public static boolean solveKnightTour()
    {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j <8 ; j++) {
                board[i][j]=-1;
            }
        }
        board[0][0]=0;
        if (!solveKTUtil(0,0,1,vertical,horizontal)){
            System.out.println("the solution does not exist");
            return false;
        }else {
            printArray(board);
          //  kingTour(board);
            return true;
        }
    }
   public static void tour(){
        int[][]board = new int[8][8];
        kingTour(board);

       System.out.println("the solution is");
    //   System.out.println(solveKnightTour());

    }
}
