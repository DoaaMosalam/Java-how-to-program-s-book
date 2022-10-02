package com.company;

import java.util.Scanner;

public class GradeBook {
    private String courseName;

    public  GradeBook(){}
    // this is constructor initializes courseName
    public GradeBook(String name){

    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
    public  String getCourseName(){
        return courseName;
    }

    public void displayMessage(){
        Scanner input = new Scanner(System.in);
        String thename = input.next();
        thename +=input.nextLine();
        setCourseName(thename);
        System.out.println();
        System.out.print("Welcome to  the grade book for: " +
                 getCourseName());
    }

    public void determineClassAverage(){

        Scanner input = new Scanner(System.in);
        int total =0;
        int gradeCounter = 1;
        int grade;
        int average;

        while (gradeCounter <= 10){
            System.out.println("Enter Grade: ");
            grade = input.nextInt();
            total = total + grade;
           // gradeCounter = gradeCounter +1;
            gradeCounter++;

            average = total /10;
            System.out.println("Total of all 10 grades is " + total);
            System.out.println("Class average is: " + average);
        }

    }
}
