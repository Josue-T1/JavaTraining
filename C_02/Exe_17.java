package com.company;

import java.util.Scanner;

public class Exe_17 {
    public static void main(String[] args) {

        Scanner Leer = new Scanner(System.in);

        System.out.print("Write the temperature between -58ºF and 41ºF: ");
        double TP = Leer.nextDouble();

        System.out.print("Write the wind speed (>= 2) in M/H: ");
        double SP = Leer.nextDouble();

        double CI = 35.74 + 0.6215 * TP - 35.75 * Math.pow(SP, 0.16) + 0.4275 * TP * Math.pow(SP, 0.16);
        System.out.println("The wind chill index is: " + CI);
    }
}
