package com.company;

public class PrimeNumbers {
    public boolean primenumber(int num) {

         int flag=0;
//         num = num /2;
//         if (num==0||num==1) {
//             System.out.println(num + " is not prime number.");
//         }else {
             for (int i =2;i<=num/2;i++){
                 if (num%i==0){
                     System.out.println(num +" is not prime number.");
                     flag=1;
                     break;
                 }
             }
             if (flag==0){
                 System.out.println(num + " is prime number.");
             }
        // }
         return true;



    }

    public void checkPrime(){
        System.out.println( "Prime numbers between 2 and 10,000 are: " );
        for (int x =2;x <=10000;x++){

            if (primenumber(x));
            System.out.println();

        }
    }
}
