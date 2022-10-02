package com.company;

import java.util.Scanner;

public class Palindromes {
    public void palindromesTest() {

        Scanner input = new Scanner(System.in);
        int numberOriginal=0;
        while (numberOriginal < 10000){
            System.out.print("Enter Your 5 digit number: ");
            numberOriginal = input.nextInt();
            if (numberOriginal<10000)
                System.err.println("Invalid Number,Try again");

            int reverseNumber = 0;
            int number = numberOriginal;
            while (number>0){
                int rem = number % 10;
                number /=10;
                reverseNumber = reverseNumber *10 + rem;
            }
            if (numberOriginal == reverseNumber)
            System.out.printf("%n%d is palindrome", numberOriginal);
        else
            System.out.printf("%n%d is not palindrome", numberOriginal);


        }
    }
}












//    if (numberOriginal == reverseNumber)
//            System.out.printf("%n%d is palindrome", numberOriginal);
//        else
//            System.out.printf("%n%d is not palindrome", numberOriginal);
//




//        Scanner input = new Scanner( System.in );
//
//         int number; // user input number
//         int digit1; // first digit
//         int digit2; // second digit
//         int digit4; // fourth digit
//        int digit5; // fifth digit
//        int digits; // number of digits in input
//
//         number = 0;
//         digits = 0;
//
//         // Ask for a number until it is five digits
//         while ( digits != 5 )
//             {
//             System.out.print( "Enter a 5-digit number: " );
//             number = input.nextInt();
//
//            if ( number < 100000 )
//                 {
//                 if ( number > 9999 )
//                     digits = 5;
//                 else
//                 System.out.println( "Number must be 5 digits" );
//                 } // end if
//             else
//             System.out.println( "Number must be 5 digits" );
//             } // end while loop
//
//         // get the digits
//        digit1 = number / 10000;
//        digit2 = number % 10000 / 1000;
//        digit4 = number % 10000 % 1000 % 100 / 10;
//        digit5 = number % 10000 % 1000 % 100 % 10;
//
//        // print whether the number is a palindrome
//         System.out.print( number );
//
//         if ( digit1 == digit5 )
//             {
//             if ( digit2 == digit4 )
//                 System.out.println( " is a palindrome!!!" );
//             else
//             System.out.println( " is not a palindrome." );
//             }
//         else
//         System.out.println( " is not a palindrome." );
//         } // end method checkPalindrome
// } // end class Palindromet.printf("%n%d is not palindrome", originalNumber);


