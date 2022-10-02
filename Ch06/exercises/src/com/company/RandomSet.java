package com.company;

import java.util.Random;

public class RandomSet {
    public static void set(){
        Random random = new Random();

        int counter=0;
        for (int x=0;x<=4;x++){
            //a
            System.out.println(2 + random.nextInt(5) * 2);

            //b
           System.out.println(3 + random.nextInt(5)*2);

            //c
            System.out.println(6 + random.nextInt(5)*4);

        }
    }
}
