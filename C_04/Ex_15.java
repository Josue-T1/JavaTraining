package com.company;

import java.util.Scanner;

public class Ex_15 {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.print("Enter a letter: ");
        String s = leer.nextLine();

        char TC = s.charAt(0);
        TC = Character.toUpperCase(TC);

        int num = 0;
        if (Character.isLetter(TC))
        {
            if (TC >= 'W')
                num = 9;
            else if (TC >= 'T')
                num = 8;
            else if (TC >= 'P')
                num = 7;
            else if (TC >= 'M')
                num = 6;
            else if (TC >= 'J')
                num = 5;
            else if (TC >= 'G')
                num = 4;
            else if (TC >= 'D')
                num = 3;
            else if (TC >= 'A')
                num = 2;

            System.out.println("The corresponding number is " + num);
        }
        else
            System.out.println(TC + " is invalid ");
    }
}
