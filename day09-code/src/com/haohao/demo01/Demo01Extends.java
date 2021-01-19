package com.haohao.demo01;
/*
In the case of inheritance, a subclass is a superclass.
That is, subclasses can be treated as superclasses.

For example, if the superclass is employee and the subclass is instructor, then "instructor is an employee".


Define the format of superclass:(a normal class definition)
public class superclass {
    //...
}

Define the format of subclass:
public class subclass extends superclass{
    //...
}
 */
public class Demo01Extends {
    public static void main(String[] args) {
        // A subclass object is created.
        Instructor instructor = new Instructor();
        // The Instructor class does not write anything, but it inherits the method from the superclass.
        instructor.method();

        // Another subclass object is created.
        Assistant assistant = new Assistant();
        assistant.method();
    }
}
