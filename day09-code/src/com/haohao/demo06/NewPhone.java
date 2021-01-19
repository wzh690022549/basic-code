package com.haohao.demo06;

// Define a new phone, using the old phone as the superclass.
public class NewPhone extends Phone {
    @Override
    public void show() {
        super.show(); // Reuse the superclass's show method.
        // Subclass to add more content.
        System.out.println("Show the name.");
        System.out.println("Show the avatar.");
    }
}
