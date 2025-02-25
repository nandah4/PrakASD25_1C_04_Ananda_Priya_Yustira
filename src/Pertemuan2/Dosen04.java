package Pertemuan2;

public class Dosen04 {
    String idDosen;
    String nama;
    boolean statusAktif;
    int tahunBergabung;
    String bidangKeahlian;

    public Dosen04() {
        
    }

    public Dosen04(String id, String namaDosen, boolean status, int tahunBergabung, String bidangKeahlian) {
        this.idDosen = id;
        this.nama = namaDosen;
        this.statusAktif = status;
        this.tahunBergabung = tahunBergabung;
        this.bidangKeahlian = bidangKeahlian;
    }

    void tampilkanInformasi() {
        System.out.println("ID Dosen             : " + idDosen);
        System.out.println("Nama Dosen           : " + nama);
        System.out.println("Status Dosen         : " + statusAktif);
        System.out.println("Tahun Bergabung      : " + tahunBergabung);
        System.out.println("Bidang Keahlian      : " + bidangKeahlian);
    }

    void setStatusAktif(boolean status) {
        this.statusAktif = status;
        if (status) {
            System.out.println("Status Dosen Aktif");
        } else {
            System.out.println("Status Dosen Tidak Aktif");
        }
    }

    int hitungMasaKerja(int tahunSekarang) {
        int resultMasaKerja = tahunSekarang - tahunBergabung;
        if (tahunSekarang < tahunBergabung) {
            System.out.println("Tahun Tidak Valid");
            return 0;
        } else {
            return resultMasaKerja;
        }
    }

    void ubahKeahlian(String bidang) {
        this.bidangKeahlian = bidang;
    }

}
