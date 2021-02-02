package com.haohao.demo04.Calendar;

import java.util.Calendar;
import java.util.Date;

public class Demo02Calendar {
    public static void main(String[] args) {
        demo04();
    }

    private static void demo04() {
        Calendar instance = Calendar.getInstance();
        Date date = instance.getTime();
        System.out.println(date);
    }

    private static void demo03() {
        Calendar instance = Calendar.getInstance();
        instance.add(Calendar.YEAR, 2);

        int year = instance.get(Calendar.YEAR);
        System.out.println(year);

        int month = instance.get(Calendar.MONTH);
        System.out.println(month + 1);

        int date = instance.get(Calendar.DATE);
        System.out.println(date);
    }

    private static void demo02() {
        Calendar instance = Calendar.getInstance();
        instance.set(Calendar.YEAR, 9999);

        int year = instance.get(Calendar.YEAR);
        System.out.println(year);

        int month = instance.get(Calendar.MONTH);
        System.out.println(month + 1);

        int date = instance.get(Calendar.DATE);
        System.out.println(date);
    }

    private static void demo01() {
        Calendar instance = Calendar.getInstance();
        int year = instance.get(Calendar.YEAR);
        System.out.println(year);

        int month = instance.get(Calendar.MONTH);
        System.out.println(month + 1);

        int date = instance.get(Calendar.DATE);
        System.out.println(date);
    }
}
