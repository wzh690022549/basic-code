package com.haohao.demo03;

public class Sub extends Super{
    int num = 20;
    public void method(){
        int num = 30;
        System.out.println(num);// 30, local variable.
        System.out.println(this.num);// 20, member variable of this class.
        System.out.println(super.num);// 10, member variable of superclass.
    }
}
