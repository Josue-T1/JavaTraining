package com.company;

import java.util.Scanner;

public class Exe_02 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double AR;

        System.out.println("Write the length and height of the EQUILATERAL triangle: ");
        double LOS = leer.nextDouble();
        AR = (Math.sqrt(3) / 4) * (LOS * LOS);
        double VL = AR * LOS;

        System.out.println("The area is " + AR);
        System.out.print("The volume of the Triangular prism is " + VL);
    }
}
