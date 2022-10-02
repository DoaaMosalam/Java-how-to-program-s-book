package com.company;

import java.util.Scanner;

public class Factorial {
    public void calculateFactorial(){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a positive number: ");
        int number = input.nextInt();

        System.out.println("Positive number is: " + number);

        int factorial = 1;
        while (number > 0){
            factorial *= number;
            number--;

        }
        System.out.println(factorial);
    }

    public void approximate(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();

//        System.out.println(number);

        int accuracy = 1;
        double e = 1.0;
        int factorial =1;
        while (accuracy < number){
            factorial *= accuracy;
            e += 1.0 / factorial;
            accuracy++;

        }
        System.out.println("E is: " + e);

    }

    public void EtoX(){
        Scanner input = new Scanner(System.in);

        System.out.print( "Enter exponent: " );
        int x = input.nextInt();


        int accuracy = 1;
        double e = 1.0;
        double exponent = 1.0;

        System.out.print("Enter desired accuracy of e: ");
        int number = input.nextInt();



        int factorial =1;
        while (accuracy < number ){
            exponent *=x;
            factorial *= accuracy;
            e += exponent / factorial;
            accuracy++;

        }
        System.out.printf( "e to the %d is ", x );
        System.out.println( e );
    }
}
