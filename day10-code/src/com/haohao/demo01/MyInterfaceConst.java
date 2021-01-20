package com.haohao.demo01;
/*
It is also possible to define "member variables" in interfaces, but they must be modified using the public static final keyword.
In effect, this is a constant of the interface.

Format:
public static final dataType constName = dataValue;

Precautions:
1. Constants in the interface must be assigned.
2. The name of a constant in a interface, in fully capitalized letters, separated by an underscore.
 */
public interface MyInterfaceConst {
    // This is just a constant. Once assigned, you can't change it.
    public static final int NUM_OF_MY_CLASS = 10;
}
