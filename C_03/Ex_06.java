package com.company;

import java.util.Scanner;

public class Ex_06 {
    public static void main(String[] args) {

        final double Km = 0.45359237;
        final double Mt = 0.0254;
        final double Ft = 0.0833333;

        Scanner leer = new Scanner(System.in);

        System.out.print("Enter weight in pounds :");
        double we = leer.nextDouble();
        System.out.print("Enter feet :");
        double fe = leer.nextDouble();
        System.out.print("Enter inches :");
        double in = leer.nextDouble();

        we *= Km;
        double h = (in += fe / Ft) * Mt;
        double rs = we / (Math.pow(h, 2));

        System.out.println("BMI is :" + rs);

        if (rs < 18.5)
            System.out.println("Underweight");

        else if (rs < 25)
            System.out.println("Normal");

        else if (rs < 30)
            System.out.println("Overweight");

        else
            System.out.println("Obese");
    }
}
