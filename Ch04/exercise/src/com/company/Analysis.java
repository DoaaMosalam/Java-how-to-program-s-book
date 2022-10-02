package com.company;

import java.util.Scanner;

public class Analysis {

    public void Test() {
        Scanner input = new Scanner(System.in);
        int passes = 0;
        int failures = 0;
        int studetCounter=0;
        int result;

        while (studetCounter  < 10){
            System.out.print("Enter result (1 = pass, 2 = fail):");
            result = input.nextInt();
            if (result == 1) {
                passes++;
                studetCounter++;
            }
            else if (result == 2) {
                    failures++;
                    studetCounter++;
                }
            else
                System.out.println("Invalid Input");
            }


        System.out.println(" Passed " + passes + " \n Failed " + failures);
        if (passes > 8)
            System.out.println("Bonus to instructor!");

    }
}

