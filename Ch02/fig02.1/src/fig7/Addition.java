package fig7;

import java.util.Scanner;

public class Addition {
    public void addition(){

        Scanner input = new Scanner(System.in);
        int number1,
         number2,
         sum;

        System.out.print("Enter first integer"); //prompt
        number1 = input.nextInt();
        System.out.print("Enter second number");
        number2 = input.nextInt();
        sum = number1 + number2;
        System.out.printf("Sum is %d\n",sum);

    }
}
