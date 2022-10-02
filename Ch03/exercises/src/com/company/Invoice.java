package com.company;

import java.util.Scanner;

public class Invoice {

    private String part_number;
    private String part_description;
    private int _quantity;
    private double  _price;

    public Invoice(){

    }

    public Invoice(String number,String description,int quantity,double price){
        part_number = number;
        part_description = description;
        _quantity = quantity;
        _price = price;
    }



    public String getPartNumber() {
        return part_number;
    }

    public String getPartDescription() {
        return part_description;
    }

    public int getquantity() {
        return _quantity;
    }

    public double getprice() {
        return _price;
    }

    public double getInvoiceAmount(){
        return getquantity() * getprice();
    }

    public void setPart_number(String part_number) {
        this.part_number = part_number;
    }

    public void setPart_description(String part_description) {
        this.part_description = part_description;
    }

    public void set_quantity(int quantity) {
        if (quantity < 0) {
            this._quantity = quantity;
        }else{
            System.out.println(quantity);
        }
    }

    public void set_price(double salary) {
        if (salary > 0.0) {
            this._price = salary;
        }
    }


    public void InvoiceTest() {
        Invoice client1 = new Invoice("123","Shoes",2,100.50);

        System.out.println(client1.getPartNumber()+"\t"+ client1.getPartDescription()+"\t"+
                client1.getquantity()+"\t"+client1.getprice() + " = " + client1.getInvoiceAmount());

        Invoice client2 = new Invoice("124","T-shirts",4,300);
        System.out.println(client2.getPartNumber()+"\t"+ client2.getPartDescription()+"\t"+
                client2.getquantity()+"\t"+client2.getprice() + " = " + client2.getInvoiceAmount());
        int Total = (int) (client1.getInvoiceAmount() + client2.getInvoiceAmount());
        System.out.println("Date today is:");
        Scanner date = new Scanner(System.in);
        String hositry = date.nextLine();
        System.out.println("Total is Invoice:\t"+ Total + "Today\t" +  hositry);


        Invoice spanner = new Invoice("123", "A Spanner", 15, 12.5);

    }







}
