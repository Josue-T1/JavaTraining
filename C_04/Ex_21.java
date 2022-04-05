package com.company;

import java.util.Scanner;

public class Ex_21 {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("Loan amount: ");
        double LA = leer.nextDouble();

        System.out.println("Number of years: ");
        int NY = leer.nextInt();

        System.out.println("Interest rate - Monthly Payment - Total Payment");

        for (double i = 5.0; i <= 8.0; i += 0.125) {
            double MIR = i / 1200;
            double MPT = LA * MIR / (1 - 1 / Math.pow(1 + MIR, NY * 12));
            double TTP = MPT * NY * 12;

            System.out.printf("%.3f", i);
            System.out.print("%");
            System.out.printf("%.2f", MPT);
            System.out.printf("%.2f", TTP);
        }
    }
}
