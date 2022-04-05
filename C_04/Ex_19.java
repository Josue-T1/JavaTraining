package com.company;

import java.util.Scanner;

public class Ex_19 {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("Enter first 9 numbers in ISBN :");
        String ISBN = leer.nextLine();

        int S = 0;

        for (int i = 0, j = 1; i < 9; i++, j++) {
            int N = Integer.parseInt(String.valueOf(ISBN.charAt(i)));
            S += N * j;
        }
        int D = S % 11;
        if (D == 10) {
            ISBN += "X";
        } else {
            ISBN += D;
        }
        System.out.println(" The ISBN-10 is :" + ISBN);
    }
}
