package com.haohao.demo03.Generic;

public class Demo04GenericInterface {
    public static void main(String[] args) {
        GenericInterface<String> gi1 = new GenericInterfaceImpl1();
        gi1.method("String");

        GenericInterface<Integer> gi2 = new GenericInterfaceImpl2<>();
        gi2.method(10);

        GenericInterface<Double> gi3 = new GenericInterfaceImpl2<>();
        gi3.method(8.8);
    }
}
