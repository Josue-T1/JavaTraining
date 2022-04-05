package com.company;

import java.util.Scanner;

public class Ex_15 {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        int Ran = (int)(Math.random()*1000);

        System.out.print("Enter a three-digit number :");
        int opc = leer.nextInt();

        int OP1 = Ran / 100;
        int R1 = Ran % 100;
        int OP2= R1 / 10;
        int OP3 = R1 % 10;
        int P1 = opc / 100;
        int R2 = opc % 100;
        int P2 = R2 / 10;
        int P3 = R2 % 10;

        System.out.println(" The lottery number is :" + Ran);

        if (opc == Ran)
            System.out.println(" Exact match: you win $12,000");
        if (P1 == OP2)
            System.out.println(" All digits: you win $5,000");
        else
            System.out.println(" One digit: you win $2,000" );
    }
}
