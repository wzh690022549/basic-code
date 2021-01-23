package com.haohao.demo02;

public class MyInterfaceImpl implements MyInterfaceA, MyInterfaceB {
    @Override
    public void methodA() {
        System.out.println("Override methodA");
    }

    @Override
    public void methodAbs() {
        System.out.println("Override abstract methods found in all AB interfaces.");
    }

    @Override
    public void methodDefault() {
        System.out.println("Overrides the default methods that conflict between multiple interfaces.");
    }

    @Override
    public void methodB() {
        System.out.println("Override methodB");
  }
}
