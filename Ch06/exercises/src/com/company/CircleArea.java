package com.company;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class CircleArea {
    public static void circle(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your radius number: ");
        int radius = input.nextInt();
        while (radius>0) {

            double area = ((radius * radius) * Math.PI);
            System.out.println("Area Circle is: " + area);
            
            System.out.print("Enter your radius number: ");
             radius = input.nextInt();
        }
    }


}
