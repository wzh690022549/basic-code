package com.haohao.demo06;

public class Dog extends Animal{
    @Override
    public void eat() {
        System.out.println("Dog eat shit.");
    }

    public void watchHouse(){
        System.out.println("The dog guarding.");
    }
}
