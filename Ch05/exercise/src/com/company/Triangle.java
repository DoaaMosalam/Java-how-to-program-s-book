package com.company;

public class Triangle {


    public void drawingTraingle() {
/** Draw First Traingle;
 * (a)
 * *
 * **
 * ***
 * ****
 * *****
 * ******
 * *******
 * ********
 * *********
 * **********
 */
        int row;
        int column;
        int space;

        for (row = 1; row <= 10; row++) {
            for (column = 1; column <= row; column++)
                System.out.print("*");
            System.out.println();
        }
        System.out.println('\t');
/** Drawing Second Triangle.
 * (b)
 * **********
 * *********
 * ********
 * *******
 * ******
 * *****
 * ****
 * ***
 * **
 * *
 */
        for (row = 10; row >= 1; row--) {
            for (column = 1; column <= row; column++)
                System.out.print("*");
            System.out.println('\t');
        }
/** Drawing Third Triangle.
 * (c)
 *  *********
 *  *********
 *  ********
 *  *******
 *  ******
 *  *****
 *  ****
 *  ***
 *  **
 *  *
 */
        for (row = 10; row >= 1; row--) {
            for (space = 10; space > row; space--)
                System.out.print(" ");
            for (column = 1; column <= row; column++)
                System.out.print("*");

            System.out.println();
        } // end for loop

        System.out.println('\t');
        /**
         * Drawing fourth triangle.
         * (d)
         * *
         * **
         * ***
         * ****
         * *****
         * ******
         * *******
         * ********
         * *********
         * **********
         */
        for (row = 10; row >= 1; row--) {

            for (space = 1; space < row; space++)
                System.out.print(" ");

            for (column = 10; column >= row; column--)
                System.out.print("*");

            System.out.println();
        }
    }

    public void ModifiedTriangle(){
        int row;
        int column;
        int space;
// triangle one
        for (row = 1; row <= 10; row++) {
            for (column = 1; column <= row; column++)
                System.out.print("*");
                for (space = 1; space <= 10 - row; space++)
                    System.out.print(" ");

            System.out.print('\t');

// triangle two
            for (column=10;column>=row;column--)
                System.out.print("*");
                for (space=1;space<row;space++)
                    System.out.print(" ");
            System.out.print("\t");
// triangle three
            for (space=1;space<row;space++)
                System.out.print(" ");
            for (column=10;column>=row;column--)
                System.out.print("*");
            System.out.print("\t");
// triangle four
            for (space=10;space>row;space--)
                System.out.print(" ");
            for (column=1;column<=row;column++)
                System.out.print("*");
            System.out.println();

        }

    }
}
