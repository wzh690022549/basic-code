package com.haohao.demo07;

import java.util.ArrayList;
import java.util.List;
/*
java.util.List is exactly the interface that ArrayList implements.
 */
public class DemoInterface {
    public static void main(String[] args) {
        // The interface name is on the left and the implementation class name is on the right. This is polymorphic notation.
        List<String> list = new ArrayList<>();
        List<String> result = addNames(list);
        for (String s : result) {
            System.out.println(s);
        }
    }

    public static List<String> addNames(List<String> list) {
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        return list;
    }
}
