package com.company;

import java.util.Scanner;

public class Ex_25 {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.print("Enter x1:");
        double x1 = leer.nextDouble();
        System.out.print("Enter y1 :");
        double y1 = leer.nextDouble();
        System.out.print("Enter x2 :");
        double x2 = leer.nextDouble();
        System.out.print("Enter y2 :");
        double y2 = leer.nextDouble();
        System.out.print("Enter x3 :");
        double x3 = leer.nextDouble();
        System.out.print("Enter y3 :");
        double y3 = leer.nextDouble();
        System.out.print("Enter x4 :");
        double x4 = leer.nextDouble();
        System.out.print("Enter y4 :");
        double y4 = leer.nextDouble();

        double a = y1 - y2;
        double b = -1 * (x1 - x2);
        double c = y3 - y4;
        double d = -1 * (x3 - x4);
        double e = (y1 - y2) * x1 - (x1 - x2) * y1;
        double f = (y3 - y4) * x3 - (x3 - x4) * y3;

        if (a * d - b * c == 0) {
            System.out.println(" The two lines are parallel ");
        } else {
            double x = (e * d - b * f) / (a * d - b * c);
            double y = (a * f - e * c) / (a * d - b * c);
            System.out.println("The intersecting point is at (" + x + ", " + y + ")");
        }
    }
}
