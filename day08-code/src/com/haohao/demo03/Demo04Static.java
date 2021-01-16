package com.haohao.demo03;
/*
Static content always takes precedence over non-static content, so static code blocks are executed before constructors.

Typical uses of static code blocks:
    Used to assign a static member variable once.
 */
public class Demo04Static {
    public static void main(String[] args) {
        Person one = new Person();
        Person two = new Person();
    }
}
