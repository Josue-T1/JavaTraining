package com.company;

import java.util.Scanner;

public class Ex_18 {
    public static void main(String[] args) {
        System.out.println("Please enter two characters Ex.(C3), M, C, or I for your major and ");
        System.out.println("1 thru 4, for your status");
        System.out.println("1 beingfreshman and 4 being senior");

        Scanner Leer = new Scanner(System.in);
        String STC = Leer.nextLine();

        String T1 = "";
        String T2 = "";
        char M = STC.charAt(0);
        char STY = STC.charAt(1);

        if (M == 'M') {
            T1 = "Mathematics";
        }
        else if (M == 'C') {
            T1 = "Computer Science";}
        else if (M == 'I') {
            T1 = "Information Technology";}

        if (STY == '1') {
            T2 = "Freshman";
        }
        else if (STY == '2') {
            T2 = "Sophomore";}
        else if(STY == '3') {
            T2 = "Junior";}
        else if(STY == '4') {
            T2 = "Senior";}

        System.out.println(T1 + " " + T2);
    }
}
