package com.haohao.demo01.Object;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Demo01ToString {
    public static void main(String[] args) {
        /*
        The Person class inherits from the Object class by default.
         */
        Person p = new Person("Li", 18);
        String s = p.toString();
        System.out.println(s);

        // Print the name of the object directly, which is essentially calling the toString method on the object.
        System.out.println(p);

        Random r = new Random();
        System.out.println(r);

        Scanner scanner = new Scanner(System.in);
        System.out.println(scanner);

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        System.out.println(list);
    }
}
