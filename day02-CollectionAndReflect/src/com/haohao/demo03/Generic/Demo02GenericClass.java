package com.haohao.demo03.Generic;

public class Demo02GenericClass {
    public static void main(String[] args) {
        GenericClass gc = new GenericClass();
        gc.setName("String");

        Object obj = gc.getName();

        GenericClass<Integer> gc2 = new GenericClass<>();
        gc2.setName(1);
        Integer name = gc2.getName();
        System.out.println(name);

        GenericClass<String> gc3 = new GenericClass<>();
        gc3.setName("XiaoMing");
        String name1 = gc3.getName();
        System.out.println(name1);
    }
}
