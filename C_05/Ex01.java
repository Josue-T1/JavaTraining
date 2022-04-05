package com.company;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {

        int SC;

        Scanner leer = new Scanner(System.in);

        while(true){
            System.out.println("Enter you score: ");
            SC =  leer.nextInt();

            if (SC >= 60){
                System.out.println("You pass the exam ");
            }
            else if (SC == -1){
                System.out.println("No numbers are entered except 0");
                break;
            }
            else{
                System.out.println("You don't pass the exam.. Sorry");
            }
        }
    }
}
