package com.company;

import java.util.Scanner;

public class Ex_27 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        double x1 = 0, y1 = 0, x2 = 200, y2 = 0, x3 = 0, y3 = 100;
        double min, max, Dx, Dy;
        String RS = "";
        double DTM = (y2 - y3) * (x1 - x3) - (x3 - x2) * (y3 - y1);

        System.out.println("Enter a point's x and y coordinates: ");
        double x = in.nextDouble();
        double y = in.nextDouble();

        min = Math.min(DTM, 0);
        max = Math.max(DTM, 0);
        Dx = x-x3;
        Dy = y-y3;

        double a = y2 - y3 * Dx + (x3 - x2) * Dy;
        if (a < min || a > max) {
            RS += "The point is not in the triangle";
        }
        double b = (y3 - y1) * Dx + (x1 - x3) * Dy;
        if (b < min || b > max) {
            RS += "The point is not in the triangle";
        }
        double c = DTM - a - b;
        if (c < min || c > max) {
            RS += "The point is not in the triangle";
        } else {
            RS += "The point is in the triangle";
        }
        System.out.println(RS);
    }
}
