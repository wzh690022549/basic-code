package com.haohao.demo07.Integer;

import java.util.ArrayList;

/*
    Automatic packing and automatic unpacking:
        Data of the primitive type can be automatically converted to and from the wrapper class.
 */
public class Demo02Integer {
    public static void main(String[] args) {
        Integer in = 1;
        in = in + 2;
        System.out.println(in);

        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);

        int a = list.get(0);
    }
}
