package com.company;

import java.util.Scanner;

public class Ex_01 {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.print("Enter the length from the center to a vertex: ");
        double L = leer.nextDouble();
        double OT = (2*L) * Math.sin(Math.PI/5);
        double Are = (5*Math.pow(OT,2)) / (4*Math.tan(Math.PI/5));

        System.out.printf("The area of the pentagon is %5.2 :" + Are);
    }
}
