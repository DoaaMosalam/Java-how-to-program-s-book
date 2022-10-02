package com.company;

public class Factorials {
    public void factorials(){


        long n =1; //this is method n equal to the product of the positive integers from 1 to n.


        System.out.println("n\tn!\n");
        for (long num =1;num<=5;num++){
            System.out.print(num);
            long result = n*=num;
            System.out.print('\t');
            System.out.println(result);


           // System.out.printf("%d\t%d\n", num, result);
        }
    }
}
