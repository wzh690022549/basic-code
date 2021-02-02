package com.haohao.demo07.Integer;
/*
    java.lang.Integer
        The Integer class wraps a value of the primitive type int in an object. An object of type Integer contains a single field whose type is int.
    Constructor Summary:
        Integer(int value)	Deprecated. It is rarely appropriate to use this constructor.
        Integer(String s)	Deprecated. It is rarely appropriate to use this constructor.
    Method Summary:
        static Integer	valueOf(int i)	Returns an Integer instance representing the specified int value.
        static Integer	valueOf(String s)	Returns an Integer object holding the value of the specified String.

        int	intValue()	Returns the value of this Integer as an int.
 */
public class Demo01Integer {
    public static void main(String[] args) {
        Integer in1 = new Integer(1);
        System.out.println(in1);

        Integer in2 = new Integer("1");
        System.out.println(in2);

        Integer in3 = Integer.valueOf(1);
        System.out.println(in3);

        Integer in4 = Integer.valueOf("1");
        System.out.println(in4);

        int i = in1.intValue();
        System.out.println(i);
    }
}
