package com.company;

import java.util.Scanner;

public class SalesCommission {

    public void Sales(){
        double gross = 0;

        int product=0;

        while (product < 4){
            product++;
            Scanner input = new Scanner(System.in);
            System.out.print("Enter Your Number Product: " + product);

            int soldNumber = input.nextInt();

            if (product == 1)
                gross += soldNumber * 239.99;


            if (product == 2)
                gross += soldNumber * 129.75;

            if (product == 4 )
                gross += soldNumber * 99.95;

            if (product == 5 )
                gross += soldNumber * 350.89;
        }
       // System.out.println(salespeople);
        System.out.println(" Total Earning in this week is: "+ 0.09 * gross+200);

    }
}
