package com.haohao.demo03.Generic;

public class Demo03GenericMethod {
    public static void main(String[] args) {
        GenericMethod gm = new GenericMethod();
        gm.method01(10);
        gm.method01("abc");
        gm.method01(8.8);
        gm.method01(true);

        GenericMethod.method02(10);
        GenericMethod.method02("abc");
        GenericMethod.method02(8.8);
        GenericMethod.method02(true);
    }
}
