package com.haohao.demo03;
/*
Once you use static to modify a member method, it becomes a static method.
Static methods do not belong to objects, but to classes.

If you don't have the static keyword, you must first create an object and then work through it before you can use it.
If you have the static keyword, you can use it directly by the class without creating an object.

Whether it's a member variable or a member method. If you have static, it is recommended that you call it using the class.
Static variable: class.variable
Static method: class.method()

Precautions:
    1.Static can not directly access non-static.
        Because in memory there is static content first, then there is non-static content.
    2.You can't use this keyword in static method.
        Reason: this represents the current object, and whoever calls the method is the current object.
 */
public class Demo02StaticMethod {
    public static void main(String[] args) {
        MyClass obj = new MyClass(); //So let's create the object.
        //You can then use content without the static keyword.
        obj.method();

        //For static methods, they can be called either by the object or directly by the class.
        obj.methodStatic(); //Correct, but not recommended.
                            //This is also translated by javac as "class.static method" after compilation.
        MyClass.methodStatic();//Correct, and recommended.

        //For static method in the original, you can omit the class name.
        myMethod();
        Demo02StaticMethod.myMethod();//Complete equivalence.
    }

    public static void myMethod(){
        System.out.println("You own method!");
    }
}
