package com.haohao.demo04;
/*
java.util.Math is a mathematics-related tool class, which provides a large number of static methods to complete operations related to mathematical operations.

public static double abs(double num): Get the absolute value. There are several type of overloads.
public static double ceil(double num): Rounding up.
public static double floor(double num): Rounding down.
public static long round(double num): Rounded.

Math.PI represents the approximate constant of PI.
 */
public class Demo03Math {
    public static void main(String[] args) {
        // Get the absolute value.
        System.out.println(Math.abs(3.14));
        System.out.println(Math.abs(0));
        System.out.println(Math.abs(-2.5));
        System.out.println("=======================");

        // Rounding up.
        System.out.println(Math.ceil(3.9)); //4.0
        System.out.println(Math.ceil(3.1)); //4.0
        System.out.println(Math.ceil(3.0)); //3.0
        System.out.println("=======================");

        // Rounding down.
        System.out.println(Math.floor(30.1)); // 30.0
        System.out.println(Math.floor(30.9)); // 30.0
        System.out.println(Math.floor(31.0)); // 31.0
        System.out.println("=======================");

        // Rounded.
        System.out.println(Math.round(20.4)); // 20
        System.out.println(Math.round(10.5)); // 11
    }
}
