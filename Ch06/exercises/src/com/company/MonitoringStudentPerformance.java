package com.company;

import java.util.Random;
import java.util.Scanner;

public class MonitoringStudentPerformance {
   private static Random random = new Random();
   int answer;
   int studentAnswer;
   int acount;
   int correct;

   public int creatQuestion(){
       int digit1 = random.nextInt(10);
       int digit2 = random.nextInt(10);
       System.out.println("How Much " + digit1 + "times " + digit2 + "?");
       answer = digit1 * digit2;
       return answer;
   }

   public double calculatePercentage(){
       return acount / correct;
   }

  public String creatResponses(boolean correct){
       if (correct)
           switch (random.nextInt(4)){
               case 0:
                   return "Very good!";
               case 1:
                   return  "Excelletn";
               case 2:
                   return "Nice work!";
               case 3:
                   return "Keep up the good work!";
           }
       switch (random.nextInt(4)){
           case 0:
               return "No. Please try again.";
           case 1:
               return "Wrong. Try once more.";
           case 2:
               return "Don't give up!";
           case 3: default:

               return "No. Keep trying.";

       }
  }

  public void checkResponses(){
       acount++;
       if (studentAnswer != answer) {
           System.out.println(creatResponses(false));
       }else {
           correct++;
           System.out.println(creatResponses(true));
           if (acount < 10)
              creatQuestion();

       }
      if (acount >=10) {
          System.out.println("your score is: " + calculatePercentage() * 10);
          if (calculatePercentage()<0.75)
              System.out.println("Please ask your instructor for extra help.");
          System.out.println();
          correct = 0;
          acount = 0;
          creatQuestion();
      }

  }

    public void display() {
        Scanner input = new Scanner(System.in);
        creatQuestion();

        System.out.print("Enter Your answer(-1 exit Question): ");
        studentAnswer = input.nextInt();
        while (studentAnswer != -1) {
            checkResponses();
            System.out.print("Enter Your answer(-1 exit Question): ");
            studentAnswer = input.nextInt();

        }
    }

}
