package com.haohao.demo02;

public interface MyInterfaceB {
    // Error!
//    static {
//
//    }
//    public MyInterface(){
//
//    }
    public abstract void methodB();

    public abstract void methodAbs();

    public default void methodDefault(){
        System.out.println("Default method BBB.");
    }
}
