package com.haohao.demo06.StringBuilder;

/*
    java.lang.StringBuilder
        String buffers, which can improve the efficiency of strings.
    Constructor Summary:
        StringBuilder(): Constructs a string builder with no characters in it and an initial capacity of 16 characters.
        StringBuilder(String str): Constructs a string builder initialized to the contents of the specified string.
 */
public class Demo01StringBuilder {
    public static void main(String[] args) {
        StringBuilder bu1 = new StringBuilder();
        System.out.println("bu1:" + bu1);

        StringBuilder bu2 = new StringBuilder("abc");
        System.out.println("bu2:" + bu2);
    }
}
