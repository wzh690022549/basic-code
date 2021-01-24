package com.haohao.demo07;

public class DemoMain {
    public static void main(String[] args) {
        // Start by creating a laptop.
        Computer computer = new Computer();
        computer.powerOn();

        // Prepare a mouse for you computer to use.
//        Mouse mouse = new Mouse();
        // First, make the upward transition.
        USB usbMouse = new Mouse(); // Polymorphism of writing.
        computer.useDevice(usbMouse);

        // Create a USB keyboard.
        Keyboard keyboard = new Keyboard(); // No polymorphic notation is used.
        computer.useDevice(keyboard);

        computer.powerOff();
    }
}
