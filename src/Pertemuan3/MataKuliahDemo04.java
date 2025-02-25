package Pertemuan3;

import java.util.Scanner;

public class MataKuliahDemo04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MataKuliah04[] arrayOfMataKuliah = new MataKuliah04[3];
        String kode, nama, dummy;
        int sks, jumlahJam;

        for (int i = 0; i < arrayOfMataKuliah.length; i++) {
            System.out.println("Masukkan data Mata Kuliah ke-" + (i + 1));
            arrayOfMataKuliah[i] = new MataKuliah04();
            arrayOfMataKuliah[i].tambahData(sc);
            System.out.println("--------------------------------------------");

            // System.out.println("Masukkan data Mata Kuliah ke-" + (i + 1));
            // System.out.print("Kode : ");
            // kode = sc.nextLine();
            // System.out.print("Nama : ");
            // nama = sc.nextLine();
            // System.out.print("SKS : ");
            // dummy = sc.nextLine();
            // sks = Integer.parseInt(dummy);
            // System.out.print("Jumlah Jam : ");
            // dummy = sc.nextLine();
            // jumlahJam = Integer.parseInt(dummy);
            // System.out.println("--------------------------------------------");
            // arrayOfMataKuliah[i] = new MataKuliah04(kode, nama, sks, jumlahJam);
        }

        for (int i = 0; i < arrayOfMataKuliah.length; i++) {
            System.out.println("Data Mata Kuliah ke-" + (i + 1));
            arrayOfMataKuliah[i].cetakInfo();
            System.out.println("--------------------------------------------");
        }

    }
}
