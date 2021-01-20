package com.haohao.demo13;

// A subclass is also an abstract class.
public abstract class Dog extends Animal{
    @Override
    public void eat() {
        System.out.println("Dogs eat bones.");
    }
}
