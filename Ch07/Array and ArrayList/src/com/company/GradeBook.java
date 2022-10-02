package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class GradeBook {
   private String _courseName; // name of course this GradeBook represents
   private int [] grades; // array of student grades
// Empty constructor.
   public GradeBook(){};
    // two-argument constructor initializes courseName and grades array
   public GradeBook(String name,int[] gradeArray){
       this._courseName=name;  // initialize courseName
       this.grades=gradeArray; // store grades
   }

   public void set_CourseName(String nameCourse){
       this._courseName = nameCourse; // store the course name
   }
   public String get_CourseName(){
       return _courseName;
   }

    // method to retrieve the course name
    public int[] getGrades() {
        return grades;
    }

    // method to set the course name
    public void setGrades(int[] grades) {
        this.grades = grades;
    }



    public void processGrades(){
       outputGrades();
        // call method getAverage to calculate the average grade
        System.out.printf( "\nClass average is %.2f\n",getAverage());

        // call methods getMinimum and getMaximum
        System.out.printf( "Lowest grade is %d\nHighest grade is %d\n\n",  getMinimum() ,getMaximum());

        // call outputBarChart to print grade distribution chart
        outputBarChart();

    } // end method processGrades.

    public void outputGrades(){
        System.out.println("The grades are:\n");
        for (int student =0;student<grades.length;student++){
            System.out.printf("Student %2d:%3d\n",student + 1 ,grades[student]);
        }

    }
    public int getMinimum(){
       int lowGrade = grades[0]; // assume grades[ 0 ] is smallest

        // loop through grades array
        for (int minGrade : grades){
            // if grade lower than lowGrade, assign it to lowGrade
            if (minGrade < lowGrade){
                lowGrade = minGrade;
            }

        }

        return lowGrade;
    }

    public int getMaximum(){
       int highGrade = grades[0];

       for (int maxGrade : grades){
           // if grade greater than highGrade, assign it to highGrade
           if (maxGrade > highGrade){
               highGrade = maxGrade; // new highest grade
           }
       }
       return highGrade;
    }

    public double getAverage(){
       int total =0;
        // sum grades for one student
        for (int average:grades) {
            total+=average;
        }
        return (double) total/grades.length;
    }

    // output bar chart displaying grade distribution
    public void outputBarChart(){
        System.out.println( "Grade distribution:" );
        int [] frequency = new int[11];
       for (int freq : grades){
           ++frequency[freq/10];
       }
        // for each grade frequency, print bar in chart
        for (int counter =0;counter<frequency.length;counter++) {
            if (counter == 10) {
                System.out.printf("%5d: ", 100);
            } else System.out.printf("%02d-%02d: ",
                    counter * 10, counter * 10 + 9);

            for (int stars = 0; stars < frequency[counter]; stars++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
    public void displayMessage() {

        // getCourseName gets the name of the course
        System.out.printf("Welcome to the grade book for\n%s!\n\n",
                get_CourseName());
    }// end method displayMessage

    public  void GradeBookTest(){
        Scanner input = new Scanner(System.in);
        int [] gradeArray ={87,68,94,100,83,78,85,91,76,87};

        System.out.println("Type course name is: ");
        String name = input.next();
        name+=input.nextLine();
        set_CourseName(name);
        System.out.printf("Welcome to the grade book for\n%s!\n\n",
                get_CourseName());

        GradeBook gradeBook = new GradeBook(name,gradeArray);
      // gradeBook.displayMessage();
        gradeBook.processGrades();
    }
}
