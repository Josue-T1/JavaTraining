package com.company;

import java.util.Scanner;

public class Exe_01 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double MLL = leer.nextDouble();
        double KM = MLL * 1.6;

        System.out.print("write The Miles: ");
        System.out.println(MLL + ": Miles are : " + KM + " KL.");
    }
}
