package com.company;

import java.util.Scanner;

public class Exe_11 {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        System.out.print(" Write the number of years :");
        int YR = leer.nextInt();

        int PP = 312032486 + (((31536000/7) - (31536000/13) + (31536000/45)) * YR);
        System.out.println("  population in the year " + YR + " is :" + PP);
    }
}
