package com.haohao.demo03;

public class Body { // External class
    public class Heart { // Member inner class
        // Member inner class method
        public void beat() {
            System.out.println("Heart beating: Bounce! Bounce!");
            System.out.println("My name is " + name);
        }
    }

    // External class member variable
    private String name;

    // External class method
    public void methodBody() {
        System.out.println("External class method.");
        new Heart().beat();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
