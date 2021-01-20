package com.haohao.demo01;
public interface MyInterfacePrivateB {
    static void methodDefault1(){
        System.out.println("Static method 1.");
        methodStaticCommon();
    }
    static void methodDefault2(){
        System.out.println("Static method 2.");
        methodStaticCommon();
    }
    private static void methodStaticCommon() {
        System.out.println("AAA");
        System.out.println("BBB");
        System.out.println("CCC");
    }
}
