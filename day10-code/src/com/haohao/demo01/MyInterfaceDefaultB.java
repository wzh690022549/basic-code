package com.haohao.demo01;

public class MyInterfaceDefaultB implements MyInterfaceDefault {
    @Override
    public void methodAbs() {
        System.out.println("The abstract method is implemented. BBB");
    }

    @Override
    public void methodDefault() {
        System.out.println("Implementation class B overrides the default methods of the interface.");
    }
}
