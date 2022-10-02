package com.company;
import java.util.Random;

public class RandomIntegers {
    public void randomGenerate(){
        Random randomNumber = new Random();

        int face;
        // loop 20 times
        for (int counter=0;counter<=20;counter++){
            // pick random integer from 1 to 6
            face = 1 + randomNumber.nextInt(6);

            System.out.printf( "%d ", face ); // display generated value

            // if counter is divisible by 5, start a new line of output
            if (counter % 5 == 0)
                System.out.println();

        }


    }
}
