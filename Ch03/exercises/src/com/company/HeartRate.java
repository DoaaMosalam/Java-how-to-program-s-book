package com.company;

import javax.swing.*;
import java.util.Calendar;
import java.util.Scanner;

public class HeartRate {
    private String fName;
    private String lName;
    private int day,month,year;

    public HeartRate() {
    }

    public HeartRate(String fName1, String lName1, int day1, int month1, int year1) {
        this.fName = fName1;
        this.lName = lName1;
        this.day = day1;
        this.month = month1;
        this.year = year1;
    }


    public String getfName() {
        return fName;
    }

    public String getlName() {
        return lName;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getAgePearson(){
        return Calendar.getInstance().get(Calendar.YEAR);
    }

    public int  getMaximumHeartRate(){
        return 220 - getAgePearson();
    }

    public String getTargetHeartRate(){
        return String.format("%.0f -%.0f ",getAgePearson() * 0.5 , getAgePearson() * 0.85);

    }

    public void HeartRateTest(){
        HeartRate heartRate = new HeartRate();

        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your First Name: ");
        String firstname = input.nextLine();
        heartRate.setfName(firstname);

        System.out.println("Enter your Second Name: ");
        String lastname= input.nextLine();
        heartRate.setlName(lastname);

        System.out.println("enter your Birthday: ");
        int yourday = input.nextInt();
        heartRate.setYear(yourday);

        System.out.println("enter your Birthday: ");
        int yourmonth = input.nextInt();
        heartRate.setYear(yourmonth);

        System.out.println("enter your Birthday: ");
        int youryear = input.nextInt();
        heartRate.setYear(youryear);

        System.out.println(heartRate.getfName() + heartRate.getlName() + heartRate.getYear());
        System.out.println("person’s maximum heart rate: " + heartRate.getMaximumHeartRate());
        System.out.println("person’s target heart rate: " + heartRate.getTargetHeartRate());

    }
//----------------------------------------------------------------------------------------------------
    // this method call by JOptionPane.
    public void ShowHeartRate(){
        String firstname,lastname;
        int day,month,year;
        HeartRate heartRate = new HeartRate();

        firstname = JOptionPane.showInputDialog("Enter Your First Name: ");
        lastname = JOptionPane.showInputDialog("Enter Your Second Name: ");
        day = Integer.parseInt(JOptionPane.showInputDialog("Enter Your Day of Birth: "));
        month = Integer.parseInt(JOptionPane.showInputDialog("Enter Your Month of Birth:  "));
        year = Integer.parseInt(JOptionPane.showInputDialog("Enter Your Year of Birth: "));

        heartRate.setfName(firstname);
        heartRate.setlName(lastname);
        setDay(day);
        setMonth(month);
        setYear(year);

        showDetails(firstname,lastname,day,month,year);

        heartRate.getMaximumHeartRate();
        heartRate.getTargetHeartRate();
        heartRate.getDataOfBirth();

        showInfo(getMaximumHeartRate(),getTargetHeartRate());


    }

    public String getDataOfBirth(){
        return String.format("%d/%d/%d",day,month,year);
    }
    private void showDetails(String name1,String name2,int day1,int month1,int year1){
        String str = String.format("Your First name is: %s\n Your Second Name: %s\n Your Data Of Bith is: %d/%d/%d",name1,name2
        ,day1,month1,year1);
        JOptionPane.showMessageDialog(null,str);

    }
    private void showInfo(int getMaximumHeartRate,String getTargetRate){
        String strdetails = String.format("person’sMaximum Heart Rate: %d\n,person’s target heart rate: %s",
                getMaximumHeartRate,getTargetRate);
        JOptionPane.showMessageDialog(null,strdetails);
    }
}
