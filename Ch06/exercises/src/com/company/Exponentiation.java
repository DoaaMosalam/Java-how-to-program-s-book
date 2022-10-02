package com.company;

import java.util.Scanner;

public class Exponentiation {

    public static void calculator() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a base number: ");

        int base = input.nextInt();

        System.out.print("Enter a exponent number(negative number) ");
        int exponent = input.nextInt();
        while (exponent >= 0) {

            System.out.println("Base number: " + base + " Exponent number: " + exponent
                    + " Integer number: " + integerPower(base, exponent));

            System.out.print("Enter a base number: ");
             base = input.nextInt();

            System.out.print("Enter a exponent number(negative number) ");
            exponent = input.nextInt();
        }
    }


    public static int integerPower(int base,int exponent){
       int num = 1;
       for (int i =1 ;i <= exponent;i++)

           Math.pow(base,exponent);
       return (int) Math.pow(base,exponent);
    //anther solution without used Class Math.pow.
        //           num *= base;
           //return num;

    }
}
