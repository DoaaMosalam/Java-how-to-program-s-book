package exercise.H;

import java.util.Random;

public class EightQueens {

    public static void print(char [][] board) {
        int row, col;
        for (col = 0; col < board.length; col++) {
            System.out.printf("\t%d", col);
        }
        System.out.println();
        for (row = 0; row < board.length; row++) {
            System.out.printf("%d", row);
            for (col = 0; col < board[row].length; col++) {
                System.out.printf("\t%s|", board[row][col]+" ");
            }
            System.out.println();
        }
    }

    /**
     * Random char Q in 2D array in same Row and column
     * @return
     */
    public static void getNewBoard() {
        char[][] board = new char[8][8];
        int[] queen = new int[8];

        for (int i = 0; i < queen.length; i++) {
            int min = 0;
            int max = 8;
            int random1 = (int) (min + (Math.random() * (max - min)));
            int minQ = 0;
            int maxQ = 8;
            int random2 = (int) (minQ + (Math.random() * (maxQ - minQ)));
            for (int j = 0; j < queen.length; j++) {
                board[random1][random2] = 'Q';
            }
        }
        for (int i = 0; i < board.length; i++) {
            char[] sub_array = board[i];
            for (int j = 0; j < sub_array.length; j++) {
                System.out.printf("\t%s|",sub_array[j]+" ");
               // System.out.print(sub_array[j] + " ");
            }
            System.out.println();

        }
    }
 //==============================================================================================
 static final char Q ='Q';
  static final int N = 8;

    /* A utility function to print solution */
    static void printSolution(char[][] board)
    {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length ; j++)
                System.out.print(" " + board[i][j]
                        + " ");
            System.out.println();
        }
    }

    /* A utility function to check if a queen can
       be placed on board[row][col]. Note that this
       function is called when "col" queens are already
       placeed in columns from 0 to col -1. So we need
       to check only left side for attacking queens */
   static boolean isSafe(char[][] board, int row, int col)
    {
        int i, j;

        /* Check this row on left side */
        for (i = 0; i < col; i++)
            if (board[row][i] == 1)
                return false;

        /* Check upper diagonal on left side */
        for (i = row, j = col; i >= 0 && j >= 0; i--, j--)
            if (board[i][j] == 1)
                return false;

        /* Check lower diagonal on left side */
        for (i = row, j = col; j >= 0 && i < N; i++, j--)
            if (board[i][j] == 1)
                return false;

        return true;
    }

    /* A recursive utility function to solve N
       Queen problem */
   static boolean solveNQUtil(char[][] board, int col)
    {
        /* base case: If all queens are placed
           then return true */
        if (col >= N)
            return true;

        /* Consider this column and try placing
           this queen in all rows one by one */
        for (int i = 0; i < N; i++) {
            /* Check if the queen can be placed on
               board[i][col] */
            if (isSafe(board, i, col)) {
                /* Place this queen in board[i][col] */
                board[i][col] = 1;

                /* recur to place rest of the queens */
                if (solveNQUtil(board, col + 1))
                    return true;

                /* If placing queen in board[i][col]
                   doesn't lead to a solution then
                   remove queen from board[i][col] */
                board[i][col] = 0; // BACKTRACK
            }
        }

        /* If the queen can not be placed in any row in
           this colum col, then return false */
        return false;
    }

    /* This function solves the N Queen problem using
       Backtracking.  It mainly uses solveNQUtil () to
       solve the problem. It returns false if queens
       cannot be placed, otherwise, return true and
       prints placement of queens in the form of 1s.
       Please note that there may be more than one
       solutions, this function prints one of the
       feasible solutions.*/
    static boolean solveNQ()
    {
        char[][] board = new char[8][8];
//                { { 0, 0, 0, 0 },
//                { 0, 0, 0, 0 },
//                { 0, 0, 0, 0 },
//                { 0, 0, 0, 0 } };

        if (!solveNQUtil(board, 0)) {
            System.out.print("Solution does not exist");
            return false;
        }

        printSolution(board);
        return true;
    }

    // driver program to test above function

    public static void startSimulation() {
        char[][] queens = new char[8][8];
//        print(queens);
//        getNewBoard();
//         solveNQ();

    }


}
