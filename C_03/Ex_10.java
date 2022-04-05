package com.company;

import java.util.Scanner;

public class Ex_10 {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        int N1 = (int)(Math.random() * 1000);
        int N2 = (int)(Math.random() * 1000);

        System.out.print("What is " + N1 + " * " + N2 + "? ");
        int awr = leer.nextInt();

        if (N1 * N2 == awr)
            System.out.println(" You are correct");
        else
            System.out.println(" You are wrong :" + N1 + " + " + N2 + " should be :" + (N1 + N2));
    }
}
