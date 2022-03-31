package com.company;

public class Ex10 {
    public static void main(String[] args) {
        double Kl = 15.0;
        double Mll = Kl / 1.6;
        double Min = 50.0;
        double RT = (Min * 60.0 + 30.0) / (60.0 * 60.0);
        double MxH = Mll / RT;
        System.out.println(MxH);
    }
}
