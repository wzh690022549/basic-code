package com.haohao.demo01;

public class Student {
   private final String name;
   private final int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void eat(){
        System.out.println("吃饭饭！");
    }
    public void sleep(){
        System.out.println("睡觉觉！");
    }
    public void study(){
        System.out.println("学习！");
    }
}
