package com.company;

import java.util.Scanner;

public class Ex_03 {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.print("Enter a, b, c, d, e and f : ");
        double a = leer.nextDouble();
        double b = leer.nextDouble();
        double c = leer.nextDouble();
        double d = leer.nextDouble();
        double e = leer.nextDouble();
        double f = leer.nextDouble();

        if (a * d - b * c == 0)
            System.out.println("The equation has no solution, try again");
        else {
            double x = (e * d - b * f) / (a * d - b * c);
            double y = (a * f - e * c) / (a * d - b * c);
            System.out.println(" x is :" + x + " y is :" + y);
        }
    }
}
