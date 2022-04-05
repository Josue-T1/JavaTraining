package com.company;

import java.util.Scanner;

public class Ex_08 {
    public static void main(String[] args) {

        Scanner Leer = new Scanner(System.in);

        System.out.print("Enter three integers :");
        int N1 = Leer.nextInt();
        int N2 = Leer.nextInt();
        int N3 = Leer.nextInt();
        int T;

        if (N2 < N1 || N3 < N1)
        {
            if (N2 < N1)
            {
                T = N1;
                N1 = N2;
                N2 = T;
            }
            if (N3 < N1)
            {
                T = N1;
                N1 = N3;
                N3 = T;
            }
        }
            if (N3 < N2)
            {
            T = N2;
            N2 = N3;
            N3 = T;
            }
        System.out.println(N1 +" | "+ N2 +" | "+ N3);
    }
}
