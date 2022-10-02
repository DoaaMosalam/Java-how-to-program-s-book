package Exercise;

import java.util.Scanner;

public class Rectangle {
    private static double length=1.0;
    private static double width=1.0;


    public static double rectanglePerimeter(double a, double b){
        double perimeter = ((2*a)+(2*b));
        return perimeter;
    }

    public static double rectangleArea(double a,double b){
        double area = a*b;
        return area;
    }

    public static void result(){
        Scanner input = new Scanner(System.in);
        System.out.print("1.Type length rectangle: ");
        length=input.nextDouble();
        System.out.println("2.Type width rectangle: ");
        width = input.nextDouble();
        System.out.printf("Rectangle's Perimeter is:%.3f\n",rectanglePerimeter(length,width));
        System.out.printf("Rectangle's Area is:.3%f\n",rectangleArea(length,width));

    }
}
