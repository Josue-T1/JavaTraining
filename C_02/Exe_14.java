package com.company;

import java.util.Scanner;

public class Exe_14 {
    public static void main(String[] args) {

        Scanner Leer = new Scanner(System.in);
        final double KG = 0.45359237;
        final double MT = 0.0254;

        System.out.print("write weight on pounds: ");
        double WH = Leer.nextDouble();

        System.out.print("Enter height on inches: ");
        double HG = Leer.nextDouble();

        WH = WH * KG;
        HG = HG * MT;

        double BMI = WH / Math.pow (HG, 2);
        System.out.println("BMI : " + BMI);
    }
}
