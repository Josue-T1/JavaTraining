package com.company;

import java.util.Scanner;

public class Ex_09 {
    public static void main(String[] args) {

        double HS = 0, SCH = 0;

        String HNAM = "";
        String SECN = "";
        String TNA = "";
        double TSC = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int NSTUD = input.nextInt();

        System.out.print("Enter a students name: ");
        HNAM = input.next();

        System.out.print("Enter the students score: ");
        HS = input.nextDouble();

        while (NSTUD > 1) {
            System.out.print("Enter a students name: ");
            TNA = input.next();

            System.out.print("Enter the students score: ");
            TSC = input.nextDouble();

            if (TSC > HS) {
                SCH = HS;
                SECN = HNAM;
                HS = TSC;
                HNAM = TNA;
                NSTUD--;
                continue;
            }
            if (TSC < HS && TSC > SCH) {
                SCH = TSC;
                SECN = TNA;
            }
            NSTUD--;
        }
        System.out.println(" The top two students are :");
        System.out.print( HNAM + " 's score of :" + HS);
        System.out.print(" and " + SECN + " 's score of :" + SCH);

    }
}
