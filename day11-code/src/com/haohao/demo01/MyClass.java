package com.haohao.demo01;
/*
When the final keyword is used to modify a class, the format:
public final class className {
    // ...
}

Meaning: The current class cannot have any subclass. (Eunuch class)

Note: If a class is final, then all of its member methods cannot be overridden (because there are no subclass).
 */
public final class MyClass {
    public void method() {
        System.out.println("Method execution.");
    }
}
