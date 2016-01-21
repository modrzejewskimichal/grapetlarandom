package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static final int BOUND = 100;

    public static void main(String[] args) {
        int b = new Random().nextInt(BOUND), c = 0;

        System.out.println("Zgadnij liczbe od 1 do 100;-)");

        while (0 != b) {
            c++;
            System.out.println("Podaj liczbe");
            Scanner wej = new Scanner(System.in);
            double a = wej.nextInt();
            if (a < b) {
                System.out.println("za malo");
            } else {
                if (a > b) {
                    System.out.println("za duzo");
                } else {
                    System.out.println("dobrze! wygrales");
                    System.out.println("Twoj wynik to " + c + " krokow");
                    break;
                }
            }
        }
    }
}