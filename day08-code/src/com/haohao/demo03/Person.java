package com.haohao.demo03;
/*
The format of the static code block is:

public class name {
    static {
        //The contents of the static code block.
    }
}

Characteristics: The first time this class is used, the static code block executes only once.
 */
public class Person {
    static {
        System.out.println("Static code block execution!");
    }

    public Person(){
        System.out.println("Constructor executed");
    }
}
