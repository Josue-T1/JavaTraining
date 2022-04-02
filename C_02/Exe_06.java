package com.company;

import java.util.Scanner;

public class Exe_06 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.print("write a number between 0 and 1000: ");
        int INP = leer.nextInt();

        int L = INP % 10; INP /= 10;
        int T = INP % 10; INP /= 10;
        int H = INP % 10; INP /= 10;

        int TTL = L + T + H;
        System.out.println("The sum is :" + TTL);
    }
}
