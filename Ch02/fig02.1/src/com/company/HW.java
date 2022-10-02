package com.company;

import java.util.*;

public class HW {
    public void HW2_6(){
       int x,
               y,
               z;
       int result;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter First integer:");
        x = input.nextInt();
        System.out.println("Enter Second integer:");
        y = input.nextInt();
        System.out.println("Enter Third integer:");
        z = input.nextInt();
        result = x * y * z;
        System.out.printf("product is %d\n",result);


    }

    public void HW2_10(){
        int x =2;
        int z =3;
        System.out.printf("x = %d\n",x);
        System.out.printf("Value of %d + %d is %d\n",x,x,(x+x));
        System.out.printf("x =");
        System.out.printf("%d = %d\n",(x+z),( z + x ));
    }

    public  void HW2_12(){
        int a = 2;
        int x = 3;
        int y;
        System.out.println(y = a * x * x * x + 7);

        System.out.println(y = a * x * x * ( x + 7 ));

        System.out.println(y = ( a * x ) * x * ( x + 7 ));

        System.out.println(y = ( a * x ) * x * x + 7);

        System.out.println(y = a * ( x * x * x ) + 7);

        System.out.println(y = a * x * ( x * x + 7 ));

    }

    public void HW2_13(){
        int x;
        System.out.println(x = 7 + 3 * 6 / 2 - 1 );
        System.out.println(x = 2 % 2 + 2 * 2 - 2 / 2);
        System.out.println(x = ( 3 * 9 * ( 3 + ( 9 * 3 / ( 3 ) ) ) ));
    }
    public void HW2_14(){
       // System.out.print("1\t2\t3\t4");
        System.out.printf("%d,%d,%d,%d",1,2,3,4);
    }


    public void HW2_15(){
        int a,
                b;
        int sum;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number: ");
        a = input.nextInt();
        System.out.println("Enter second Number:");
        b = input.nextInt();
        sum = a + b / 10;
        System.out.printf("Product is %d\n",sum);
    }
    //--------------------------------------------------------------------------
    /*
        Write an application that asks the user to enter two integers
         obtains them from the user and displays the larger number followed by the words "is larger".
         If the numbers are equal,
        print the message "These numbers are equal"
         */

    public void HW2_16(){


        Scanner input = new Scanner(System.in);
        System.out.println("Enter first integer: ");
        int x = input.nextInt();
        System.out.println("Enter second integer: ");
        int y = input.nextInt();

//       if (x > y ) {
//           // System.out.printf("%d > %d,%s" ,x , y , "is Largest: ");
//           System.out.println("Number of X is Largest:" + x + " > " + y);
//       }
//       if (y > x){
//           System.out.println("Number of Y is Largest: " + y + " > " + x);
//       }
//
//       if (x == y){
//           System.out.println("These numbers are equal: " + x + " == " + y);
//           //System.out.printf("%d == %d,%s",x , y , "These numbers are equal");
//       }

        // This is another solution by used multe if.
        if (x > y){
            System.out.println("Number One of X is Largest:" + x + " > " + y);
        }else if (y > x){
            System.out.println("Number Two of Y is Largest: " + y + " > " + x);
        }
        else if (x == y){
             System.out.println("These numbers are equal: " + x + " == " + y);

        }
    }

//------------------------------------------------------------------------------------
    /*
    Write an application that inputs three integers from the
    user and displays the sum, average, product, smallest and largest of the numbers. Use the techniques
    shown in Fig. 2.15. [Note: The calculation of the average in this exercise should result in an integer
     representation of the average. So, if the sum of the values is 7, the average should be 2
     */
    public void HW2_17(){
        int f;
        int s;
        int t;
        int result;
        int largest = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first integer: ");
        f = input.nextInt();
        System.out.println("Enter second integer: ");
        s = input.nextInt();
        System.out.println("Enter Third integer: ");
        t = input.nextInt();

        result = f + s + t;

        System.out.printf("product is %d\n" , result);
        int average = result / 3;
       // System.out.printf("Average is, %s,%d\n" , average);
        System.out.println("Average is: " + average);
        if (f > largest ){
            largest = f;
        }
        if (s > largest){
            largest = s;
        }
        if (t > largest){
            largest = t;
        }
        System.out.println("The largest number is: " + largest);
    }

