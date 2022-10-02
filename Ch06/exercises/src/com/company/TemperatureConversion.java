package com.company;

import java.util.Scanner;

public class TemperatureConversion {
    public double Celsius(int fahrenheitTemperated) {


        return (int) (5.0 / 9.0 * (fahrenheitTemperated - 32));
    }

    public int fahrenheit(int celsiusTemperated) {
        return (int) (9.0 / 5.0 * celsiusTemperated + 32);

    }

    public void display() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a temperature: ");
        int temp = input.nextInt();
        while (input.hasNext()) {

            System.out.println(temp + "Fahrenheit is: " + Celsius(temp));

            System.out.println(temp + "Celsius is: " + fahrenheit(temp) );

            System.out.print("Enter a temperature: ");
            temp = input.nextInt();

        }
//        int choice; // the user's choice in the menu
//        do {
//// print the menu
//            System.out.println("1. Fahrenheit to Celsius");
//            System.out.println("2. Celsius to Fahrenheit");
//            System.out.println("3. Exit");
//            System.out.print("Choice: ");
//            choice = input.nextInt();
//            if (choice != 3) {
//                System.out.print("Enter a temperature:");
//                int temp = input.nextInt();
//                switch (choice) {
//                    case 1:
//                        System.out.println(temp + " Fahrenheit is: " + Celsius(temp));
//                        break;
//                    case 2:
//                        System.out.println(temp + "Celsius is: " + fahrenheit(temp));
//                        break;
//                }
//            }
//
//
//        }while ( choice != 3 );


    }
}
