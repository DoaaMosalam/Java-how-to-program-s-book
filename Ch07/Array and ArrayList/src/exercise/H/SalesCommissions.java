package exercise.H;

import java.util.Arrays;
import java.util.Scanner;

/**
 *  ناخد من المستخدم قيمه المبيعات
 *  تحوي القيم الي Array عن طريق method convertTo
 *  حساب اجمالي المبيعات عن طريق الميثود sumTotal
 *  حساب عموله البايع عن طريق الميثود range salas person total
 *عرض البياتات في جدول من خلال ميثود shoetable
 * Sales Commissions) Use a one-dimensional array to solve the following problem: A company pays its salespeople on a commission basis.
 * The salespeople receive $200 per week plus 9% of
 * their gross sales for that week. For example,
 * a salesperson who grosses $5000 in sales in a week receives $200 plus 9% of $5000,
 * or a total of $650. Write an application (using an array of counters)
 */
public class SalesCommissions {

    public static void printArray(double[]array){
        for (int counter=0;counter<array.length-1;counter++){
            System.out.printf("%.2f - ",array[counter]);
        }
        System.out.println(array[array.length-1]);
    }
    public static void printTwoArray(double[][]array){
        for (int row=0;row<array.length;row++){
            for (int column=0;column<array[row].length;column++){
                System.out.print(array[row][column]);
            }
            System.out.println(" ");
        }
    }

   public static double[] convertTo(String line){
        String[]pieces= line.split("[ ]");
        double[]sales = new double[pieces.length];
        for (int i=0;i<sales.length;i++){
            sales[i]=Double.parseDouble(pieces[i]);
        }
        return sales;
   }

   public static double[][] rangesalas(int row){
        Scanner input = new Scanner(System.in);
       System.out.println("Enter positive sales $ in this 7 days: ");
      double[][]array = new double[row][];
      for (int i=0;i<array.length;i++){
          System.out.println((i+1) + " day");
          array[i]=convertTo(input.nextLine());
      }
      return array;
   }


   public static double sumTotal(double[][]array){
        double total=0;
        for (int row=0;row<array.length;row++){
            for (int column=0;column<array[row].length;column++){
                total+=array[row][column];
            }
        }
        return total;
   }
    public static double rangeSalasPersonTotal(double[][]array){
        double range=0;
        for (int i=0;i<array.length;i++) {
            range = sumTotal(array) * 9 / 100 +200;
        }
        return range;
    }

    public static void showTable(double[][]array){
        System.out.println("Day     |" + "salary       |" +"  salaryPerson  ");
        int i;
        for (i=0;i<array.length;i++){
            for (int column=0;column<array[i].length;column++) {
                System.out.printf("%d      | ", i + 1);
                System.out.print(Arrays.toString(array[i]) + "    |");
                double range = array[i][column] * 9 / 100 + 200;
                System.out.printf("%.2f     \n  ", range);
            }
        }
        System.out.println("Total salery ="+ sumTotal(array));
        System.out.println("salary commission person=" + rangeSalasPersonTotal(array));
    }

    public static void displaySales() {
        double[][] array = rangesalas(7);

       showTable(array);

//        Scanner scanner = new Scanner(System.in);
//        double n = 0;
//        double[] profitable = new double[7];
//        for (int i = 0; i < profitable.length; i++) {
//            System.out.println("Enter the sales amount today");
//            n = (scanner.nextInt());
//            profitable[i] = n;
//        }
//        double u = 0;
//        for (int j = 0; j < profitable.length; j++) {
//            u += profitable[j];
//        }
//        u = (u / 100 )*9 ;
//        System.out.print("Customer profit is : ");
//        System.out.println(u);

    }


}
