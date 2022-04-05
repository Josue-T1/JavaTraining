package com.company;

import java.util.Scanner;

public class Ex_20 {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        System.out.println(" Enter the temperature in Fahrenheit between -58°F and 41°F :");
        double T = leer.nextDouble();

        System.out.println("Enter the wind speed (>=2) in miles per hour: ");
        int WS = leer.nextInt();

        if (T >= -58 && T <= 41 && WS >= 2) {
            double POW = Math.pow(WS, 0.16);
            double TW = 35.74 + 0.6215 * T - 35.75 * POW + 0.4275 * T * POW;
            System.out.println(" The wind chill index is: " + TW);
        } else {
            System.out.println(" Please check to make sure you are entering valid input ");
        }
        leer.close();
    }
}
