package Pertemuan2;

public class MataKuliahMain04 {
    public static void main(String[] args) {
        MataKuliah04 mk1 = new MataKuliah04();
        MataKuliah04 mk2 = new MataKuliah04("ASD25", "Algoritma Struktur Data", 3, 6);
        MataKuliah04 mk3 = new MataKuliah04("PRAKASD25", "Praktikum ASD", 4, 8);

        mk1.tampilkanInformasi();
        mk2.tampilkanInformasi();
        mk3.tampilkanInformasi();

        mk1.ubahSKS(2);
        mk2.ubahSKS(5);
        mk3.ubahSKS(3);

        mk1.tambahJam(5);
        mk2.tambahJam(2);
        mk3.tambahJam(2);
        
        mk1.kurangJam(2);
        mk2.kurangJam(12);
        mk3.kurangJam(1);

        mk1.tampilkanInformasi();
        mk2.tampilkanInformasi();
        mk3.tampilkanInformasi();

    }
}
