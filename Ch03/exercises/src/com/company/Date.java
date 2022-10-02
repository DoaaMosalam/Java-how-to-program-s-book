package com.company;

import java.util.Scanner;

public class Date {
    private int month;
    private int day;
    private int year;
    // empty constructor.
    public Date(){

    }

    public Date(int month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }
    public int getMonth(){
        return month;
    }
    public int getDay(){
        return day;
    }
    public int getYear(){
        return year;
    }
    public void setMonth(int month1){
        if (month >= 0 && month <= 12){
            month = month1;
        }else {
            month = 0;
        }
    }

    public void setDay(int day1) {
        if (day >= 0 && day <=30){
            day = day1;
        }else {
            day = 0;
        }
    }

    public void setYear(int year1) {
        this.year = year1;
    }

//    public void displayDate () {
//        System.out.printf ("%d/%d/%d\n", getMonth(), getDay(), getYear());
//    }

    public void DateTest(){
        Date date = new Date();

        Scanner input = new Scanner(System.in);

        System.out.println("enter Your Month:");
        int month =input.nextInt();
        date.setMonth(month);

        System.out.println("enter Your Day:");
        int day = input.nextInt();
        date.setDay(day);

        System.out.println("enter Your Year:");
        int year = input.nextInt();
        date.setYear(year);

        System.out.println(date.getMonth() + "/" + date.getDay() + "/" + date.getYear());

      //  date.displayDate();











    }
}
