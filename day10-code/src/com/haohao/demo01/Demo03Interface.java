package com.haohao.demo01;
/*
Note: Static methods in an interface cannot be called from objects of the interface implementation class.
 */
public class Demo03Interface {
    public static void main(String[] args) {
        MyInterfaceStaticImpl impl = new MyInterfaceStaticImpl();
//        impl.methodStatic(); // Wrong writing.

        MyInterfaceStatic.methodStatic();
    }
}
