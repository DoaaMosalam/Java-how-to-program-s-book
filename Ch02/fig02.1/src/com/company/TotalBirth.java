package com.company;

import java.util.Scanner;

public class TotalBirth {

    public void MyBirth(){
        int day,
                month,
                year1,
                year2= 2020,
                sum;
        String name = null;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your name:");
        name = input.next();
        name += input.nextLine();

        System.out.println("Enter your day:");
        day = input.nextInt();

        System.out.println("Enter Your Month:");
        month = input.nextInt();

        System.out.println("Enter First Year: ");
        year1 = input.nextInt();

//        System.out.println("Enter Second Year: ");
//        year2 = input.nextInt();

        sum = year2 - year1;
       // System.out.printf("%s, %d ,%d","Bithday This Person is: ",name,sum);
        System.out.println("Birthday is : " + name + day + "\\" + month +"\\" + year1 +"\nThe Age is:" + sum + " in Year 2020" );
//-----------------------------------------------------------------------------------


    }
}
