package com.haohao.demo03;

public class Demo03Person {
    public static void main(String[] args) {
        Person person = new Person();
        person.show();

        person.name = "王子豪";
        person.setAge(21);
        person.show();
    }
}
