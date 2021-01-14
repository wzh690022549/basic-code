package com.haohao.demo04;

public class Demo02MethodOverloadSame {
    public static void main(String[] args) {
        byte a = 10, b = 20;
        System.out.println(isSame(a, b));
        short c = 10, d = 20;
        System.out.println(isSame(c, d));
        System.out.println(isSame(10, 20));
        long e = 10, f = 10;
        System.out.println(isSame(e, f));
    }

    public static boolean isSame(byte a, byte b) {
        System.out.println("byte");
        return a == b;
    }

    public static boolean isSame(short a, short b) {
        System.out.println("short");
        return a == b;
    }

    public static boolean isSame(int a, int b) {
        System.out.println("int");
        return a == b;
    }

    public static boolean isSame(long a, long b) {
        System.out.println("long");
        return a == b;
    }
}
