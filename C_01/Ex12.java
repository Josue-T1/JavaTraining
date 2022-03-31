package com.company;

public class Ex12 {
    public static void main(String[] args) {
        double HR = 1;
        double MN = 40;
        double SEC = 35;
        double DM = 24;
        double DEK = DM * 1.6;
        double TEM = HR * 60.0 + MN + SEC / 60.0;
        double KPH = 60.0 * DEK / TEM;

        System.out.println(KPH);
    }
}
