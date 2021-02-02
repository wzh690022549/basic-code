package com.haohao.demo03.DateFormat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
    java.text.DateFormat
    DateFormat is an abstract class for date/time formatting subclasses which formats and parses dates or time in a language-independent manner.
    The date/time formatting subclass, such as SimpleDateFormat, allows for formatting (i.e., date → text), parsing (text → date), and normalization.

    Member method:
        String	format(Date date)
            Formats a Date into a date-time string.
        Date	parse(String source)
            Parses text from the beginning of the given string to produce a date.


    public class SimpleDateFormat extends DateFormat
    Constructors:
        SimpleDateFormat(String pattern)
            Constructs a SimpleDateFormat using the given pattern and the default date format symbols for the default FORMAT locale.
 */
public class Demo01DateFormat {
    public static void main(String[] args) throws ParseException {
        demo02();
    }

    private static void demo02() throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
        Date date = simpleDateFormat.parse("2021年02月01日 19时13分54秒");
        System.out.println(date);
    }

    private static void demo01() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
        Date date = new Date();
        String text = simpleDateFormat.format(date);
        System.out.println(date);
        System.out.println(text);
    }
}
