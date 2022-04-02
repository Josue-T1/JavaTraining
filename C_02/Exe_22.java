package com.company;

import java.util.Scanner;

public class Exe_22 {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.print("Enter an amount as integer: ");
        int A = leer.nextInt();
        int R = A;
        int D = R / 100;
        R %= 100;
        int C = R / 1;
        R %= 1;

        System.out.println("Your amount " + A / 100.0 + " consists of");
        System.out.println(" " + D + " dollars");
        System.out.println(" " + C + " cents");
    }
}
