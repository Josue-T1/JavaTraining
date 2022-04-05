package com.company;

import java.util.Scanner;

public class Ex_07 {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.print("Enter an amount in double, for example 11.56 :");
        double AMO = leer.nextDouble();

        int R = (int)(AMO * 100);
        int NOD = R / 100;
        R %= 100;
        int NOQ = R / 25;
        R %= 25;
        int NODS = R / 10;
        R %= 10;
        int NON = R / 5;
        R %= 5;
        int NOP = R;

        System.out.println("Your amount " + AMO + " consists of ");
        System.out.println(" " + NOD + (NOD == 1 ? " dollar" : " dollars "));
        System.out.println(" " + NOQ + (NOQ == 1 ? " quarter" : " quarters "));
        System.out.println(" " + NODS + (NODS == 1 ? " dime" : " dimes "));
        System.out.println(" " + NON + (NON == 1 ? " nickel" : " nickels "));
        System.out.println(" " + NOP + (NOP == 1 ? " pennie" : " pennies "));
    }
}
