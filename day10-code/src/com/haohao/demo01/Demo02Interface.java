package com.haohao.demo01;

public class Demo02Interface {
    public static void main(String[] args) {
        // Create the implementation class object.
        MyInterfaceDefaultA a = new MyInterfaceDefaultA();
        a.methodAbs();

        // Call the default method, and if not in the implementation class, look up for the interface.
        a.methodDefault();

        System.out.println("====================");

        MyInterfaceDefaultB b = new MyInterfaceDefaultB();
        b.methodAbs();
        b.methodDefault();
    }
}
