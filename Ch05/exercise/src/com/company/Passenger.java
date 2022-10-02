package com.company;
import java.util.*;

public class Passenger {
   public void BagPassenger() {
       Scanner input = new Scanner(System.in);

       char passenger; // This is variable Passenger Class.
       double bagWeight = 0; // This is variable bag Weight.
       double bagexcesses;  // This is variable bag Excessess.
       double charge;       // This is variable Cgarge about passenger pay if bag is weight .


       int numberOfPassenger=10;
       int passengerOfGroup;


       int counter=1;
       while (counter <= numberOfPassenger) {
// This is input Passenger Class.

           System.out.println("Please enter your passenger class For Passenger No:" + counter);
           passenger = input.next().charAt(0);
// This is method bag wieght.
           System.out.println("Please enter your bag weight: " + counter);
           bagWeight = input.nextDouble();

           switch (passenger) {
               case 'f':
               case 'F':
                   if (bagWeight >= 30) {
                       bagexcesses = bagWeight - 30;
                       charge = bagexcesses * 10;
                       System.out.println("You must pay charge excessess bag is: " + charge);
                       break;
                   }
               case 'b':
               case 'B':
                   if (bagWeight >= 25) {
                       bagexcesses = bagWeight - 25;
                       charge = bagexcesses * 10;
                       System.out.println("You must pay charge excessess bag is: " + charge);
                       break;
                   }
               case 'e':
               case 'E':
                   if (bagWeight >= 20) {
                       bagexcesses = bagWeight - 20;
                       charge = bagexcesses * 10;
                       System.out.println("You must pay charge excessess bag is: " + charge);
                       break;
                   }

               default:
                   System.out.println("You enter Error bag weight");
           }
           counter++;


       }
   }





}
