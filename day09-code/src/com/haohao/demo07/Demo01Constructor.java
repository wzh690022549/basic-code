package com.haohao.demo07;
/*
Access characteristics of constructors in inheritance relationships:
1. There is an implicit "super()", call int he subclass constructor by default, so it must be called first before executing the subclass constructor.
2. The superclass overloaded construct can be invoked using the duper keyword.
3. The superclass constructor call must be the first statement of the subclass constructor. A subclass construct cannot call the super construct more than once.

Conclusion:
Subclasses must call the superclass constructor, or give super() if they don't.
You can only have one super, and must be the first one.
 */
public class Demo01Constructor {
    public static void main(String[] args) {
        Sub sub = new Sub();
    }
}
