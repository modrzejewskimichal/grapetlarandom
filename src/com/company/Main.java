package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static final int BOUND =10;

    public static void main(String[] args) {
        int b = new Random().nextInt(BOUND);

        System.out.println("Zgadnij liczbe od 1 do 10;-)");

        while (0 != b) {
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
                    break;
                }
            }
        }
    }
}