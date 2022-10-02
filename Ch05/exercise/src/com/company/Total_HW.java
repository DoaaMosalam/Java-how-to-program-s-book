package com.company;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Total_HW {


    public void ProductOdd() {
        int product = 1;
        for (int num = 1; num <= 15; num++) {
            if (num % 2 == 1)
                product *= num;

            System.out.println(num);

        }
        System.out.println("Product Of Odd Integers: " + product);
        System.out.println("-----------------------------------------------");
    }


    public void factorials() {
        long n = 1;
        System.out.println("n\n n! \n");
        for (int num = 1; n <= 5; num++) {
            System.out.print(num);
            long result = n * num;
            System.out.println("\t" + result);
        }
        System.out.println("-----------------------------------------------");

    }

    public void interest() {
        double amount;
        double principal = 1000.0;

        for (int interestRate = 5; interestRate <= 10; interestRate++) {
            double rate = interestRate / 100.0;

            System.out.printf("\nInterest Rate: %d%%\n", interestRate);
            System.out.println("Year\tAmount on deposit");

            for (int year = 1; year <= 10; year++) {
                amount = principal * (1.0 + rate);
                for (int power = 2; power <= year; power++)


                    amount *= (1.0 + rate);
                System.out.printf("%d\t%.2f\n", year, amount);

            }
        }
        System.out.println("-----------------------------------------------");

    }

    public void drawingTraingle() {
        int row, column, space;
        System.out.println("(a)");
        for (row = 1; row <= 10; row++) {
            for (column = 1; column < row; column++)
                System.out.print("*");
            System.out.println();
        }
        System.out.println("(b)");
        System.out.println("\t");
        for (row = 10; row >= 1; row--) {
            for (column = 1; column < row; column++)
                System.out.print("*");
            System.out.println();
        }
        System.out.println("(c)");
        for (row = 1; row <= 10; row++) {
            for (space = 10; space > row; space--)
                System.out.print(" ");
            for (column = 1; column < row; column++)
                System.out.print("*");
            System.out.println();
        }
        System.out.println("(d)");
        for (row = 10; row >= 1; row--) {
            for (space = 1; space < row; space++)
                System.out.print(" ");
            for (column = 10; column >= row; column--)
                System.out.print("*");
            System.out.println();
        }
        System.out.println("---------------------------------------");

    }
}
