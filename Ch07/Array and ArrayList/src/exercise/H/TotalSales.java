package exercise.H;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class TotalSales {

//This method print two dimensional Array
    public static double[][]printTwoArray(double[][]array){
        for (int i=0;i<array.length;i++){
            System.out.println(Arrays.toString(array[i]));
        }
//        for (int row=0;row<array.length;row++){
//            for (int column=0;column<array[row].length;column++){
//              //  System.out.printf("%.1f-",array[row][column]);
//             //   System.out.println("array[ " + row + "][" + column + "] =" + array[row][column]);
//            }
//        }
        return array;
    }
//this method convert file array from String to array
    public static double[] ConvertToArray(String line){
        String[] pieces = line.split("\\s");
        double[] sales = new double[pieces.length];
        for (int i = 0; i <sales.length ; i++) {
            sales[i]=Double.parseDouble(pieces[i]);
        }
        return sales;
    }
    //this method load data from file txt.
    public static double[][] loadData(String fileName,int row) throws FileNotFoundException {
        Scanner input = new Scanner(new File("D:\\Coders Programming\\Java\\Java-How To Program\\Project in Book\\Ch07\\"+fileName));

        double[][] data = new double[row][];
        for (int i = 0; i <data.length ; i++) {
            data[i] = ConvertToArray(input.nextLine());

        }
        return data;
    }
//// this method  about start array from special line.
    public static double[][] loadData(String fileName,int row,int start) throws FileNotFoundException {
        Scanner input = new Scanner(new File("D:\\Coders Programming\\Java\\Java-How To Program\\Project in Book\\Ch07\\"+fileName));
        for (int i = 0; i <start ; i++) {
            System.out.println(input.nextLine());
        }
        double[][] data = new double[row][];
        for (int i = 0; i <data.length ; i++) {
            data[i] = ConvertToArray(input.nextLine());
        }
        return data;
    }

//This method sum row alone.
    public static double totalRow(double[]row){
        double sum=0;
        for (int i=2;i<row.length;i++){
            sum+=row[i];
        }
        return sum;
    }

    public static double totalColumn(double[][]column){
        double sumCol = 0;
        for (int col = 2; col <column[0].length ; col++) {
            sumCol=0;
            for (int row=0;row<column.length;row++){
                sumCol+=column[row][col];
        }
                System.out.printf("C.%d= %.1f|",col+1,sumCol );
            }
        return sumCol;
    }

    public static double grandTotal(double[][]totalSales){
        double total=0;
        for (int row = 0; row <totalSales.length ; row++) {
            for (int column=2;column<totalSales[row].length;column++){ // begin total from column 2 because column 0 is sales person and column 1 is number product.
                total+=totalSales[row][column];
            }
        }
        return total;
    }

    public static void tabularFormat() throws FileNotFoundException{
        System.out.println(" N.S |" + "  N.P | "  + " P.1 |" + "  P.2 |" +" P.3  |"
                +" P.4  |" + " P.5 |" + "    Total");
        double[][] sales = loadData("Total Sales.txt",4);
        printTwoArray(sales);
        totalColumn(sales);

        System.out.println();
        for (int i=0;i<sales.length;i++) {
            System.out.printf("R.%d=%.1f|",(i + 1), totalRow(sales[i]));
        }

        System.out.println();
        System.out.println();
        System.out.printf("Grand Total Sales %.1f = ", grandTotal(sales));
    }

}
