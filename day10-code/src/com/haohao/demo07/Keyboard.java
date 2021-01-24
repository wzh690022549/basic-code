package com.haohao.demo07;

// The keyboard is a USB device.
public class Keyboard implements USB {
    @Override
    public void open() {
        System.out.println("Open keyboard.");
    }

    @Override
    public void close() {
        System.out.println("Close keyboard.");
    }

    public void type() {
        System.out.println("Keyboard type.");
    }
}
