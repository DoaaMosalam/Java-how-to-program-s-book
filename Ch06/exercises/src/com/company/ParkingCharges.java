package com.company;

import java.util.Scanner;



public class ParkingCharges {

    public static void charges(){
        double hours;
        double totalReceipts=0.0;

        double fee = 0;

        Scanner input = new Scanner(System.in);
        System.out.println(" Enter Your hours parked in the garage yesterday: ");
        hours = input.nextDouble();

        while (hours >= 0.0){
            fee += calculateCharges(hours);
            totalReceipts += fee;
             System.out.printf(
                     "Current charge: $%.2f, Total receipts: $%.2f\n",
                     fee, totalReceipts );

            System.out.print(
                     "Enter number of hours (a negative to quit): " );
             hours = input.nextDouble();
        }
    }

    public static double calculateCharges(double hours){
        double charge = 2.0;
        if (hours < 3.0)
            charge = 2.0 + 0.5 * Math.ceil( hours - 3.0 );
        if (hours > 10.0)
            charge = 10.0;
        return charge;

    }

}
