package com.company;

import java.util.Scanner;

public class Ex_30 {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("Enter the time zone offset to GMT :");
        int Time = leer.nextInt();
        boolean pm = false;

        long TIM = System.currentTimeMillis();
        long SC1970 = TIM / 1000;
        long SC = SC1970 % 60;
        long MN1970 = SC1970 / 60;
        long MN = MN1970 % 60;
        long HR1970 = MN1970 / 60;

        System.out.println(HR1970);

        long HR = HR1970 % 24;
        HR += Time;

        if (HR > 12) {
            pm = true;
            HR -= 12;
        }
        System.out.println("Your current time is " + HR + ":" + MN + ":" + SC + (pm ? " PM" : " AM"));
    }
}
