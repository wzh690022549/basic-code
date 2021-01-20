package com.haohao.demo14;

public class User {
    private String name;
    private int balance; // Balance, which is the amount of money that the current user has.

    public User() {
    }

    public User(String name, int balance) {
        this.name = name;
        this.balance = balance;
    }

    // Show how much money the current user has.
    public void show(){
        System.out.println("I'm " + name + ". I have " + balance + "$.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
