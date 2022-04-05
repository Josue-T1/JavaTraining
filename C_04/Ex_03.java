package com.company;

public class Ex_03 {
    public static void main(String[] args) {

        double X1 = 51.5138505182;
        double Y1 = -0.15690922737098845;
        double X2 = 28.5383355;
        double Y2 = -81.37923649999999;
        double X3 = 32.0835407;
        double Y3 = -81.09983419999998;
        double X4 = 35.2270869;
        double Y4 = -80.84312669999997;

        double s1 = Math.sqrt(Math.pow(X1-X2, 2) + Math.pow(Y1-Y2, 2));
        double s2 = Math.sqrt(Math.pow(X2-X3, 2) + Math.pow(Y2-Y3, 2));
        double s3 = Math.sqrt(Math.pow(X1-X3, 2) + Math.pow(Y1-Y3, 2));

        double s = (s1+s2+s3)/2;
        double a = Math.sqrt(s * (s-s1) * (s-s2) * (s-s3));

        s1 = Math.sqrt(Math.pow(X1-X3, 2) + Math.pow(Y1-Y3, 2));
        s2 = Math.sqrt(Math.pow(X4-X3, 2) + Math.pow(Y4-Y3, 2));
        s3 = Math.sqrt(Math.pow(X1-X4, 2) + Math.pow(Y1-Y4, 2));

        s = (s1+s2+s3)/2;
        a = Math.sqrt(s * (s-s1) * (s-s2) * (s-s3)) + a;

        System.out.print("The area enclosed by 4 cities is " + a + " km^2");
    }
}
