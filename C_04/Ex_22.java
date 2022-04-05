package com.company;

import java.util.Scanner;

public class Ex_22 {
    public static void main(String[] args) {

        Scanner Leer = new Scanner(System.in);
        System.out.println("Enter the loan amount: ");
        double LA = Leer.nextDouble();

        System.out.println("Number of years: ");
        int NY = Leer.nextInt();

        System.out.println("Annual Interest Rate (as a percent (ex. enter '7' for 7%)): ");
        double RT = Leer.nextDouble();

        double MIN = RT / 1200;
        double MP = LA * MIN / (1 - 1 / Math.pow(1 + MIN, NY * 12));
        System.out.printf("Monthly Payment: %.2f", MP);

        double TTP = MP * NY * 12;

        System.out.printf("Total Payment: %.2f", TTP);
        System.out.println();
        double BL = TTP;
        double PCP;

        for (int i = 1; i <= NY * 12; i++) {
            System.out.println("Payment Interest Principal Balance");
            double INTE = MIN * BL;
            PCP = MP - INTE;
            BL = BL - PCP;
            System.out.printf("%1d %4.2f %4.2f %.2f", i, INTE, PCP, BL);
        }
    }
}
