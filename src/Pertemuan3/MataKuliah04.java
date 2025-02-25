package Pertemuan3;

import java.util.Scanner;

public class MataKuliah04 {
    public String kode;
    public String nama;
    public int sks;
    public int jumlahJam;

    MataKuliah04() {
    }

    MataKuliah04(String kode, String nama, int sks, int jumlahJam) {
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

    // // Constructor 1 Parameter
    // MataKuliah04(String kode) {
    // this.kode = kode;
    // }

    void tambahData(Scanner sc) {
        System.out.print("Kode          : ");
        this.kode = sc.nextLine();
        System.out.print("Nama          : ");
        this.nama = sc.nextLine();
        System.out.print("SKS           : ");
        this.sks = sc.nextInt();
        System.out.print("Jumlah Jam    : ");
        this.jumlahJam = sc.nextInt();
        sc.nextLine();
    }

    void cetakInfo() {
        System.out.println("Kode            : " + this.kode);
        System.out.println("Nama            : " + this.nama);
        System.out.println("SKS             : " + this.sks);
        System.out.println("Jumlah Jam      : " + this.jumlahJam);
    }
}
