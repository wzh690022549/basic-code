package com.haohao.demo05;
/*
In polymorphic code, the access rules for member methods are:
    See who is new, the first to use who, do not look up.

The formula: Compile to the left, run to the right.

For comparison:
Member variables: Compile to the left, run to the left.
 */
public class Demo02MultiMethod {
    public static void main(String[] args) {
        Super obj = new Sub();

        obj.method();
        obj.methodSuper();
    }
}
