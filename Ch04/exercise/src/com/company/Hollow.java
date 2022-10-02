package com.company;

import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class Hollow {
    public void HollowTest() {
        Scanner sc = new Scanner(System.in);
        int row ;
        int column;
        int side = 0;

       while (side == 0 || side > 20){
           System.out.println("Enter a number between 1 and 20: ");
           int input = sc.nextInt();
           if (input > 0 && input <= 20)
               side = input;
       }

        for(row=0; row<side; row++){
            // first and last rows
            if(row == 0 || row == side-1){
                for(column=0; column<side; column++){
                    System.out.print("*");
                }
            }else{
                System.out.print("");
                // hollow portion (-2 as 1 * on each side)
                for(int j=0; j<side-2; j++){
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
       }



    }


}






















//        String STAR = "*";
//        String star1 = "**********";
//        int MAX = 10;
//        for (int row = 0; row <= MAX; row += 1 ) {
//            for (int col = 0; col <= MAX; col += 10) {
//                if (row == 0 && col == 0)
//                    System.out.println(star1);
//                if (row >= 1 && row <= 4)
//                    System.out.println(STAR + "        " + STAR);
//                if (row == 10 && col == 10)
//                    System.out.println(star1);
//            }
//        }


