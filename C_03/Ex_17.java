package com.company;

import java.util.Random;
import java.util.Scanner;

public class Ex_17 {
    public static void main(String[] args) {

        Random ran = new Random();
        Scanner leer = new Scanner(System.in);

        int oth = ran.nextInt(3);
        String Result = "The computer is";
        int S = 0;
        int P = 2;
        int R = 1;

        System.out.println("Scissor (0), rock (1), paper (2) :");
        int SL = leer.nextInt();

        if (SL == 0 || SL == 1 || SL == 2) {

            switch (SL) {
                case 0:
                    if (oth == S) {
                        Result += " scissor and you are scissor, it's a draw ";
                    } else if (oth == R) {
                        Result += " rock and you are scissor, you lost ";
                    } else if (oth == P) {
                        Result += " paper and you are scissor, you won ";
                    }
                    break;
                case 1:
                    if (oth == S) {
                        Result += " scissor and you are rock, you won ";
                    } else if (oth == R) {
                        Result += " rock and you are rock, its a draw ";
                    } else if (oth == P) {
                        Result += " paper and you are rock, you lost ";
                    }
                    break;
                case 2:
                    if (oth == S) {
                        Result += " scissor and you are paper, you lost.";
                    } else if (oth == R) {
                        Result += " rock and you are paper, you won ";
                    } else if (oth == P) {
                        Result += " paper and you are paper, it's a draw.";
                    }
                    break;
            }
            System.out.println(Result);
        } else {
            System.out.println("Computer wins, you input an invalid value so you forfiet this round!");
        }
        leer.close();
    }
}
