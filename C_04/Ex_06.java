package com.company;

public class Ex_06 {
    public static void main(String[] args) {

         double rad = 40;

        double A = (Math.random() * (2*Math.PI));
        double A1 = (Math.random() * (2*Math.PI));
        double A2 = (Math.random() * (2*Math.PI));


        double x1 = rad*Math.cos(A);
        double y1 = rad*Math.sin(A);
        double x2 = rad*Math.cos(A1);
        double y2 = rad*Math.sin(A1);
        double x3 = rad*Math.cos(A2);
        double y3 = rad*Math.sin(A2);


        double a = Math.sqrt(Math.pow(x2-x3, 2) + Math.pow(y2-y3, 2));
        double b = Math.sqrt(Math.pow(x1-x3, 2) + Math.pow(y1-y3, 2));
        double c = Math.sqrt(Math.pow(x1-x2, 2) + Math.pow(y1-y2, 2));


        double AB = Math.toDegrees(Math.acos((a*a - b*b - c*c) / (-2*b*c)));
        double BC = Math.toDegrees(Math.acos((b*b - a*a - c*c) / (-2*a*c)));
        double CC = Math.toDegrees(Math.acos((c*c - b*b - a*a) / (-2*a*b)));

        System.out.println("The three angles are " + Math.round(AB*100) / 100.0 + " " + Math.round(BC*100)/100.0 + " " + Math.round(CC*100)/100.0);
    }
}