    public  void HW2_18(){

        // Draw box
        System.out.println(" *********\n*         *\n*         *\n*         *\n*         *" +
                           "\n*         *\n*         *\n*         *\n *********");
        // draw Ovel

//        System.out.println("***");
//        System.out.println(" * *");
//        System.out.println("  *  *");
//        System.out.println("   *   *");
//        System.out.println(    "*    *");


        // Draw
        System.out.println("      *");
        System.out.println("     *** ");
        System.out.println("    ***** ");
        System.out.println("      *");
        System.out.println("      *");
        System.out.println("      *");
        System.out.println("      *");
        System.out.println("      *");
        System.out.println("      *");
        System.out.println("      *");
        System.out.println("      *");

        //        System.out.println( "*\n**\n***\n****\n*****" );

//        System.out.println( "*" );
//        System.out.println( "***" );
//        System.out.println( "*****" );
//        System.out.println( "****" );
//        System.out.println( "**" );
//
//        System.out.print( "*" );
//        System.out.print( "***" );
//        System.out.print( "*****" );
//        System.out.print( "****" );
//        System.out.println( "**" );
//
//
//
//        System.out.print( "*" );
//        System.out.println( "***" );
//        System.out.println( "*****" );
//        System.out.print( "****" );
//        System.out.println( "**" );
//
//
//        System.out.printf( "%s\n%s\n%s\n", "*", "***", "*****" );

    }
    //--------------------------------------------------------------------------------
    /*
    (Largest and Smallest Integers) Write an application that reads five integers and determines
     and prints the largest and smallest integers in the group. Use only the programming techniques you
     learned in this chapter.
     */

    public void HW2_24(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter First number: ");
        int num1 = scan.nextInt();
        System.out.println("Enter Second number: ");
        int num2 = scan.nextInt();
        System.out.println("Enter Third number: ");
        int num3 = scan.nextInt();
        System.out.println("Enter Fourth number: ");
        int num4 = scan.nextInt();
        System.out.println("Enter Fifth number: ");
        int num5 = scan.nextInt();

       int largest = 0;
       if (num1 > largest){
           largest = num1;

       }
       if (num2 > largest){
           largest = num2;
       }

       if (num3 > largest){
           largest = num3;
       }

       if (num4 > largest){
           largest = num4;
       }
        if (num5 > largest) {
            largest = num5;
        }
        System.out.println("These  is largest number : " + largest);

        int small = 0;
        if (num1 < small){
            small = num1;

        }
        if (num2 < small){
            small = num2;
        }

        if (num3 < small){
            small = num3;
        }

        if (num4 < small){
            small = num4;
        }
        if (num5 < small) {
            small = num5;
        }
        System.out.println("These  is small number : " + small);
    }




   //--------------------------------------------------------------------------------------------
    /*
    (Odd or Even) Write an application that reads an integer and determines and prints whether it’s odd or even.
     [Hint: Use the remainder operator. An even number is a multiple of 2.
      Any multiple of 2 leaves a remainder of 0 when divided by 2.]
     */

