package com.haohao.demo02;

public class Demo02PhoneTwo {
    public static void main(String[] args) {
        Phone one = new Phone("HUAWEI", 9999, "black");
        System.out.println(one.getBrand());
        System.out.println(one.getPrice());
        System.out.println(one.getColor());

        one.call("任正非");
        one.sendMessage();

        System.out.println("======================");

        Phone two = new Phone("Honor", 9999, "blue");
        System.out.println(two.getBrand());
        System.out.println(two.getPrice());
        System.out.println(two.getColor());

        two.call("任正非非");
        two.sendMessage();
    }
}
