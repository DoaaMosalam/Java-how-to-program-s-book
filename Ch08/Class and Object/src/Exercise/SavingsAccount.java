package Exercise;

public class SavingsAccount {
    private static double annualInterestRate; //to store the annual interest rate for all account holders.
    private static double savingsccount;

    public static double calculateMonthlyInterest(double v){
        return savingsccount+= v*(annualInterestRate /12.0);
    }

    public static double modifyInterestRate(double newRate){
       return annualInterestRate= newRate;
              // (newRate>=0 && newRate<= 1.0)?newRate : 0.04;
    }

    public static void savingAccountResult(){
        double save1 = 2000;
        double save2 = 3000;
        System.out.println(modifyInterestRate(0.04));
        System.out.println("Number Month | Save num 1 | Save num 2");
        for (int month = 1; month <=12 ; month++) {
            System.out.printf("Month %d \t",month);
            System.out.printf("  %f\t",calculateMonthlyInterest(save1));
            System.out.printf("    %f\t",calculateMonthlyInterest(save2));

            System.out.println("\n");
        }




    }
}
