package com.company;

import java.util.Scanner;

public class Exe_16 {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.print("Side: ");
        double S = leer.nextDouble();
        double A = (( 3 * Math.pow (3, 0.5)) / 2 ) * Math.pow( S, 2 );
        System.out.println("The area is " + A);
    }
}
