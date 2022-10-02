package com.company;

public class ProductOfOddIntegers {
    public void ProductOdd(){
        int product=1;

        for (int i =1;i<=15;i+=2){
            if (i%2==1){
                product *= i;
                System.out.print(i);

                System.out.println();

            }

        }
        System.out.print('\t');
        System.out.println("Product Of Odd Integers: " + product);

    }
}
