package com.haohao.demo01;

public class Demo02Student {
    public static void main(String[] args) {
        Student student = new Student("Max", 20);
        System.out.println(student.getName());
        System.out.println(student.getAge());
        student.eat();
        student.sleep();
        student.study();
    }
}
