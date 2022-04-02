package com.company;

import java.util.Scanner;

public class Exe_21 {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.print("Enter investment amount :");
        double IA = leer.nextDouble();

        System.out.print("Enter annual interest rate in percentage: ");
        double AI = leer.nextDouble();
        AI /= 1200;

        System.out.print("Enter number of years: ");
        int NY = leer.nextInt();

        double FV = IA * Math.pow(1 + AI, NY * 12);
        System.out.println("Accumulated value is $" + FV);
    }
}
