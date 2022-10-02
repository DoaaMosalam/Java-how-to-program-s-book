package example;

import javax.xml.crypto.Data;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Time1 {
    private static int hour; //set 0-23
    private static int minute; //set 0-59
    private static int second; //set 0-59


    public static void setTime(int h, int m, int s){
        if ((h>=0 && h<23) &&  (m>=0 && m<59) && (s>=0 && s<59)){
            hour=h;
            second=s;
            minute=m;
        }else {
            throw new IllegalArgumentException("hours,minutes and/or seconds was out range");
        }
    }

    public static String toUniversalString(){
        return String.format("%02d:%02d:%02d",hour,second,minute);
    }

    @Override
    public String toString() {
        return String.format("%d:%02d:%02d %s",((hour==0 || hour==12) ? 12 : hour%12),
                minute,second,(hour<12 ? "AM" : "PM"));
    }

    public static void displayTime(){
        // create and initialize a Time1 object
        Time1 time = new Time1();
        // output string representations of the time
        System.out.print("The initial universal time is: ");
        System.out.println(toUniversalString());
        System.out.print("The initial standerd time is: ");
        System.out.println(time);
        System.out.println(); //output blank time.

        // change time and output updated time
        setTime(13,27,6);
        System.out.print( "Universal time after setTime is: " );
        System.out.println(toUniversalString());
        System.out.print("Stander time after setTime is: ");
        System.out.println(time); //Method toString.
        System.out.println(); //output blank time.

        // attempt to set time with invalid values
        try {
            setTime(99,99,99);  // all values out of range
        }
        catch (IllegalArgumentException e){
            System.out.printf("Exception: %s\n\n",e.getMessage());
        }

        // display time after attempt to set invalid values
        System.out.println( "After attempting invalid settings:" );
        System.out.print( "Universal time: " );
        System.out.println( toUniversalString());
        System.out.print( "Standard time: " );
        System.out.println( time);




    }


}
