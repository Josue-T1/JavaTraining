package com.company;

import java.util.Scanner;

public class Ex_31 {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.print("Enter the exchange rate from dollars to RMB: ");
        double RFD = leer.nextDouble();

        System.out.print("Enter 0 to convert dollars to RMB and 1 vice versa: ");
        int CDTR = leer.nextInt();

        double A = 0;

        if (CDTR == 1) {
            System.out.print("Enter the RMB amount: ");
        } else {
            System.out.println("Enter the dollar amount: ");
        }
        A = leer.nextDouble();

        if (CDTR == 1) {
            double Yuan = A * RFD;
            System.out.println(" $ " + A + " dollars is " + Yuan + " yuan");

        } else {
            double Doollar = A / RFD;
            System.out.printf("%.2f yuan is %.2f dollars", A, Doollar);

        }
    }
}
