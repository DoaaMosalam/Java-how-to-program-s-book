package exercise.H;

import java.util.*;

public class KnightsTour_Brute_Force_Approaches {
    private static final int[][] board = new int[8][8];
    private static  int[] horizontal = {2, 1, -1, -2, -2, -1, 1, 2}; //move column
    private static  int[] vertical = {-1, -2, -2, -1, 1, 2, 2, 1}; //move row
    private static int currentRow;
    private static int currentColumn;
    private static int moveNumber = 0;
    private static final Random randomKing = new Random();
    private static int count;
    public static int track;
   public static int[] valid = {1,-1,2,-2};

    public static int[][]printSolution(int[][]bo){
        int row,column;
        for (column=0;column<bo.length;column++){
            System.out.printf("\t%d",column);
        }
        System.out.println("\n");
        for (row = 0;  row<bo.length ;row ++) {
            System.out.printf("%d\t",row);
            for (column=0;column<bo[row].length;column++){
                System.out.printf("\t%d|",bo[row][column]);
            }
        }
        return bo;
    }
// This method count move knight full complete in this tour
    public static void moveKnight(int[][]boa){
        int row,col;
        count=1;
        for (col=0;col<boa.length;col++){
            System.out.printf("%d\t",col);
        }
//        currentRow=randomKing.nextInt(vertical.length);
//        currentColumn=randomKing.nextInt(horizontal.length);
//        boa[currentRow][currentColumn]=randomKing.nextInt(8);
        System.out.println("\n");
        for (row=0;row<boa.length;row++){
            System.out.printf("%d -",row);
            for (col=0;col<boa[row].length;col++){
                System.out.printf("\t%d",boa[row][col]=randomKing.nextInt(8));
            }
            System.out.println();
        }
        System.out.printf("Number of moves: %d\n", totalMoves());

    }

    public static boolean isSafe(int row,int column){
        return (row>=0&&row<8&&column>=0&&column<8&&board[row][column]==-1);
    }

    public static boolean solveKTUtil(int row, int column, int moveI, int[] v_Move, int[] h_Move) {
       int next_Row,next_Column;
       if (moveI==8*8){
           return true;
       }
        for (int i = 0; i <8 ; i++) {
            next_Row=row+v_Move[i];
            next_Column=column+h_Move[i];
            if (isSafe(next_Row,next_Column)){
                board[next_Row][next_Column]=moveI;
                if (solveKTUtil(next_Row,next_Column,moveI+1,v_Move,h_Move)){
                    return true;
                }else{
                    board[next_Row][next_Column]=-1;
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
            System.out.println("Knight tour is complete.");
            moveKnight(board);
            return true;
        }
    }

    public static int counter(){
        return count=-1;
    }

    public static int totalMoves(){
        int xPost,yPost,total = 0;

        xPost=randomKing.nextInt(8);
        yPost=randomKing.nextInt(8);
        for (int i = 0; i <xPost ; i++) {
            for (int j = 0; j <yPost ; j++) {
                total+=board[i][j];
            }
        }
        return total;
    }

    public static void tour()
    {

    }

    public static void solution(){
       // moveKnight(board);
      //  System.out.println("=============================");
        System.out.println(solveKnightTour());

    }
}
