package Pertemuan4;

import java.util.Scanner;

public class Transaksi04 {
    void tampilSemuadata04(Barang04[] barangs04) {
        System.out.println("Kode \t\t Nama Barang \t Jenis \t Stock \t Harga Barang");

        for (int i = 0; i < barangs04.length; i++) {
            System.out.print(barangs04[i].kodeBarang04 + "\t\t");
            System.out.print(barangs04[i].namaBarang04 + "\t\t  ");
            System.out.print(barangs04[i].jenisBarang04 + "\t    ");
            System.out.print(barangs04[i].stock04 + "\t");
            System.out.print(barangs04[i].harga04 + "\t");
            System.out.println();
        }
    }

    void totalStockByJenis04(Barang04[] barangs04, Scanner nanda04) {
        System.out.println("Input Jenis Barang");
        String jenis = nanda04.nextLine();
        int totals04 = 0;

        for (int i = 0; i < barangs04.length; i++) {
            if (jenis.equalsIgnoreCase(barangs04[i].jenisBarang04)) {
                totals04 += barangs04[i].stock04;
                System.out.println("Total Stock Makanan : " + totals04);
            }
        }
    }
}
