package com.haohao.demo04;
/*
In the parent-child inheritance relationship, the rules for creating subclass objects and accessing member methods:
    Use the object you created first, and look up if you don't.

Precautions:
If you don't have a member method or a member variable, you look up the superclass, you never look down the subclass.

Override:
    Concept: In an inheritance relationship, the name of the method is the same, and so is the parameter list.

Override: Method names are the same, and so is the parameter list.
Overload: Method names are the same, but the parameter list is different.

Method override feature: create a subclass object, the preferred subclass method.
 */
public class Demo01ExtendsMethod {
    public static void main(String[] args) {
        Sub sub = new Sub();

        sub.methodSuper();
        sub.methodSub();

        // We are creating subclass objects, so subclass methods are preferred.
        sub.method();
    }
}
