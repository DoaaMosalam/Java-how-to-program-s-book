package com.company;

public class Interest {
    public static void interest(){
        /**
         * a = p (1 + r)n
         * where
         * p is the original amount invested (i.e., the principal)
         * r is the annual interest rate (e.g., use 0.05 for 5%)
         * n is the number of years
         * a is the amount on deposit at the end of the nth year
         */
        double amount;
        double principal=1000.0;
        double rate =0.05;
        System.out.printf( "  %s         %s \n", "Year", "Amount on deposit" );
        for (int year =1;year<=10;year++){
            amount = principal*Math.pow(1.0 + rate,year);
            System.out.printf( "%4d%,20.2f\n", year, amount );


        }
    }




}
