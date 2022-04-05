package com.company;

import java.util.Scanner;

public class Ex_04 {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.print("Enter the side: ");
        double SD = leer.nextDouble();
        double ARE = (6 * Math.pow(SD,2)) / (4*Math.tan(Math.PI/6));

        System.out.printf("The are of the hexagon is %4.2 ", ARE);
    }
}
