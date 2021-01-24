package com.haohao.demo07;

// The mouse is a USB device.
public class Mouse implements USB {
    @Override
    public void open() {
        System.out.println("Open mouse.");
    }

    @Override
    public void close() {
        System.out.println("Close mouse.");
    }

    public void click() {
        System.out.println("Mouse click.");
    }
}
