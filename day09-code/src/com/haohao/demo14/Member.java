package com.haohao.demo14;

import java.util.ArrayList;
import java.util.Random;

public class Member extends User {
    public Member() {
    }

    public Member(String name, int balance) {
        super(name, balance);
    }

    public void receive(ArrayList<Integer> list) {
        // Take a random red envelope from a number of red envelopes and give it to myself.
        // Retrieves the index number of a collection at random.
        setBalance(getBalance() + list.remove(new Random().nextInt(list.size())));
    }
}
