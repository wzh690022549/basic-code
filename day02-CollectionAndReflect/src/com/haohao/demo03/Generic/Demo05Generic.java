package com.haohao.demo03.Generic;

import java.util.ArrayList;
import java.util.Collection;

public class Demo05Generic {
    public static void main(String[] args) {
        Collection<Integer> list01 = new ArrayList<>();
        list01.add(1);
        list01.add(2);

        Collection<String> list02 = new ArrayList<>();
        list02.add("a");
        list02.add("b");

        printArray(list01);
        printArray(list02);
    }

    public static void printArray(Collection<?> list) {
        for (Object o : list) {
            System.out.println(o);
        }
    }
}
