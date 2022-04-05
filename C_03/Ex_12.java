package com.company;

import java.util.Scanner;

public class Ex_12 {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.print("Enter a three-digit integer :");
        int num = leer.nextInt();

        int D1 = (int)(num / 100);
        int rem = num % 100;
        int D2 = (int)(rem % 10);

        System.out.println(num + ((D1 == D2) ? " is a " : " is not a ") + "palindrome");
    }
}
