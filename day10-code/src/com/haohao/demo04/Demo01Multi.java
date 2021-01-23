package com.haohao.demo04;
/*
Polymorphism in the code is a simple statement: a reference to a parent class points to a child object.

Format:
superclassName objectName = new subclassName();
or:
interfaceName objectName = new implementationClassName();
 */
public class Demo01Multi {
    public static void main(String[] args) {
        // Use polymorphic notation.
        // A reference to the parent class on the left, pointing to the object of the child class on the right.
        Super obj = new Sub();

        obj.method();
        obj.methodSuper();
    }
}
