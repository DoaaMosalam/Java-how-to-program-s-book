package com.company;

public class HW5_3 {
    public  void TestOne(){

        int sumOdd=0;
        int sumEven=0;

        for (int num =1; num<=99;num++){
            if (num%2==0) {
                System.out.println(num + " :is Even number");
                sumEven += num;
            }
            else{
                System.out.println(num + " :is Odd number");
                sumOdd += num;
            }


        }
        System.out.println("The Sum of Even number is: " + sumEven);
        System.out.println("The Sum of Oddd number is: " + sumOdd);



//       int  sum = 0;
//        for ( int count = 1; count <= 99; count += 2 )
//            sum += count;
//        System.out.println(sum);
    }

    public void TestTwo(){
        double value = 2.5;

        value = Math.pow(2.5,3);
        System.out.println(value);
    }

    public  void TestThree(){
        int count = 1;
        while (count<=20){
            System.out.print(count);
            if (count%5 == 0)
                System.out.println();
            else
                System.out.print('\t');


            ++count;

        }
    }

    public void TestFour(){
        for (int count = 1; count<=20;count++){
            System.out.print(count);
            if (count%5==0)
                System.out.println();
            else
                System.out.print("/t");
        }

//
    }
}
