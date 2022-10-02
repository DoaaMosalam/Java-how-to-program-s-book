package exercise.H;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class UsingtheEnhancedforStatement {
   public static void  array(double[][]x){
       for (int row = 0; row < x.length ; row++) {
           for (int column = 0; column <x[row].length ; column++) {
               System.out.printf("{%.2f}" ,x[row][column]);
           }
       }
       System.out.println(" ");
   }
   public static double[] convertArray(String line){
       String[] pieces = line.split("[ ]");
       double[] array=new double[pieces.length];
       for (int count = 0; count <array.length ; count++) {
           array[count] = Double.parseDouble(pieces[count]);
       }
       return array;
   }

   public static double[][] loadData(String fileName,int row)throws FileNotFoundException {
       Scanner input = new Scanner(new File("D:\\Coders Programming\\Java\\Videos\\FadelK\\Arrays(FadelK)\\"+fileName));
       double[][] data = new double[row][];
       for (int i = 0; i <data.length ; i++) {
           data[i]=convertArray(input.nextLine());
       }
       return data;
   }
   public static double sum(double[][]array){
       double sum = 0;
       int i=0;
       for (; i <array.length ; i++)
           sum+=array[i][0];
       return sum;
   }

    public static void display() throws FileNotFoundException{
       double[][] data = loadData("01.txt",6);
       array(data);
        System.out.println("============================================");
        System.out.println("Sum is "+ sum(data));

    }
}
