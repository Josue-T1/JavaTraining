package com.company;

import java.util.Scanner;

public class Exe_13 {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        final double IR = 0.003125;
        System.out.print("Enter the monthly saving amount: ");
        double sAm = leer.nextDouble();

        double TT = 100 * (1 + IR);
        double T1 = (100 + TT) * (1 + IR);
        double T2 = (100 + T1) * (1 + IR);
        double T3 = (100 + T2) * (1 + IR);
        double T4 = (100 + T3) * (1 + IR);

        System.out.println("After the first month, the value is " + TT);
        System.out.println("After the second month, the value is " + T1);
        System.out.println("After the third month, the value is " + T1);
        System.out.println("After the fourth month, the value is " + T1);
    }
}
