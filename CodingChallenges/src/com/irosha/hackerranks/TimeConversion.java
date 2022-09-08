package com.irosha.hackerranks;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 * Given a time in -hour AM/PM format, convert it to military (24-hour) time.
 */
public class TimeConversion {

    public static String timeConversion(String s) {

            DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("hh:mm:ssa");
            DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("HH:mm:ss");
            LocalTime localTime = LocalTime.parse(s,dtf1);
            return localTime.format(dtf2);


    }

    public static void main(String[] args) {

        String s = "07:01:00PM";
        System.out.println( TimeConversion.timeConversion(s));
    }

}
