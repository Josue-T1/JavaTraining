package com.company;

import java.util.Scanner;

public class Ex_14 {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.print("Enter a letter grade: ");
        String LG = leer.nextLine();
        char TC = LG.charAt(0);
        TC = Character.toUpperCase(TC);

        if (TC>='A' && TC<='F' && TC!='E')
        {
            System.out.print("The numeric value for grade " + TC + " is ");
            switch(TC)
            {
                case 'A': System.out.println(4); break;
                case 'B': System.out.println(3); break;
                case 'C': System.out.println(2); break;
                case 'D': System.out.println(1); break;
                case 'F': System.out.println(0);
            }
        }
        else
            System.out.println(TC + " is invalid ");
    }
}
