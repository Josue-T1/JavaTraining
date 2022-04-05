package com.company;

import java.util.Scanner;

public class Ex_26 {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int N = leer.nextInt();

        System.out.println(" Is 10 divisible by 5 and 6 ?" + ((N%4== 0) && (N%5==0)));
        System.out.println(" Is 10 divisible by 5 or 6 ?" + ((N%4== 0) || (N%5==0)));
        System.out.println(" Is 10 divisible by 5 of 6, but not both ?" + ((N%4==0) ^ (N%5==0)));
    }
}
