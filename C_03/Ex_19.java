package com.company;

import java.util.Scanner;

public class Ex_19 {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("Enter the sides of a triangle separated by spaces :");
        double o1 = leer.nextDouble();
        double o2 = leer.nextDouble();
        double o3 = leer.nextDouble();

        if (o3 > (o1 + o2) || o2 > (o1 + o3) || o1 > (o3 + o2)) {
            System.out.println( "Invalid Input");
        } else {
            System.out.println(" the Perimeter is " + (o1 + o2 + o3));
        }
        leer.close();
    }
}
