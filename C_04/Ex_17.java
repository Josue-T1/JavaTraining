package com.company;

import java.util.Scanner;

public class Ex_17 {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        String Y = "", M = "", D = "";
        System.out.print("\nEnter a year: ");

        try {
            Y = leer.next("[\\d][\\d][\\d][\\d]");
        } catch (Exception e) {
            System.out.println("Invalid input");
            System.exit(0);
        }
        int NY = Integer.parseInt(Y);

        System.out.print("\n Enter a month :");
        try {
            M = leer.next("[A-Z][a-z][a-z]");
        } catch (Exception e) {
            System.out.println("Invalid input");
            System.exit(1);
        }
        switch (M) {
            case "Sep":
            case "Apr":
            case "Jun":
            case "Nov":
                D += "30";
                break;
            case "Jan":
            case "Mar":
            case "May":
            case "Jul":
            case "Aug":
            case "Oct":
            case "Dec":
                D += "31";
                break;
            case "Feb":
                if (NY % 4 == 0) {
                    if (NY % 100 == 0) {
                        if (NY % 400 == 0) {
                            D += "29";
                        } else {
                            D += "28";
                        }
                    } else {
                        D += "29";
                    }
                } else {
                    D += "28";
                }
        }
        System.out.println( M + " " + Y + " " + D + " days");
    }
}
