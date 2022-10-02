package com.company;

import java.util.Scanner;

public class MaximumFinder {
    public  void maximumFinder(){
        // obtain three floating-point values and locate the maximum value

        Scanner input = new Scanner (System.in);
        //prompt for and input three floating-point values
        System.out.print("Enter three floating-point values separated by spaces: " );


        double number1 = input.nextDouble();
        double number2 = input.nextDouble();
        double number3 = input.nextDouble();

        double result =  maximum(number1,number2,number3);
        System.out.println("Maximum " + result);
    }

    public static double maximum(double x , double y ,double z){

        double maximumValue = x;

        if (y > maximumValue)
            maximumValue = y;

        if (z > maximumValue)
            maximumValue = z;
        return  Math.max(x,Math.max(y,z));
    }
}
