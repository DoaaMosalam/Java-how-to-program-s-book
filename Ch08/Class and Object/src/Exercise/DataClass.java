package Exercise;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DataClass {
    public static void multipleformats(){
        String[] fmts = {"MM.DD.YYYY",
                        "MM.dd,YYYY","DDD.YYYY"};

       ;


        SimpleDateFormat[] sdf = new SimpleDateFormat[fmts.length];
        for (int i = 0; i <sdf.length ; i++) {
            sdf[i]=new SimpleDateFormat(fmts[i]);
        }
        Date date1 = new Date();
        for (int i = 0; i <sdf.length ; i++) {
            System.out.println(sdf[i].format(date1));
        }
    }

}
