package com.company;

import java.util.Scanner;

public class Test {

    public void solution(){

        Scanner input = new Scanner(System.in);

        int num;
        int even =0;
        int odd=0;
        for (int count =1;count<=10;count++){
            System.out.println("Enter number: "+count );
             num = input.nextInt();



            if (num%2== 0)
                even+=num;

            else
            odd+=num;
        }
        System.out.println("Thee Sum of Even number is: " + even);
        System.out.println("Thee Sum of Odd number is: " + odd);

    }

    public void Break(){
        Scanner input = new Scanner(System.in);
        int counter = 1,num,sum=0;
        while (counter<=7){
            System.out.println("Enter a positive integer:" + counter);
            num = input.nextInt();
            if (num<0){
                System.out.println("Negative numbers are not allowed");
                break;
            }
            sum += num;
            counter++;
        }
        System.out.println("Sum: " + sum);
    }

    public void Continue(){

        Scanner input = new Scanner(System.in);
        int counter = 1,num,sum=0;
        while (counter<=7){
            System.out.println("Enter a positive integer:" + counter);
            num = input.nextInt();
            if (num<0){
                System.out.println("Negative numbers are not allowed");
                continue;
            }
            sum += num;
            counter++;
        }
        System.out.println("Sum: " + sum);
    }

    public void Shape() {
        int shape, row, column;
        System.out.println("Enter your number: ");
        Scanner input = new Scanner(System.in);
        shape = input.nextInt();
        for (row = 0; row < shape; row++) {

            for (column = 0; column < shape; column++) {

                if (row == 0 || row == (shape - 1))
                    System.out.print(" *");
                else if (column == 0 || column == (shape - 1))
                    System.out.print(" *");
                else
                    System.out.println(" ");
            }
        }
    }



}
