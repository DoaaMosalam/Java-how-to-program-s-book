package com.company;

import java.util.Scanner;

public class GlobalWarmingFactsQuiz {
    public void globalWarming(){
        int answer;
        int right = 0;
        int score;

        System.out.println("Answer This Question; Write number answer. ");

            Scanner input = new Scanner(System.in);
// first question
            System.out.print("First Question:\t");

          System.out.println("True or False: Wasting less food is a way to reduce greenhouse gas emissions.\n");

            System.out.println("1.True"); // Correct answer
            System.out.println("2.False");
            System.out.println("3.Not any one");
            System.out.println("4.All of the above\n");
           answer = input.nextInt();
           if (answer == 1){
               System.out.println("Correct answer");
               right++;
           }else {
               System.out.println("Incorrect answer");
           }

// Second question
            System.out.print("Second Question:\t" );
        System.out.println("Which of these countries emits the most carbon dioxide?\n");


            System.out.println("1.China");//correct answer
            System.out.println("2.USA");
            System.out.println("3.UK");
            System.out.println("4.Russia\n");
          int answerquiz2 = input.nextInt();

          if (answerquiz2 == 1){
              System.out.println("Correct answer");
              right++;
          }else {
              System.out.println("Incorrect answer");
          }


// Third question.
            System.out.print("Third Question:\t");
        System.out.println("What is the Greenhouse Effect?\n");

            System.out.println("1.The name of climate change legislation that passed by congress");
            System.out.println("2. When you paint your house green to become an environmentalist");
            System.out.println("3.When the gasses in our atmosphere trap heat and block it from escaping our planet"); //correct answer
            System.out.println("4.When you build a greenhouse\n");
        answer = input.nextInt();
        if (answer == 3){
            System.out.println("Correct answer");
            right++;
        }else {
            System.out.println("Incorrect answer");
        }


 // fourth question.
            System.out.print("Fourth Question:\t");
        System.out.println("Which of the following are consequences associated with climate change?\n");

            System.out.println("1.The ice sheets are declining, glaciers are in retreat globally, and our oceans are more acidic than ever");
            System.out.println("2.Surface temperatures are setting new heat records about each year");
            System.out.println("3.More extreme weather like droughts, heat waves, and hurricanes");
            System.out.println("4. All of the above\n"); //correct answer
        int answerquiz4 = input.nextInt();
        if (answerquiz4 == 4){
            System.out.println("Correct answer");
            right++;
        }else {
            System.out.println("Incorrect answer");
        }

// fifth question
        System.out.print("Fifth Question:\t");
        System.out.println("What percentage of the global greenhouse gas emissions does the transportation sector emit?\n");

        System.out.println("1.1%");
        System.out.println("2.14%"); // correct answer
        System.out.println("3.33%");
        System.out.println("4.70%");
         int answerquiz5 = input.nextInt();
        if (answerquiz5 == 2){
            System.out.println("Correct answer");
            right++;
        }else {
            System.out.println("Incorrect answer");
        }


  // Calculation score quiz.
        score = right * 2;
        if (score == 10)
            System.out.println("Your Score is: " + score + " grade is: Excelent");
        else if (score == 8)
            System.out.println("Your Score is: " + score + " grade is: Very good");
        else
            System.out.println("Your Score is: " + score + " grade is: Time to brush up on your knowledge of global warming,");














    }
}
