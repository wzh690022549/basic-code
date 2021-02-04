package com.haohao.demo03.Generic;

public class GenericMethod {
    public <E> void method01(E e) {
        System.out.println(e);
    }

    public static <E> void method02(E e) {
        System.out.println(e);
    }
}
