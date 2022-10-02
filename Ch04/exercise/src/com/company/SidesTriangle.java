package com.company;

import java.util.Scanner;

public class SidesTriangle {
    public void sidesTriangle() {


        int side1 = 0, side2 = 0, side3 = 0;
        boolean triangle;

        int count = 1;
        Scanner input = new Scanner(System.in);
        while (count <= 3) {
            System.out.println("Enter Sides Triangle: " + count);
            int sides = input.nextInt();

            triangle = false;
            if (sides > side3) {
                if (sides > side1) {
                    if (sides > side2) ;
                }
            }

            count++;
        }

        if (triangle = true)
            System.out.println("These could be sides to a triangle ");
        else
            System.out.println("These do not form a triangle.");

    }
}






