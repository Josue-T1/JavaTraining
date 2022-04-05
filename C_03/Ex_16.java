package com.company;

import java.util.Random;

public class Ex_16 {
    public static void main(String[] args) {

        Random ran = new Random();

        boolean PX = ran.nextBoolean();
        boolean PY = ran.nextBoolean();

        int x = (int) ((Math.random() * 100));
        int y = (int) ((Math.random() * 200));

        if (PX) {
            x=x * -1;
        }
        if (PY) {
            y=y * -1;
        }
        System.out.println("(" + x + "," + y + ")");
    }
}
