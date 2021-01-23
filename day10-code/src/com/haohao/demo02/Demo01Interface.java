package com.haohao.demo02;
/*
Note when using interfaces:
1. Interfaces have no static code blocks or constructors.
2. A class's immediate superclass is unique, but a class can implement multiple interfaces at the same time.
3. If there are repeated abstract methods among the interfaces implemented by the implementation class, it only needs to be override once.
4. The implementation class must be an abstract class if it does not override all abstract methods in all interfaces.
5. If the implementation class implements multiple interfaces that have duplicate default methods, then the implementation class must override the conflicting default methods.
6. If a method in a class's immediate superclass conflicts with the default method in the interface, use the method in the superclass first.
 */
public class Demo01Interface {
    public static void main(String[] args) {
        Sub sub = new Sub();
        sub.method();
    }
}
