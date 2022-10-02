package com.company;

public class InitArray {

    public static void initArray(){
        System.out.println("Index\t" + " Value");
        int [] array = new int[10];
//        array[0]=1;
//        array[1]=10;
//        array[2]=2;
//        array[3]=20;
//        array[4]=3;
//        array[5]=30;
//        array[6]=4;
//        array[7]=40;
//        array[8]=5;
//        array[9]=50;

      //  System.out.printf("%s%8s/n","Index","Value");
        for (int counter = 0;counter<array.length;counter++){
            //System.out.printf("%5d%8d\n",counter,array[counter]);
            System.out.println(counter + "\t      " + array[counter]);

        }
    }

    public static void initArray2(){
        System.out.println("Index" + "\t" + "Value");
        int [] n = {32, 27, 64, 18, 95, 14, 90, 70, 60, 37};
        for (int counter=0;counter<n.length;counter++){
            System.out.println(counter + "\t     " + n[counter]);
        }
        System.out.println("Length a N array is: " + n.length);
    }


    public static void calculatorArray(){
        System.out.println("Index" + "\t" + "Value");
        final int  Array_Length = 10;
        int [] array = new int[Array_Length];
        for (int counter=0;counter<array.length;counter++)
         array[counter] = 2+2*counter;
        for (int counter=0;counter<array.length;counter++){
            System.out.println(counter + "\t      " + array[counter]);
        }
    }

    public static void sumArray(){
        int total = 0;
        System.out.println("Index\t" + "Value");
        int[] array = { 87, 68, 94, 100, 83, 78, 85, 91, 76, 87 };
        for (int counter=0;counter<array.length;counter++){
             total += array[counter];
            System.out.println(counter +"\t" + array[counter]);
        }

        System.out.println("Total of array elements: " + total);

    }

}
