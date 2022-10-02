package com.company;

import java.util.Scanner;

public class PerfectNumbers {
    public String factory(int number){



            int sumFactory = 1;
        String factors = "1 ";

        for (int i = 1; i<= number /2 ; i++){
            if (number % i == 0){
                sumFactory += i;
                factors += i + " ";
            }
        }
        if (sumFactory == number)
            return factors;

//            System.out.println(number + " is Perfect number.");
//        else
//            System.out.println(number + " is not Perfect number.");

        return null;
    }

    public void perfect (){
        for (int a =2;a<=1000;a++){
            String result = factory(a);
            if ( result != null )
                System.out.printf ( "%d is perfect.\n\tFactors: %s\n",
                        a, result );
        }
    }
}
