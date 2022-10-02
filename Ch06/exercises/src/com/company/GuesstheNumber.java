package com.company;

import java.util.Random;
import java.util.Scanner;

public class GuesstheNumber {
  private static Random random = new Random();
  int answer;

  public int guesstRandom(){
      return 1 + random.nextInt(1000);
  }

//  public void display(){
//
//      answer = guesstRandom();
//      System.out.println("Guest Number between 1 to 1000");
//  }
  public void play(){

      answer = guesstRandom();
      System.out.println("Guest Number between 1 to 1000");
      Scanner input = new Scanner(System.in);

    //  display();
      System.out.print("Guest(0 to Exit): ");
      int userGuest = input.nextInt();
      while (userGuest!=0){
          if (userGuest<answer)
              System.out.println("is to low,Try again," + userGuest);
          else if (userGuest > answer)
              System.out.println("is to height,Try again, " + userGuest);
          else
              System.out.println("Congratulations. You guessed the number!" );
          System.out.print("Guest(0 to Exit): ");
          userGuest = input.nextInt();
      }
  }



}
