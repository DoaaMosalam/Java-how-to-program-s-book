package com.company;

import javax.swing.*;
import java.util.Scanner;

public class Credit {
    int credit;
    int creditLimit;
    int charge;
    int oldBalance;
    int newBalance;
    int account;

    public Credit() {
    }

    public int getCredit() {
        return credit;
    }
    public int getCreditLimit(){
        return creditLimit;
    }

    public void setCreditLimit(int creditLimit){

        this.creditLimit = creditLimit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public int getCharge() {
        return charge;
    }

    public void setCharge(int charge) {
        this.charge = charge;
    }

    public int getOldBalance() {
        return oldBalance;
    }

    public void setOldBalance(int oldBalance) {
        this.oldBalance = oldBalance;
    }

    public int getNewBalance() {
        return getOldBalance() + getCharge() - getCredit();
    }

    public void setNewBalance(int newBalance) {
        this.newBalance = newBalance;
    }

    public int getAccount() {
        return account;
    }

    public void setAccount(int account) {
        this.account = account;
    }

    public void calcurateBalance(){

        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your Number Account: " );
        account = input.nextInt();
        setAccount(account);

        while (account != -1) {



            System.out.println("Enter your Balance: ");
            oldBalance = input.nextInt();
            setOldBalance(oldBalance);

            System.out.println("Enter Your Charge: ");
            charge = input.nextInt();
            setCharge(charge);

            System.out.println("Enter Your Credit : ");
            credit = input.nextInt();
            setCredit(credit);

            System.out.println("Enter your Credit Limit: ");
            creditLimit = input.nextInt();
            setCreditLimit(creditLimit);




           // newBalance = getOldBalance() + getCharge() - getCredit();

            System.out.println("New Balance is: " + getNewBalance());

            if (newBalance > credit)
                System.out.println("Credit limit exceeded");
                System.out.print("\nEnter Account Number (or -1 to quit): ");
                account = input.nextInt();

        }

}















//      //  Credit credit1 = new Credit(10000);
//        String Message;
//
//        account = Integer.parseInt(JOptionPane.showInputDialog("Enter your Account number,Please:"));
//        while (account != -1){
//            oldBalance = Integer.parseInt(JOptionPane.showInputDialog("Enter Balance,please:"));
//            charges = Integer.parseInt(JOptionPane.showInputDialog("Enter Charges,please:"));
//            credit = Integer.parseInt(JOptionPane.showInputDialog("Enter Credit,please:"));
//            creditLimit = Integer.parseInt(JOptionPane.showInputDialog("Enter CreditLimite,please:"));
//            newBalance = oldBalance + charges - credit;
//
//            showInfo(oldBalance,charges,credit,creditLimit,newBalance);
//
//            if (newBalance > creditLimit);
//            Message = JOptionPane.showInputDialog("Credit limit exceeded");
//            JOptionPane.showMessageDialog(null,Message);
//
//
//        }
//
//
//    }
//
//    private void showInfo(int oldBalance1, int charges1, int credit1,int creditLimit1,int newBalance1) {
//        String str = String.format("Your Balance:\t %d\nYour Charge:\t%d \nyour Credit:\t%d " +
//                        "\nyour Credit Limit:\t%d New Balance is:\t%d"
//                ,oldBalance1,charges1,credit1,creditLimit1,newBalance1);
//        JOptionPane.showMessageDialog(null,str);

}
