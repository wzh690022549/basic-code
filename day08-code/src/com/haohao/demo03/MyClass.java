package com.haohao.demo03;

public class MyClass {

    int num;    //Member variable
    static int numStatic;   //Static variable

    //Member method
    public void method(){
        System.out.println("This is a member method.");

        //Member method can access member variables.
        System.out.println(num);

        //Member method can access static variables.
        System.out.println(numStatic);
    }

    //Static method
    public static void methodStatic(){
        System.out.println("This is a static method.");

        //Static method can access static variables.
        System.out.println(numStatic);

        //Static method cannot directly access non-static variables.
//        System.out.println(num);

        //The this keyword cannot be used in static method.
//        System.out.println(this);
    }
}
