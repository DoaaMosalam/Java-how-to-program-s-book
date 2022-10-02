package exercise.H;

import java.util.Random;

public class Craps {
    // create random number generator for use in method rollDice
    private  final Random randomNumber = new Random();
    // enumeration with constants that represent the game status
    private enum Status{ CONTINUE, WON, LOST}

    // constants that represent common rolls of the dice
    private static final int SNAKE_EYES = 2;
    private static final int TREY = 3;
    private static final int SEVEN = 7;
    private static final int YO_LEVEN = 11;
    private static final int BOX_CARS = 12;

    int[] wins;
    int[] losses;
    int sumWin=0;
    int sumLost=0;
    int roll;
    public void craps() {
        int myPoint = 0; // point if no win or loss on first roll
        // declaration enum Status.
        Status gamestatus; // can contain CONTINUE, WON or LOST
        int sumOfDice = rollDice(); // first roll of the dice
        // determine game status and point based on first roll
        for (int i = 0; i < 1000; i++) {
            sumOfDice = rollDice();
            roll=1;
            switch (sumOfDice) {
                case SEVEN:   // win with 7 on first roll
                case YO_LEVEN: // win with 11 on first roll
                    gamestatus = Status.WON;
                    break;
                case SNAKE_EYES: // lose with 2 on first roll
                case TREY: // lose with 3 on first roll
                case BOX_CARS: // lose with 12 on first roll
                    gamestatus = Status.LOST;
                    break;
                default:          // did not win or lose, so remember point
                    gamestatus = Status.CONTINUE;  // game is not over
                    myPoint = sumOfDice; // remember the point

                    System.out.printf("Point is %d\n", myPoint);
                    break; // optional at end of switch
            }

            // while game is not complete
            while (gamestatus == Status.CONTINUE)  // not WON or LOST
            {
                sumOfDice = rollDice(); // roll dice again
                roll++;

                // determine game status
                if (sumOfDice == myPoint) // win by making point

                    gamestatus = Status.WON;
                else if (sumOfDice == SEVEN) ;
            }
            if (roll>21)
                roll=21;

// display won or lost message
            if (gamestatus == Status.WON) {
               ++wins[roll];
                ++sumWin;
            }
            else{
               ++losses[roll];
                ++sumLost;
            }
        }
        printStatus();
    }

    public void  printStatus(){
        int total = sumWin + sumLost;
        int length=0;
        for (int i = 0; i <=21 ; i++) {
            if (i==21)
                System.out.printf( "%d %s %d %s\n",
                        wins[ i ], "games won and", losses[ i ],
                        "games lost on rolls after the 20th roll" );
            else
                System.out.printf( "%d %s %d %s%d\n",
                        wins[ i ], "games won and", losses[ i ],
                        "games lost on roll #", i );
            // for calculating length of game
// number of wins/losses on that roll multiplied
// by the roll number, then add them to length
            length += wins[ i ] * i + losses[ i ] * i;
        }// end for
        // calculate chances of winning
        System.out.printf( "\n%s %d / %d = %.2f%%\n",
                "The chances of winning are", sumWin, total,
                ( 100.0 * sumWin / total ) );
        System.out.printf( "The average game length is %.2f rolls.\n",
                ( ( double ) length / total ) );
    }

    // roll dice, calculate sum and display results
    public int rollDice() {
        int die1 = 1 + randomNumber.nextInt(6);
        int die2 = 1 + randomNumber.nextInt(6);

        int sum = die1 + die2;
        return sum;
    }
}
