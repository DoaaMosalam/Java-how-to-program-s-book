package com.company;

import Start.*;

import java.util.Scanner;

public class Employee  {

    private String _Name;
    private int _Data;
    private String _Dept;
    private Boolean _isActive;

    public void setname(String name){
        _Name = name;
    }
    public  void setdata(int data){
        _Data = data;
    }
    public void setDept(String dept){
        _Dept = dept;
    }
    public void setisActive(Boolean active){
        _isActive = active;
    }


    public String get_Name(){
        return _Name;
    }

    public int get_Data(){
        return _Data;
    }

    public String get_Dept(){
        return _Dept;
    }

    public Boolean get_isActive(){
        return _isActive;
    }



    public void printInfo(){
        System.out.println("Initial course name is:" );
        System.out.println("Please enter your name: ");
        Scanner name = new Scanner(System.in);
        String thename = name.nextLine();
        setname(thename);



        System.out.println("Please enter your data: ");
        Scanner data = new Scanner(System.in);
        int thedata = data.nextInt();
        setdata(thedata);

        System.out.println("Please enter your Adress: ");
        Scanner adept = new Scanner(System.in);
        String thedept = adept.nextLine();
        setDept(thedept);
        System.out.println("Welcome: " + get_Name());
        System.out.println("Data is:" + get_Data());
        System.out.println("Your Dept is: " + get_Dept());
    }
}
