package com.haohao.demo03.DateFormat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Demo02MyTest {
    public static void main(String[] args) throws ParseException {
        System.out.println("Please enter your birthday, format: yyyy MM dd");
        Scanner scanner = new Scanner(System.in);
        System.out.println("You've been alive for " + toDays(new Date().getTime() - parse(scanner.nextLine())) + " days.");
    }

    private static int toDays(long date) {
        return (int) (date / 1000 / 60 / 60 / 24);
    }

    private static long parse(String date) throws ParseException {
        return new SimpleDateFormat("yyyy MM dd").parse(date).getTime();
    }
}
