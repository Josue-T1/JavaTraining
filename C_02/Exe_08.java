package com.company;

import java.util.Scanner;

public class Exe_08 {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.print("Enter the time zone offset to GMT: ");
        int inp = leer.nextInt();

        long MS = System.currentTimeMillis();
        long TS = MS / 1000;
        long CS = TS % 60;
        long TM = CS / 60;
        long CM = TM % 60;
        long H = CM / 60;
        long ACTH = H % 24; ACTH = ACTH + inp;

        System.out.println("actual time: " + ACTH + ":" + CM + ":" + CS);
    }
}
