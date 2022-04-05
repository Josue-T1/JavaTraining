package com.company;

import java.util.Scanner;

public class Ex_32 {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("Enter three sets of coordinates for the points p0, p1, p2 (ex: 4.4 2 6.5 9.5 -5 4): ");
        double x0 = leer.nextDouble();
        double y0 = leer.nextDouble();
        double x1 = leer.nextDouble();
        double y1 = leer.nextDouble();
        double x2 = leer.nextDouble();
        double y2 = leer.nextDouble();
        double DTM = (x1-x0) * (y2-y0) - (x2-x0) * (y1-y0);

        String BG = "(" +x2+ "," +y2+ ") is ";
        String END = " line from " + "(" +x0+ "," +y0+ ") to " + "(" +x1+ "," +y1+ ")";
        String OPC = "";

        if (DTM > 0) {
            OPC += "on the left side of the";
        } else if (DTM < 0) {
            OPC += "on the right side of the";
        } else if (DTM == 0) {
            OPC += "on the same line as the";
        } else {
            System.out.println("INVALID");
            System.exit(0);
        }
        System.out.println(BG + OPC + END);
    }
}
