package com.company;

import java.util.Scanner;

public class cxkm

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Dodaj dwie liczby całkowite");
        System.out.println("podaj pierwszą liczbę");
        float first = 0;
        try {
            first = scan.nextFloat();


        } catch (Exception exception) {
            System.out.println("Podaj liczbę!!!");
            main(args);
        }

        System.out.println("Podaj drugą liczbę");
        float second = 0;
         try {
        second = scan.nextFloat();


        } catch (Exception exception) {
            System.out.println("Podaj liczbę!!!");
            main(args);

        }

        float result = add(first, second);

        System.out.print("Wynik dodawanie to: ");
        System.out.println(result);

    }

    static float add(float arg1, float arg2) {
        return arg1 + arg2;
    }

}

