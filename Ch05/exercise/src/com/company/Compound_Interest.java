package com.company;

public class Compound_Interest {
    public void interest(){
        double amount;
        double principal =1000.0;

        for (int interestRate = 5; interestRate<=10;interestRate++){
            double rate =  interestRate / 100.0;

            System.out.printf( "\nInterest Rate: %d%%\n", interestRate );
             System.out.println( "Year\tAmount on deposit" );


            for (int year = 1;year<=10;year++) {

                amount = principal * (1.0 + rate);
                for (int power = 2;power<=year;power++)


                    amount *= (1.0 + rate);
                 System.out.printf( "%d\t%.2f\n", year, amount );



            }

        }
    }
}
