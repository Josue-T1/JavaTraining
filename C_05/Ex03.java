package com.company;

public class Ex03 {
    public static void main(String[] args) {

        double C;

        System.out.println("celsius | farenheit");

        for (int i = 0; i <= 100; i += 2) {
            C = i;
            C = (C*9/5) +32;
            System.out.println( i + " : " + C);
        }
    }
}
