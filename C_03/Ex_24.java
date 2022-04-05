package com.company;

public class Ex_24 {
    public static void main(String[] args) {

        int ran = (int)((Math.random()*(14-1))+1);
        int ran2 = (int)(Math.random()*4);

        System.out.print("The card you picked is :");

        switch(ran) {
            case 1: System.out.print("Ace"); break;
            case 2: System.out.print(ran); break;
            case 3: System.out.print(ran); break;
            case 4: System.out.print(ran); break;
            case 5: System.out.print(ran); break;
            case 6: System.out.print(ran); break;
            case 7: System.out.print(ran); break;
            case 8: System.out.print(ran); break;
            case 9: System.out.print(ran); break;
            case 10: System.out.print(ran); break;
            case 11: System.out.print("Jack"); break;
            case 12: System.out.print("Queen"); break;
            case 13: System.out.print("King");
        }
        System.out.print(" of ");
        switch (ran2){
            case 0: System.out.println("Clubs"); break;
            case 1: System.out.println("Diamonds"); break;
            case 2: System.out.println("Hearts"); break;
            case 3: System.out.println("Spades");
        }
    }
}
