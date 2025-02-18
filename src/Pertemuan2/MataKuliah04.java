package Pertemuan2;

public class MataKuliah04 {
    String kodeMK;
    String nama;
    int sks;
    int jumlahJam;

    public MataKuliah04() {

    }

    public MataKuliah04(String kodeMK, String nm, int sks, int jmlJam) {
        this.kodeMK = kodeMK;
        nama = nm;
        this.sks = sks;
        jumlahJam = jmlJam;
    }

    void tampilkanInformasi() {
        System.out.println("Kode Mata Kuliah: " + kodeMK);
        System.out.println("Nama Mata Kuliah: " + nama);
        System.out.println("Jumlah SKS: " + sks);
        System.out.println("Jumlah Jam: " + jumlahJam);
    }

    void ubahSKS(int sksBaru) {
        sks = sksBaru;
        System.out.println("Anda berhasil mengubah SKS!");
    }

    void tambahJam(int jam) {
        jumlahJam += jam;
    }

    void kurangJam(int jam) {
        if (jam >= jumlahJam) {
            System.out.println("Pengurangan tidak dapat dilakukan");
        } else {
            jumlahJam -= jam;
            System.out.println("Jumlah jam saat ini: " + jumlahJam);
        }
    }

}
