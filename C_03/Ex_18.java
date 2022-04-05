package com.company;

import java.util.Scanner;

public class Ex_18 {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("Enter your packages weight :");
        double WT = leer.nextDouble();
        String shipping = "";

        if (WT > 50) {
            System.out.println("The package cannot be shipped ");
            leer.close();
            return;
        } else if (WT > 0 && WT <= 1) {
            shipping += 3.5;
        } else if (WT > 1 && WT <= 3) {
            shipping += 5.5;
        } else if (WT > 3 && WT <= 10) {
            shipping += 8.5;
        } else if (WT > 10 && WT <= 20) {
            shipping += 10.5;
        }
        System.out.println(" With a package weight of :" + WT + " your cost of shipping will be :" + shipping);
        leer.close();
    }
}
