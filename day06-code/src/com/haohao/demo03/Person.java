package com.haohao.demo03;

public class Person {
    String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age > 0 && age < 100) {
            this.age = age;
        } else {
            System.out.println("年龄不合法！");
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void show() {
        System.out.println("我叫：" + name + "，年龄：" + age);
    }
}
