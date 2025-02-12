package Pertemuan1;

import java.util.Scanner;

public class Tugas3 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int jumlahMatkul;

        do {
            System.out.print("Masukkan jumlah mata kuliah Anda: ");
            jumlahMatkul = sc.nextInt();

            if (jumlahMatkul < 1) {
                System.out.println("Jumlah Mata Kuliah tidak boleh kurang dari 1");
            }
        } while (jumlahMatkul < 1);

        String[] namaMk = new String[jumlahMatkul];
        int[] sks = new int[jumlahMatkul];
        int[] semester = new int[jumlahMatkul];
        String[] hariKuliah = new String[jumlahMatkul];
        String[] headerTableMatkul = { "Nama Mata Kuliah", "SKS", "Semester", "Hari Kuliah" };

        menuSystem(namaMk, sks, semester, hariKuliah, headerTableMatkul);
    }

    static void menuSystem(String[] namaMk, int[] sks, int[] semester, String[] hariKuliah,
            String[] headerTableMatkul) {
        while (true) {
            System.out.println("1. Input data mata kuliah");
            System.out.println("2. Tampilkan seluruh jadwal");
            System.out.println("3. Tampilkan jadwal berdasarkan hari");
            System.out.println("4. Tampilkan jadwal kuliah berdasarkan semester");
            System.out.println("5. Tampilkan detail matkul berdasarkan nama");
            System.out.println("6. Keluar Program");
            System.out.print("Pilih menu Anda: ");
            int outerMenu = sc.nextInt();
            sc.nextLine();

            switch (outerMenu) {
                case 1:
                    inputDataMatkul(namaMk, sks, semester, hariKuliah);
                    break;
                case 2:
                    showAllMatkul(namaMk, sks, semester, hariKuliah, headerTableMatkul);
                    break;
                case 3:
                    showMatkulByDay(namaMk, sks, semester, hariKuliah, headerTableMatkul);
                    break;
                case 4:
                    showMatkulBySemester(namaMk, sks, semester, hariKuliah, headerTableMatkul);
                    break;
                case 5:
                    showMatkulByName(namaMk, sks, semester, hariKuliah, headerTableMatkul);
                    break;
                case 6:
                    System.out.println("Keluar dari program");
                    return;
                default:
                    System.out.println("Input tidak sesuai, Ulangi!");
                    break;
            }
        }
    }

    static void inputDataMatkul(String[] namaMk, int[] sks, int[] semester, String[] hariKuliah) {
        System.out.println("------------------------------------------------------------------------------------");
        System.out.println("Yuk, inputkan data mata kuliah!");
        for (int i = 0; i < namaMk.length; i++) {
            System.out.print("Nama Mata Kuliah ke-" + (i + 1) + ": ");
            namaMk[i] = sc.nextLine();
            System.out.print("Masukkan SKS Mata Kuliah ke-" + (i + 1) + ": ");
            sks[i] = sc.nextInt();
            System.out.print("Masukkan Tahap Semester Kuliah ke-" + (i + 1) + ": ");
            semester[i] = sc.nextInt();
            sc.nextLine();
            System.out.print("Masukkan Hari Mata Kuliah ke-" + (i + 1) + ": ");
            hariKuliah[i] = sc.nextLine();
        }
        System.out.println("Hore! Mata Kuliah Selesai diinputkan!");
        System.out.println("------------------------------------------------------------------------------------");
    }

    static void showAllMatkul(String[] namaMk, int[] sks, int[] semester, String[] hariKuliah,
            String[] headerTableMatkul) {

        if (namaMk[0] == null) {
            System.out.println("Data Anda Kosong, Mohon inputkan terlebih dahulu!");
        } else {
            System.out.println("------------------------------------------------------------------------------------");
            for (int i = 0; i < headerTableMatkul.length; i++) {
                if (i == 0) {
                    System.out.printf("%-30s", headerTableMatkul[0]);
                } else {
                    System.out.printf("%-20s", headerTableMatkul[i]);
                }
            }
            System.out.println();

            for (int i = 0; i < namaMk.length; i++) {
                System.out.printf("%-30s %-20d %-20d %-20s", namaMk[i], sks[i], semester[i], hariKuliah[i]);
                System.out.println();
            }
            System.out.println("------------------------------------------------------------------------------------");
        }
    }

    static void showMatkulByDay(String[] namaMk, int[] sks, int[] semester, String[] hariKuliah,
            String[] headerTableMatkul) {

        if (namaMk[0] == null) {
            System.out.println("Data Anda Kosong, Mohon inputkan terlebih dahulu!");
        } else {
            System.out.println("------------------------------------------------------------------------------------");
            System.out.println("Cari Mata Kuliah berdasarkan Hari");
            System.out.print("Masukkan hari: ");
            String hari = sc.nextLine();

            boolean hariKuliahIsExist = false;

            for (int i = 0; i < namaMk.length; i++) {
                if (hariKuliah[i].equalsIgnoreCase(hari)) {
                    hariKuliahIsExist = true;
                }
            }

            if (hariKuliahIsExist) {
                for (int i = 0; i < headerTableMatkul.length; i++) {
                    if (i == 0) {
                        System.out.printf("%-30s", headerTableMatkul[0]);
                    } else {
                        System.out.printf("%-20s", headerTableMatkul[i]);
                    }
                }
                System.out.println();

                for (int i = 0; i < namaMk.length; i++) {
                    if (hariKuliah[i].equalsIgnoreCase(hari)) {
                        System.out.printf("%-30s %-20d %-20d %-20s", namaMk[i], sks[i], semester[i], hariKuliah[i]);
                        System.out.println();
                    }
                }
            } else {
                System.out.println("Tidak ada mata kuliah di hari " + hari);
            }
            System.out.println("------------------------------------------------------------------------------------");
        }
    }

    static void showMatkulBySemester(String[] namaMk, int[] sks, int[] semester, String[] hariKuliah,
            String[] headerTableMatkul) {

        if (namaMk[0] == null) {
            System.out.println("Data Anda Kosong, Mohon inputkan terlebih dahulu!");
        } else {
            System.out.println("------------------------------------------------------------------------------------");
            System.out.println("Cari Mata Kuliah berdasarkan Semester");
            System.out.print("Masukkan Semester ke- ");
            int inputSemester = sc.nextInt();

            boolean semesterIsExist = false;

            for (int i = 0; i < namaMk.length; i++) {
                if (semester[i] == inputSemester) {
                    semesterIsExist = true;
                }
            }

            if (semesterIsExist) {
                for (int i = 0; i < headerTableMatkul.length; i++) {
                    if (i == 0) {
                        System.out.printf("%-30s", headerTableMatkul[0]);
                    } else {
                        System.out.printf("%-20s", headerTableMatkul[i]);
                    }
                }
                System.out.println();

                for (int i = 0; i < namaMk.length; i++) {
                    if (semester[i] == inputSemester) {
                        System.out.printf("%-30s %-20d %-20d %-20s", namaMk[i], sks[i], semester[i], hariKuliah[i]);
                        System.out.println();
                    }
                }
            } else {
                System.out.println("Tidak ada mata kuliah di semester " + inputSemester);
            }
            System.out.println("------------------------------------------------------------------------------------");
        }

    }

    static void showMatkulByName(String[] namaMk, int[] sks, int[] semester, String[] hariKuliah,
            String[] headerTableMatkul) {

        if (namaMk[0] == null) {
            System.out.println("Data Anda Kosong, Mohon inputkan terlebih dahulu!");
        } else {
            System.out.println("------------------------------------------------------------------------------------");
            System.out.println("Cari Informasi Mata Kuliah Berdasarkan Nama");
            System.out.print("Masukkan Nama Mata Kuliah: ");
            String inputNamaMataKuliah = sc.nextLine();

            boolean mataKuliahIsExist = false;

            for (int i = 0; i < namaMk.length; i++) {
                if (namaMk[i].equalsIgnoreCase(inputNamaMataKuliah))
                    mataKuliahIsExist = true;
            }

            if (mataKuliahIsExist) {
                for (int i = 0; i < headerTableMatkul.length; i++) {
                    if (i == 0) {
                        System.out.printf("%-30s", headerTableMatkul[0]);
                    } else {
                        System.out.printf("%-20s", headerTableMatkul[i]);
                    }
                }
                System.out.println();

                for (int i = 0; i < namaMk.length; i++) {
                    if (namaMk[i].equalsIgnoreCase(inputNamaMataKuliah)) {
                        System.out.printf("%-30s %-20d %-20d %-20s", namaMk[i], sks[i], semester[i], hariKuliah[i]);
                        System.out.println();
                    }
                }

            } else {
                System.out.println("Tidak ada mata kuliah " + inputNamaMataKuliah);
            }
            System.out.println("------------------------------------------------------------------------------------");
        }

    }
}
