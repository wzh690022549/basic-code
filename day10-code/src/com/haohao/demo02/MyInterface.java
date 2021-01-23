package com.haohao.demo02;

public interface MyInterface {
    public default void method(){
        System.out.println("Interface default method.");
    }
}
