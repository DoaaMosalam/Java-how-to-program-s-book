package com.company;

public class MethodOverload {

    public static void main(String[] arg) {




    }
    public static int square ( int intValue){
        System.out.printf("\nCalled square with int argument: %d\n",
                intValue);


        return intValue * intValue;
    }

    public static double square ( double doubleValue){
        System.out.printf( "\nCalled square with double argument: %f\n",
                doubleValue );
        return doubleValue * doubleValue;
    }

    

    public static void display(){

        System.out.printf( "Square of integer 7 is %d\n",square(7) );
        System.out.printf( "Square of double 7.5 is %f\n", square(7.5));
    }

}
