package exercise.H;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class HW {
    public static double[] array_Size(){
        final int ARRAY_SIZE=10;
        double[] array = new double[ARRAY_SIZE];
        array[0]=4.740;
        array[1]=0.150;
        array[2]=7.850;
        array[3]=0.510;
        array[4]=5.560;
        array[5]=9.980;
        array[6]=3.333;
        array[7]=2.680;
        array[8]=2.580;
        array[9]=1.667;
        return array;
    }

    public static void printArray(double[]array){
        for (int i = 0; i <array.length-1; i++) {
            System.out.printf("%.2f - ",array[i]);
        }
        System.out.println(array[array.length-1]);
    }
    public static void printTwoArray(double[][]array){
        for (int row=0;row<array.length;row++){
            for (int column=0;column<array[row].length;column++){
                System.out.printf("%.2f - ",array[row][column]);
            }
            System.out.println(" ");
        }
    }

    public static double[]convertToArray(String line){
        String[] pieces = line.split("[ ]");
        double[] array = new double[pieces.length];
        for (int i=0;i<array.length;i++){
            array[i]=Double.parseDouble(pieces[i]);
        }
        return array;
    }

    public static double[]loadData(String fileName,int row) throws FileNotFoundException {
        Scanner input = new Scanner(new File("E:\\Coders Programming\\Java\\Videos\\FadelK\\Arrays(FadelK)\\"+fileName));
        double[] array = new double[row];
        for (int i = 0; i <array.length ; i++) {
            array = convertToArray(input.nextLine());
        }
        return array;
    }

    public static double findIndex(double[] array,double num){
//        int k=0;
//        for (int i=0;i<array.length;i++){
//            if (num==array[i]){
//                k=i;
//                break;
//            }
//        }
//        return k;
//// if you want used bineary search
        System.out.println("Sort Array: ");
        Arrays.sort(array);
        for (int i=0;i<array.length-1;i++){
            System.out.printf("%.2f - ", array[i]);
        }
        System.out.println(array[array.length-1]);
        int location = Arrays.binarySearch(array,num);
        if (location>=0){
            System.out.printf("Found element in index %d =" ,location);
        }
        else {
            System.out.printf("Not Found element");
        }
        return location;
    }

    public static boolean equal(double[]array){
        double[] y = new double[array.length];
        int i;
        for (i=0;i<y.length;i++) {
            y[i] = array[i];
            if (y[i] == array[i]) {
                System.out.println(true);
            }
        }
        return false;
    }
    public static double sum(double[]array){
        double total =0;
        for (int i=0;i<array.length;i++){
            total+=array[i];
        }
        return total;
    }
    public static void copyArray(double []array){
        double[] y = new double[array.length];
        for (int i=0;i<y.length;i++){
            y[i] = array[i];
        }
        System.out.print("Copy array from array price = ");
        printArray(y);
    }

    public static double[][]loadData(String fileName,int row,int start)throws FileNotFoundException{
        Scanner input = new Scanner(new File("E:\\Coders Programming\\Java\\Videos\\FadelK\\Arrays(FadelK)\\"+fileName));
        for (int y=0;y<start;y++){
            System.out.println(input.nextLine());
        }
        double[][] price = new double[row][];
        for (int i = 0; i <price.length ; i++) {
            price[i]= convertToArray(input.nextLine());
        }
        return price;
    }

    public static double GrandTotal(double[][]array){
        double total=0.0;
        for (int row=0;row<array.length;row++){
            for (int column=0;column<array[row].length;column++){
               total+=array[row][column];
            }
        }
        return total;

    }

    public static double getMinimum(double[][]array){
        double max = array[0][0];
        for (double[] y: array){
            for (double value: y){
                if (value<max){
                    max=value;
                }
            }
        }
        return max;
    }

    public static double getMaximum(double[][]array){
        double max = array[0][0];
        for (double[]x:array){
            for (double value:x){
                if (value>max){
                    max=value;
                }
            }
        }
        return max;
    }

    public static void display() throws FileNotFoundException {
        double[]prices = array_Size();
        printArray(prices);
        System.out.println(findIndex(prices,2.68));
        System.out.println(equal(prices));
        System.out.printf("Sum array = %.2f\n",sum(prices));
        copyArray(prices);

//        double[]prices = loadData("04.txt",1);
//        printArray(prices);
// declare two demenstion array.
//        System.out.println("====================================================================================================================");
//        System.out.println("Two Demenstion Array");
//        double[][] data = loadData("04.txt",3,2);
//        printTwoArray(data);
//        System.out.println("Grand Total 2D = " + GrandTotal(data));
//        System.out.println("Minimum value = " + getMinimum(data));
//        System.out.println("Maximum Value = " + getMaximum(data));
        System.out.println("=======================================================================================");

        int[] f = new int[6];
        int [] p ={8,8,8,8,};
        double[]c= new double[100];
        double total =0;
        for (int i=0;i<c.length;i++){
            total+=c[i];
        }
        System.out.println(total);

    }
}
