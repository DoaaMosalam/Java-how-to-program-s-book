package example;

//public class Date {
//    private int month;
// private  int day;
// private  int year;
//
// private static final int[] daysPerMonth = // days in each month
//         { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
//
// public Date(int theMonth, int theDay, int theYear){
//     month=checkMonth(theMonth);
//     this.year=theYear;
//     day=checkDay(theDay);
//     System.out.printf(
//             "Date object constructor for date %s\n", this );
// }
//
//
//
//    private int checkMonth(int testMonth) {
//        if (testMonth>0 && testMonth<=12)
//            return testMonth;
//        else
//            throw new IllegalArgumentException("Month must be 1-12");
//    }
//
//    private int checkDay(int testDay) {
//     if (testDay>0 && testDay<= daysPerMonth[month])
//         return testDay;
//         if (month==2 && testDay==29 && (year%400 == 0 && year%4==0 ||year % 100 !=0 ))
//        return testDay;
//
//         throw new IllegalArgumentException("Day must be ");
//    }
//
//    @Override
//    public String toString() {
//     return String.format("%d %d %d", month,year,day);
//    }
//}
