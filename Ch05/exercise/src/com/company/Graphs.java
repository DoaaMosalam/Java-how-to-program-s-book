package com.company;

import java.util.Scanner;

public class Graphs {
    public void bar_char(){
        int number1 = 0,number2=0,number3=0,number4=0,number5=0;
        int value = 0;
        int counter;

        Scanner input = new Scanner(System.in);
       for (  counter = 1;counter<=5;counter++) {
           System.out.print("Enter 5 Integer numbers: ");
           int  num = input.nextInt();
            if (num >=1 && num<=30){
                switch (counter){
                    case 1:
                        number1 = num;
                        break;
                    case 2:
                        number2 = num;
                    case 3:
                        number3 = num;
                        break;
                    case 4:
                        number4 = num;
                        break;
                    case 5:
                        number5 = num;
                }

            }else
                System.out.println("Invalid Input\nNumber should be between 1 and 30");
       }
       for ( counter =1;counter<=5;counter++){
           switch (counter){
               case 1:
                   value = number1;
                   break;
               case 2:
                   value = number2;
                   break;
               case 3:
                   value = number3;
                   break;
               case 4:
                   value = number4;
                   break;
               case 5:
                   value = number5;
                   break;

           }
           for (int i =1;i<=value;i++)
               System.out.print("*");

           System.out.println();

       }

    }
}
