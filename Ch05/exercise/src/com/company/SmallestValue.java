package com.company;

import java.util.Scanner;

public class SmallestValue {
    public void smallest(){
       Scanner input = new Scanner(System.in);
        System.out.println("Enter 10 Number: ");
        int numSamllest=Integer.MAX_VALUE;

       for (int num = 0;num<=10;num++){
           num = input.nextInt();

           if (num < numSamllest) {
               numSamllest = num;

           }
       }

        System.out.println("Smallest Integer is: " + numSamllest);

    }
}
