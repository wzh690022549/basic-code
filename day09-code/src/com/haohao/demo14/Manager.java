package com.haohao.demo14;

import java.util.ArrayList;

public class Manager extends User{
    public Manager() {
    }

    public Manager(String name, int balance) {
        super(name, balance);
    }

    public ArrayList<Integer> send(int totalMoney, int count) {
        // First, you need a ArrayList to store the amount of several red envelopes.
        ArrayList<Integer> redList = new ArrayList<>();

        // So let's look at how much money group manager has on its own.
        int balance = getBalance();
        if (totalMoney > balance){
            System.out.println("Insufficient balance.");
            return redList; // Returns an empty ArrayList.
        }

        // Deduct money, in fact, resetting the balance.
        setBalance(balance - totalMoney);

        // Divide it evenly into count parts.
        int avg = totalMoney / count;
        int mod = totalMoney % count; // The remainder, that's the small change.

        // The undivided change is wrapped in the last red envelope.
        // Now put the red packets one by one into the collection.
        for (int i = 0; i < count - 1; i++) {
            redList.add(avg);
        }

        // The last red envelope.
        redList.add(avg + mod);

        return redList;
    }
}
