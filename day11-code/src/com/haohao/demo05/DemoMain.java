package com.haohao.demo05;

/*
If the implementation class of the interface (or a subclass of the superclass) only needs to use it once.
In this case, you can omit the class definition and use an anonymous inner class instead.

The format of the definition of an anonymous inner class:
interfaceName objectName = new interfaceName() {
    // Override all abstract methods.
};
 */
public class DemoMain {
    public static void main(String[] args) {
//        MyInterface obj = new MyInterfaceImpl();
//        obj.method();

//        MyInterface some = new MyInterface(); // Error!

        MyInterface obj = new MyInterface() {
            @Override
            public void method() {
                System.out.println("The anonymous inner class implements the method!");
            }
        };
        obj.method();
    }
}
