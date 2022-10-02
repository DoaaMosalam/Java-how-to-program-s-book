package com.company;

import java.util.Scanner;

public class SeparatingDigit {
    // displays the individual digits of a number
    public void Digits()
    {
        Scanner input = new Scanner( System.in );
        System.out.print( "Enter the integer (0 to exit): " );
        int number = input.nextInt();
        while ( number != 0 )
        {
            if ( number <= 99999 && number >= 1 )
                displayDigits( number );
            else
                System.out.println( "number must be between 1 and 99999" );
            System.out.print( "Enter the integer (0 to exit): " );
            number = input.nextInt();
        } // end while loop
    } // end method separateDigits

    // part a
    public static int  quotient(int a , int b){


        int divided = a /b;

        return divided;
    }

    //part b
    public static int  remain(int a , int b){



        int remain = a % b;

        return remain;
    }

    //part c.

    public static void displayDigits(int number)
    {

int divisor =1 ,digit;
String result =" ";
        // Loop for highest divisor
        for ( int i = 1; i < number; i *= 10 )
            divisor = i;
        while ( divisor >= 1 )
        {
            digit = quotient( number, divisor );
            result += digit + " ";
            number = remain( number, divisor );
            divisor = quotient( divisor, 10 );
        } // end while loop
        System.out.println( result );
    } // end method displayDigits


}
