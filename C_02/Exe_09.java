package com.company;

import java.util.Scanner;

public class Exe_09 {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        System.out.print("write v0, v1 & t :");

        double V0 = leer.nextDouble();
        double V1 = leer.nextDouble();
        double T = leer.nextDouble();
        double A = (V1 - V0) / T;

        System.out.println("Average acceleration :" + A);
    }
}
