package com.company;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class DistanceBetweenPoints {
    //(x1,x2) + (y1,y2)2
    //(x2-x1) + (y2 - y1)2
    //(2,3) + (8,7)2
    //(8-2) + (7-3)
    public static double distance(double x1 , double y1 ,double x2, double y2){
        return Math.sqrt(Math.pow((x2-x1),2) + Math.pow((y2 -y1),2));
    }

    public static void display() {
           double x1 = 0,x2 = 0,y1 = 0,y2 = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the coordinates of two points where you want to find the distance between (x1,x2)(y1,y2)");
        System.out.print("Enter x1: ");

            while (input.hasNext()){
                x1 = input.nextDouble();
                System.out.print("Enter x2: ");
                x2 = input.nextDouble();
                System.out.print("Enter y1: ");
                y1 = input.nextDouble();
                System.out.print("Enter y2: ");
                y2 = input.nextDouble();
                System.out.println("distance is : " + distance(x1,y1,x2,y2));

                System.out.println("Enter the coordinates of two points where you want to find the distance between (x1,x2)(y1,y2)");

                System.out.print("Enter x1: ");
            }

        }
    }


