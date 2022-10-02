package com.company;

public class PrintF {
    public void PrintF(){
        System.out.printf( "%s\n%s\n", "Welcome to", "Java Programming!" );
        double x = 22.0 / 7;
// This is Take two number after ,
      //  System.out.printf("%.3f",x);
//        System.out.printf("%.5f",x);

//تنسيق الرقم المطبوع 10 خانات فارغه
// وطباعه رقمين بعد العلامه العشريه
//        System.out.printf("%10.2f",x);

// print number in Right
//        System.out.printf("%-10.2f",x);

// print Zero before number
//        System.out.printf("%010.2f",x);

// if number - appear between Parentheses
//        System.out.printf("%(10.2f",x);

// + it.s appear sign numbers + or -
 //       System.out.printf(" The value is: %+10.2f",x);

//---------------------- if you want print two number----------------
        double a = 22.0 / 7;
        int y = 55;
       // System.out.printf("%.2f %5.2f",x,y);

       // System.out.printf("the value is:%5.2f %20d",x,y);

//-----------------------------------------------------------------
        double d = 2254812.0 /7;
        long i = 372458234;
//        System.out.printf("The value is:%,.2f",d);

        System.out.printf("%s %,d","Doaa Sayed Mosalam",i);


    }
}
