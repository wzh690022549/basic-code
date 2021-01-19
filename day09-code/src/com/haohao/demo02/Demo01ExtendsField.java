package com.haohao.demo02;
/*
In a parent-child inheritance relationship, if the member variable has the same name, then there are two ways to create a subclass object:
1. Accessing member variables directly through subclass object:
    So whoever is on the left-hand side of the equal sign, you take precedence over whoever is on the left-hand side of the equal sign, and you look up if you don't.
2. Member variables are accessed indirectly through member methods:
    The method belongs to who, the priority to use who, no search up.
 */
public class Demo01ExtendsField {
    public static void main(String[] args) {
        Super su = new Super(); // Create a superclass object.
        System.out.println(su.numSuper);    // You can only use things in the parent class, there's no subclass content.
        System.out.println("=====================");

        Sub sub = new Sub();

        System.out.println(sub.numSuper);   //10
        System.out.println(sub.numSub);     //20
        System.out.println("=====================");

        // Just give priority to who is on the left-hand side of the equal sign.
        System.out.println(sub.num);    // Give priority to subclass.
        System.out.println("=====================");

        // This method is subclasses, preferring subclasses instead of looking up.
        sub.methodSub();    // 200
        // This method is defined in the superclass, give priority to superclass.
        sub.methodSuper();  // 100
    }
}
