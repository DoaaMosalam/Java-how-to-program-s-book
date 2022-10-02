package com.company;

import java.util.Random;
import java.util.Scanner;

public class CoinTossing {
    private static Random random = new Random();
    public boolean randomCoin(){
       return random.nextInt(2)==1;
    }

    public void Tossing(){
        Scanner input = new Scanner(System.in);

        int choice;
        int head=0;
        int tails=0;

        do {
            // display a menu
            System.out.println( "1. Toss Coin" );
            System.out.println( "2. Exit" );
            System.out.print( "Choice: " );
            choice = input.nextInt();
            if (choice ==1){
                if (randomCoin())
                    head++;
                else
                    tails++;
                System.out.printf( "Heads: %d, Tails: %d\n", head, tails );
            }
        }while (choice != -2);

    }
}
