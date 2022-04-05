package com.company;

import java.util.Scanner;

public class Ex_13 {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        System.out.print(" ( 0-single filter, 1-married jointly or " + " qualifying widow(er), 2-married separately, 3-head of " + " houshold ) Enter the filing status :");
        int opc = leer.nextInt();

        System.out.print("Enter the taxable income: ");
        double I = leer.nextDouble();
        double T = 0;

        switch (opc)
        {
            case 0 :
                T += (I <= 8350) ? I * 0.10 : 8350 * 0.10;
                if (I > 8350)
                    T += (I <= 33950) ? (I - 8350) * 0.15 :
                            25600 * 0.15;
                if (I > 33950)
                    T += (I <= 82250) ? (I - 33950) * 0.25 :
                            48300 * 0.25;
                if (I > 82250)
                    T += (I <= 171550) ? (I - 82250) * 0.28 :
                            89300 * 0.28;
                if (I > 171550)
                    T += (I <= 372950) ? (I - 171550) * 0.33 :
                            201400 * 0.33;
                if (I > 372950)
                    T += (I - 372950) * 0.35;
                break;
            case 1 :
                T += (I <= 16700) ? I * 0.10 : 16700 * 0.10;
                if (I > 16700)
                    T += (I <= 67900) ? (I - 16700) * 0.15 :
                            (67900 - 16700) * 0.15;
                if (I > 67900)
                    T += (I <= 137050) ? (I - 67900) * 0.25 :
                            (137050 - 67900) * 0.25;
                if (I > 137050)
                    T += (I <= 208850) ? (I - 137050) * 0.28 :
                            (208850 - 137050) * 0.28;
                if (I > 208850)
                    T += (I <= 372950) ? (I - 208850) * 0.33 :
                            (372950 - 208850) * 0.33;
                if (I > 372950)
                    T += (I - 372950) * 0.35;
                break;
            case 2 :
                T += (I <= 8350) ? I * 0.10 : 8350 * 0.10;
                if (I > 8350)
                    T += (I <= 33950) ? (I - 8350) * 0.15 :
                            (33950 - 8350) * 0.15;
                if (I > 33950)
                    T += (I <= 68525) ? (I - 33950) * 0.25 :
                            (68525 - 33950) * 0.25;
                if (I > 68525)
                    T += (I <= 104425) ? (I - 68525) * 0.28 :
                            (104425 - 68525) * 0.28;
                if (I > 104425)
                    T += (I <= 186475) ? (I - 104425) * 0.33 :
                            (186475 - 104425) * 0.33;
                if (I > 186475)
                    T += (I - 186475) * 0.35;
                break;
            case 3 :
                T += (I <= 11950) ? I * 0.10 : 11950 * 0.10;
                if (I > 11950)
                    T += (I <= 45500) ? (I - 11950) * 0.15 :
                            (45500 - 11950) * 0.15;
                if (I > 45500)
                    T += (I <= 117450) ? (I - 45500) * 0.25 :
                            (117450 - 45500) * 0.25;
                if (I > 117450)
                    T += (I <= 190200) ? (I - 117450) * 0.28 :
                            (190200 - 117450) * 0.28;
                if (I > 190200)
                    T += (I <= 372950) ? (I - 190200) * 0.33 :
                            (372950 - 190200) * 0.33;
                if (I > 372950)
                    T += (I - 372950) * 0.35;
                break;
            default : System.out.println(" Error: invalid status ");
                System.exit(1);
        }
        System.out.println(" the Tax is :" + (int)(T * 100) / 100.0);
    }
}
