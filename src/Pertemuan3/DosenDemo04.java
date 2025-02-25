package Pertemuan3;

import java.util.Scanner;

public class DosenDemo04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah data Dosen: ");
        int jmlData = sc.nextInt();
        sc.nextLine();

        String dummy;

        Dosen04[] arrOfDosen = new Dosen04[jmlData];

        for (int i = 0; i < arrOfDosen.length; i++) {
            arrOfDosen[i] = new Dosen04();
            System.out.println("Masukkan Data Dosen ke-" + (i + 1));
            System.out.print("Kode                        : ");
            arrOfDosen[i].kode = sc.nextLine();
            System.out.print("Nama                        : ");
            arrOfDosen[i].nama = sc.nextLine();
            System.out.print("Jenis Kelamin (Pria/Wanita) : ");
            dummy = sc.nextLine();

            if (dummy.equalsIgnoreCase("Wanita") || dummy.equalsIgnoreCase("Perempuan")) {
                arrOfDosen[i].jenisKelamin = true;
            } else {
                arrOfDosen[i].jenisKelamin = false;
            }

            System.out.print("Usia                        : ");
            arrOfDosen[i].usia = sc.nextInt();
            sc.nextLine();
            System.out.println("-------------------------------------------");
        }

        int i = 0;
        for (Dosen04 iterable_element : arrOfDosen) {
            System.out.println("Data Dosen ke-" + (i + 1));
            System.out.println("Kode             : " + iterable_element.kode);
            System.out.println("Nama             : " + iterable_element.nama);

            if (iterable_element.jenisKelamin) {
                System.out.println("Jenis Kelamin    : Wanita");
            } else {
                System.out.println("Jenis Kelamin    : Pria");
            }

            System.out.println("Usia             : " + iterable_element.usia);
            System.out.println("-------------------------------------------");
            i++;
        }
    }
}
