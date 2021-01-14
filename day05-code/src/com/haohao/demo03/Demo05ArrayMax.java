package com.haohao.demo03;

public class Demo05ArrayMax {
    public static void main(String[] args) {
        int[] array = {5, 15, 30, 20, 10000, 30, 35, 20000};
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            max = Math.max(max, array[i]);
        }
        System.out.println(max);
    }
}
