package com.company;

import java.util.Scanner;

public class Ex_11 {
    public static void main(String[] args) {

        Scanner Leer = new Scanner(System.in);

        System.out.print("Enter the month as integer: ");
        int MN = Leer.nextInt();

        System.out.print("Enter the year as integer: ");
        int YR = Leer.nextInt();

        boolean Lapp = (YR % 4 == 0 && YR % 100 != 0) || (YR % 400 == 0);
        switch (MN)
        {
            case 1: System.out.println(" January " + YR + " had 31 days "); break;
            case 2: System.out.println(" February " + YR + " had" + ((Lapp) ? " 29 days" : " 28 days")); break;
            case 3: System.out.println(" March " + YR + " had 31 days"); break;
            case 4: System.out.println(" April " + YR + " had 30 days"); break;
            case 5: System.out.println(" May " + YR + " had 31 days"); break;
            case 6: System.out.println(" June " + YR + " had 30 days"); break;
            case 7: System.out.println(" July " + YR + " had 31 days"); break;
            case 8: System.out.println(" August " + YR + " had 31 days"); break;
            case 9: System.out.println(" September " + YR + " had 30 days"); break;
            case 10: System.out.println(" October " + YR + " had 31 days"); break;
            case 11: System.out.println(" November " + YR + " had 30 days"); break;
            case 12: System.out.println(" December " + YR + " had 31 days");
        }
    }
}
