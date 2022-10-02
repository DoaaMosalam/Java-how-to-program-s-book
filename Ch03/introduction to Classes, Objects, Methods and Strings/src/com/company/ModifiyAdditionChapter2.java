package com.company;

import javax.swing.*;
import java.nio.channels.ScatteringByteChannel;
import java.util.Scanner;

public class ModifiyAdditionChapter2 {
    String message;
    int num1;
    int num2;
    int sum;

    public void inputmessage(){
        message = JOptionPane.showInputDialog("Please enter first number:");
        num1 = Integer.parseInt(message);
        message = JOptionPane.showInputDialog("Please enter second number:");
        num2 = Integer.parseInt(message);
        sum = num1 + num2;
        JOptionPane.showMessageDialog(null,"Sum is: " + sum);

    }

    public  void message(){
        String name = JOptionPane.showInputDialog("Enter your name:");
       // String input = String.format("Welcome:\t%s,To Java Programming!",name);

        JOptionPane.showMessageDialog(null, name +" Welcome to Java Programming!" ,"Display Message",JOptionPane.INFORMATION_MESSAGE);
    }

// this is method in chapter 2 that modifiy

//    public void addition(){
//        Scanner input = new Scanner(System.in);
//        System.out.println("Please enter first number: ");
//        int num1 = input.nextInt();
//        System.out.println("Please enter second number: ");
//        int num2 = input.nextInt();
//        int sum = num1 + num2;
//        System.out.println("sum is: " + sum);
//    }


}
