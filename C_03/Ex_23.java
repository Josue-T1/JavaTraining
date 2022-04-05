package com.company;

import java.util.Scanner;

public class Ex_23 {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.print("Enter a point with two coordinates :");

        double x = leer.nextDouble();
        double y = leer.nextDouble();

        boolean c = (Math.pow(Math.pow(x, 2), 0.5) <= 10 / 2 ) || (Math.pow(Math.pow(y, 2), 0.5) <= 5.0 / 2);
        System.out.println("Point (" + x + ", " + y + ") is " +	(c ? "in " : "not in ") + "the rectangle");
    }
}
