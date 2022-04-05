package com.company;

import java.util.Scanner;

public class Ex_13 {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.print("Enter a letter: ");
        String Let = leer.nextLine();
        char C = Let.charAt(0);

        if (Character.isLetter(C))
        {
            switch(Character.toUpperCase(C))
            {
                case 'A':
                case 'E':
                case 'I':
                case '0':
                case 'U': System.out.println(C + " is a vowel"); break;
                default : System.out.println(C + " is a consonant");
            }
        }
        else
            System.out.println(C + " is  invalid ");
    }
}
