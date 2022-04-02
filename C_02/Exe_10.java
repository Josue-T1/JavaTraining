package com.company;

import java.util.Scanner;

public class Exe_10 {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.print("write the amount of water in KL: ");
        double KG = leer.nextDouble();

        System.out.print("write initial temperature: ");
        double IT = leer.nextDouble();

        System.out.print("write final temperature: ");
        double FT = leer.nextDouble();

        double ENE = KG * (FT - IT) * 4184;
        System.out.println(" The energy needed is :" + ENE);
    }
}
