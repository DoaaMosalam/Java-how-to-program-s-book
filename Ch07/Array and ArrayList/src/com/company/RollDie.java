package com.company;

import java.util.Random;

public class RollDie {
    public  static void RollDie(){
        Random random = new Random();
        int [] frequency =  new int[7]; // array of frequency counters

// roll die 6,000,000 times; use die value as frequency index
        for (int roll=1;roll<=6000000;roll++){

//uses the random value to determine which frequency element to increment during
//each iteration of the loop.
            ++frequency[1+random.nextInt(6)];
            System.out.printf( "%s%10s\n", "Face", "Frequency" );
// output each array element's value
            for (int face=1;face<frequency.length;face++){
                System.out.printf( "%4d%10d\n", face, frequency[ face ] );
            }
        }

//        Random random = new Random();
//        int [] frequancy = new int [7];
//        for (int roll=1;roll<=6000000;roll++){
//            ++frequancy[1+random.nextInt(6)];
//            System.out.printf("%s%10s\n","Face","Frequency");
//
//            for (int face=1;face<frequancy.length;face++){
//
//            }
//        }


    }
}
