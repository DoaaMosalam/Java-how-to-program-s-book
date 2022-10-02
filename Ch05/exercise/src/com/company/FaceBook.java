package com.company;

import java.util.Scanner;

public class FaceBook {
    public void facebookGrowth() {
        double rate = 0.05;
        long growth = 500000000;
        double total;


        System.out.println("Estiamted Population growth for 8 months");
        System.out.println();
        System.out.println("Month" + "\tAmount of Users ");

        for (int year = 1; year <= 30; year++) {
            total = growth * Math.pow(1.0 + rate, year);
            System.out.printf("%4d %20.2f\n", year, total);

        }



//        java.util.Scanner input=new java.util.Scanner(System.in);
//        double  rate=0.05;
//        double growthRate=500000000;
//        double tot;
//        double newman;
//        int num;
//
//
//        System.out.println("Estiamted Population growth for 8 months");
//        System.out.println();
//        System.out.println("Month"+"\tAmount of Users ");
//        for(int year=1;year<=36;year++){
//
//            //this will calculate the total pop growth montly
//
//            //tot=growthRate*rate;

//            tot=growthRate*Math.pow(1.0+rate,year);
//
//            //growthRate+=tot;
//            System.out.printf("%4d%,20.2f\n", year,tot );
//
//        }
//        //to find the months needed to Reach a population
//        //just enter Population amount and it will calculate the months it will take
//
//        System.out.println("For the estimated Population growth it will take  15 month for facebook to get to 1 billion users \nAnd 29 months for it to get to 2 billion users");
//        num=input.nextInt();
//        newman=(num*1+0.5/12)*12;
//        newman= (num*Math.pow(1+0.5/12, 12));
//        System.out.println("it will take "+newman+" months for Population to get to "+num);




    }
}
