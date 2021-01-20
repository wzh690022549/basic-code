package com.haohao.demo11;
/*
Abstract: Add the abstract keyword, drop the braces, and close with a semicolon.
Abstract class: The class of the abstract method must be an abstract class. Just write abstract keyword before class.

How to use abstract classes and abstract methods:
1. New abstract class object cannot be created directly.
2. A subclass must inherit from the abstract superclass.
3. A subclass must override all abstract methods in the abstract parent class.
    Override(implementation): Subclass to remove the abstract keyword from the abstract method and then fill in the method body braces.
4. Create subclass objects for use.
 */
public abstract class Animal {
    // This is an abstract method.
    public abstract void eat();

    // This is a normal member method.
    public void normalMethod(){

    }
}
