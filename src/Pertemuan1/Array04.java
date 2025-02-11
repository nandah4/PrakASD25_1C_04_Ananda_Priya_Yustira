package Pertemuan1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Array04 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("======================");
        System.out.println("Program Menghitung IP Semester");
        System.out.println("======================");

        double ipResult, totalBobot = 0;
        int totalSks = 0;

        String[][] dataSKS = new String[8][5];

        // Data MK
        dataSKS[0][0] = "Pancasila";
        dataSKS[1][0] = "Konsep Teknologi Informasi";
        dataSKS[2][0] = "Critical Thinking and Problem Solving";
        dataSKS[3][0] = "Matematika Dasar";
        dataSKS[4][0] = "Rekayasa Perangkat Lunak";
        dataSKS[5][0] = "Dasar Pemrograman";
        dataSKS[6][0] = "Praktikum Pemrograman";
        dataSKS[7][0] = "Keselamatan dan Kesehatan Kerja";

        // Data Bobot SKS
        dataSKS[0][4] = "2";
        dataSKS[1][4] = "2";
        dataSKS[2][4] = "2";
        dataSKS[3][4] = "3";
        dataSKS[4][4] = "2";
        dataSKS[5][4] = "2";
        dataSKS[6][4] = "3";
        dataSKS[7][4] = "2";

        for (int i = 0; i < dataSKS.length; i++) {
            System.out.print("Masukkan Nilai Angka untuk MK " + dataSKS[i][0] + " : ");
            double nilaiAngka = sc.nextDouble();
            sc.nextLine();
            dataSKS[i][1] = Double.toString(nilaiAngka);

            if (nilaiAngka > 80 && nilaiAngka <= 100) {
                dataSKS[i][2] = "A";
                dataSKS[i][3] = "4.00";
            } else if (nilaiAngka > 73 && nilaiAngka <= 80) {
                dataSKS[i][2] = "B+";
                dataSKS[i][3] = "3.50";
            } else if (nilaiAngka > 65 && nilaiAngka <= 73) {
                dataSKS[i][2] = "B";
                dataSKS[i][3] = "3.00";
            } else if (nilaiAngka > 60 && nilaiAngka <= 65) {
                dataSKS[i][2] = "C+";
                dataSKS[i][3] = "2.50";
            } else if (nilaiAngka > 50 && nilaiAngka <= 60) {
                dataSKS[i][2] = "C";
                dataSKS[i][3] = "2.00";
            } else if (nilaiAngka > 39 && nilaiAngka <= 50) {
                dataSKS[i][2] = "D";
                dataSKS[i][3] = "1.50";
            } else if (nilaiAngka >= 0 && nilaiAngka <= 39) {
                dataSKS[i][2] = "E";
                dataSKS[i][3] = "1.00";
            } else {
                dataSKS[i][2] = "X";
                dataSKS[i][3] = "0.00";
            }

            totalBobot += (Integer.parseInt(dataSKS[i][4]) * Double.parseDouble(dataSKS[i][3]));
            totalSks += Integer.parseInt(dataSKS[i][4]);
        }
        ipResult = totalBobot / totalSks;

        System.out.printf("%-42s %-15s %-15s %-15s", "MK", "Nilai Angka", "Nilai Huruf", "Bobot Nilai");
        System.out.println();

        for (int i = 0; i < dataSKS.length; i++) {
            System.out.printf("%-42s %-15s %-15s %-15s", dataSKS[i][0], dataSKS[i][1], dataSKS[i][2], dataSKS[i][3],
                    "Bobot Nilai");
            System.out.println();
        }
        DecimalFormat df = new DecimalFormat("#.##");
        System.out.println("IP Semester: " + df.format(ipResult));
    }
}
