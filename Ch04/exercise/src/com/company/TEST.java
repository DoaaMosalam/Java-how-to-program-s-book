package com.company;

import javax.swing.*;
import java.util.Scanner;

public class TEST {

    public void Student(){
//        int sum=0;
//        int numStudent;
//        Scanner input = new Scanner(System.in);
//        int counter=1;
//
//        while (counter <= 6){
//        System.out.print("Enter Grad for student no: " + counter );
//       int grade = input.nextInt();
//       sum+=grade;
//       counter++;
//        }
//        System.out.println("Average of the  6 Grade is: "+ counter + sum/6);

//-------------------------------------------------------------------------------------------------

//        Scanner input = new Scanner(System.in);
//
//        int counter = 1;
//        double sum = 0;
//        double nextSum=0;
////        int  totalnum = sum + sum;
//        while (counter <= 10){
//            System.out.print("Enter number: ");
//             sum = input.nextDouble();
////             sum += counter;
//            nextSum = sum + nextSum;
//            counter++;
//
//
//        }
////        System.out.println(sum);
//        System.out.println("Total numbers is: " + nextSum);
//--------------------------------------------------------------------------------------
//        Scanner reader = new Scanner(System.in);
//        double sum =0.0;
//        double value;
//        boolean nonNigative = true;
//
//        while (nonNigative == true){
//            System.out.print("Enter the Next Positive Number: ");
//            value = reader.nextDouble();
//            if (value < 0)
//                nonNigative = false;
//            else
//                sum += value;
//
//        }
//        System.out.println("Sum of input numbers is " + sum);
        //-----------------------------------------------------------------------------------
//        Scanner reader = new Scanner(System.in);
//        int guess,rand;
//
//        rand = (int) (Math.random() *100);
//        boolean stillPlaying = true;
//        System.out.println("The Generated Random Number is: " + rand);
//        while (stillPlaying ){
//            System.out.println("Guess a number between 0 to 100 ");
//            guess = reader.nextInt();
//            if (guess>rand)
//                System.out.println("Guess too large");
//            else
//                if (guess<rand)
//                    System.out.println("Guess too small");
//                else
//                    System.out.println("You win!!");
//                stillPlaying = false;
//        }

        char letter;
        String vowels="aeiouAEIOU", enter;
        boolean guess=false;



        while(!guess){
            enter= JOptionPane.showInputDialog("Enter letter: ");
            //letter=enter.charAt(0);

            if(enter.contains(vowels)){
                JOptionPane.showMessageDialog(null, "Found a vowel");
                guess=true;
            }
            else{
                JOptionPane.showMessageDialog(null, "Not that as I am expecting. Try again");
            }
        }
    }




}
