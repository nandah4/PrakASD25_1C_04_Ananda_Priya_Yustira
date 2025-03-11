package Pertemuan5;

import java.util.Scanner;

public class PangkatMain04 {
    public static void main(String[] args) {
        Scanner input04 = new Scanner(System.in);

        System.out.print("Masukkan jumlah elemen : ");
        int elemen = input04.nextInt();

        Pangkat04[] png = new Pangkat04[elemen];
        for (int i = 0; i < elemen; i++) {

            System.out.print("Masukkan nilai basis elemen ke-" + (i + 1) + ": ");
            int basis = input04.nextInt();

            System.out.print("Masukkan nilai pangkat elemen ke-" + (i + 1) + ": ");
            int pangkat = input04.nextInt();

            png[i] = new Pangkat04(basis, pangkat);

        }

        System.out.println("Hasil Pangkat Brute Force:");
        for (Pangkat04 p : png) {
            System.out.println(p.nilai + "^" + p.pangkat + ": " + p.pangkatBF(p.nilai, p.pangkat));
        }

        System.out.println("Hasil Pangkat DC:");
        for (Pangkat04 p : png) {
            System.out.println(p.nilai + "^" + p.pangkat + ": " + p.pangkatDC(p.nilai, p.pangkat));
        }
    }
}
