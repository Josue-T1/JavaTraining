package com.company;

import java.util.Scanner;

public class Ex_26 {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.print("Enter an amount, for example 11.56: ");
        String AM = leer.nextLine();

        String NOD = AM.substring(0, AM.indexOf('.'));

        int CNTS = Integer.parseInt(AM.substring(AM.indexOf('.') + 1));

        int NOQ = CNTS / 25;
        CNTS %= 25;

        int NODS = CNTS / 10;
        CNTS %= 10;

        int NON = CNTS / 5;
        CNTS %= 5;

        System.out.println("Your amount " + AM + " consists of " + NOD + " dollars" + NOQ + " quarters" + NODS + " dimes " + NON + " nickels "	+ CNTS + " pennies ");
    }
}
