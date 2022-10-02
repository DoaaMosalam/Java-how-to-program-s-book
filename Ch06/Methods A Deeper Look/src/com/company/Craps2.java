package com.company;

import java.util.Random;

public class Craps2 {
    private static final Random randomNumber = new Random();

    private enum Status{Continues,Won,Lost}

    private static final int SNAKE_EYES = 2;
    private static final int TREY = 3;
    private static final int SEVEN = 7;
    private static final int YO_LEVEN = 11;
    private static final int BOX_CARS = 12;


    public static void craps (){
        int myPoint = 0;
        Status gameStatus;

        int sumofDice = rollDice();

        switch (sumofDice){
            case SEVEN:
            case YO_LEVEN:
                gameStatus = Status.Won;
                break;
            case SNAKE_EYES:
            case TREY:
            case BOX_CARS:
                gameStatus = Status.Lost;
                break;
            default:
                gameStatus = Status.Continues;
                myPoint = sumofDice;
                System.out.printf( "Point is %d\n", myPoint );
                break;
        }

        while (gameStatus == Status.Continues){
            sumofDice = rollDice();

            if (sumofDice == myPoint)
                gameStatus = Status.Won;
            else if (sumofDice == SEVEN)
                gameStatus = Status.Lost;
        }
        if (gameStatus == Status.Won)
            System.out.println("Players wins");
        else
            System.out.println("Players Loses");



    }

    public static int rollDice(){
        int dice1 = 1 + randomNumber.nextInt(6);
        int dice2 = 1 + randomNumber.nextInt(6);

        int sum = dice1 + dice2;

        System.out.println("Player Roll " + dice1 + " + " + dice2 + " = " + sum);
        return sum;
    }
}
