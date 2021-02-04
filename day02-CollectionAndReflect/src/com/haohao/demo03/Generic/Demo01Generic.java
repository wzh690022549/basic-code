package com.haohao.demo03.Generic;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Demo01Generic {
    public static void main(String[] args) {
        show02();
    }

    private static void show02() {
        Collection<String> list = new ArrayList<>();
        list.add("abc");
//        list.add(1)

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String s = iterator.next();
            System.out.println(s.length());
        }
    }

    private static void show01() {
        Collection list = new ArrayList();
        list.add("abc");
        list.add(1);

        Iterator iterator = list.iterator();

        while (iterator.hasNext()) {
            Object next = iterator.next();
            System.out.println(next);

            String s = (String) next;
            System.out.println(s.length());
        }
    }
}
