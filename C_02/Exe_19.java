package com.company;

import java.util.Scanner;

public class Exe_19 {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.print("Enter three points for a triangle: ");
        double B1 = leer.nextDouble();
        double A1 = leer.nextDouble();
        double B2 = leer.nextDouble();
        double A2 = leer.nextDouble();
        double B3 = leer.nextDouble();
        double A3 = leer.nextDouble();

        double S1 = Math.pow (Math.pow(B2 - B1, 2) + Math.pow(A2 - A1, 2), 0.5);
        double S2 = Math.pow (Math.pow(B3 - B2, 2) + Math.pow(A3 - A2, 2), 0.5);
        double S3 = Math.pow (Math.pow(B1 - B3, 2) + Math.pow(A1 - A3, 2), 0.5);
        double TS = (S1 + S2 + S3) / 2;
        double AR = Math.pow(TS * (TS - S1) * (TS - S2) * (TS - S3), 0.5);
        System.out.println("The area of the triangle is " + AR);
    }
}
