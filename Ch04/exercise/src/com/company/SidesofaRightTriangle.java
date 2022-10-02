package com.company;

import java.util.Scanner;

public class SidesofaRightTriangle {
    public void rightTriangle(){
        Scanner input = new Scanner(System.in);

        boolean isTriangle;

        System.out.println("Enter first sides Triangle: ");
        int side1 = input.nextInt();
        System.out.println("Enter first sides Triangle: ");
        int side2 = input.nextInt();
        System.out.println("Enter first sides Triangle: ");
        int side3 = input.nextInt();

            int side1Square = side1 * side1;
            int side2Square = side2 * side2;
            int side3Square = side3 * side3;

            isTriangle = false;

            if ((side1Square + side2Square)==side3Square)
                isTriangle = true;
            else if ((side1Square + side3Square)==side2Square)
                isTriangle = true;
            else if ((side2Square + side3Square)== side1Square)
                isTriangle = true;
            if ( isTriangle )
                System.out.println( "These are the sides of a right triangle." );
            else
                System.out.println( "These do not form a right triangle." );


    }
}
