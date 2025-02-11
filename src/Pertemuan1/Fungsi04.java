package Pertemuan1;

import java.util.Scanner;

public class Fungsi04 {
    static Scanner sc = new Scanner(System.in);

    static void showIncome(String[][] args) {
        System.out.println("== Pendapatan Cabang Royal Garden ==");
        double[] hargaTanaman = { 75000, 50000, 60000, 10000 };

        for (int i = 0; i < args.length; i++) {
            double totalPendapatan = 0;
            for (int j = 1; j < args[0].length; j++) {

                totalPendapatan += (Integer.parseInt(args[i][j]) * hargaTanaman[j - 1]);

            }
            System.out.println(args[i][0] + " Total pendapatan Rp." + totalPendapatan);
        }
    }

    static void showStock(String[][] args) {
        System.out.println("== Jumlah Stock Cabang Royal Garden ==");

        String[] flowersName = { "Aglonema", "Keladi", "Alocasia", "Mawar" };
        int[] stockReduction = { 1, 2, 0, 5 };

        for (int i = 0; i < args.length; i++) {
            for (int j = 1; j < args[i].length; j++) {
                args[i][j] = Integer.toString(Integer.parseInt(args[i][j]) - stockReduction[j - 1]);
            }
        }

        System.out.println("Stok berkurang: Aglonema -1, Keladi -2, Alocasia -0, dan Mawar -5");

        System.out.printf("%-20s", " ");
        for (String i : flowersName) {
            System.out.printf("%-15s", i);
        }
        System.out.println();

        for (int i = 0; i < args.length; i++) {
            System.out.printf("%-20s", args[i][0]);
            for (int j = 1; j < args[i].length; j++) {
                System.out.printf("%-15s", args[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        String[][] inventoryRoyalGarden = {
                { "RoyalGarden1", "10", "5", "15", "7" },
                { "RoyalGarden2", "6", "11", "9", "12" },
                { "RoyalGarden3", "2", "10", "10", "5" },
                { "RoyalGarden4", "5", "7", "12", "9" },
        };

        while (true) {
            System.out.println("=== Inventory Royal Garden ===");
            System.out.println("1. Tampilkan Pendapatan");
            System.out.println("2. Tampilkan Stok");
            System.out.println("3. Exit");
            System.out.print("Pilih menu: ");
            int menu = sc.nextInt();

            switch (menu) {
                case 1:
                    showIncome(inventoryRoyalGarden);
                    break;
                case 2:
                    showStock(inventoryRoyalGarden);
                    break;
                case 3:
                    return;
                default:
                    return;
            }
        }
    }
}
