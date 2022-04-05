package com.company;

import java.util.Scanner;

public class Ex_01 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.print(" Enter a, b and c : ");

        double a = leer.nextDouble();
        double b = leer.nextDouble();
        double c = leer.nextDouble();
        double DS = Math.pow(b, 2) - 4 * a * c;

        System.out.print("The equation :");
        if (DS > 0)
        {
            double V1 = (-b + Math.pow(DS,0.5))/(2 * a);
            double V2 = (-b - Math.pow(DS,0.5))/(2 * a);
            System.out.println(" two roots :" + V1 + " &" + V2);
        }
        else if (DS == 0)
        {
            double V1 = (-b + Math.pow(DS,0.5)) / (2 * a);
            System.out.println(" one root :" + V1);
        }
        else
            System.out.println(" no real roots");
    }
}
