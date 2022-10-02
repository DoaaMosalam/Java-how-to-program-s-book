package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        MaximumFinder finder = new MaximumFinder();
      // finder.maximumFinder();

        RandomIntegers random = new RandomIntegers();
      //  random.randomGenerate();

        RollDie rollDie = new RollDie();
      //  rollDie.roll();


      //  Craps.craps();

    //    Craps2.rollDice();

    //    Scope.scope();

   //    MethodOverload.display();

        DrawSmiley drawSmiley = new DrawSmiley();
        drawSmiley.DrawSmileyTest();
//---------------------------------------------------------------------------------------
//        Random random1 = new Random();
//        int number;
//        for (int i =1;i<10;i++) {
//
//             number = 2 + 3 * random1.nextInt(5);
//
//            System.out.println(number);
//        }
//        System.out.println(" ");




//        double x,y;
//        System.out.println(Math.ceil(9.2));
//        System.out.println(Math.cos(0));
//        System.out.println(Math.exp(1.0));
//        System.out.println(Math.pow(2.0,7.0));



        RegisterForm registerForm = new RegisterForm();
       // System.out.println(registerForm.);
       // registerForm.stdSemester.toString();

//        Employee employee = new Employee(Floor.f1,FloorType.in);
//        employee.empNo=1;
//        employee.empName = "Doaa";
//        employee.address = "Suze";
//        employee.workFloor = Floor.f1;
//        employee.workFloor = Floor.f2;
//
//        System.out.println(employee.workFloor.num+"\n" + employee.workFloor.name);


//        for (tune people : tune.values())
//            System.out.printf("%s\t%s\t%s\n",people,people.getDesc(),people.getYear());


     //   display();
        largest(15,12);

     
    }
    public static int sum(int n1,int n2,int n3){
        int result = n1 + n2 + n3;

        return result;

    }

    public static double average(int m1 ,int m2 ,int m3){
        return sum(m1,m2,m3)/3;
    }

    public static  void display(){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Three Numbers,Please: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int  num3 = input.nextInt();

        int total = sum(num1,num2,num3);
        double totalAverage = average(num1,num2,num3);

        System.out.println("The Sum of the 3 numbers: " + total);
        System.out.println("The Average of the 3 numbers: " + totalAverage);

    }

    public static void largest (int num1 ,int num2){

        if (num1 > num2)
            num2 = num1;
        System.out.println(num2);
    }

}
