package com.company;

import java.util.Scanner;

public class GreatestCommonDivisor {
    public void GCD() {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int first = input.nextInt();
        System.out.print("Enter second number: ");
        int second = input.nextInt();


       int gcd = 1;
       for (int i =1;i<=first && i<=second;i++){
           if (first%i==0&&second%i==0)
               gcd = i;

       }
        System.out.printf("GCD given numbers is :%d and %d is %d ", first,second,gcd);

//        while (first != second) {
//            if(first > second)
//                first = first - second;
//            else
//                second = second - first;
//        }
//
//        System.out.printf("GCD of given numbers is: %d", second);
//    }
    }


}