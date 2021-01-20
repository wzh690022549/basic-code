package com.haohao.demo12;

public class Sub extends Super{

    public Sub() {
        System.out.println("Subclass constructor execution!");
    }

    @Override
    public void eat() {
        System.out.println("To eat!");
    }
}
