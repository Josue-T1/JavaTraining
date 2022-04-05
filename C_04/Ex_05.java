package com.company;

import java.util.Scanner;

public class Ex_05 {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.print("Enter the number of sides: ");
        int NOS = leer.nextInt();

        System.out.print("Enter the side: ");
        double SD = leer.nextDouble();
        double ARE = (NOS * Math.pow(SD, 2) / (4 * Math.tan(Math.PI / NOS)));

        System.out.println("The area of the polygon is " + ARE);
    }
}
