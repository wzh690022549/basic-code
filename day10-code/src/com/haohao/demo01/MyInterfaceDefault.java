package com.haohao.demo01;
/*
Starting with Java 8, default methods are allowed to be defined in interfaces.
Format:
public default methodName (parameter list) { methodContent }

Note: The default method in the interface can solve the problem of interface upgrade.
 */
public interface MyInterfaceDefault {
    void methodAbs();

    // default method
    default void methodDefault() {
        System.out.println("This is the newly added default method.");
    }
}
