package Exercise;

import java.util.Scanner;

public class Rational {

    private int numerator=1;
    private  int denominator=1;

    public Rational() {
    }

    public Rational(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    @Override
    public String toString() {
        return "Rational{" +
                "numerator=" + numerator +
                ", denominator=" + denominator +
                '}';
    }

    public String toFloatString(int digit){
        double value = (double) numerator / denominator;
        return String.format("%." + digit +"f." , value);
    }

    public Rational Addition(Rational right){
        int resultNumerator = numerator * right.denominator + denominator * right.numerator;
        int resultDenominator = denominator * right.denominator;
         return  new Rational(resultNumerator,resultDenominator);
    }

    public Rational subtract(Rational right){
        int resultNumerator = numerator * right.denominator - right.numerator *denominator;
        int resultDenominator = denominator * right.denominator;
        return  new Rational(resultNumerator,resultDenominator);
    }

    public Rational muplication(Rational right){
        int resultNumerator = numerator * right.numerator;
        int resultDenominator = denominator * right.denominator;
        return new Rational(resultNumerator,resultDenominator);
    }

    public Rational divide (Rational right){
        int resultNumerator = numerator * right.denominator;
        int resultDenominator = denominator * right.numerator;
        return new Rational(resultNumerator,resultDenominator);
    }

    public void getMenuChoice(){
        Scanner input = new Scanner(System.in);
        Rational rational1;
        Rational rational2;
        Rational result;
        int digits=1;

        System.out.println("1.Addition.");
        System.out.println("2.Subtract. ");
        System.out.println("3.multiplication.");
        System.out.println("4.divide. ");
        int choice = input.nextInt();

        System.out.print( "Enter numerator 1: " );
        numerator = input.nextInt();
        System.out.print( "Enter denominator 1: " );
        denominator = input.nextInt();
        rational1 = new Rational( numerator, denominator );
// read second fraction
        System.out.print( "Enter numerator 2: " );
        numerator = input.nextInt();
        System.out.print( "Enter denominator 2: " );
        denominator = input.nextInt();
        rational2 = new Rational( numerator, denominator );


        while (choice!=5){
            switch (choice){
                case 1:
                    result = rational1.Addition(rational2);
                    System.out.println("a + b\n " +result.toString() + result.toFloatString(digits));
                    break;
                case 2:
                    result =rational1.subtract(rational2);
                    System.out.println("a - b\n " + result.toString() + result.toFloatString(digits));
                    break;
                case 3:
                    result = rational1.muplication(rational2);
                System.out.println("a * b\n " + result.toString()+ result.toFloatString(digits));
                break;
                case 5:
                    result = rational1.divide(rational2);
                    System.out.println("a / b\n " + result.toString() + result.toFloatString(digits));
                    break;
                default:
                    System.out.println("Choice is not found.");
                    break;
            }
            choice=input.nextInt();
        }
    }
}
