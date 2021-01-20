package com.haohao.demo01;
/*
Problem description:
We need to extract a common method to solve the problem of duplicating code between the two default methods.
However, this common method should not be used by the implementation class and should be privatized.

Solution: Starting with Java 9, private methods are allowed to be defined in interfaces.
1. Common private methods to solve the problem of duplicate code between multiple default methods.
2. Static private methods to solve the problem of repeated code between multiple static methods.
 */
public interface MyInterfacePrivateA {
    default void methodDefault1(){
        System.out.println("Default method 1.");
        methodCommon();
    }
    default void methodDefault2(){
        System.out.println("Default method 2.");
        methodCommon();
    }
    private void methodCommon() {
        System.out.println("AAA");
        System.out.println("BBB");
        System.out.println("CCC");
    }
}
