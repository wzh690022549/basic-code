package com.haohao.demo03;

public class Demo03MethodPrint {
    public static void main(String[] args) {
        print(100);
    }

    public static void print(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println((i + 1) + ":Hello World!");
        }
    }
}
