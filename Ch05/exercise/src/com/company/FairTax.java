package com.company;

import java.util.Scanner;

public class FairTax {

    public void fairTax(){
        int amount;
        int expenses ;
        int total = 0;

//        Scanner input = new Scanner(System.in);
//        //  prompts expenses in various expense categories
//        System.out.println("1.Enter your expenses house: ");
//        expenses  = input.nextInt();
//
//        System.out.println("2.Enter your expenses food: ");
//        expenses = input.nextInt();
//
//        System.out.println("3.Enter your expenses clothing: ");
//        expenses = input.nextInt();
//
//        System.out.println("4.Enter your expenses transportation: ");
//        expenses = input.nextInt();
//
//        System.out.println("5.Enter your expenses education: ");
//        expenses = input.nextInt();
//
//        System.out.println("6.Enter your expenses health: ");
//        expenses = input.nextInt();
//
//        System.out.println("7.Enter your expenses care: ");
//        expenses = input.nextInt();
//
//        System.out.println("8.Enter your expenses vacations: ");
//        expenses = input.nextInt();
//
//
 //       }

        Scanner input = new Scanner(System.in);

        System.out.println("\"Welcome to the Fair Tax Calculator!\n" +
                "Here are some common expense categories:\n" +
                "1: Housing, 2: Food, 3: Clothing, 4: Transportation,\n" +
                "5: Education, 6: Health care, 7: Vacations;");

        for (amount=1;amount<=7;amount++){

            System.out.println("Total spending for category " + amount);
            expenses = input.nextInt();
            total += amount;
        }
        double tax = total * 0.3;
        System.out.println("Your total Fair Tax would be $" + tax);












    }
}
