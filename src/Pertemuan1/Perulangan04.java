package Pertemuan1;

import java.util.Scanner;

public class Perulangan04 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Masukkan NIM Anda: ");
        long nim = sc.nextLong();

        long lastDigit = nim % 100;

        if (lastDigit < 10) {
            lastDigit += 10;
        }

        for (int i = 1; i <= lastDigit; i++) {
            if (i == 6 || i == 10) {
                continue;
            }

            if (i % 2 != 0) {
                System.out.print("*" + " ");
            } else {
                System.out.print(i + " ");
            }
        }

    }
}
