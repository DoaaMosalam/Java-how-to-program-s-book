package com.company;

import java.util.Scanner;

public class Min {
    public static double minimum3(double num1,double num2,double num3){
        return Math.min(Math.min(num1,num2),num3);
    }

    public static void display(){
        Scanner input = new Scanner(System.in);
        System.out.println( "Type the end-of-file indicator to terminate, " +
                "On UNIX/Linux/Mac OS X type <ctrl> d then pr," +
                "            On Windows type <ctrl> z then press Enter" );
        System.out.print( "Or enter first number: " );
        while (input.hasNext()) {

            double one = input.nextDouble();

            System.out.print(" enter second number: " );
            double two = input.nextDouble();
            System.out.print(" enter second number: ");
            double three = input.nextDouble();

            System.out.println("Minimum is: " + minimum3(one,two,three));
            System.out.print( " enter first number: " );
        }

    }
}
