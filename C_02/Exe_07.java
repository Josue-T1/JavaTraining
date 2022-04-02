package com.company;

import java.util.Scanner;

public class Exe_07 {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.print("Enter the N of minutes: ");
        int Mi = leer.nextInt();
        int YR = Mi / 525600;
        int D = ( Mi % 525600 ) / 1440;

        System.out.println(Mi + "Minutes  " + YR + " years & " + D + " days");
    }
}
