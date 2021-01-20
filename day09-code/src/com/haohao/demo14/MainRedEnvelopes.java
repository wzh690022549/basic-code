package com.haohao.demo14;

import java.util.ArrayList;

public class MainRedEnvelopes {
    public static void main(String[] args) {
        Manager manager = new Manager("Manager", 100);
        Member one = new Member("Member A", 0);
        Member two = new Member("Member B", 0);
        Member three = new Member("Member B", 0);

        manager.show();
        one.show();
        two.show();
        three.show();
        System.out.println("==================");

        // Group manager hands out $20 in total, divided into three red envelopes.
        ArrayList<Integer> redList = manager.send(20, 3);

        // Three ordinary members receive red envelopes.
        one.receive(redList);
        two.receive(redList);
        three.receive(redList);

        manager.show();
        one.show();
        two.show();
        three.show();
    }
}
