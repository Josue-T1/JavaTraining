package com.company;

import java.util.Scanner;

public class Ex_08 {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        System.out.print("Enter an ASCII code: ");
        int ASC = leer.nextInt();

        System.out.println("The character for ASCII code " + ASC + " is " + (char) ASC);
    }
}
