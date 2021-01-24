package com.haohao.demo01;
/*
A member variable is immutable if it is modified with the final keyword.

1. Since member variables have default values, they must be assigned manually after final. Default values will not be given again.
2. For final member variables, you use either direct assignment or constructor assignment. One or the other.
3. You must ensure that all overloaded constructors in you class will eventually assign values to the final member variables.
 */
public class Person {
    private final String name/* = "LuHan"*/;

    public String getName() {
        return name;
    }

//    public void setName(String name) {
//        this.name = name;
//    }

    public Person(String name) {
        this.name = name;
    }

    public Person() {
        this.name = "GuanXiaoTong";
    }
}
