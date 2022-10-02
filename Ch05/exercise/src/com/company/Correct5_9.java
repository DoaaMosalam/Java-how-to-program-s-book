package com.company;

import java.util.Scanner;

public class Correct5_9 {
    public void CorrectPartA(){
        for (int i =100;i>=1;i--){
            System.out.println(i);
        }
    }

    public void CorrectPartB(){
        int value;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your Number: ");
        value = input.nextInt();
        switch (value%2){
            case 0:
                System.out.println( "Even integer" );
                break;
            case 1:
                System.out.println("Odd integer");
                break;
            default:
                System.out.println("Not Found Number");

        }

    }

    public void CorrectPartC(){
        for (int i = 19;i>=1;i--){
            System.out.println(i);
        }
    }

    public void CorrectPartD(){
      int  counter = 2;
        do
        {
            System.out.println( counter );
            counter += 2;
        } while ( counter < 100 );
    }
}
