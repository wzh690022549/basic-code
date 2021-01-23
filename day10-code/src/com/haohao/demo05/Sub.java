package com.haohao.demo05;

public class Sub extends Super {
    int num = 20;
    int age = 16;

    @Override
    public void showNum() {
        System.out.println(num);
    }

    @Override
    public void method() {
        System.out.println("Subclass method.");
    }

    public void methodSub() {
        System.out.println("Subclass-specific method.");
    }
}
