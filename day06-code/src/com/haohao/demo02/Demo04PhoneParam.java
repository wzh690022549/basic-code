package com.haohao.demo02;

public class Demo04PhoneParam {
    public static void main(String[] args) {
        Phone one = new Phone("HUAWEI", 8888, "gold");
        method(one);
    }

    public static void method(Phone param) {
        System.out.println(param.getBrand());
        System.out.println(param.getPrice());
        System.out.println(param.getColor());
    }
}
