package com.haohao.demo07.Integer;

/*
    Conversions between primitive types and strings:
        The basic type --> String:
            1. The value of the basic type data + "" (Often used in work)
            2. static String toString(int i)
            3. static String valueOf(int i)
        String --> The basic type:
            static int parseInt(String s)
 */
public class Demo03Integer {
    public static void main(String[] args) {
        String s1 = 100 + "";
        System.out.println(s1 + 200);

        String s2 = Integer.toString(100);
        System.out.println(s2 + 200);

        String s3 = String.valueOf(100);
        System.out.println(s3 + 200);

        int i = Integer.parseInt("100");
        System.out.println(i + 200);
    }
}
