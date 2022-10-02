package com.company;

import java.util.Scanner;

public class MathTest {
    public static void solution (){
        System.out.println("Math.abs( 23.7 )= " + Math.abs(23.7));
        System.out.println("Math.abs( 0.0 )= " + Math.abs(0.0));
        System.out.println("Math.abs(-23.7)= " + Math.abs(-23.7));
        System.out.println("Math.ceil(9.2)= " + Math.ceil(9.2));
        System.out.println("Math.ceil(-9.8)=" + Math.ceil(-9.8));
        System.out.println("Math.cos(0.0)= " + Math.cos(0.0));
        System.out.println("Math.exp(1.0)= " + Math.exp(1.0));
        System.out.println("Math.floor(9.2)= " + Math.floor(9.2));
        System.out.println("Math.floor(-9.8)= " + Math.floor(-9.8));
        System.out.println("Math.log(Math.E)= " + Math.log(Math.E) );
        System.out.println("Math.log(Math.E * Math.E)= " + Math.E );
        System.out.println("Math.max(2.3,12.7)= " + Math.max(2.3,12.7));
        System.out.println("Math.max(-2.3,-12.7)= " + Math.max(-2.3,-12.7));
        System.out.println("Math.min(2.3,12.7)= " + Math.min(2.3,12.7));
        System.out.println("Math.min(-2.3,-12.7)= " + Math.min(-2.3,-12.7));
        System.out.println("Math.pow(2.0,7.0)= " + Math.pow(2.0,7.0));
        System.out.println("Math.sin(0.0)= " + Math.sin(0.0));
        System.out.println("Math.sqrt(900.0)= " + Math.sqrt(900.0));
        System.out.println("Math.tan(0.0)= " + Math.tan(0.0));

    }


    public static double hypotenuse(double side1 , float side2){

        double result = side1 * side2;
        System.out.println(result);
        return result;
    }

    public static int smallest(int x ,int y ,int z){
        int result = x + y + z;
        System.out.println("The result is: " + result);
        return result;
    }

    public static void instructions(){
        int x=2, z=3 ,y=4;
        int result = x + z + y;
        System.out.println("The result is: " + result);
    }

    public static float intToFloat(int number){

      float result = number;
        System.out.println("The result is: " + result);
        return result;

    }
//----------------------------------------------------------
    // this is error because declaration method h within in method g.
//    void g()
//    {
//        System.out.println( "Inside method g" );
//        void h()
//        {
//            System.out.println( "Inside method h" );
//        }
//    }

    // solution above method.

    void g() {
        System.out.println("Inside method g");
    }
        void h()
        {
            System.out.println( "Inside method h" );
    }
//-------------------------------------------------------------------
// this method error because this method need return.
//    int sum( int x, int y )
//    {
//        int result;
//        result = x + y;
//    }

    int sum( int x, int y )
    {
        int result;
       return result = x + y;
    }
//-------------------------------------------------------------------
// this method and type semicoln declation variable delete this variable and semicolon.
//    void f( float a );
//    {
//
//    System.out.println( a );
//    }

    void f( float a )
    {

        System.out.println( a );
    }
//------------------------------------------------------------------------------


//    void product()
//    {
//        int a = 6, b = 5, c = 4, result;
//        result = a * b * c;
//        System.out.printf( "Result is %d\n", result );
//        return result;
//    }

    int product()
    {
        int a = 6, b = 5, c = 4, result;
        result = a * b * c;
        System.out.printf( "Result is %d\n", result );
        return result;

    }
}
