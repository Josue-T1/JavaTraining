package com.company;

import java.util.Scanner;

public class Ex_29 {
    public static void main(String[] args) {

        Scanner Leer = new Scanner(System.in);

        double X1, Y1, X2, Y2, R1, R2;
        System.out.print("Enter circle1's center x-, y-coordinates, and radius: ");
        X1 = Leer.nextDouble();
        Y1 = Leer.nextDouble();
        R1 = Leer.nextDouble();

        System.out.print("Enter circle2's center x-, y-coordinates, and radius: ");
        X2 = Leer.nextDouble();
        Y2 = Leer.nextDouble();
        R2 = Leer.nextDouble();

        double DBC = Math.sqrt(Math.pow((X2-X1), 2) + Math.pow((Y2-Y1), 2));
        String RS = "";
        if (DBC <= Math.abs(R1 - R2)) {
            RS += "is inside circle1";
        } else if (DBC <= R1 + R2) {
            RS += "overlaps circle1";
        } else {
            RS += "is not inside of and does not overlap circle1";
        }
        System.out.println("Circle2 " + RS);
    }
}
