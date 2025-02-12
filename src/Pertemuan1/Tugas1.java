package Pertemuan1;

import java.util.Scanner;

public class Tugas1 {
    static Scanner sc = new Scanner(System.in);

    static void menuSystem(char[] codePlates, char[][] listCities) {
        while (true) {
            System.out.print("Masukkan kode plat mobil (Cth. A): ");
            char menu = sc.next().charAt(0);
            sc.nextLine();

            System.out.println("Hasil pencarian Anda: " + searchCity(menu, codePlates, listCities));

            System.out.print("Ingin mengulangi pencarian? {y/n} ");
            String repeatMenu = sc.nextLine();
            if (repeatMenu.equals("n")) {
                break;
            }
        }
    }

    static String searchCity(char menu, char[] codePlates, char[][] listCities) {

        for (int i = 0; i < codePlates.length; i++) {
            if (menu == codePlates[i]) {
                return new String(listCities[i]);
            }
        }

        return "Tidak ditemukan";
    }

    public static void main(String[] args) {
        char[] codePlates = { 'A', 'B', 'D', 'E', 'F', 'G', 'H', 'L', 'N', 'T' };

        char[][] listCities = { { 'B', 'A', 'N', 'T', 'E', 'N' },
                { 'J', 'A', 'K', 'A', 'R', 'T', 'A' },
                { 'B', 'A', 'N', 'D', 'U', 'N', 'G' },
                { 'C', 'I', 'R', 'E', 'B', 'O', 'N' },
                { 'B', 'O', 'G', 'O', 'R' },
                { 'P', 'E', 'K', 'A', 'L', 'O', 'N', 'G', 'A', 'N' },
                { 'S', 'E', 'M', 'A', 'R', 'A', 'N', 'G' },
                { 'S', 'U', 'R', 'A', 'B', 'A', 'Y', 'A' },
                { 'M', 'A', 'L', 'A', 'N', 'G' },
                { 'T', 'E', 'G', 'A', 'L' } };

        menuSystem(codePlates, listCities);
    }
}
