package com.haohao.demo06;
/*
The upward transition must be safe, problem-free and correct. But there is a downside:
    Once an object is upcast to a superclass, it cannot call the content that was originally unique to the subclass.

Solution: Restore with a downward transformation of the object.
 */
public class Demo01Main {
    public static void main(String[] args) {
        // An upward transformation of an object, which is a reference to an object of the superclass.
        Animal animal = new Cat();
        animal.eat();

//        animal.catchMouse();// Error!

        Cat cat = (Cat) animal;
        cat.catchMouse();

        Dog dog = (Dog) animal; // Error! java.lang.ClassCastException
    }
}
