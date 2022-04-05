package com.company;

import java.util.Scanner;

public class Ex_24 {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        System.out.print("Enter the first city: ");
        String FC = leer.nextLine();

        System.out.print("Enter the second city: ");
        String SC = leer.nextLine();

        System.out.print("Enter the third city: ");
        String TC = leer.nextLine();

        String temp;
        if (FC.compareTo(SC)<0) {
            temp = FC;
            FC = SC;
            SC = temp;
        }
        if (SC.compareTo(TC)<0) {
            temp = SC;
            SC = TC;
            TC = temp;
        }
        if (FC.compareTo(SC)<0) {
            temp = FC;
            FC = SC;
            SC = temp;
        }
        System.out.println("The three cities in alphabetical order are: ");
        System.out.println(FC);
        System.out.println(SC);
        System.out.println(TC);
    }
}
