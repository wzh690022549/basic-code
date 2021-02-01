package com.haohao.demo08;

import com.haohao.red.OpenMode;

import java.util.ArrayList;
import java.util.Random;

public class RandomMode implements OpenMode {
    @Override
    public ArrayList<Integer> divide(final int totalMoney, final int totalCount) {
        ArrayList<Integer> list = new ArrayList<>();

        Random r = new Random();
        int currentMoney = totalMoney;
        int currentCount = totalCount;

        for (int i = 0; i < totalCount - 1; i++) {
            int money = r.nextInt(currentMoney / currentCount * 2) + 1;
            list.add(money);
            currentMoney -= money;
            currentCount--;
        }

        list.add(currentMoney);
        return list;
    }
}
