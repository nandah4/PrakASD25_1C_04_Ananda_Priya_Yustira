package Pertemuan5;

import java.util.Scanner;

public class SumMain04 {
    public static void main(String[] args) {
        Scanner input04 = new Scanner(System.in);

        System.out.print("Masukkan jumlah elemen: ");
        int elemen = input04.nextInt();

        Sum04 sm = new Sum04(elemen);

        for (int i = 0; i < elemen; i++) {
            System.out.print("Masukkan keuntungan ke-" + (i + 1) + ": ");
            sm.keuntungan[i] = input04.nextDouble();
        }

        System.out.println("Total keuntungan menggunakan BF " + sm.totalBF());
        System.out.println("Total keuntungan menggunakan DC " + sm.totalDC(sm.keuntungan, 0, sm.keuntungan.length - 1));
    }
}
