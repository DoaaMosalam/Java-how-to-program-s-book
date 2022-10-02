package example.ch08;

public class Time1 {
    static private int hour;
    static private int minute;
    static private int second;

    public static void setTime(int h, int m, int s) {
        if (h>=0 && h<24 && m>=0 && m<60 && s>=0 && s<60){
            hour=h;
            minute=m;
            second=s;
        }else throw new IllegalArgumentException("hour, minute and/or second was out of range");
    }

    public static String toUniversalString(){
       return String.format("%02d:%02d:%02d", hour, minute, second);
    }

    @Override
    public String toString(){
        return String.format( "%d:%02d:%02d %s",
                ( ( hour == 0 || hour == 12 ) ? 12 : hour% 12 ),minute, second,
                ( hour < 12 ? "AM" : "PM" ) );
    }

    public static void displayTime(){
        // create and initialize a Time1 object
        example.Time1 time = new example.Time1();
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
