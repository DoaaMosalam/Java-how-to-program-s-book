package com.company;

public class DaysofChristmas {
    public void printSong(){
//        for (int day =1;day<=12;day++){
//            switch (day){
//                case 1:
//                    System.out.println("first");
//                    break;
//                case 2:
//                    System.out.println("second");
//                    break;
//                case 3:
//                    System.out.println("third");
//                    break;
//                case 4:
//                    System.out.println("fourth");
//                    break;
//                case 5:
//                    System.out.println("fifth");
//                    break;
//                case 6:
//                    System.out.println("sixth");
//                    break;
//                case 7:
//                    System.out.println("seventh");
//                    break;
//                case 8:
//                    System.out.println("eighth");
//                    break;
//                case 9:
//                    System.out.println("ninth");
//                    break;
//                case 10:
//                    System.out.println("tenth");
//                    break;
//                case 11:
//                    System.out.println("eleventh");
//                    break;
//                case 12:
//                    System.out.println("twelfth");
//                    break;
//                default:
//                    System.out.println("Error");
//            }
//            System.out.println(
//                    " day of Christmas, my true love gave to me:" );
//            switch (day){
//                case 12:
//                    System.out.println( "Twelve lords-a-leaping," );
//                case 11:
//                    System.out.println( "Eleven pipers piping," );
//                case 10:
//                    System.out.println( "Ten drummers drumming," );
//                case 9:
//                    System.out.println( "Nine ladies dancing," );
//                case 8:
//                    System.out.println( "Eight maids-a-milking," );
//                case 7:
//                    System.out.println( "Seven swans-a-swimming," );
//                case 6:
//                    System.out.println( "Six geese-a-laying," );
//                case 5:
//                    System.out.println( "Five golden rings." );
//                case 4:
//                    System.out.println( "Four calling birds," );
//                case 3:
//                    System.out.println( "Three French hens," );
//                case 2:
//                    System.out.println( "Two turtle doves, and" );
//                case 1:
//                    System.out.println( "a Partridge in a pear tree." );
//            }
//            System.out.println();
//        }

// this is another solution ------------------------------------------------------------------------------------

        int number;
        String prize = "";

        String day = "";

        String song = "";
        System.out.print("");

        number = 12;
        System.out.println();
        for (int j = 1; j <= 12; j++)

        {
            switch (j)

            {

                case 1:

                    day = "First";
                    prize = "A Partridge in a Pear Tree \n ";
                    break;
                case 2:
                    day = "Second";
                    prize = "\nTwo turtle doves, \nAnd " + prize;
                    break;
                case 3:
                    day = "Third";
                    prize = "\nThree French Hens," + prize;
                    break;
                case 4:
                    day = "Four";
                    prize = "\nFour Calling Birds," + prize;
                    break;
                case 5:
                    day = "Five";
                    prize = "\nFive Golden Rings," + prize;
                    break;
                case 6:
                    day = "Six";
                    prize = "\nSix Geese a Laying," + prize;
                    break;
                case 7:
                    day = "Seven";
                    prize = "\nSeven Swans a Swimming," + prize;
                    break;
                case 8:
                    day = "Eight";
                    prize = "\nEight Maids a Milking," + prize;
                    break;
                case 9:

                    day = "Nine";
                    prize = "\nNine Ladies Dancing," + prize;
                    break;
                case 10:

                    day = "Ten";
                    prize = "\nTen Lords a Leaping," + prize;
                    break;

                case 11:
                    day = "Eleven";

                    prize = "\nEleven Pipers Piping," + prize;
                    break;
                case 12:

                    day = "Twelve";
                    prize = "\n12 Drummers Drumming," + prize;
                    break;

            }

            song +="\nOn the " + day + " day of Christmas \nmy true love sent to me: " + prize;

        }

        System.out.println(song);

    }
}
