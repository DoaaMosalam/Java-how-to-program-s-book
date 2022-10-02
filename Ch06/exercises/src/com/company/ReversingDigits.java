package com.company;

import java.util.Scanner;

public class ReversingDigits {

    public void reversing(){
        int reverse =0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer number to reverse: ");
        int num = input.nextInt();


        while (num !=0) {
            reverse = reverse * 10 ;
            reverse = reverse + num % 10;
            num = num / 10;
        }

        System.out.println("Reverse of the number is " + reverse);
    }
}
