package com.company;

import java.util.Scanner;

public class Accomplishtask {

    public void solution4_4() {
        int x = 0;
        int y=0;
        int z = x++ +y;
        Scanner input = new Scanner(System.in);
        z=input.nextInt();
        if (z > 10){
            System.out.println( "Count is greater than 10" + z );
        }
    }

    public void solution4_5(){
        int sum=0;
        int x = 1;
        sum += x;
        System.out.println("The sum is: " + sum);
    }

    public void solution4_6(){
        int x =1;
        int sum =0;
        sum += x;
        System.out.println("The sum is: " + sum);
        while (sum <=10){
            System.out.println(sum);
            sum++;
        }
    }

    public void solution4_7(){
        int x =5;
        int y = 5;
        y *=x++;
        System.out.println(y);



    }
    public void solution4_16() {

        int y;
        int x = 1;
        int total = 0;

        while (x <= 10) {
            y = x * x;
            System.out.println(y);
            total += y;
            ++x;
        } // end while

        System.out.printf("Total is %d\n", total);
    }

}
