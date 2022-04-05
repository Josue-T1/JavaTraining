package com.company;

import java.util.Scanner;

public class Ex_20 {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("write a string :");
        String St = leer.next();

        System.out.println("Length is " + St.length() + " First char is " + St.charAt(0));
    }
}
