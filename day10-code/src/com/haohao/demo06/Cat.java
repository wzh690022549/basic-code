package com.haohao.demo06;

public class Cat extends Animal {
    @Override
    public void eat() {
        System.out.println("Cat eat fish.");
    }

    public void catchMouse() {
        System.out.println("Cat catch mouse.");
    }
}
