package com.company;

import java.util.Scanner;

public class Exe_03 {
    public static void main(String[] args) {

        Scanner Leer = new Scanner(System.in);

        System.out.print("Enter the value: ");
        double M = Leer.nextDouble();
        double F = M * 3.2786;
        System.out.println(M + " Meters to: " + F + " Feet.");
    }
}
