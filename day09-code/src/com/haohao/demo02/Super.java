package com.haohao.demo02;

public class Super {
    int numSuper = 10;
    int num = 100;
    public void methodSuper(){
        // It is used in this class, it does not look down for subclasses.
        System.out.println(num);
    }
}
