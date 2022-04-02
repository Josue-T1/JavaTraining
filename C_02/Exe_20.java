package com.company;

import java.util.Scanner;

public class Exe_20 {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.print("Enter balance and interest rate (e.g., 3 for 3%): ");
        double BL = leer.nextDouble();
        double AIN = leer.nextDouble();
        double IT = BL * (AIN / 1200);

        System.out.println("Interest :" + IT);
    }
}
