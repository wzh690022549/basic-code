package com.haohao.demo02.Iterator;

import java.util.ArrayList;
import java.util.Collection;

/*
Enhanced for loop: The underlying iterator is also used.
Using the format of a for loop simplifies iterator writing.
 */
public class Demo02Foreach {
    public static void main(String[] args) {
        demo02();
    }

    private static void demo02() {
        Collection<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");
        for (String s : list) {
            System.out.println(s);
        }
    }

    private static void demo01() {
        int[] arr = {1, 2, 3, 4, 5};
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
