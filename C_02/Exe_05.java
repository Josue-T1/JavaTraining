package com.company;

import java.util.Scanner;

public class Exe_05 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.print("write the subtotal and a gratuity ");
        double ST= leer.nextDouble();
        double GT = leer.nextDouble();
        double G = ST * (GT / 100);
        double TTL = ST + G;

        System.out.println("The gratuity: " + G + " total is :" + TTL);
    }
}
