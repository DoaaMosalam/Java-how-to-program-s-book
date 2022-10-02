package com.company;

import java.util.Scanner;

public class GradeBook_Two_dimensional {
    private String courseName;
    private int[][] grades;

    public GradeBook_Two_dimensional(){

    }

    public GradeBook_Two_dimensional(String name,int [][]gradeArray){
        this.courseName=name;
        this.grades =gradeArray;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String nameCourse) {
        this.courseName = nameCourse;
    }

    public int getMinimum(){
//        int row,column;
//        int lowGrade = grades[0][0];
//        for (row=0;row<grades.length;row++){
//            for (column=0;column<grades[row].length;column++)
//                if (column<=lowGrade)
//                    lowGrade=column;
//        }

// assume first element of grades array is smallest
        int lowGrade = grades[0][0];
// loop through rows of grades array
        for (int[] studentGrade:grades) {
// loop through columns of current row
            for (int minGrade:studentGrade) {
// if grade less than lowGrade, assign it to lowGrade
                if (minGrade<lowGrade)
                    lowGrade=minGrade;
            }
        }
        return lowGrade;
    }

    public int getMaximum(){
        int highGrade = grades[0][0];
        for (int[] studentGrade:grades) {
            for (int maxGrades:studentGrade) {
                if (maxGrades > highGrade)
                    highGrade = maxGrades;
            }

        }
        return highGrade;
    }
    public double getAverage(int[] setOfGrades){
        int total = 0; // initialize total
// sum grades for one student
        for ( int grade : setOfGrades )
            total += grade;
// return average of grades
        return (double) total / setOfGrades.length;

    }

    public void outputBarChart(){
        System.out.println( "Overall grade distribution:" );
        // stores frequency of grades in each range of 10 grades
        int[] frequency = new int[ 11 ];
        for (int [] studentGrade:grades) {
            for (int grade:studentGrade)
                ++frequency[grade/10];
        }
        // for each grade frequency, print bar in chart
        for (int counter=0;counter<frequency.length;counter++){
            // output bar label ( "00-09: ", ..., "90-99: ", "100: " )
            if (counter==10)
                System.out.printf("%d ",100);
            else
                System.out.printf("%02d-%02d: ",counter*10,counter*10+9);
            for (int stars=0;stars<frequency[counter];stars++){
                System.out.print("*");
            }
            System.out.println();
        }
    }//end methos outputGrade Char

    public void outputGrades() {
        System.out.println("The grades are:\n");
        System.out.print(" "); // align column heads
// create a column heading for each of the tests
        for (int test = 0; test < grades[0].length; test++)
            System.out.printf("\t    Test %d ", test + 1);
        System.out.println("Average"); // student average column heading
// create rows/columns of text representing array grades
        for (int student = 0; student < grades.length; student++) {
            System.out.printf("Student %2d", student + 1);
            for (int test : grades[student]) // output student's grades
                System.out.printf("%8d", test);

// call method getAverage to calculate student's average grade;
// pass row of grades as the argument to getAverage
            double average = getAverage(grades[student]);
            System.out.printf("%9.2f\n", average);

        }
    }  //end Method outputGrade.

    // perform various operations on the data
    public void processGrades(){
        outputGrades();
        // call methods getMinimum and getMaximum
        System.out.printf( "\n%s %d\n%s %d\n\n",
                "Lowest grade in the grade book is", getMinimum(),
                "Highest grade in the grade book is", getMaximum() );
// output grade distribution chart of all grades on all tests
        outputBarChart();
    } // end method processGrades


    public void displayMessage(){
        System.out.printf("Welcome to the grade book for\n%s!\n\n",
                getCourseName());
    }

    public void GradeBookTest(){
        Scanner input = new Scanner(System.in);
        int [][]gradeArray={ { 87, 96, 70 },
                { 68, 87, 90 },
                { 94, 100, 90 },
                { 100, 81, 82 },
                { 83, 65, 85 },
                { 78, 87, 65 },
                { 85, 75, 83 },
                { 91, 94, 100 },
                { 76, 72, 84 },
                { 87, 93, 73 } };
        System.out.println("Type Course name,Please: ");
        String name = input.nextLine();
        setCourseName(name);
        System.out.printf("Welcome to the grade book for\n%s!\n\n",
                getCourseName());

        GradeBook_Two_dimensional myGradeBook = new GradeBook_Two_dimensional(name,gradeArray);
        myGradeBook.processGrades();

    }
}
