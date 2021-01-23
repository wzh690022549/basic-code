package com.haohao.demo02;

public interface MyInterfaceA {
    // Error!
//    static {
//
//    }
//    public MyInterface(){
//
//    }
    public abstract void methodA();

    public abstract void methodAbs();

    public default void methodDefault(){
        System.out.println("Default method AAA.");
    }
}
