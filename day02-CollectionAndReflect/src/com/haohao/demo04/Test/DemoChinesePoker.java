package com.haohao.demo04.Test;

import java.util.ArrayList;
import java.util.Collections;

public class DemoChinesePoker {
    public static void main(String[] args) {
        ArrayList<String> poker = new ArrayList<>();
        String[] colors = {"♠", "♥", "♣", "♦"};
        String[] numbers = {"2", "A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3"};

        poker.add("red joker");
        poker.add("black joker");
        for (String color : colors) {
            for (String number : numbers) {
                poker.add(color + number);
            }
        }
//        System.out.println(poker);

        Collections.shuffle(poker);
//        System.out.println(poker);

        ArrayList<String> player01 = new ArrayList<>();
        ArrayList<String> player02 = new ArrayList<>();
        ArrayList<String> player03 = new ArrayList<>();

        for (int i = 0; i < 51; i++) {
            String p = poker.remove(0);
            if (i % 3 == 0) {
                player01.add(p);
            } else if (i % 3 == 1) {
                player02.add(p);
            } else {
                player03.add(p);
            }
        }

        System.out.println("" + player01.size() + player01);
        System.out.println("" + player01.size() + player02);
        System.out.println("" + player01.size() + player03);
        System.out.println(poker);
    }
}
