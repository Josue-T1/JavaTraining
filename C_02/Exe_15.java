package com.company;

import java.util.Scanner;

public class Exe_15 {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        System.out.print("Enter x1 and y1: ");

        double X1 = leer.nextDouble();
        double Y1 = leer.nextDouble();

        System.out.print("Enter x2 and y2: ");
        double X2 = leer.nextDouble();
        double Y2 = leer.nextDouble();
        double DT = Math.pow(Math.pow(X2 - X1, 2) +Math.pow (Y2 - Y1, 2), 0.5);
        System.out.println(" distance between the two points: " + DT);
    }
}
