package com.company;

public class Sum {
    public void total(){
        int total=0;
//        for (int sum =2; sum<=20;sum+=2) {
//            total += sum;
//            System.out.println(sum);
//        }
//        System.out.println("Sum is: " + total);

// you could merge the body of the for statement in line 11–12 of Fig. 5.5

//            for (int sum=2;sum<=20;total+=sum,sum+=2);
//        System.out.println("Sum is:" + total);
//

        }




    public void EvenandOdd() {
        for (int i = 2; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " Even");
            } else {
                System.out.println(i + " Odd");
            }

        }
    }
}
