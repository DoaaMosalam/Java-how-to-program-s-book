package com.company;

import java.util.*;

public class Comparison {


   public void Comparison(){

       Scanner input = new Scanner(System.in);
       int number1,
               number2;
       System.out.println("Enter first integer:");
       number1 = input.nextInt();
       System.out.println("Enter second integer");
       number2 = input.nextInt();

       if ( number1 == number2 )
           System.out.printf( "%d == %d\n", number1, number2 );
       if ( number1 != number2 )
           System.out.printf( "%d != %d\n", number1, number2 );
       if ( number1 < number2 )
           System.out.printf( "%d < %d\n", number1, number2 );
       if ( number1 > number2 )
           System.out.printf( "%d > %d\n", number1, number2 );
       if ( number1 <= number2 )
           System.out.printf( "%d <= %d\n", number1, number2 );
       if ( number1 >= number2 )
           System.out.printf( "%d >= %d\n", number1, number2 );

   }
}
