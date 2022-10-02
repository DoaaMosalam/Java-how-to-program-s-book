package com.company;

import javax.swing.*;
import java.util.Scanner;

import static javax.swing.JOptionPane.INFORMATION_MESSAGE;

public class Account {

    private double balance;

    public Account(){
    }


    public Account(double initialbalance){
        if (initialbalance > 0.0);
        balance = initialbalance;
    }


    public double getbalance(){
        return balance;
    }

    public void credit(double amount){
        balance = balance + amount;
    }


//   public void setWithdrawAmount(double withdraw) {
//       if (withdraw < balance) {
//           balance -= withdraw;
//       } else {
//           System.out.println("Debit amount exceeded account balance" + balance);
//       }


       public boolean debit(double amount){
           // ensure sufficient funds
           if(amount > balance)
               return false;

           balance -= amount;
           return true;
       }




//       public void AccountTest() {
//           Account account1 = new Account(50.0);
//
//           Account account2 = new Account(0.00);
//           System.out.println("Account 1 balance is: " + account1.getbalance());
//           System.out.println("Account 2 balance is: " + account2.getbalance());
//
//           Scanner input = new Scanner(System.in);
//           System.out.println("Please enter your for amount: ");
//           double despoitAmount = input.nextDouble();
//           System.out.printf("%nAdding $%.2f to account1\n", despoitAmount);
//           account1.credit(despoitAmount);
//           System.out.println("account 1 amount is: " + account1.getbalance());
//
//           System.out.println("Please enter your for amount: ");
//           despoitAmount = input.nextDouble();
//           System.out.println("Adding " + despoitAmount + "to account 2");
//           account2.credit(despoitAmount);
//
//           System.out.println("Account 2 amount is: " + account2.getbalance());
//
//           //  System.out.println("total amount is account 1:\t" + account1.getbalance());
//           System.out.printf("Total amount account 1 is: $%.2f\n", account1.getbalance());
//           System.out.println("total amount is account 2:\t" + account2.getbalance());
//
////-----debit that withdraws money from an Account-----------------
//           Scanner sc = new Scanner(System.in);
//           System.out.println("Please enter debit amount ");
//           double debitAmount = sc.nextDouble();
//           account1.setWithdrawAmount(debitAmount);
//           System.out.println("Account 1 amount exceeded account balance is : " + account1.getbalance());
//
//
//           System.out.println("PleasePlease enter debit amount");
//           debitAmount = sc.nextDouble();
//           account2.setWithdrawAmount(debitAmount);
//           System.out.println("Account 2 amount exceeded account balance is : " + account1.getbalance());
//
//           System.out.println("Total Account 1 is after Debit is: " + account1.getbalance());
//           System.out.println("Total Account 2 is after Debit is: " + account1.getbalance());
//       }
//---------------------------------------------------------------------------------------------------------------------
    public void accountTestShow(){
       // String message;
        double depositAmount;
        double debitAmount ;


        Account account1 = new Account(50.00);
        Account account2 = new Account(-7.53);

        showBalance(account1.getbalance(),account2.getbalance());


//        message = JOptionPane.showInputDialog("Please enter amount first account");
//        depositAmount = Double.parseDouble(message);
        depositAmount = Double.parseDouble(JOptionPane.showInputDialog("Please Enter deposit amount first account:"));
        showProgress("Adding","account1",depositAmount);
        account1.credit(depositAmount);
        showBalance(account1.getbalance(),account2.getbalance());

        depositAmount = Double.parseDouble(JOptionPane.showInputDialog("Please Enter deposit amount secomd account"));
        showProgress("Adding","account2",depositAmount);
        account2.credit(depositAmount);
        showBalance(account1.getbalance(),account2.getbalance());



        debitAmount = Double.parseDouble(JOptionPane.showInputDialog(" Please Enter withdrawl amount for account1: "));

        if(account1.debit(debitAmount) != true){
            JOptionPane.showMessageDialog(null, "Debit amount exceeded account balance");
        }
        showBalance(account1.getbalance(),account2.getbalance());
        account1.debit(debitAmount);


        debitAmount = Double.parseDouble(JOptionPane.showInputDialog(" Please Enter withdrawl amount for account1: "));

        if(account2.debit(debitAmount) != true){
            JOptionPane.showMessageDialog(null, "Debit amount exceeded account balance");
        }
        showBalance(account1.getbalance(),account2.getbalance());
        account1.debit(debitAmount);

        showBalance(account1.getbalance(),account2.getbalance());

    }



    private void showBalance(double getbalance, double getbalance1) {
        String strMessage = String.format("First balance Account is: $%.2f\n,second balance Account is: $%.2f",getbalance,getbalance1);
        JOptionPane.showMessageDialog(null,strMessage);


    }

     private void showProgress(String action, String account, double amount){
         String strProgress = String.format(
                 "%s $%.2f to %s balance...", action, amount, account);
         JOptionPane.showMessageDialog(null, strProgress);
    }


}
