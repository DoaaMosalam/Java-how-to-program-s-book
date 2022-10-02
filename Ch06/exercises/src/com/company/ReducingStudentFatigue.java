package com.company;

import java.util.Random;
import java.util.Scanner;

public class ReducingStudentFatigue {
    private static Random random = new Random();
    int answer;
    int studentAnswer;

    public int  CreatQuestion(){
        int digit1 = random.nextInt(10);
        int digit2 = random.nextInt(10);
        System.out.println("How Much " + digit1 + "times " + digit2 + "?");
        return answer = digit1 * digit2;
    }

    public void checkResponses(){
        if (studentAnswer != answer){
            System.out.println( creatResponses(false));
        }else {
            System.out.println( creatResponses(true));
            CreatQuestion();
        }
    }
    public String creatResponses(boolean correct){

        if (correct)
            switch (random.nextInt(4)){
                case 0:
                    return "Very good!";
                case 1:
                    return  "Excelletn";
                case 2:
                    return "Nice work!";
                case 3:
                    return "Keep up the good work!";

            }
            switch (random.nextInt(4)){
                case 0:
                   return "No. Please try again.";
                case 1:
                    return "Wrong. Try once more.";
                case 2:
                    return "Don't give up!";
                case 3: default:

                    return "No. Keep trying.";
            }
    }

    public void display() {
        Scanner input = new Scanner(System.in);
        CreatQuestion();

        System.out.print("Enter Your answer(-1 exit Question): ");
        studentAnswer = input.nextInt();
        while (studentAnswer != -1) {
            checkResponses();
            System.out.print("Enter Your answer(-1 exit Question): ");
            studentAnswer = input.nextInt();

        }
    }

}
