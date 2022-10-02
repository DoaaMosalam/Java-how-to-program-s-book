package com.company;

import java.util.Random;

public class RollDie {
    public void roll(){

        Random randomNumber = new Random();

        int frequency1 = 0; // maintains count of 1s rolled
        int frequency2 = 0; // count of 2s rolled
        int frequency3 = 0; // count of 3s rolled
        int frequency4 = 0; // count of 4s rolled
        int frequency5 = 0; // count of 5s rolled
        int frequency6 = 0; // count of 6s rolled

        int face;

        for (int counter = 1; counter<=6000000;counter++){
            face = 1 + randomNumber.nextInt(6);
            switch (face){
                case 1:
                    ++frequency1;
                    break;
                case 2:
                    ++frequency2;
                    break;
                case 3:
                    ++frequency3;
                    break;
                case 4:
                    ++frequency4;
                    break;
                case 5:
                    ++ frequency5;
                    break;
                case 6:
                    ++frequency6;
                    break;
            }

        }
        System.out.println( "Face\tFrequency" ); // output headers
        System.out.printf( "1\t%d\n2\t%d\n3\t%d\n4\t%d\n5\t%d\n6\t%d\n",
                 frequency1, frequency2, frequency3, frequency4,
                 frequency5, frequency6 );


    }
}
