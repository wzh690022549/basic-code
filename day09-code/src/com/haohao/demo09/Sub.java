package com.haohao.demo09;
/*
The super keyword is used to access the content of the parent class, while the this keyword is used to access the content of this class.
It can be used in three ways:
1. In the member method of the class, access the member variables of the class.
2. In the member method of the class, access another member method of the class.
3. In the constructor of the class, access another constructor of the class.
    Note in the third usage:
    A. this() call must also be the first statement of the constructor, the only one.
    B. super() and this() are two construct calls that cannot be used together.
 */
public class Sub extends Super {
}
