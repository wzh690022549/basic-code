package com.haohao.demo04;

public class Person {
    private String name;//自己的名字

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //参数是对方的名字
    public void sayHellO(String name){
        System.out.println(name + "，你好。我是" + this.name + "。");
    }
}
