package com.hchooney.qewqs.recycler_tutorial.DAO;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * Created by hooney on 2018. 1. 19..
 */

public class Date {
    public static String getDateAndTimeNOW(String mapping){
        Calendar c = Calendar.getInstance();
        SimpleDateFormat df = new SimpleDateFormat(mapping);
        String formattedDate = df.format(c.getTime());
        return formattedDate;
    }
}
