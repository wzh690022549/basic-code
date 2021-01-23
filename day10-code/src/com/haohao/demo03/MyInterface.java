package com.haohao.demo03;
/*

 */
public interface MyInterface extends MyInterfaceA, MyInterfaceB {
    public abstract void method();

    @Override
    public default void methodDefault() {

    }
}
