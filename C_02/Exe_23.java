package com.company;

import java.util.Scanner;

public class Exe_23 {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.print("Enter the driving distace: ");
        double DD = leer.nextDouble();

        System.out.print("Enter miles per gallon: ");
        double MG = leer.nextDouble();

        System.out.print("Enter price per gallon: ");
        double PG = leer.nextDouble();

        double TTL = (DD / MG) * PG;
        System.out.println("The cost of driving is $" + TTL);
    }
}
