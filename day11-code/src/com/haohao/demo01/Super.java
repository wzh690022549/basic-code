package com.haohao.demo01;
/*
When the final keyword is used to modify a method, the method is final and cannot be overridden.
Format:
modifier final returnValueType methodName(Parameters) {
    // Method body
}

Precautions:
The abstract keyword and final keyword cannot be used at the same time for classes and methods because of the contradiction.
 */
public abstract class Super {
    public final void method() {
        System.out.println("Superclass method execution!");
    }

    public abstract /*final*/ void methodAbs();
}
