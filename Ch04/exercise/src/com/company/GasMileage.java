package com.company;

import javax.swing.*;
import java.util.Scanner;

public class GasMileage {
    int miles;
    int gallons;
    int totalMiles=0;
    int totalGallons=0;



    public void gasMileage(){


        double milesPerGallon; // miles per gallon for tankful
        double totalMilesPerGallon;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter Miles: ");
        miles=input.nextInt();
        while (miles !=-1){
            System.out.println("Enter gallon: ");
            gallons = input.nextInt();

            totalMiles += miles;
            totalGallons += gallons;

            if ( gallons != 0 )
                {
                 milesPerGallon = (double) miles / gallons;
                 System.out.printf( "MPG this tankful: %.2f\n",
                         milesPerGallon );
                } // end if statement

            // calculate miles per gallon for the total trip
             if ( totalGallons != 0 )
                 {
                 totalMilesPerGallon = (double) totalMiles / totalGallons;
                 System.out.printf( "Total MPG: %.2f\n",
                         totalMilesPerGallon );
                 } // end if statement

             // prompt user for new value for miles
             System.out.print( "Enter miles (-1 to quit): " );
             miles = input.nextInt();
        }
    }

//-------------------------------------------------------------
    public void gasMileageGui() {
        String message;
        int miles;
        int gallons;
        int totalMiles = 0;
        int totalGallons = 0;
        double milesPerGallon;
        double totalMilesPerGallon;


        miles = Integer.parseInt(JOptionPane.showInputDialog("Enter Miles(-1 to quit): "));
        while (miles != -1) {
            System.out.println("Enter Miles: ");
            gallons = Integer.parseInt(JOptionPane.showInputDialog("Enter Gallons: "));
            totalMiles += miles;
            totalGallons += gallons;

            if (gallons != 0) {
                milesPerGallon = (double) miles / gallons;
                showprogress(milesPerGallon);

            } // end if statement


            if (totalGallons != 0) {
                totalMilesPerGallon = (double) totalMiles / totalGallons;
               showprogress2(totalMilesPerGallon);
            } // end if statement

            // prompt user for new value for miles
            System.out.print("Enter miles (-1 to quit): ");
           // miles = input.nextInt();
        }



    }

    private void showprogress(double premillesgallons1){

        String str = String.format("%n\tMPG this tankful:\n %.2f",premillesgallons1);
        JOptionPane.showMessageDialog(null,str);
    }

    private void showprogress2(double totalMilesPerGallon1){
        String srtTotal = String.format("%n\tTotal MPG:\n %.2f",totalMilesPerGallon1);
        JOptionPane.showMessageDialog(null,totalMilesPerGallon1);

    }


}
