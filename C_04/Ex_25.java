package com.company;

public class Ex_25 {
    public static void main(String[] args) {

        int P1 = 65+(int)(Math.random()*(90-65));
        int P2 = 65+(int)(Math.random()* (90-65));
        int P3 = 65+(int)(Math.random()*(90-65));

        int n1 = (int)(Math.random()*10);
        int n2 = (int)(Math.random()*10);
        int n3 = (int)(Math.random()*10);
        int n4 = (int)(Math.random()*10);
        System.out.println((char)(P1)+((char)(P2))+((char)(P3))+n1+n2+n3+n4);
    }
}
