package com.haohao.demo01;

public class Sub extends Super {
    @Override
    public void methodAbs() {

    }
    // Wrong writing! A final method in a parent class cannot be overridden.
//    @Override
//    public void method() {
//        System.out.println("The subclass overrides the method of the superclass!");
//    }
}
