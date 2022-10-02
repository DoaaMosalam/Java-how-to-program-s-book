package com.company;

import java.util.Random;
import java.util.Scanner;

public class ModifyGuessTheNumber {
    private static Random randomNumber = new Random();
    int answer;
    int guesst = 0;

    public int guesstNumber() {
        return 1 + randomNumber.nextInt(10);
    }

    public void Play() {

        answer = guesstNumber();
        System.out.print("Enter guesst 1000 numbers (0 to Exit): ");
        Scanner input = new Scanner(System.in);

        System.out.println("Guest(0 to Exit): ");
        int userGuest = input.nextInt();

        while (userGuest != 0) {
            guesst++;
            if (userGuest < answer)
                System.out.println("is to low,Try again," + userGuest);
            else if (userGuest > answer)
                System.out.println("is to height,Try again, " + userGuest);
            else
                System.out.println("Congratulations. You guessed the number!");
            System.out.print("Guest(0 to Exit): ");
            userGuest = input.nextInt();
            newdisplay();
        }
    }

    public void newdisplay() {

        System.out.println("You guessed the number in tries " + guesst);

            if (guesst < 10)
                System.out.println("Either you know the secret or you got lucky!\n");
            else if (guesst == 10)
                System.out.println("Ahah! You know the secret!\n");
            else
                System.out.println("You should be able to do better!\n");

    }
}





