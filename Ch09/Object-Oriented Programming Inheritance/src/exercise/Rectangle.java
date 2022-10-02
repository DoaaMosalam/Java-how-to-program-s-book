package exercise;

import java.util.Scanner;

public class Rectangle extends  Quadrilateral{
    static double height;

    public Rectangle(double xCoordinate, double yCoordinate) {
        super(xCoordinate, yCoordinate);
    }


    public static void Calculator(){
       double space = calculatorRectangle();
        System.out.println(space);
    }
}
