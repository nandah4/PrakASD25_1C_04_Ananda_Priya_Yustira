package Pertemuan1;

import java.util.Scanner;

public class Pemilihan04 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        /*
         * Hanya menggunakan sintaks sampai materi Pemilihan
         */

        System.out.println("Program menghitung nilai akhir");
        System.out.println("==========================");

        System.out.print("Masukkan nilai tugas (1-100): ");
        int nilaiTugas = sc.nextInt();

        System.out.print("Masukkan nilai kuis (1-100): ");
        int nilaiKuis = sc.nextInt();

        System.out.print("Masukkan nilai UTS (1-100): ");
        int nilaiUTS = sc.nextInt();

        System.out.print("Masukkan nilai UAS (1-100): ");
        int nilaiUAS = sc.nextInt();

        System.out.println("==========================");
        System.out.println("==========================");

        double nilaiAkhir = (nilaiTugas * 0.2) + (nilaiKuis * 0.2) + (nilaiUTS * 0.3) + (nilaiUAS * 0.3);
        if (nilaiTugas > 100 || nilaiTugas < 0 || nilaiKuis > 100 || nilaiKuis < 0 || nilaiUTS > 100 || nilaiUTS < 0
                || nilaiUAS > 100 || nilaiUAS < 0) {
            System.out.println("Nilai tidak valid");
        } else if (nilaiAkhir > 80 && nilaiAkhir <= 100) {
            System.out.println("Nilai Akhir Anda: " + nilaiAkhir);
            System.out.println("Nilai Huruf Anda: A");
            System.out.println("Anda dinyatakan LULUS");
        } else if (nilaiAkhir > 73 && nilaiAkhir <= 80) {
            System.out.println("Nilai Akhir Anda: " + nilaiAkhir);
            System.out.println("Nilai Huruf Anda: B+");
            System.out.println("Anda dinyatakan LULUS");
        } else if (nilaiAkhir > 65 && nilaiAkhir <= 73) {
            System.out.println("Nilai Akhir Anda: " + nilaiAkhir);
            System.out.println("Nilai Huruf Anda: B");
            System.out.println("Anda dinyatakan LULUS");
        } else if (nilaiAkhir > 60 && nilaiAkhir <= 65) {
            System.out.println("Nilai Akhir Anda: " + nilaiAkhir);
            System.out.println("Nilai Huruf Anda: C+");
            System.out.println("Anda dinyatakan LULUS");
        } else if (nilaiAkhir > 50 && nilaiAkhir <= 60) {
            System.out.println("Nilai Akhir Anda: " + nilaiAkhir);
            System.out.println("Nilai Huruf Anda: C");
            System.out.println("Anda dinyatakan LULUS");
        } else if (nilaiAkhir > 39 && nilaiAkhir <= 50) {
            System.out.println("Nilai Akhir Anda: " + nilaiAkhir);
            System.out.println("Nilai Huruf Anda: D");
            System.out.println("Anda dinyatakan TIDAK LULUS");
        } else if (nilaiAkhir >= 0 && nilaiAkhir <= 39) {
            System.out.println("Nilai Akhir Anda: " + nilaiAkhir);
            System.out.println("Nilai Huruf Anda: D");
            System.out.println("Anda dinyatakan TIDAK LULUS");
        } else {
            System.out.println("Nilai tidak Valid");
        }
        System.out.println("==========================");
        System.out.println("==========================");

    }
}
