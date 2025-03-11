package Pertemuan4;

import java.util.Scanner;;

public class TransaksiDemo04 {

    public static void main(String[] args) {
        Scanner nanda04 = new Scanner(System.in);

        System.out.println("Masukkan Total Barang yang ingin disimpan");
        int totalsBarang04 = nanda04.nextInt();
        nanda04.nextLine();

        Barang04[] arrOfBarang04 = new Barang04[totalsBarang04];
        // Barang04 a = new Barang04("11", "Ikan", "Makanan", 10, 1000);
        // arrOfBarang04[0] = a;

        for (int i = 0; i < arrOfBarang04.length; i++) {
            System.out.println("Data Barang ke-" + (i + 1));
            System.out.print("Kode Barang : ");
            String kodeBrg04 = nanda04.nextLine();

            System.out.print("Nama Barang : ");
            String namaBrg04 = nanda04.nextLine();

            System.out.print("Jenis Barang : ");
            String jenisBrg04 = nanda04.nextLine();

            System.out.print("Stock Barang : ");
            int stck04 = nanda04.nextInt();
            System.out.print("Harga Barang : ");
            int hrg04 = nanda04.nextInt();

            nanda04.nextLine();

            arrOfBarang04[i] = new Barang04(kodeBrg04, namaBrg04, jenisBrg04, stck04,
                    hrg04);
        }
        Transaksi04 objTransaksi04 = new Transaksi04();

        LOOP: while (true) {
            System.out.println();
            System.out.println("===================== JTI KANTIN =====================");
            System.out.println("1. Tampil data barang");
            System.out.println("2. Tampil total penjualan");
            System.out.println("3. Exit");
            System.out.println("Pilih menu Anda : ");
            int mainMenu04 = nanda04.nextInt();
            nanda04.nextLine();

            if (mainMenu04 == 1) {
                objTransaksi04.tampilSemuadata04(arrOfBarang04);
            } else if (mainMenu04 == 2) {
                objTransaksi04.totalStockByJenis04(arrOfBarang04, nanda04);
            } else if (mainMenu04 == 3) {
                break LOOP;
            }

        }
    }

}
