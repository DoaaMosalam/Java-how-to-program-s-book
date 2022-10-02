package com.company;

import java.util.Scanner;

public class BinaryNumber {

    public void convertToDecimal(){

        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your binary number: ");
        int binary = input.nextInt();

        int decimal =0;
        int number =1;
        while (binary != 0){
            decimal += binary % 10 * number;
            binary /=10;
            number *=2;
        }
        System.out.println("Binary number is: " + binary + "\t" + "Decimal number is: " + decimal);

    }
}
