package com.haohao.demo07;

public class Computer {
    public void powerOn() {
        System.out.println("Power on.");
    }

    public void powerOff() {
        System.out.println("Power off.");
    }

    public void useDevice(USB usb) {
        usb.open();
        if (usb instanceof Mouse) {
            Mouse mouse = (Mouse) usb;
            mouse.click();
        } else if (usb instanceof Keyboard) {
            Keyboard keyboard = (Keyboard) usb;
            keyboard.type();
        }
        usb.close();
    }
}
