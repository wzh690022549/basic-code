package com.haohao.demo01.Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

/*
java.util.Collection
    Interface Collection<E> : The root interface in the collection hierarchy.

    Method Summary:
        boolean add(E e)
        void clear()
        boolean remove(E e)
        boolean contains(E e)
        boolean isEmpty()
        int size()
        Object[] toArray()
 */
public class Demo01Collection {
    public static void main(String[] args) {
        Collection<String> coll = new HashSet<>();
        System.out.println(coll);

        boolean b1 = coll.add("ZhangSan");
        System.out.println("b1:" + b1);
        System.out.println(coll);
        coll.add("L");
        coll.add("W");
        coll.add("Z");
        coll.add("T");
        System.out.println(coll);

        boolean b2 = coll.remove("Z");
        System.out.println("b2:" + b2);

        boolean b3 = coll.remove("X");
        System.out.println("b3:" + b3);

        System.out.println(coll);

        boolean b4 = coll.contains("L");
        System.out.println("b4:" + b4);

        boolean b5 = coll.contains("X");
        System.out.println("b5:" + b5);

        boolean b6 = coll.isEmpty();
        System.out.println("b6:" + b6);

        int size = coll.size();
        System.out.println("size:" + size);

        Object[] arr = coll.toArray();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        coll.clear();
        System.out.println(coll);
        System.out.println(coll.isEmpty());
    }
}
