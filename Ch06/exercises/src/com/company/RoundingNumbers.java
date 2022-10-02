package com.company;

import java.util.Scanner;

public class RoundingNumbers {

    public static void roundingNum(){

        Scanner input = new Scanner(System.in);
        while (input.hasNext()) {
            System.out.println("Enter your Decimal number: ");


            double num = input.nextDouble();

            System.out.printf("Number: %f\tMath.floor( x + .5 ): %f\n",
                    num, Math.floor(num + 0.5));
        }
    }

    public static void roundingNum2(){

        Scanner input = new Scanner(System.in);

        System.out.println("Enter Your decimal numbers: ");

        double y = input.nextDouble();
        System.out.println("Number is : " + y);

        System.out.println( " Math.floor(x * 10 + 0.5) / 10: \t" + Math.floor( y * 10 + 0.5 ) / 10 );

        System.out.println( " Math.floor(x * 100+ 0.5) / 100: \t" + Math.floor( y * 100 + 0.5 ) / 100 );

        System.out.println( " Math.floor(x * 1000 + 0.5) / 1000: \t" + Math.floor( y * 1000 + 0.5 ) / 1000 );

    }
}