    public void HW2_25() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your Number: ");
        int x = input.nextInt();
        if (x % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
//--------------------------------------------------------------------------------------------------
    public void HW2_26(){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1 = input.nextInt();
        System.out.println("Enter second number: ");
        int num2 = input.nextInt();

        if (num1 % num2 == 1){
            System.out.println(num1 + " is a multiple of " + num2);
        }else {
            System.out.println(num1 + " is not a multiple of " + num2);
        }

    }
 //------------------------------------------------------------------------
 public void HW2_28(){
        double t = 3.14159;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter  radius of a circle: ");
        int d = input.nextInt();

        double circle_diameter = d * 2;
        double circumference = circle_diameter * t;
       // double area = d * d * t;
// This is Another Law of the revolving area.
     double area = (circle_diameter / 2) * t * d;
     //System.out.printf("%f   %f   %f",circle_diameter,circumference,area);
     System.out.println( " circle’s diameter: " + circle_diameter + "\ncircumference: " + circumference + "\n Area: " + area);

 }
//--------------------------------------------------------------------------
    /*
    (Separating the Digits in an Integer) Write an application that inputs one number consisting of five digits from the user,
    separates the number into its individual digits and prints the digits
     separated from one another by three spaces each. For example, if the user types in the number 42339,
     the program should print  4 2 3 3 9
     */
    public void HW2_30(){

        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number with 5 digits: ");
        int input = in.nextInt();
//        int n1 = input / 100000 % 10;
//        int n2 = input / 10000 % 10;
//        int n3 = input / 1000 % 10;
//        int n4 = input / 100 % 10;
//        int n5 = input / 10 % 10;
//       // int n6 = input % 10;

       int n1 = input / 10000;
       int n2 = (input % 10000) / 1000;
       int n3 = ((input % 10000) % 1000) / 100;
        int n4 = (((input % 10000) % 1000) % 100) / 10;
         int n5 = (((input % 10000) % 1000) % 100) % 10;
        System.out.println(n1 + " " + n2 + " " + n3 + " " + n4 + " " + n5); //+ " " + n6);
        //System.out.println(n1 + "\t" + n2 + "\t" + n3 + "\t" + n4 + "\t" + n5); //+ " " + n6);
    }
//-------------------------------------------------------------------------------------------------
    /*
    (Table of Squares and Cubes) Using only the programming techniques you learned in this
     chapter, write an application that calculates the squares and cubes of the numbers from 0 to 10 and
     prints the resulting values in table format, as shown below. [Note: This program does not require
     any input from the user.]
     */
    public  void HW2_31() {
//        int number;
//        int square;
//        int cube;
//        System.out.println("Number\tSquare\tCube");
//
//        for (number = 1; number <= 10; number++) {
//            square = number * number;
//            cube = number * square;
//            System.out.println(number + "\t" + square + "\t" + cube);
//
//        }

        // Another solution.

        System.out.println("Numbers\tSquare\tCube");
        System.out.printf("%d   %d    %d\n",0,0*2,0*3);
        System.out.printf("%d   %d    %d\n",1,1*1,1*1*1);
        System.out.printf("%d   %d    %d\n",2,2*2,2*2*2);
        System.out.printf("%d   %d    %d\n",3,3*3,3*3*3);
        System.out.printf("%d   %d    %d\n",4,4*4,4*4*4);
        System.out.printf("%d   %d    %d\n",5,5*5,5*5*5);
        System.out.printf("%d   %d    %d\n",6,6*6,6*6*6);
        System.out.printf("%d   %d    %d\n",7,7*7,7*7*7);
        System.out.printf("%d   %d    %d\n",8,8*8,8*8*8);
        System.out.printf("%d   %d    %d\n",9,9*9,9*9*9);
        System.out.printf("%d   %d    %d\n",10,10*10,10*10*10);

    }
//-----------------------------------------------------------------------------------------------------------
    /*
    (Negative, Positive and Zero Values) Write a program that inputs five numbers and determines
    and prints the number of negative numbers input, the number of positive numbers input and
     the number of zeros input.
     */
    public void HW2_32(){

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int x = scan.nextInt();
        System.out.println("Enter second number: ");
        int y = scan.nextInt();
        System.out.println("Enter third number: ");
        int a = scan.nextInt();
        System.out.println("Enter fourth number: ");
        int z = scan.nextInt();
        System.out.println("Enter fifth number: ");
        int w = scan.nextInt();


         System.out.printf("%+d\t%+d\t%+d\t%+d\t%+d\n", x , y, a, z, w);

        System.out.println("--------- Number positive or negative--------------");

            if (x > 0) {
                System.out.println("Number 1 is Positive: " + x);


            } else if (x < 0) {
                System.out.println("Number 1 is Negitive: " + x);

            } else {
                System.out.println("Number 1 is Zero: " + x);
            }
            //------------------------------------------
            if (y > 0) {
                System.out.println("Number 2 is Positive: " + y);
            } else if (y < 0) {
                System.out.println("Number 2 is Negitive: " + y);
            } else {
                System.out.println("Number 2 is Zero: " + y);
            }

            //------------------------------------------
            if (a > 0) {
                System.out.println("Number 3 is Positive:" + a);
            } else if (a < 0) {
                System.out.println("Number 3 is Negitive:" + a);
            } else {
                System.out.println("Number 3 is Zero:" + a);
            }

            //------------------------------------------
            if (z > 0) {
                System.out.println("Number 4 is Positive:" + z);
            } else if (z < 0) {
                System.out.println("Number 4 is Negitive:" + z);
            } else {
                System.out.println("Number 4 is Zero:" + z);
            }

            //------------------------------------------
            if (w > 0) {
                System.out.println("Number 5 is Positive:" + w);
            } else if (w < 0) {
                System.out.println("Number 5 is Negitive:" + w);
            } else {
                System.out.println("Number 5 is Zero:" + w);
            }

        int[] number = new int[5];
        int positive = 0;
        int negative = 0;


        for (int i =0;i<5;i++){
            if (x > 0){
                positive++;
            }
            else if (x< 0){
                negative++;
            }
        }

        for (int i =0;i<5;i++){
            if (y > 0){
                positive++;
            }
            else if (y< 0){
                negative++;
            }
        }

        for (int i =0;i<5;i++){
            if (a > 0){
                positive++;
            }
            else if (a< 0){
                negative++;
            }
        }

        for (int i =0;i<5;i++){
            if (z > 0){
                positive++;
            }
            else if (z< 0){
                negative++;
            }
        }

        for (int i =0;i<5;i++){
            if (w > 0){
                positive++;
            }
            else if (w< 0){
                negative++;
            }
        }
        System.out.println("Numbers is Positive is: " + positive);
        System.out.println("Numbers is Negitive is: " + negative);
    }
//------------------------------------------------------------------------------------
    public void multiplication(){
//    Scanner input = new Scanner(System.in);
//        System.out.println("Write Your Number: ");
//        int num = input.nextInt();
        for (int i = 1;i<=10;i++){
            System.out.println("-----------------------------------------------------------------");
            for (int z=1;z<=10;z++){
                System.out.println(i + " x " + z + " = " + (i*z));
            }

            for (int w = 1;w<=10;w++) {
                System.out.println("-----------------------------------------------------------------");
                for (int j = 1; j <= 10; j++) {

                    System.out.println(w + " / " + j + " = " + (double) w / j);
                }
            }
        }
    }
 //------------------------------------------------------------------------------------------------

    public void BodyMass(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your  weight: ");
        double weight = input.nextDouble();
        System.out.println("Enter your height: ");
        double height = input.nextDouble();

        double BMI = (weight * 703) / (height * height);
        System.out.println("Your Body Mass is "+ BMI);
       // System.out.printf ("Your Body Mass Index (BMI) is %f\n\n", BMI);
        if (BMI < 18.5){
            System.out.println("Underweight: less than 18.5");
        }else if (BMI == 18.5 && BMI == 24.9 ){
            System.out.println("Normal: between 18.5 and 24.9");
        }
        else if (BMI == 25 && BMI == 29.9){
            System.out.println("Overweight: between 25 and 29.9");
        }
        else {
            System.out.println("Obese: 30 or greater");

        }
        System.out.println("-------------------------------------");
        System.out.println("BMI VALUES\n");
        System.out.println("Underweight: less than 18.5");
        System.out.println("Normal: between 18.5 and 24.9");
        System.out.println("Overweight: between 25 and 29.9");
        System.out.println("Obese: 30 or greater");


    }
//------------------------------------------------------------------------------------------------

    public void PopulationGrowth(){
        Scanner input = new Scanner(System.in);
        System.out.println("World Population Growth: ");
        long population = input.nextLong();
        System.out.println("The annual world population growth rate: ");
        long growthrate = input.nextLong();

       // long PopulationCalculator = population / growthrate;
        
        for(int i=1; i<6; i++, population *= growthrate) {
            System.out.printf("%d years = %d\n", i, population);

//        for (int i =1;i<=5;i++) {
//            System.out.println("World Population Growth is: " + " Year: " + i + PopulationCalculator);
//        }

        }

    }
//-----------------------------------------------------------------------------------------------------------------

    public void Car(){
        Scanner input = new Scanner(System.in);
        System.out.println("Total miles driven per day:");
        int totalmile = input.nextInt();
        System.out.println("Cost per gallon of gasoline:");
        int gasoine = input.nextInt();
        System.out.println("Average miles per gallon:");
        int Averagemiles = input.nextInt();
        System.out.println("Parking fees per day:");
        int parking = input.nextInt();
        System.out.println("Tolls per day:");
        int tolls = input.nextInt();

        int dailyDrivingCost = (totalmile / Averagemiles)*gasoine+parking+tolls;
        System.out.println("Your Daily Driving Cost Is:" + dailyDrivingCost);
    }

//------------------------------------------------------------------------------------------------
    public void Positive_Even_Odd() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1 = input.nextInt();

        if (num1 % 2 == 0) {
            System.out.println("Even");
            if (num1 > 0) {
                System.out.println("Positive Number: " + num1);
            } else {
                System.out.println("Odd");
            }
        } else {
            System.out.println("Negative Number: " + num1);
        }

    }


