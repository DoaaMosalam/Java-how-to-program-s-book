package Exercise;

import java.util.Scanner;

public class RationalNumbers {
    private static int numerator = 1; // a
    private static int denominator = 1; //b
    private static int numeratorC=1;
    private static int denominatorD=1;
    //constructor non-argument
    public RationalNumbers(){}

    public RationalNumbers(int numerator, int denominator, int numeratorC, int denominatorD) {
        RationalNumbers.numerator = numerator;
        RationalNumbers.denominator = denominator;
        RationalNumbers.numeratorC = numeratorC;
        RationalNumbers.denominatorD = denominatorD;
    }

    @Override
    public  String toString() {
        return "Q{" +
                "a=" + numerator +
                ", b=" + denominator +
                ", c=" + numeratorC +
                ", d=" + denominatorD +
                '}';
    }

    public static String toFloatstring(){
        double value =(double) numerator /denominator;
        double value2 =(double) numeratorC / denominatorD;
        return String.format("a/b=%.2f  c/d=%.2f", value,value2);
    }


    public  static void isEqual() {
        boolean value = false;
        int result1 = numerator * denominatorD;
        int result2 = denominator * numeratorC;

       if (numerator /denominator == numeratorC / denominatorD && result1 == result2){
           System.out.println("arithmetic is equal.");
       }else {
           System.out.println("arithmetic is not equal");
       }

    }

    public static double addition(int a, int b, int c, int d) {
        return (a * d + b * c) / (b * d);
    }

    public static double multiplication(int a, int b, int c, int d) {
        return (a * c) / (b * d);
    }

    public static double subtract(int a, int b, int c, int d) {
        return (a * d - c * b) / (b * d);
    }

    public static double divide(int a, int b, int c, int d) {
        return (a * d) / (b * c);
    }


    public void result() {
     Scanner input = new Scanner(System.in);
        System.out.println("1.Addition: ");
        System.out.println("2.Subtract: ");
        System.out.println("3.Multiplication: ");
        System.out.println("4.Divide: ");
        System.out.println("5.Exit.");
        System.out.println("Choice performing arithmetic with fractions.");
        int choice = input.nextInt();

        System.out.print("type Numerator a:");
        numerator = input.nextInt();
        System.out.print("type denominator b:");
        denominator= input.nextInt();
        System.out.print("type Numerator c:");
        numeratorC = input.nextInt();
        System.out.print("Type Denominator d:");
         denominatorD = input.nextInt();

        while (choice!=5){
            switch (choice){
                case 1:
                    System.out.println("You choice arithmetic Addition.");
                    System.out.printf("a + b = %s = %s\n", toString(),toFloatstring());
                    System.out.println("final result addition is: " + addition( numerator,denominator,numeratorC,denominatorD));
                    isEqual();
                    break;
                case 2:
                    System.out.println("You choice arithmetic Subtract.");
                    System.out.printf("a - b =%s = %s\n",toString(),toFloatstring());
                    System.out.println("final result subtract: "+ subtract(numerator,denominator,numeratorC,denominatorD));
                   // System.out.println(isEqual());
                    isEqual();
                    break;
                case 3:
                    System.out.println("You choice arithmetic Multiplication.");
                    System.out.printf("a * b = %s = %s\n",toString(),toFloatstring());
                    System.out.println("final result multiplication: "+ multiplication(numerator,denominator,numeratorC,denominatorD));
                    isEqual();
                    break;
                case 4:
                    System.out.println("You choice arithmetic Divide.");
                    System.out.printf("a / d =%s = %s\n",toString(),toFloatstring());
                    System.out.println("final result divide: " + divide(numerator,denominator,numeratorC,denominatorD));
                    isEqual();
                    break;
                default:
                    System.out.println("Exit");
                    break;
            }
            choice =input.nextInt();
        }
    }

}
