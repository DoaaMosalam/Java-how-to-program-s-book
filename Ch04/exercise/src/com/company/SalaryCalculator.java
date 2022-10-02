package com.company;

import java.util.Scanner;

public class SalaryCalculator {

    public void employee(){
        double grossPay;
        double hours;
        double rate;
        int count = 1;

        Scanner input = new Scanner(System.in);

        while (count <= 3){
            System.out.print("enter your hours  worked:" );
            hours = input.nextDouble();

            System.out.print("Entr your Rate Worked: ");
            rate = input.nextDouble();
            if (hours> 40){
                grossPay = (40.0 * rate) + (hours -40) *(rate * 1.5);

            }else {
                grossPay = hours * rate;
            }
            System.out.println("Pay for Employee " + count + "is: "  + grossPay);
            count++;




        }

    }



}
