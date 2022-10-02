package com.company;

import javax.swing.*;
import java.util.Scanner;

public class TwoLargestNumbers {
//    private int fLargest;
//    private int sLargest;
//
//    public TwoLargestNumbers() {
//    }
//
//    public void setNumber(int num){
//        if (num > fLargest){
//            sLargest = fLargest;
//            fLargest = num;
//        }else if (num > sLargest){
//            sLargest = num;
//        }
//
//    }

//    public int getfLargest(){
//        return fLargest;
//    }
//
//    public  int getsLargest(){
//        return sLargest;
//    }

    public void largest() {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int number = input.nextInt();
        int flargest = 0;
        int slargest = 0;
        int counter;
        if (number > flargest) {
            slargest = flargest;
            flargest = number;
        } else;
            slargest = number;
        counter = 2;
        while (counter < 10) {
            System.out.print("enter Number:");
            number = input.nextInt();
            if (number > flargest) {
                slargest = flargest;
                flargest = number;
            } else if (number > slargest)
                slargest = number;
                counter++;

        }
        System.out.println("Largest First Number is: " + flargest + " Largest Second Number is: " + slargest);

    }



//        Scanner input = new Scanner(System.in);
//        TwoLargestNumbers tl = new TwoLargestNumbers();
//        for (int i=0;i<10;i++){
//            System.out.println("Enter Number: " );
//            tl.setNumber(input.nextInt());
//        }
//        System.out.println("Largest Number is: " + tl.getfLargest() + " Second Number is: " + tl.getsLargest());
//    }
}
