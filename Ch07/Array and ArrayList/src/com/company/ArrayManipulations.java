package com.company;
import java.util.Arrays;

public class ArrayManipulations {
    public static void Manipulations() {
        double[]doublesArray = { 8.4, 9.3, 0.2, 7.9, 3.4 };
       Arrays.sort(doublesArray);
        System.out.println("double Arrays: ");
        for (double values : doublesArray)
            System.out.printf("%.1f ",values);

        // fill 10-element array with 7s
        int []fillArray = new int[10];
        Arrays.fill(fillArray,7);
        displayArray(fillArray,"Fill Arrays:");

        // copy array intArray into array intArrayCopy
        int [] intArray ={1,2,3,4,5,6};
        int [] intArrayCopy = new int[intArray.length];
        System.arraycopy(intArray,0,intArrayCopy,0,intArray.length);
        displayArray(intArray, "Int Array");
        displayArray(intArrayCopy, "Int Array Copy");

        // compare intArray and intArrayCopy for equality
        boolean b = Arrays.equals(intArray,intArrayCopy);
        System.out.printf("\n\nint Array %s int Array Copy\n",(b ? "==" : "!=="));

        // search intArray for the value 5
        int location = Arrays.binarySearch(intArray,5);
        if (location>=0)
            System.out.printf("Found 5 at element %d in intArray\n",location);
        else
            System.out.println( "5 not found in intArray" );

        // search intArray for the value 8763
        location = Arrays.binarySearch(intArray,8763);
        if (location>=0)
            System.out.printf("Found 8763 at element %d in intArray\n",location);
        else
            System.out.println("8763 not found in intArray");
    }

    public static void displayArray(int[]array,String descriptions){
        System.out.printf("\n%s",descriptions );
        for (int value: array)
            System.out.printf("%d ",value);
    }
}
