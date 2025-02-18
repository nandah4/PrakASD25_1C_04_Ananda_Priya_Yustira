package Pertemuan2;

public class MahasiswaMain04 {
    public static void main(String[] args) {
        Mahasiswa04 mhs1 = new Mahasiswa04();
        mhs1.nama = "Muhammad Ali Farhan";
        mhs1.nim = "244107090142";
        mhs1.kelas = "SI 2J";
        mhs1.ipk = 3.55;

        mhs1.tampilkanInformasi();
        mhs1.ubahKelas("SI 2K");
        mhs1.updateIpk(5.60);
        mhs1.tampilkanInformasi();

        Mahasiswa04 mhs2 = new Mahasiswa04("Annisas Nabila", "24410900202", 3.25, "TI 2L");
        mhs2.updateIpk(3.30);
        mhs2.tampilkanInformasi();

        Mahasiswa04 mhsNanda04 = new Mahasiswa04("Ananda Priya Yustira", "244107020131", 4.0, "TI 1C");
        mhsNanda04.tampilkanInformasi();
    }
}
