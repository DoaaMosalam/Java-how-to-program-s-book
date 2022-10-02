package exercise.H;

import java.util.Arrays;
import java.util.Scanner;

public class AirlineReservations {

//    boolean[] seating = new boolean[11]; /* create 10 seat numbers (array[0] will not be used). Empty seat indicated by false*/
//    Scanner input = new Scanner(System.in);
//
//    public void start() {
//        while (true) {
//            makeReservation();
//        }
//    }
//
//    public void makeReservation() {
//        System.out.println("Please type 1 for First Class or 2 for Economy: ");
//        int section = input.nextInt();
//        if (section == 1) {
//            firstClassSeat();
//        } else {
//            economySeat();
//        }
//    }
//
//    public void firstClassSeat() // assign a first class seat
//    {
//        for (int count = 1; count <= 5; count++) {
//            if (seating[count] == false)  // if false, then a seat is available for assignment
//            {
//                seating[count] = true;  // assign seat
//                System.out.printf("First Class. Seat# %d\n", count);
//                break;
//            } else if (seating[5] == true) // If seating[5] is true then first class is fully booked
//            {
//                if (seating[10] == true) // If seating[10] is true then economy (and therefore whole flight) is fully booked
//                {
//                    System.out.println("Sorry, flight fully booked. Next flight is in 3 hours.");
//                } else // ask passenger if they would like an economy ticket instead
//                {
//                    System.out.println("First Class is fully booked. Would you like Economy? 1 for Yes 2 for No");
//                    int choice = input.nextInt();
//                    if (choice == 1) {
//                        economySeat();
//                        start();
//                    } else {
//                        System.out.println("Next flight is in 3 hours.");
//                        System.exit(0);
//                    }
//                }
//            }
//        }
//    }
//
//    public void economySeat() // assign an economy seat
//    {
//        for (int count = 6; count <= 10; count++) {
//            if (seating[count] == false) // if false, then a seat is available for assignment
//            {
//                seating[count] = true; // assign seat
//                System.out.printf("Economy. Seat# %d\n", count);
//                break;
//            } else if (seating[10] == true) // If seating[10] is true then economy is fully booked
//            {
//                if (seating[5] == true) // If seating[5] is true then first class (and therefore whole flight) is fully booked
//                {
//                    System.out.println("Sorry, flight fully booked. Next flight is in 3 hours.");
//                    System.exit(0);
//                } else // ask if passenger would like a first class ticket instead
//                {
//                    System.out.println("Economy is fully booked. Would you like First Class? 1 for Yes 2 for No");
//                    int choice = input.nextInt();
//                    if (choice == 1) {
//                        firstClassSeat();
//                        start();
//                    } else {
//                        System.out.println("Next flight is in 3 hours");
//                        System.exit(0);
//                    }
//                }
//            }
//        }
//    }
//
//




    boolean[] seating = new boolean[11];
    Scanner input = new Scanner(System.in);
 //This method selection user between first class or economy class.
    public void makeReservation(){
        System.out.println("Please.type 1 for first class or 2 for economy class: ");
        int selection = input.nextInt();
        if (selection==1){
            System.out.println("Your selection first Class in our tour.");
            firstClass();

        }else {
            System.out.println("Your selection economy Class in our tour.");
            economyClass();
        }
    }

    public void start(){
        while (true){
            makeReservation();
        }
    }
    public void checkSeating_firstClass(){
        for (int count=0;count<seating.length;count++){
           if (Arrays.asList(seating).contains(seating[5] || seating[2])){
            System.out.println("Sorry.flight fully booked.Next flight is in 3 hours.");
        }else {
                System.out.println("first class id fully booked.Would you like Economy Class? 1 for'Yes' 2 for 'No'");
                int choice = input.nextInt();
                if (choice == 1) {
                    economyClass();
                    start();
                }
            }
            System.out.println("Next flight is in 3 hours.");
            System.exit(0);
            }
    }

    public void checkSeating_EconomyClass(){
        for (int count=0;count<seating.length;count++){
            if (Arrays.asList(seating).contains(seating[6]||seating[10])){
                System.out.println("Sorry.flight fully booked.Next flight is in 3 hours.");
            }else {
                System.out.println("economy class id fully booked.Would you like First Class? 1 for'Yes' 2 for 'No'");
                int choice = input.nextInt();
                if (choice==1){
                    firstClass();
                    start();
                }else {
                    System.out.println(".Next flight is in 3 hours.");
                    System.exit(0);
                }
            }
        }
    }
    public void firstClass() {
        for (int count = 1; count <= 5; count++) {
            if (seating[count] == false) {
                if (seating[count] = true)
                    // System.out.printf("First Class. Seat# %d\n", count);
                    System.out.println("Selection your seating in airplane.(from 1 : 5)");
                int seat = input.nextInt();
                System.out.println("your select seating is: " + seat);
                System.out.println("=======================");
                 // break;
            }
            checkSeating_firstClass();
        }
    }

    public void economyClass(){
        for (int count=5;count<=10;count++){
            if (seating[count]==false){
                if (seating[count]=true)
                  //  System.out.printf("Economy Class. Seat# %d\n", count);
                    System.out.println("Selection your seating in airplane.(from 6 to 10)");
                    int seat = input.nextInt();
                    System.out.println("your select seating is: " + seat);
                    System.out.println("=======================");
                   // break;
                }
                checkSeating_EconomyClass();

        }
    }
}
