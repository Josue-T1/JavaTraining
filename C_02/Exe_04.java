package com.company;

import java.util.Scanner;

public class Exe_04 {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        System.out.print("write a value in square meters: ");
        double MT = leer.nextDouble();
        double P = MT * 0.3025;
        System.out.println(MT + " square meters is: " + P + " ping");
    }
}
