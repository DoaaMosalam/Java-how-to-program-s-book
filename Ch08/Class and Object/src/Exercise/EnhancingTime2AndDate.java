package Exercise;

import java.text.SimpleDateFormat;
import java.util.Date;

public class EnhancingTime2AndDate {
    private static int hour;
    private static int minute;
    private static int second;
//
//    EnhancingTime2AndDate(int h, int m, int s){
//        hour=h;
//        minute=m;
//        second=s;
//    }
//
//    public static int getHour() {
//        return hour;
//    }
//
//    public static void setHour(int h) {
//        if (h>=0 && hour<24)
//            hour=h;
//        else throw new IllegalArgumentException("hour must be 0-23");
//        EnhancingTime2AndDate.hour = hour;
//    }
//
//    public static int getMinute() {
//        return minute;
//    }
//
//    public static void setMinute(int m) {
//        if (m>=0 && m<59){
//            minute=m;
//        }else throw new IllegalArgumentException("minutes must be 0-59");
//        EnhancingTime2AndDate.minute = minute;
//    }
//
//    public static int getSecond() {
//        return second;
//    }
//
//    public static void setSecond(int s) {
//        if (s>=0 && s<59)
//            second=s;
//        else throw new IllegalArgumentException("Second must be 59");
//        EnhancingTime2AndDate.second = second;
//    }
//
//    public static void setTime(int h,int m,int s){
//        setHour(h);
//        setMinute(m);
//        setSecond(s);
//    }
//    public String toUniversalString(){
//        return String.format("%02d:%02d:%02d", getHour(), getMinute(), getSecond());
//    }
//
//    @Override
//    public String toString(){
//      return   String.format("%d:%02d:%02d %s",((getHour()==0 || getHour()==12)?12 : getHour()%12),getMinute(),getSecond(),
//                (getHour()<12?"AM":"PM"));
//    }
//
//    public void Time2Test() {
//        Time2 t1 = new Time2();
//        Time2 t2 = new Time2(2);
//        Time2 t3 = new Time2(21, 34);
//        Time2 t4 = new Time2(12, 25, 42);
//        Time2 t5 = new Time2(t4);
//
//        System.out.println("Constructed with:");
//        System.out.println("t1: all arguments defaulted");
//        System.out.printf("   %s\n", t1.toUniversalString());
//        System.out.printf("   %s\n", t1.toString()
//        );
//
//        System.out.println(
//                "t2: hour specified; minute and second defaulted");
//        System.out.printf("   %s\n",
//                t2.toUniversalString());
//        System.out.printf("   %s\n", t2.toString());
//
//        System.out.println(
//                "t3: hour specified; minute and second defaulted");
//        System.out.printf("   %s\n",
//                t2.toUniversalString());
//        System.out.printf("   %s\n", t3.toString());
//
//        System.out.println(
//                "t4: hour specified; minute and second defaulted");
//        System.out.printf("   %s\n",
//                t2.toUniversalString());
//        System.out.printf("   %s\n", t4.toString());
//
//        System.out.println(
//                "t5: hour specified; minute and second defaulted");
//        System.out.printf("   %s\n",
//                t2.toUniversalString());
//        System.out.printf("   %s\n", t5.toString());
//
//        try {
//            Time2 t6 = new Time2(27, 74, 99);
//        } catch (IllegalArgumentException e) {
//            System.out.printf("\nException while initializing t6: %s\n",
//                    e.getMessage());
//        }
//    }

        public static void tick(){
            for (int i = 0; i <hour ; i++) {
                hour=i;
                for (int j=0;j<minute;j++){
                    minute=i;
                    for (int s=0;s<second;s++){
                        second=s;
                    }
                }
            }
            Date date = new Date();
            SimpleDateFormat sdf = new SimpleDateFormat("E yyyy/MM/dd HH:mm:ss");
            System.out.println(sdf.format(date));
    }
}
