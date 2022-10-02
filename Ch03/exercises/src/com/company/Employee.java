package com.company;

public class Employee {
    private String fname;
    private String lname;
    private double mSalary;

    public Employee(String fname, String lname, double mSalary) {
        this.fname = fname;
        this.lname = lname;
        this.mSalary = mSalary;
    }
    public Employee() {
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public double getmSalary() {
        return mSalary;
    }

    public void setmSalary(double mSalary) {
        if (mSalary > 0) {
            this.mSalary = mSalary;
        }
    }
    public double getyearlySalary(){
        return getmSalary() * 12;
    }
    public void setRasia(double rasia){
        setmSalary( mSalary += (mSalary / 100) *rasia );
    }




    public void EmployeeTest(){
        Employee employee1 = new Employee("Doaa","Mosalam",1000);
        Employee employee2 = new Employee("Ahmed","Mohammed",768);
        System.out.println(employee1.getFname() +"\t"+employee1.getLname()+"\t"+employee1.getmSalary());
        System.out.println(employee2.getFname() +"\t"+employee2.getLname()+"\t"+employee2.getmSalary());

        System.out.println("After 10% Rasia\n");
        employee1.setRasia(10);
        System.out.println(employee1.getyearlySalary() + "Per annum");
        employee2.setRasia(10);
        System.out.printf("%.2f %s ",employee2.getyearlySalary(),"Per annum");
        //System.out.println(employee2.getyearlySalary() + "Per annum");

    }








}
