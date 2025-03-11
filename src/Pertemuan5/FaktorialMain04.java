package Pertemuan5;

import java.util.Scanner;

public class FaktorialMain04 {
    public static void main(String[] args) {
        Scanner input04 = new Scanner(System.in);

        System.out.print("Masukkan nilai: ");
        int nilai = input04.nextInt();

        Faktorial04 fk04 = new Faktorial04();
        System.out.println("Nilai faktorial " + nilai + " menggunakan BF : " + fk04.faktorialBF(nilai));
        System.out.println("Nilai faktorial " + nilai + " menggunakan DC : " + fk04.faktorialDC(nilai));
    }
}
