package com.haohao.demo13;

public class DemoMain {
    public static void main(String[] args) {
        Husky husky = new Husky();
        husky.eat();
        husky.sleep();
        System.out.println("===============");

        GoldenRetriever goldenRetriever = new GoldenRetriever();
        goldenRetriever.eat();
        goldenRetriever.sleep();
    }
}