    public void BMICalculator(){

            Scanner input = new Scanner(System.in);

            double weight, height, bmi;
            int choice;

            System.out.print("BMI calculator: 1 for imperial, 2 for metric: ");
            choice = input.nextInt();

            System.out.printf("Input weight in %s: ",
                    (choice == 1) ? "pounds" : "kilograms");
            weight = input.nextDouble();

            System.out.printf("Input height in %s: ",
                    (choice == 1) ? "inches(ft * 12 * in)" : "metres");
            height = input.nextDouble();

            bmi = (choice == 1) ? calculateImperial(weight, height) : calculateMetric(weight, height);

            System.out.printf("Your BMI : %.1f\n", bmi);
            printBmiTable();
        }

        // calculate using imperial measures
        private static double calculateImperial(double weight, double height){
            return ((weight * 700) / (height * height));
        }
        // calculate using metric measures
        private static double calculateMetric(double weight, double height){
            return weight / (height * height);
        }
        // print BMI information from Department of Health and Human Services /
        // National Institutes of Health.
        private static void printBmiTable(){
            System.out.printf("BMI VALUES:");
            System.out.println("Underweight: less than 18.5");
            System.out.println("Normal:      between 18.5 and 24.9");
            System.out.println("Overweight:  between 25 and 29.9");
            System.out.println("Obese:       30 or greater");
        }
}
