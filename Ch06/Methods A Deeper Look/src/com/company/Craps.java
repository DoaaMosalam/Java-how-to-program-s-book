package com.company;

import java.util.Random;

public class Craps {
    // create random number generator for use in method rollDice
   private static final Random randomNumber = new Random();

   // enumeration with constants that represent the game status
    private enum Status{ CONTINUE, WON, LOST}

    // constants that represent common rolls of the dice
    private static final int SNAKE_EYES = 2;
    private static final int TREY = 3;
    private static final int SEVEN = 7;
    private static final int YO_LEVEN = 11;
    private static final int BOX_CARS = 12;

    public static void craps(){
        int myPoint =0; // point if no win or loss on first roll
        // declaration enum Status.
        Status gamestatus; // can contain CONTINUE, WON or LOST

        int sumOfDice = rollDice(); // first roll of the dice

        // determine game status and point based on first roll
        switch (sumOfDice){
            case SEVEN:   // win with 7 on first roll
            case YO_LEVEN: // win with 11 on first roll
                    gamestatus = Status.WON;
                    break;
                    case SNAKE_EYES: // lose with 2 on first roll
                     case   TREY: // lose with 3 on first roll
                     case BOX_CARS: // lose with 12 on first roll
                                gamestatus = Status.LOST;
                                break;
            default:          // did not win or lose, so remember point
                gamestatus = Status.CONTINUE;  // game is not over
                myPoint = sumOfDice; // remember the point

                System.out.printf( "Point is %d\n", myPoint );
                 break; // optional at end of switch
        }

        // while game is not complete
        while (gamestatus == Status.CONTINUE)  // not WON or LOST
        {
            sumOfDice = rollDice(); // roll dice again

            // determine game status
            if ( sumOfDice == myPoint ) // win by making point

            gamestatus = Status.WON;
            else if (sumOfDice == SEVEN);
        }
// display won or lost message
        if (gamestatus == Status.WON)
            System.out.println("Player Wins");
        else
            System.out.println("Player Loses");
    }

    // roll dice, calculate sum and display results
    public static int rollDice(){
        int die1 = 1 + randomNumber.nextInt(6);
        int die2 = 1 + randomNumber.nextInt(6);

        int sum = die1 + die2;

        // display results of this roll
        System.out.printf( "Player rolled %d + %d = %d\n",
                die1, die2, sum );
        return sum;

    }
}


