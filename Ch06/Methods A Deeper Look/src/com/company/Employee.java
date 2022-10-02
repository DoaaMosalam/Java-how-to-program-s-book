package com.company;

enum f1{administration,Security};
enum  f2{ClassKg1};
enum  f3{ClassKg2,PrimOne};
enum f4{ClassPrimeTwo,PrimeThree};
enum f5{ClassSecondary,Prep};

public class Employee {
    public int empNo;
    public String empName;
    public  String address;
    public Floor workFloor;

    f1 stdf1;
    f2 stdf2;
    f3 stdf3;
    f4 stdf4;
    f5 stdf5;


    public  Employee(Floor workFloor,FloorType type) {
        this.workFloor = workFloor;

       stdf1 = f1.administration;
       stdf2 = f2.ClassKg1;
       stdf3 = f3.ClassKg2;
       stdf4 = f4.ClassPrimeTwo;
       stdf5 = f5.ClassSecondary;
    }





}
