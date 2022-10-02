package com.company;

import java.util.Random;
import java.util.Scanner;

public class Computer_AssistedInstruction {
    private static Random random = new Random();
    int answer;
    int studentanswer;

    public int  CreatQuestion(){
        int digit1 = random.nextInt(10);
        int digit2 = random.nextInt(10);
        System.out.println("How Much " + digit1 + "times " + digit2 + "?");
       return answer = digit1 * digit2;
    }

    public void checkResponses(){
        if (studentanswer != answer){
            System.out.println( "No. Please try again." );
        }else {
            System.out.println( "Very Good!" );
            CreatQuestion();
        }
    }

    public void display(){
        Scanner input = new Scanner(System.in);
        CreatQuestion();

        System.out.print("Enter Your answer(-1 exit Question): ");
        studentanswer = input.nextInt();
        while (studentanswer!=-1){
            checkResponses();
            System.out.print("Enter Your answer(-1 exit Question): ");
            studentanswer = input.nextInt();

        }
    }
}
