package com.company;

import java.util.Scanner;

public class Account {

    private double balance;
//constructor
    public Account(){

    }
    public Account(double initialbalance){// this parameter started balance
        // validate that initialBalance is greater than 0.0;
        // if it is not, balance is initialized to the default value 0.0
       if (initialbalance > 0.0); //ensur that initialbalance is great than0.0
       balance = initialbalance;
    }
// creat set
    // credit (add) amount
    public void credit(double amount){
        balance = balance + amount;
      //  balance += amount;
    }
// creat get
    public double getbalance(){
        return balance;
    }

    public void AccountTest(){
      Account account1 = new Account(50.0);
      Account account2 = new Account(0.00);
      System.out.println("Account 1 balance is: " + account1.getbalance());
      System.out.println("Account 2 balance is: " + account2.getbalance());

      Scanner input = new Scanner(System.in);
        System.out.println("Please enter your for amount: ");
      double despoitAmount = input.nextDouble();
       // System.out.println("Adding " + despoitAmount + "to account1");
        System.out.printf("%nAdding $%.2f to account1\n",despoitAmount);
      account1.credit(despoitAmount);
        System.out.println("Account 1 amount is: " + account1.getbalance());


        System.out.println("Please Enter Your for amount: ");
        despoitAmount = input.nextDouble();
        System.out.println("Adding " +despoitAmount + "to account2");
        account2.credit(despoitAmount);
        System.out.println("Account 2 amount is: " + account2.getbalance());

      //  System.out.println("total amount is account 1:\t" + account1.getbalance());
        System.out.printf("Total amount account 1 is: $%.2f\n",account1.getbalance());
        System.out.println("total amount is account 2:\t" + account2.getbalance());







    }




}
