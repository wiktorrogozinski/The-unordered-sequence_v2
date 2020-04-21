package com.company;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner liczba = new Scanner(System.in);
        int test = liczba.nextInt();
        int tryb = 0;
        while (true) {

            int warunek = liczba.nextInt();
            if (warunek == 0) {
                System.out.print("true");
                break;
            }

            if (tryb == 0) {
                if (test > warunek) {
                    tryb = 1;
                } else if (warunek > test) {
                    tryb = 2;
                } else {
                    test = warunek;
                    continue;
                }
            } else {
                if (test > warunek && tryb == 2) {
                    System.out.println("false");
                    break;
                } else if (test < warunek && tryb == 1) {
                    System.out.println("false");
                    break;
                } else {
                    test = warunek;
                    continue;
                }
            }
        }
    }
}