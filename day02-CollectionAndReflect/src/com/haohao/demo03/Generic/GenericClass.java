package com.haohao.demo03.Generic;
/*
Define a class with g generic type that mimics the ArrayList collection.
A generic type is an unknown data type. We can use a generic type when we are not sure what the data type is.
Generics can accept any data type. You can use Integer, String, Student...
Determine the generic data type when creating the object.
 */
public class GenericClass<E> {
    private E name;

    public E getName() {
        return name;
    }

    public void setName(E name) {
        this.name = name;
    }
}
