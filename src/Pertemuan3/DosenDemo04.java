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
        DataDosen04 arrManageDosen04 = new DataDosen04();

        for (int i = 0; i < arrOfDosen.length; i++) {
            arrOfDosen[i] = new Dosen04();
            System.out.println("Masukkan Data Dosen ke-" + (i + 1));
            System.out.print("Kode : ");
            arrOfDosen[i].kode = sc.nextLine();
            System.out.print("Nama : ");
            arrOfDosen[i].nama = sc.nextLine();
            System.out.print("Jenis Kelamin (Pria/Wanita) : ");
            dummy = sc.nextLine();

            if (dummy.equalsIgnoreCase("Wanita") || dummy.equalsIgnoreCase("Perempuan")) {
                arrOfDosen[i].jenisKelamin = true;
            } else {
                arrOfDosen[i].jenisKelamin = false;
            }

            System.out.print("Usia : ");
            arrOfDosen[i].usia = sc.nextInt();
            sc.nextLine();
            System.out.println("-------------------------------------------");
        }

        while (true) {
            System.out.println("Management Data Dosen Menu:");
            System.out.println("1. Data Semua Dosen");
            System.out.println("2. Jumlah Dosen per Jenis Kelamin");
            System.out.println("3. Rerata Usia Dosen");
            System.out.println("4. Informasi Dosen Tertua");
            System.out.println("5. Informasi Dosen Termuda");
            System.out.println("6. Exit");
            int menu = sc.nextInt();
            sc.nextLine();

            switch (menu) {
                case 1:
                    arrManageDosen04.dataSemuaDosen(arrOfDosen);
                    break;
                case 2:
                    arrManageDosen04.jumlahDosenPerJenisKelamin(arrOfDosen);
                    break;
                case 3:
                    arrManageDosen04.rerataUsiaDosenPerJenisKelaminDosen(arrOfDosen);
                    break;
                case 4:
                    arrManageDosen04.infoDosenPalingTua(arrOfDosen);
                    break;
                case 5:
                    arrManageDosen04.infoDosenPalingMuda(arrOfDosen);
                    break;
                default:
                    System.out.println("Keluar Program");
                    return;
            }

        }
    }
}
