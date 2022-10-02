package com.company;
import java.util.*;

public class HypotenuseCalculations {

    public static void calulation(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number side 1: ");
        double side1 = input.nextInt();


        while (side1>0){
            System.out.print("Enter number side 2: ");
            double side2 = input.nextInt();
            System.out.println("Hypotenuse is: " + hypotenuse(side1,side2));

            System.out.print("Enter number side 1: ");
             side1 = input.nextInt();
        }


    }

    public static double hypotenuse(double side1 ,double side2){
        double squared = Math.pow(side1 , 2) + Math.pow(side2 ,2);
        return Math.sqrt(squared);
    }
}
