package com.company;

import java.util.Scanner;

public class Sales {
    public void calculatorSale(){
        Scanner input = new Scanner(System.in);
        double product1=0,product2=0,product3=0,product4=0,product5=0;
        int productNum = 1;
        while (productNum != 0){
            System.out.print("Enter product number (1-5) (0 to stop): ");
            productNum = input.nextInt();

            if (productNum >=1 && productNum<=5){

                System.out.print( "Enter quantity sold: " );
                 int quantity = input.nextInt();

                 switch (quantity) {
                     case 1:
                         product1 += quantity * 2.98;
                         break;
                     case 2:
                         product2 += quantity * 4.50;
                         break;
                     case 3:
                         product3 += quantity * 9.98;
                         break;
                     case 4:
                         product4 += quantity * 4.49;
                         break;
                     case 5:
                         product5 += quantity * 6.87;
                         break;
                     default:
                         System.out.println("You must enter product between (1-5).");
                 }

            }else if (productNum != 0)
                System.out.println("Enter product number (1-5) (0 to stop): ");
        }


        System.out.println();
         System.out.printf( "Product 1: $%.2f\n", product1 );
         System.out.printf( "Product 2: $%.2f\n", product2 );
         System.out.printf( "Product 3: $%.2f\n", product3 );
         System.out.printf( "Product 4: $%.2f\n", product4 );
         System.out.printf( "Product 5: $%.2f\n", product5 );
    }
}
