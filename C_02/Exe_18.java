package com.company;

public class Exe_18 {
    public static void main(String[] args) {

        int A[][] = {{0, 0}, {1, 4}, {2, 7}, {3, 9}, {4, 11}};
        int B[][] = {{2, 1}, {4, 2}, {6, 3}, {10, 5}, {12, 7}};

        double x, y;
        System.out.println("a 		b 		Middle Point");

        for (int i = 0; i <= 5; i++) {
            System.out.print("\n");

            x = (A[i][0] + B[i][0]) / 2.0;
            y = (A[i][1] + B[i][1]) / 2.0;

            System.out.print("(" + A[i][0] + "," + A[i][1] + ") 		");
            System.out.print("(" + B[i][0] + "," + B[i][1] + ") 		");
            System.out.print("(" + x + "," + y + ")");
        }
    }
}
