package com.company;

public class Ex_10 {
    public static void main(String[] args) {

         int INNU = 100;
         int ENUM = 1000;
         int CONT = 0;

        for (int i = INNU; i <= ENUM; i++) {
            if (i % 6 == 0 && i % 5 == 0) {
                System.out.print( i + " ");
                CONT++;
                if (CONT == 10) {
                    System.out.println();
                    CONT = 0;
                }
            }
        }
    }
}
