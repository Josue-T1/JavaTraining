package com.company;

import java.util.Scanner;

public class Ex_02 {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        int D1 = (int)(Math.random() * 10);
        int D2 = (int)(Math.random() * 10);
        int D3 = (int)(Math.random() * 10);

        System.out.print(" What is " + D1 + " + " + D2 + " + " + D3 + "? ");
        int QST = leer.nextInt();

        System.out.println( D1 + " + " + D2 + " + " + D3 + " = " + QST + " is :" +( D1 + D2 + D3 == QST ));
    }
}
