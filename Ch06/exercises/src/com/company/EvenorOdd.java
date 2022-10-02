package com.company;

import java.util.Scanner;

public class EvenorOdd {

    public static void testNumber() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number ");
        System.out.printf( "%s\n%s\n %s\n %s\n",
                "Enter numbers to determine if they are even or odd.",
                "Type the end-of-file indicator to terminate input:",
                "On UNIX/Linux/Mac OS X type <ctrl> d then press Enter",
                "On Windows type <ctrl> z then press Enter" );

        while (input.hasNext()) {

            int even = input.nextInt();
            if (isEven(even))
                System.out.println(even + " This number is Even.");
            else
                System.out.println(even + " This number is odd.");
        }
    }
    public static boolean isEven(int numeven){
        boolean num = numeven % 2== 0;
        return num;
    }
}
