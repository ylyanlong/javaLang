package cn.com.yl.date;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created by Administrator on 2015/7/14.
 */
public class DateT1 {
    public static void main(String[] args){
        System.out.println("curTime:" + System.currentTimeMillis() );
        Date mydate = new Date();
        System.out.println("datetime str: " + mydate.toString() );
        System.out.println("milliseconds: " + mydate.getTime() );

        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateStr = dateFormat.format(mydate);
        System.out.println(dateStr);
    }
}
