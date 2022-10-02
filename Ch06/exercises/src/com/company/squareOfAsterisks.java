package com.company;

import java.util.Scanner;

public class squareOfAsterisks {

    public static void testSquare(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num = input.nextInt();
        square(num);
    }
    public static void square(int side){
        for (int i = 1;i <side * side;i++){
            System.out.print("*");
            if (i % side == 0)
                System.out.println();

        }
    }
//this id another short solution.
    public static void square(){

        Scanner input = new Scanner(System.in);
        System.out.println("Enter side number: ");
        int num = input.nextInt();

        for (int count = 1;count<=num*num;count++){
            System.out.print("*");
            if (count % num == 0 )
                System.out.println("*");


        }
    }
}
