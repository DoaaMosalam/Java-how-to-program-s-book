package com.company;

import java.util.Scanner;

public class Comparison2 {
    public void comparison2(){
        int grade = 100;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your Name:");
        String nam = input.next();
        nam += input.nextLine();

        System.out.println("Enter your grade:");
        grade = input.nextInt();

        if (grade == 50){
            System.out.println("good");
        }
//        if (grade <= 50 || grade == 50){
//            System.out.println("Bad");
//        }
        if (grade >=100) {
            System.out.println("امتياز مع مرتبه الشرف");
        }
        if (grade != 10); // logic error
            System.out.println("blade");




    }
}
