package com.company;
import java.lang.*;
import java.util.*;

public class Diamond {
    /**
     *
     ***
     *****
     *******
     *********
     *******
     *****
     ***
     *
     */
    public void diamond(){
        int row,column,space;

        for (row=1;row<=5;row++){
            for (space=5;space>row;space--)
                System.out.print( " " );
            for (column=1;column<=(2 * row)-1;column++)
                System.out.print("*");
            System.out.println();
        }

        for (row = 4; row>=1; row--){
            for (space=5;space>row;space--)
                System.out.print( " " );
            for (column =1;column<=(2 * row) -1;column++)
                System.out.print("*");
            System.out.println();
        }
    }
// This is Exercise number 5.25 in book.

    public void ModifiedDiamond(){
        int row,column,space;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of rows (odd number 1 to 19): ");
        int num = input.nextInt();
        while ((num>19)||(num<0)||(num %2 == 0)){ }

        for (row =1;row <(num/2)+1;row++){
            for (space=num/2;space>=row;space--)
                System.out.print( " " );
            for (column=1;column<=(2*row)-1;column++)
                System.out.print("*");
            System.out.println();

        }

        for (row=4;row>=1;row--){
            for (space = num/2;space>=row;space--)
                System.out.print( " " );
            for (column=1;column<=(2*row)-1;column++)
                System.out.print("*");
            System.out.println();
        }





//        Scanner input = new Scanner( System.in );
//        int row; // current row
//        int stars; // number of stars
//        int spaces; // number of spaces
//        int numRows; // number of rows
//        do
//        {
//            System.out.print(
//                    "Enter number of rows (odd number 1 to 19): " );
//            numRows = input.nextInt();
//        } while ( ( numRows > 19 ) || ( numRows < 0 ) ||
//                ( numRows % 2 == 0 ) );
//       //  top half
//        for ( row = 1; row < ( numRows / 2 ) + 1; row++ )
//        {
//            for ( spaces = numRows / 2; spaces >= row; spaces-- )
//                System.out.print( " " );
//            for ( stars = 1; stars <= ( 2 * row ) - 1; stars++ )
//                System.out.print( "*" );
//            System.out.println();
//        } // end for loop
//// bottom half, note that the first clause of the for
//// loop isn't needed; row is already defined
//        for ( ; row >= 1; row-- )
//        {
//            for ( spaces = numRows / 2; spaces >= row; spaces-- )
//                System.out.print( " " );
//            for ( stars = 1; stars <= ( 2 * row ) - 1; stars++ )
//                System.out.print( "*" );
//            System.out.println();
//        } // end for loop

    }
}
