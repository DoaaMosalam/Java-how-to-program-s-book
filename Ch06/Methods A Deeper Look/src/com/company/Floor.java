package com.company;
enum FloorType{in,out;}

public enum  Floor {
    f1(1,"Class Kg 1"),f2(),f3(),f4(),f5;

    public int num;
    public String name;




   Floor(){

     //  System.out.println("Enum Floor");

    }
    private Floor(int num){
       this.num = num;
       // System.out.println("Enum Floor With Integer" + num);
    }
    private Floor(int num,String Class){
       this.num = num;
       this.name = Class;
       // System.out.println("Enum Floor With Integer" +num +" && String Name Class is " + Class);

    }
}


