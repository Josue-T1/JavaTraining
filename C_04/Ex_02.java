package com.company;

import java.util.Scanner;

public class Ex_02 {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        double RAD = 6371.01;

        System.out.print("Enter point 1 (latitude and longitude) in degrees: ");
        String P1 = leer.nextLine();

        System.out.print("Enter point 2 (latitude and longitude) in degrees: ");
        String P2 = leer.nextLine();

        int k = P1.indexOf(',');
        double x1 = Double.parseDouble(P1.substring(0, k - 1));
        double y1 = Double.parseDouble(P1.substring(k + 2));

        k = P2.indexOf(',');
        double x2 = Double.parseDouble(P2.substring(0, k - 1));
        double y2 = Double.parseDouble(P2.substring(k + 2));

        x1 = Math.toRadians(x1);
        y1 = Math.toRadians(y1);
        x2 = Math.toRadians(x2);
        y2 = Math.toRadians(y2);

        double DIS = RAD * Math.acos(Math.sin(x1) * Math.sin(x2) + Math.cos(x1) * Math.cos(x2) * Math.cos(y1-y2));
        System.out.println("The distance between the two points is " + DIS);
    }
}
