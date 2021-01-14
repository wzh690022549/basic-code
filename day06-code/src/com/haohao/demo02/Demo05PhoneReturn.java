package com.haohao.demo02;

public class Demo05PhoneReturn {
    public static void main(String[] args) {
        Phone two = getPhone();
        System.out.println(two.getBrand());
        System.out.println(two.getPrice());
        System.out.println(two.getColor());
    }
    public static Phone getPhone(){
        return new Phone("HUAWEI", 8888, "black");
    }
}
