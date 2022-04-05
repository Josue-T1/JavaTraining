package com.company;

import java.util.Scanner;

public class Ex_21 {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.print("Enter year: (e.g., 2012) ");
        int y = leer.nextInt();

        System.out.print("Enter month: 1-12 : ");
        int m = leer.nextInt();

        System.out.print("Enter the day of the month: 1-31 : ");
        int dom = leer.nextInt();

        if (m == 1 || m == 2){
            m = (m == 1) ? 13 : 14;
            y--; }
        int op = (dom + (26 * (m + 1)) / 10 + (y % 100) + (y % 100) / 4 + (y / 100) / 4 + 5 * (y / 100)) % 7;

        System.out.print("Day of the week is ");

        switch(op){
            case 0: System.out.println("Saturday"); break;
            case 1: System.out.println("Sunday"); break;
            case 2: System.out.println("Monday"); break;
            case 3: System.out.println("Tuesday"); break;
            case 4: System.out.println("Wednesday"); break;
            case 5: System.out.println("Thursday"); break;
            case 6: System.out.println("Friday");
        }
    }
}
