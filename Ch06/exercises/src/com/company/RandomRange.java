package com.company;

import java.util.Random;

public class RandomRange {
    public static void solution(){
        Random random = new Random();

        // a
        System.out.println(1 + random.nextInt(2));

        //b
        System.out.println(1 + random.nextInt(100));

        //c
        System.out.println(1+random.nextInt(9));

        //d
        System.out.println(100 + random.nextInt(112));

        //e
        System.out.println(-1 + random.nextInt(3));

        //f
        System.out.println(-1 + random.nextInt(2));
    }
}
