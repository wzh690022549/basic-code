package com.haohao.demo04;

public class Demo02ArrayReturn {
    public static void main(String[] args) {
        int[] result = calculate(10, 20, 30);
        System.out.println("sum:" + result[0]);
        System.out.println("avg:" + result[1]);
    }

    public static int[] calculate(int a, int b, int c) {
        return new int[]{a + b + c, (a + b + c) / 3};
    }
}
