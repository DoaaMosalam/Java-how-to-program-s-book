package com.company;

import java.util.Scanner;

public class qualityPoints {
    public int points(int grade){
       if (grade >= 90){
           return 4;

       }else if (grade >= 80) {
           return 3;
       }else if (grade>=70) {
           return 2;
       }else if (grade >= 60)
           return 1;
       else
           return 0;
    }

    public void checkQualityPoint(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your Average:(exit -1) ");
        int averager = input.nextInt();
        while (averager !=-1){
            if (averager >= 0 && averager <=100){
                System.out.println("Your point is: " + points(averager));
            }else
                System.out.println("invalid input;please enter correct number.");
            System.out.println("Enter Your Average:(exit -1) ");
             averager = input.nextInt();
        }
    }
}
