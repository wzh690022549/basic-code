package com.haohao.demo04;

import org.jetbrains.annotations.NotNull;

public class Demo01ArrayParam {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50};
        printArray(array);
    }

    public static void printArray(int @NotNull [] array) {
        for (int i : array)
            System.out.println(i);
    }
}
