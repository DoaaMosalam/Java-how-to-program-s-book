package com.company;

import exercise.H.*;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {

        //   Main.sumArray();

        // InitArray.initArray();
        //  InitArray.initArray2();
        //  InitArray.calculatorArray();
        //  InitArray.sumArray();

        //  BarChart.BarChart();

        //  RollDie.RollDie();
        //  StudentPoll.poll();

        DeckOfCards myDeckOfCards = new DeckOfCards();
        //    myDeckOfCards.DeckOfCards();
//
//        // print all 52 Cards in the order in which they are dealt
//        for (int i = 1; i <= 52; i++) {
//// deal and display a Card
//            System.out.printf("%-19s", myDeckOfCards.dealCard());
//            if (i % 4 == 0) // output a newline after every fourth card
//                System.out.println();
//        }

        EnhancedForTest forTest = new EnhancedForTest();
//       forTest.forEachtest();

//        PassArray.display();

        GradeBook gradeBook = new GradeBook();
//        gradeBook.GradeBookTest();

        GradeBook_Two_dimensional gbtd = new GradeBook_Two_dimensional();
//        gbtd.GradeBookTest();

//        VarargsTest.display();
//        VarargsTest.example();

//        InitArrayTwo_dimensional.display();

////------------------------------------------------------------------------------------------
// //// This is fig 7.21 from book.
//      // check number of command-line arguments
//// check number of command-line arguments
//      if (args.length != 3)
//          System.out.println(
//                  "Error: Please re-enter the entire command, including\n" +
//                          "an array size, initial value and increment.");
//      else {
//// get array size from first command-line argument
//          int arrayLength = Integer.parseInt(args[0]);
//          int[] array = new int[arrayLength]; // create array
//
//// get initial value and increment from command-line arguments
//          int initialValue = Integer.parseInt(args[1]);
//          int increment = Integer.parseInt(args[2]);
//
//          // calculate value for each array element
//          for (int counter = 0; counter < array.length; counter++)
//              array[counter] = initialValue + increment * counter;
//
//
//          System.out.printf("%s%8s\n", "Index", "Value");
//// display array index and value
//          for (int counter = 0; counter < array.length; counter++)
//              System.out.printf("%5d%8d\n", counter, array[counter]);
//      } // end else
//

        ArrayManipulations manipulations = new ArrayManipulations();
        //     manipulations.Manipulations();

        ArrayListCollection list = new ArrayListCollection();
        //   list.collection();

        //  DrawRainbow.DrawRainbowTest();

////-------------------------------------------------------------------------------------
        // HW.display();
//      SalesCommissions.displaySales();
        //   DuplicateElimination.display();
        //   Varargs.VarargsTest();
        //   UsingtheEnhancedforStatement.display();
        //   UsingtheEnhancedforStatement2.display();
        //  DiceRolling.rollDice();
        //// AirlineReservations.firstClass();
        AirlineReservations air = new AirlineReservations();
        // air.makeReservation();

        //  TotalSales.tabularFormat();
        Craps craps = new Craps();
        // craps.craps();
        // TurtleGraphics.commands();
        // KnightsTour.tour();
       // KnightsTour_Brute_Force_Approaches.solution();
       EightQueens.startSimulation();
       // Queens.startSimulation();

       // SieveofEratosthenes.solution();

//        int i,j;
//        int[][] values = new int[3][4];
//        for (i=0;i<values.length;i++){
//            for ( j = 0; j <values.length ; j++) {
//                values[i][j]= (int) Math.random();
//            }
//            System.out.println(values[i][j]);
//        }

//        String character ="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
//        String randomstring ="";
//        int length =5;
//        Random random = new Random();
//        char[] text = new char[5];
//
//        for (int i = 0; i < text.length ; i++) {
//            text[i]= character.charAt(random.nextInt(character.length()));
//        }
//        for (int i = 0; i <text.length ; i++) {
//            randomstring+=text[i];
//        }
//        System.out.println(randomstring);


        /////==========================================================================================


        //   DuplicateNumber.display();

//        int row,column;
//        System.out.println("*");
//        for (row=0;row<=5;row++){
//            System.out.print("* ");
//            for (column=0;column<row;column++){
//                System.out.print("- ");
//            }
//            System.out.println("*");
//        }
//        for (int i=0;i<=5;i++){
//            System.out.print("* ");
//       }
    }

}
