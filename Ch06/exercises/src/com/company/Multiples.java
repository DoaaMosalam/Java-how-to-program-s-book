package com.company;

import java.util.Scanner;

public class Multiples {
    public static  void testMultiple(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number 1: ");
        int num1 = input.nextInt();

        while (num1 !=0) {
            System.out.println("Enter number 2: ");
            int num2 = input.nextInt();


            if (multiple(num1, num2))
                System.out.println("Number one: " + num1 + "Number two: " + num2
                        + "number 1 multipe number 2.");
            else
                System.out.println("Number one: " + num1 + "Number two: " + num2
                        + " Number 1 is not multiple number two");

            System.out.println("Enter number 1: ");
            num1 = input.nextInt();

        }
    }

    public static boolean multiple(int number1,int number2 ){

        boolean multiple = number2 % number1 == 0;
        return multiple;
    }

    public static void multiples(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int first = input.nextInt();

        while (first != -1){
            int second = input.nextInt();
            System.out.println("Enter second number: ");
            if (second % first ==0)
                System.out.println("Number one: " + first + "Number two: " + second
                        + "number 1 multipe number 2.");

            else
                System.out.println("Number one: " + first + "Number two: " + second
                        + "number 1 is not multipe number 2.");
            System.out.print("Enter first number: ");
             first = input.nextInt();
        }

    }
}
