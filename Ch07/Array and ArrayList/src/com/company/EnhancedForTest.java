package com.company;

public class EnhancedForTest {

    public void forEachtest() {

        int[] array = {87, 68, 94, 100, 83, 78, 85, 91, 76, 87};
        int total = 0;


        for (int number: array) {
            total+=number;

        }
        System.out.printf( "Total of array elements: %d\n", total );

    }

}
