package com.haohao.demo05;

/*
There are two ways to access a member variable:
1. Access member variables directly by the name of the object:
    see who is on the left side of the equal sign, select who is preferred, and look up if not.
2. Indirect access to member variables through member methods:
    to see who belongs to the method, the first to use who, if not up.
 */
public class Demo01MultiField {
    public static void main(String[] args) {
        // Using polymorphic notation, the superclass refers to the subclass object.
        Super obj = new Sub();
        System.out.println(obj.num);
//        System.out.println(obj.age);
        System.out.println("================");

         obj.showNum();
    }
}
