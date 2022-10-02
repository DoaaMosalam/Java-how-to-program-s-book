package exercise.H;

import java.util.Random;

public class DiceRolling {
    public static int[] print(int[]array) {
        for (int count = 0; count <array.length ; count++) {
           array[count]=0;
        }
        return array;
    }
    public static void rollDice() {
        Random random = new Random();
        int face1;
        int face2;
        int[] array = new int[13];
        print(array);

        for (int roll=1;roll<=36000;roll++){
            face1=1+random.nextInt(6);
            face2=1+random.nextInt(6);
            array[face1+face2]++;
        }
        // print the table
        System.out.printf( "%3s%12s%12s\n",
                "Sum", "Frequency", "Percentage" );
        for (int i=0;i<array.length;i++){
            int percent = array[ i ] / ( 360 );
            System.out.printf( "%3d%12d%12d\n", i, array[ i ], percent );
        }


    }
}
