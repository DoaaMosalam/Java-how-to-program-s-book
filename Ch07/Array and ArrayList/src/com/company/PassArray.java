package com.company;

public class PassArray {
  //  double [] hourlyTemperatures = new double[24];
public static void display() {
    int[] array = {1, 2, 3, 4, 5};

    System.out.println("Effects of passing reference to entire array:\n" +
            "The values of the original array are:");

    for (int values:array
         ) {
        System.out.printf("    %d",values);

    }
    modifyArray(array);
    System.out.println("\n\nThe values of modify array are: " );
    for (int values:array) {
        System.out.printf("    %d",values);
    }

    System.out.printf(
            "\n\nEffects of passing array element value:\n" +
                    "array[3] before modifyElement: %d\n", array[ 3 ] );
    modifyElement(array[3]);
    System.out.printf(
            "array[3] after modifyElement: %d\n", array[ 3 ] );
}

    public static void modifyArray(int []b) {
        for (int counter = 0; counter < b.length; counter++) {
            b[counter] *= 2;

        }


    }

    public static void modifyElement(int element){
    element*=2;
        System.out.printf("Value of element in modifyElement: %d\n", element);
    }



}
