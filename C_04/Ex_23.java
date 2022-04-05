package com.company;

import java.util.Scanner;

public class Ex_23 {
    public static void main(String[] args) {

        double GP, FD, STATE,TTD;
        Scanner leer = new Scanner(System.in);

        System.out.print("Enter employee’s name: ");
        String EN = leer.next();

        System.out.print("Enter number of hours worked in a week: ");
        double HWD = leer.nextDouble();

        System.out.print("Enter hourly pay rate: ");
        double HPR = leer.nextDouble();

        System.out.print("Enter federal tax withholding rate: ");
        double FTR = leer.nextDouble();

        System.out.print("Enter state tax withholding rate: ");
        double STR = leer.nextDouble();

        System.out.printf("Employee Name: " + EN + "Hours Worked: " + HWD + "Pay Rate: $" + HPR +
                "Gross Pay: $" + (GP = HWD * HPR) +
                "Deductions: Federal Witholding (20.0%): $" + (FD = GP * FTR) +
                " State Witholding (9.0%): $" + (STATE = GP * STR) +
                " Total Deduction: $" + (TTD = FD + STATE) +
                " Net Pay: $" + (GP - TTD));
    }
}
