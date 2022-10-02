package com.company;

import java.util.Scanner;

public class PopulationGrowth {
    public void Population(){
        long population=7650816456L;
        long p1;
        long p2 = 0;
        int year = 2020;
        long increase ;
        boolean isDouble = true;


        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your Population Growth: " );

         p1 = input.nextLong();

        for (int i = 1;i<75;i++){
            year++;
            increase = (p2 - p1); // this is population growth.
            p2 = (long) (population * Math.pow (( 2.71828) ,(.0109*i)));

                    System.out.println("Population Growth in year: " + year + " Old Population: " + p1 + " New Population: " + p2 +
                                 " Become Population Growth is: " + increase );

            if(increase >= population & isDouble) {       //check for the very first year that the population is double the size
                System.out.println("The population doubles in this year : " + year);
                isDouble = false;

        }

            }
    }
}
