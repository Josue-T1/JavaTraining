package com.company;

import java.util.Scanner;

public class Ex_09 {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.print("Enter the first 9 digits of an ISBN as integer :");
        int ISBN = leer.nextInt();

        int D1 = ISBN / 100000000;
        int RD = ISBN % 100000000;

        int D2 = RD / 10000000;
        RD %= 10000000;

        int D3 = RD / 1000000;
        RD %= 1000000;

        int D4 = RD / 100000;
        RD %= 100000;

        int D5 = RD / 10000;
        RD %= 10000;

        int D6 = RD / 1000;
        RD %= 1000;

        int D7 = RD / 100;
        RD %= 100;

        int D8 = RD / 10;
        RD %= 10;

        int D9 = RD;

        int D10 = (D1 * 1 + D2 * 2 + D3 * 3 + D4 * 4 + D5 * 5 + D6 * 6 + D7 * 7 + D8 * 8 + D9 * 9) % 11;
        System.out.println(" The ISBN-10 number is :" + D1 + D2 + D3 + D4 + D5 + D6 + D7 + D8 + D9);

        if (D10 == 10)
            System.out.println(" X ");
        else
            System.out.println(D10);
    }
}
