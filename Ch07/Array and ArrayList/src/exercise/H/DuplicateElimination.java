package exercise.H;

import java.util.HashSet;
import java.util.Scanner;

public class DuplicateElimination {
    public static void printArray(double[]array){
        for (int counter=0;counter<array.length;counter++){
            System.out.printf("%.2f - " , array[counter]);
        }
        System.out.println(" ");
    }
    public static double[] typeNumber(int row) {
        double[] number = new double[row];
        boolean contains = false;

        Scanner input = new Scanner(System.in);
        System.out.println("Type positive number between 10 : 100 ");
        System.out.println("============================================================");
//loop from Array
        for (int i = 0; i < number.length; i++) {
 // Scanner input user number
            System.out.println("Type positive number,Please:" + (i + 1));
            double num = input.nextDouble();
// شرط الرقم ا
           if (num<=10 && num<=100) {
               for (int n = 0; n < i; n++)
                   if (num == number[n])
                       contains = true;
               if (!contains) {
                   number[i] = num;
               } else {
                   System.out.printf("%.2f has ready earned in array\n", num);
               }
           }
           else
               System.out.println("Between number 10 to 100");
        }
        printArray(number);
        return number;
    }

    public static void display(){
        double[] numbers = typeNumber(5);
        printArray(numbers);
    }

//    Scanner scanner = new Scanner(System.in);
//    HashSet hashSet = new HashSet(0);
//    int a = 0 ;
//    boolean y = false ;
//      for (int i = 0; i < 4; i++) {
//        System.out.println("ادخل رقم");
//        boolean x = (a = scanner.nextInt()) > 100;
//        if (!x) {
//            if (!hashSet.add(a)) {
//                System.out.println("الرقم مكرر");
//            }
//        } else {
//            System.out.println("الرقم اكبر من 100");
//        }
//    }
}
