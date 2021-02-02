package com.haohao.demo02.Date;

import java.util.Date;

public class Demo02Date {
    public static void main(String[] args) {
        demo03();
    }

    /*
    long getTime() : Converts the date to milliseconds.
    Returns the number of milliseconds since January 1, 1970, 00:00:00 GMT represented by this Date object.
     */
    private static void demo03() {
        Date date = new Date();
        long time = date.getTime();
        System.out.println(time);
    }

    /*
    Date constructor with arguments:
        Date(long date): Converts a millisecond to a Date by passing a milli shift value.
     */
    private static void demo02() {
        Date date = new Date(0);
        System.out.println(date);

        Date date1 = new Date(158111111111L);
        System.out.println(date1);
    }

    /*
    Date parameter constructor:
        Date() retrieves the Date and time of the current system.
     */
    private static void demo01() {
        Date date = new Date();
        System.out.println(date);
    }
}
