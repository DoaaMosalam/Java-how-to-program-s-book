package example;

public class Time2 {
    private int hour; // 0 - 23
    private int minute; // 0 - 59 private int second; // 0 - 59
    private int second;


    public Time2(){
        this(0,0,0);
    }
    public Time2(int h){
        this(h,0,0);
    }
    public Time2(int h,int m){
        this(h,m,0);
    }

    public Time2(int h,int m,int s){
        setTime(h,m,s);

    }
    public Time2(Time2 time){
        this(time.getHour(), time.getMinute(), time.getSecond());
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int h) {
        if (h>=0 && h<24)
            hour=h;
        else
            throw new IllegalArgumentException("hour must be 0-23");
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int m) {
        if (m>=0 && m<60)
            minute=m;
        else
            throw new IllegalArgumentException("Minutes must be 0-59");
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int s) {
        if (s >=0 && s< 60)
            second=s;
        else throw new IllegalArgumentException("Second must be 0-59");
    }

    public void setTime(int h,int m,int s){
        setHour(h);
        setMinute(m);
        setSecond(s);
    }

    public String toUniversalString(){
        return String.format("%02d:%02d:%02d", getHour(), getMinute(), getSecond());
    }

    @Override
    public String toString() {
        return String.format( "%d:%02d:%02d %s",
                ( (getHour() == 0 || getHour() == 12)? 12 : getHour() % 12 ), getMinute(), getSecond(), ( getHour()
                        < 12 ? "AM" : "PM" ) );
    }

    public void Time2Test(){
        Time2 t1 = new Time2();
        Time2 t2 = new Time2(2);
        Time2 t3 = new Time2(21,34);
        Time2 t4 = new Time2(12,25,42);
        Time2 t5 = new Time2(t4);

        System.out.println( "Constructed with:" ); System.out.println( "t1: all arguments defaulted" );
        System.out.printf( "   %s\n", t1.toUniversalString() ); System.out.printf( "   %s\n", t1.toString()
        );

        System.out.println(
                "t2: hour specified; minute and second defaulted" ); System.out.printf( "   %s\n",
                t2.toUniversalString() ); System.out.printf( "   %s\n", t2.toString() );

        System.out.println(
                "t3: hour specified; minute and second defaulted" ); System.out.printf( "   %s\n",
                t2.toUniversalString() ); System.out.printf( "   %s\n", t3.toString() );

        System.out.println(
                "t4: hour specified; minute and second defaulted" ); System.out.printf( "   %s\n",
                t2.toUniversalString() ); System.out.printf( "   %s\n", t4.toString() );

        System.out.println(
                "t5: hour specified; minute and second defaulted" ); System.out.printf( "   %s\n",
                t2.toUniversalString() ); System.out.printf( "   %s\n", t5.toString() );

                try {
                    Time2 t6 = new Time2(27,74,99);
                }
                catch (IllegalArgumentException e){
                    System.out.printf( "\nException while initializing t6: %s\n",
                            e.getMessage() );
                }

    }
}
