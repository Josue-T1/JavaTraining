package com.company;

import java.util.Scanner;

public class Ex_14 {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        int RO = (int)(Math.random() * 2);

        System.out.print("Enter a guess 0-head or 1-tail: ");
        int opc = leer.nextInt();

        System.out.println(((opc == RO) ? "Correct" : "Incorrect") + " guess.");
    }
}
