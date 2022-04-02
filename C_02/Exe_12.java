package com.company;

import java.util.Scanner;

public class Exe_12 {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.print("Enter the speed : ");
        double SD = leer.nextDouble();
        System.out.print("Enter the acceleration :");
        double AC = leer.nextDouble();
        double LG = Math.pow(SD, 2) / (2 * AC);

        System.out.println(" minimum  length for the airplane :" + LG);
    }
}
