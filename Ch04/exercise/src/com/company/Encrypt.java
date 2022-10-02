package com.company;

import java.util.Scanner;

public class Encrypt {
    /**
     * A company wants to transmit data over the telephone but is concerned that its phones may
     * be tapped. It has asked you to write a program that will encrypt the data so that it may be transmitted more securely. All the data is transmitted as four-digit integers. Your application should read a
     * four-digit integer entered by the user and encrypt it as follows: Replace each digit with the result of
     * adding 7 to the digit and getting the remainder after dividing the new value by 10. Then swap the
     * first digit with the third, and swap the second digit with the fourth. Then print the encrypted integer. Write a separate application that inputs an encrypted four-digit integer and decrypts it to form
     * the original number.
     */
    public void encryptTest(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter four number: ");
        int number = input.nextInt();

        int num1 = (number / 1000 +7) % 10;
        int num2 = (number % 1000 / 100 + 7) % 10;
        int num3 = (number % 100 / 10 +7) %10;
        int num4 = (number % 10 + 7) % 10;

        int encryptNumbers = num1 * 10 + num2 + num3 * 1000 +num4 * 100;
        System.out.println("Encrypted number is " + encryptNumbers );
    }

    public void decryptTest(){
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a four number: ");
        int numbers = reader.nextInt();

        int num1 =(numbers /1000 +3)%10;
        int num2 = (numbers%1000/100+3)%10;
        int num3 = (numbers%100/10+3)%10;
        int num4 = (numbers%10+3)%10;
        int decryptNumbers = num1 * 10 + num2 + num3 * 1000 +num4 * 100;
        System.out.println("Encrypted number is " + decryptNumbers );

    }
}
