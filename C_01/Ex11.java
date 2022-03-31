package com.company;

public class Ex11 {
    public static void main(String[] args) {
        double OB = 7.0;
        double OD = 13.0;
        double NiM = 45.0;
        double PB = 312032486;
        double STY = 60 * 60 * 24 * 365;

        double NC = STY / OB;
        double NM = STY / OD;
        double NI = STY / NiM;

        for (int k = 1; k <= 5; k++) {
            PB += NC + NI - NM;
            System.out.println("Y " + k + " = " + (int) PB);
        }
    }
}
