package com.company;

import java.util.Scanner;

public class Ex_28 {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.print(" Enter r1's center x and y coordinates, width and height :");
        double x = leer.nextDouble();
        double y = leer.nextDouble();
        double W = leer.nextDouble();
        double H = leer.nextDouble();

        System.out.print("Enter r2's center x and y coordinates, width and height :");
        double x2 = leer.nextDouble();
        double y2 = leer.nextDouble();
        double W2 = leer.nextDouble();
        double H2 = leer.nextDouble();

        if	((Math.pow(Math.pow(y2-y, 2), .05) + H2/2 <= H/2) && (Math.pow(Math.pow(x2-x, 2), .05) +W2/2 <= W/2) && (H/2 + H2/2 <= H) && (W/2 + W2/2 <= W))
            System.out.println(" R2 is inside R1 ");
        else if ((x+W / 2> x2-W2) || (y+H / 2 > y2-H2))
            System.out.println(" R2 overlaps R1");
        else
            System.out.println(" R2 does not overlap R1");
    }
}
