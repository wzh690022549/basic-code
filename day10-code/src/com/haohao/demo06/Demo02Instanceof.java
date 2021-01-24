package com.haohao.demo06;
/*
How do I know what a superclass is referring to, and what is originally a subclass?
Format:
Object instanceof class name
The results in a Boolean value that determines whether the previous object can be used as an instance of the following type.
 */
public class Demo02Instanceof {
    public static void main(String[] args) {
        Animal animal = new Dog();
        animal.eat();

        if (animal instanceof Dog){
            Dog dog = (Dog) animal;
            dog.watchHouse();
        }
        if (animal instanceof Cat){
            Cat cat = (Cat) animal;
            cat.catchMouse();
        }
    }
}
