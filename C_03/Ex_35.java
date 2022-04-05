package com.company;

import java.util.Scanner;

public class Ex_35 {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.print("Enter a number :");
        int N = leer.nextInt();

        if(N % 2 == 0)
            System.out.println(N + " is even number");
        else
            System.out.println(N + " is odd number");
    }
}

