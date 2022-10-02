package com.company;

import java.util.Scanner;

public class LargestNumber {

    public void largestNum(){
        Scanner input = new Scanner(System.in);

        int largest = 0;
        int counter=1;

        while (counter <= 10){
            System.out.print("Enter Number: ");
            int number = input.nextInt();

            if (number > largest)
                largest = number;

            counter++;


        }
        System.out.println("Largeat Number Is: "+ largest);
    }
}
