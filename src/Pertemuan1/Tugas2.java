package Pertemuan1;

import java.util.Scanner;

public class Tugas2 {

    static Scanner sc = new Scanner(System.in);

    static void menuSystem() {
        int sisiKubus = 0;

        LOOP_MENU: while (true) {
            System.out.println("=== PROGRAM MENGHITUNG KUBUS ===");

            System.out.println("1. Volume Kubus");
            System.out.println("2. Luas Permukaan Kubus");
            System.out.println("3. Keliling Kubus");
            System.out.println("4. Keluar Progrgam");
            System.out.print("Silahkan pilih program Anda: ");
            int menu = sc.nextInt();

            switch (menu) {
                case 1:
                    calculateVolumeCube(sisiKubus);
                    break;
                case 2:
                    calculateLuasPermukaan(sisiKubus);
                    break;
                case 3:
                    circumferenceCube(sisiKubus);
                    break;
                case 4:
                    System.out.println("Keluar program");
                    break LOOP_MENU;
                default:
                    System.out.println("Menu tidak sesuai");
                    break;
            }
        }
    }

    static void calculateVolumeCube(int sisiKubus) {
        System.out.print("Masukkan sisi kubus: ");
        sisiKubus = sc.nextInt();

        double volumeCube = Math.pow(sisiKubus, 3);
        System.out.println("Volume kubus: " + volumeCube);
    }

    static void calculateLuasPermukaan(int sisiKubus) {
        System.out.print("Masukkan sisi kubus: ");
        sisiKubus = sc.nextInt();

        double sisiSquare = Math.pow(sisiKubus, 2);
        double luasPermukaan = sisiSquare * 6;

        System.out.println("Luas permukaan kubus: " + luasPermukaan);

    }

    static void circumferenceCube(int sisiKubus) {
        System.out.print("Masukkan sisi kubus: ");
        sisiKubus = sc.nextInt();

        System.out.println("keliling kubus: " + (12 * sisiKubus));
    }

    public static void main(String[] args) {
        menuSystem();
    }
}
