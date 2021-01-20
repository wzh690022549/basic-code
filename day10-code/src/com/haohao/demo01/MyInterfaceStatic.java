package com.haohao.demo01;
/*
Starting with Java 8, static methods are allowed to be defined in interfaces.
Format:
public static returnType methodName(parameter list) { methodContent }
 */
public interface MyInterfaceStatic {
    static void methodStatic(){
        System.out.println("This is a static method of the interface!");
    }
}
