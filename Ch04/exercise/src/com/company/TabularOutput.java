package com.company;

import java.util.Scanner;

public class TabularOutput {

    public void tabular(){
        int tenNumber;
        int hNumber;
        int aNumber;

        System.out.print("N\t 10*N\t 100*N\t 1000*N");

//        int number = 1;
//        while (number<=5){
//
//            System.out.printf( "%d\t%d\t%d\t%d\n",
//
//                    number, ( 10 * number ), ( 100 * number ), ( 1000 * number ) );
//             number++;
//        }


        for (int number = 0;number<=5;number++){

            tenNumber = number * 10;
            hNumber = tenNumber * 10;
            aNumber = hNumber * 10;
            System.out.println(number+"\t" +tenNumber+"\t" + hNumber+"\t" + aNumber);
        }



    }
}
