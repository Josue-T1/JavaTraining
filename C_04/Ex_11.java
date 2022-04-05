package com.company;

import java.util.Scanner;

public class Ex_11 {
    public static void main(String[] args) {
        String BIN;

        Scanner leer = new Scanner( System.in );
        System.out.print("Enter binary digits (0000 to 1111): ");
        BIN =leer.nextLine();

        System.out.println("The decimal value is: "+Integer.parseInt(BIN,2));
    }
}
