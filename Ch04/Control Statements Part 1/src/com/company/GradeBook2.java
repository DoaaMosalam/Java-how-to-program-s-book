package com.company;

import java.util.Scanner;

public class GradeBook2 {
    private String courseName;

    public  GradeBook2(){}
    // this is constructor initializes courseName
    public GradeBook2(String name){

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
    public void determineClassAverage2(){
        Scanner input = new Scanner(System.in);

        int total = 0;
        int  gradeCounter = 0;
        int grade;
        double average;
        System.out.println("Enter grade or -1 to quit: ");
        grade = input.nextInt();

        while (grade != -1){

            total = total + grade;
            gradeCounter = gradeCounter + 1;
            System.out.print( "Enter grade or -1 to quit: " );
            grade = input.nextInt();
        }

        if (gradeCounter != 0){
            average = (double) total /gradeCounter;
            System.out.println("Total of the " + gradeCounter + " grades entered is " + total);
            System.out.println(average);
        }
        else {
            System.out.println( "No grades were entered" );
        }

    }

}
