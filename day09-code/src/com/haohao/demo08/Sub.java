package com.haohao.demo08;
/*
The super keyword can be used in three ways:
1. In the member method of the subclass, access the member variables of the superclass.
2. In a member method of the subclass, access the member methods of the superclass.
3. In the constructor of the subclass, access the constructor of the superclass.
 */
public class Sub extends Super {
    int num = 20;

    public Sub(){
        super();
    }

    public void methodSub(){
        System.out.println(super.num); // num of Superclass.
    }

    @Override
    public void method(){
        super.method(); // Access the method of superclass.
        System.out.println("Method of subclass.");
    }
}
