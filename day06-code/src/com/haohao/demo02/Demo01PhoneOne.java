package com.haohao.demo02;

public class Demo01PhoneOne {
    public static void main(String[] args) {
        Phone one = new Phone("HUAWEI", 9999, "black");
        System.out.println(one.getBrand());
        System.out.println(one.getPrice());
        System.out.println(one.getColor());

        one.call("任正非");
        one.sendMessage();
    }
}
