package com.company;

import java.util.Scanner;
public class GradeBook  {

    private String courseName;
    private String courseInstructor;

    public GradeBook( String courseofName,String instructor){
        courseName = courseofName;
        courseInstructor = instructor;

    }

    public void setCourseInstructor(String Instructor) {

        this.courseInstructor = Instructor;
    }

    public String getCourseInstructor(){
        return courseInstructor;
    }



    public void setCourseName(String name){
        courseName = name;
    }

    public String getCourseName(){
        return courseName;
    }



    public void displayMessage(){
        System.out.println("Initial course name is: " + getCourseName());
        System.out.printf("\"Initial course name is: %s\n\n",getCourseName());
        System.out.println("Please Ente your course name: ");

        Scanner input = new Scanner(System.in);
        String thename = input.next();
        thename +=input.nextLine();
        setCourseName(thename);
        System.out.println();
        System.out.print("Welcome to  the grade book for: " + getCourseName() + "This course is presented by: " +
                         getCourseInstructor());
    }






}
