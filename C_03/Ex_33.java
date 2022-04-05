package com.company;

import java.util.Scanner;

public class Ex_33 {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.print("Enter weight and price for package 1: ");
        double W = leer.nextDouble();
        double P = leer.nextDouble();

        System.out.print("Enter weight and price for package 2: ");
        double W2 = leer.nextDouble();
        double P2 = leer.nextDouble();

        if (P/W < P2/W2)
            System.out.println("Package 1 has a better price.");
        else if (P/W > P2/W2)
            System.out.println("Package 2 has a better price.");
        else
            System.out.println("Two packages have the same price.");
    }
}
