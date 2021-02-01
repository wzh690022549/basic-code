package com.haohao.demo08;

import com.haohao.red.OpenMode;

public class Bootstrap {
    public static void main(String[] args) {
        MyRed red = new MyRed("HaoHao");

        // set owner name
        red.setOwnerName("HaoHao");

        // Ordinary red envelopes
//        OpenMode normal = new NormalMode();
//        red.setOpenWay(normal);

        // Lucky red envelopes
        OpenMode random = new RandomMode();
        red.setOpenWay(random);
    }
}
