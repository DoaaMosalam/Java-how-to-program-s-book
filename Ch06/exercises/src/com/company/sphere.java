package com.company;

import java.util.Scanner;

public class sphere {
    public void sphereTest(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number: ");
        double radius = input.nextInt();
        System.out.println("Volume is: " + sphereVolume(radius));

    }

    public static double sphereVolume(double radius){
        double volume = ( 4.0 / 3.0 ) * Math.PI * Math.pow( radius, 3 );
        return volume;
    }
}
