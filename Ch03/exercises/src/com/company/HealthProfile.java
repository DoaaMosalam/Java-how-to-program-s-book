package com.company;

import javax.swing.*;
import java.util.Calendar;
import java.util.Scanner;

public class HealthProfile {
    private String fname;
    private String lname;
    private String gender;
    private int day;
    private int month;
    private int year;
    private double weight;
    private double height;

    public HealthProfile(){

    }

    public HealthProfile(String firstnam ,String lastnam ,String gend ,int day1,int month1,int year1,double weight1,double height1 ){
        this.fname = firstnam;
        this.lname = lastnam;
        this.gender = gend;
        this.day = day1;
        this.month = month1;
        this.year = year1;
        this.weight = weight1;
        this.height = height1;
    }

    public void setFirstName(String firstname) {
        this.fname = firstname;
    }

    public void setLastName(String lastName) {
        this.lname = lastName;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setDay(int daybirth) {
        this.day = daybirth;
    }
    public void setMonth(int monthbirth){
        this.month = monthbirth;
    }
    public void setYear(int yearbirth){
        this.year = yearbirth;
    }

    public void setWeight(double weight){
        this.weight = weight;
    }
    public void setHeight(double height){
        this.height = height;
    }


    public String getFname() {
        return fname;
    }

    public String getLname() {
        return lname;
    }

    public String getGender() {
        return gender;
    }

    public int getDay() {
        return day;
    }

    public int getMonth(){
        return year;
    }

    public int getYear(){
        return year;
    }

    public double getWeight(){
        return weight;
    }

    public double getHeight(){
        return height;
    }

    public String getdatabirth(){
        return String.format("%d,%d,%d",day,month,year);
    }

    public int getPearsonAge(){
        return Calendar.getInstance().get(Calendar.YEAR);
    }
    public int getMaximumHeartRate(){
        return 220 - getPearsonAge();
    }

    public String getTargetHeartRate(){
        return String.format("%.0f - %.0f",getPearsonAge() * 0.5,getPearsonAge() * 0.85 );
    }


    public double getbmi(){

            return (double) (weight * 703) / (height * height);

    }

    public void HealthProfileTest(){
        HealthProfile healthProfile = new HealthProfile();

        Scanner input = new Scanner(System.in);

        System.out.println("Enter Your First name: ");
        String nam1 = input.nextLine();
        healthProfile.setFirstName(nam1);

        System.out.println("Enter Your Last name: ");
        String nam2 = input.nextLine();
        healthProfile.setLastName(nam2);

        System.out.println("Enter your Gender: ");
        String g = input.nextLine();
        healthProfile.setGender(g);

        System.out.println("Enter Your Birth day: ");
        int day = input.nextInt();
       setDay(day);

        System.out.println("Enter Your Birth month: ");
        int month = input.nextInt();
        setMonth(month);

        System.out.println("Enter Your Birth year: ");
        int year = input.nextInt();
        setYear(year);



        System.out.println("Enter your Weight: ");
        double weight = input.nextDouble();
        healthProfile.setWeight(weight);

        System.out.println("Enter your height: ");
        double height = input.nextDouble();
        healthProfile.setWeight(height);

        System.out.println("first name is:" + healthProfile.getFname());
        System.out.println("Nick name is:" + healthProfile.getLname());
        System.out.println(healthProfile.getGender());
        System.out.println(healthProfile.getWeight());
        System.out.println(healthProfile.getHeight());
        System.out.println(healthProfile.getbmi());

        System.out.println("Data Of Birthday is: " + getdatabirth());
        System.out.println("person’s maximum heart rate: " + healthProfile.getPearsonAge());
        System.out.println("person’s target heart rate: " + healthProfile.getTargetHeartRate());

        System.out.println("\nBMI Categories:\r\n" + "Underweight =< 18.5\r\n" + "Normal weight = 18.5�24.9\r\n"
                + "Overweight = 25�29.9\r\n" + "Obesity = BMI of 30 or greater");
    }
//-------------------------------------------------------------------------------------------[
    // this method call by JOptionPane.
    public void HealthProfileGui(){
        String message, firstname,lastname,gender;
        int day,month,year;
        double weight,height;

        HealthProfile health = new HealthProfile("doaa","Mosalam","Female",6,9,1991,160,173);

        firstname = JOptionPane.showInputDialog("Please Enter First name: ");
        lastname = JOptionPane.showInputDialog("Please enter Second name: ");
        gender = JOptionPane.showInputDialog("Your Gender is: ");
        day = Integer.parseInt(JOptionPane.showInputDialog("Day of Birthday: "));
        month = Integer.parseInt(JOptionPane.showInputDialog("Month of Birthday: "));
        year = Integer.parseInt(JOptionPane.showInputDialog("Year of Birthday: "));
        weight = Double.parseDouble(JOptionPane.showInputDialog("enter your Weight: "));
        height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height: "));

        health.setFirstName(firstname);
        health.setLastName(lastname);
        health.setGender(gender);
        health.setDay(day);
        health.setMonth(month);
        health.setYear(year);
        health.setWeight(weight);
        health.setHeight(height);
        health.getdatabirth();
        health.getMaximumHeartRate();
        health.getTargetHeartRate();
        health.getbmi();

        showProgress(firstname,lastname,gender,day,month,year,weight,height);
        showdetails(getMaximumHeartRate(),getTargetHeartRate(),getbmi());

        System.out.println("\nBMI Categories:\r\n" + "Underweight =< 18.5\r\n" + "Normal weight = 18.5�24.9\r\n"
                + "Overweight = 25�29.9\r\n" + "Obesity = BMI of 30 or greater");



    }



    private void showProgress(String firstname, String secondname, String gender,
                              int day,int month, int year,double weirgt,double height){

        String strProgress = String.format(
                "First name:%s\n Second name:%s\n Your Gender: %s\n Age is %d/%d/%d\n Weight is:.%f\n Height is:.%2f ", firstname, secondname, gender,
                day,month,year,weirgt,height);
        JOptionPane.showMessageDialog(null, strProgress);
    }
    private void showdetails(int getMaximumHeartRate,String getTargetRate,double getbmi){
        String str = String.format("Maximum Heart Rate: %d\n Target Rate: %s\n %.0f",getMaximumHeartRate,getTargetRate,getbmi);
        JOptionPane.showMessageDialog(null,str);
    }



}
