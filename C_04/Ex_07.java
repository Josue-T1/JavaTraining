package com.company;

import java.util.Scanner;

public class Ex_07 {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.print("Enter the radius of the bounding circle: ");
        double ROBC = leer.nextDouble();

        System.out.println("The coordinates of five points on the pentagon are :");

        for (int i = 0; i < 5; i++) {
            double x = ROBC * Math.sin(2.0*Math.PI / 5.0*i);
            double y = ROBC * Math.cos(2.0*Math.PI / 5.0*i);
            System.out.println(x + " " + y);
        }
    }
}