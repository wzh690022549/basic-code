package com.haohao.demo02;

public class Sub extends Super {
    int numSub = 20;
    int num = 200;
    public void methodSub(){
        // Because num is in this class, the num of the class is used.
        System.out.println(num);
    }
}
