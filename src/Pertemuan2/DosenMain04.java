package Pertemuan2;

public class DosenMain04 {
    public static void main(String[] args) {
        Dosen04 dosen1 = new Dosen04("DS01", "Lukman", true, 2005, "Teknik Sipil");
        Dosen04 dosen2 = new Dosen04();
        Dosen04 dosen3 = new Dosen04("DS03", "Firman", false, 1989, "Kimia");

        dosen1.setStatusAktif(false);
        dosen1.ubahKeahlian("Teknik Nuklir");
        dosen1.tampilkanInformasi();
        System.out.println("Masa Kerja: " + dosen1.hitungMasaKerja(2025) + " tahun");
        System.out.println();

        dosen2.setStatusAktif(true);
        dosen2.ubahKeahlian("Teknik Air");
        dosen2.tampilkanInformasi();
        System.out.println("Masa Kerja: " + dosen2.hitungMasaKerja(2025) + " tahun");

        System.out.println();
        dosen3.tampilkanInformasi();
        dosen3.setStatusAktif(true);
        System.out.println("Masa Kerja: " + dosen3.hitungMasaKerja(2025) + " tahun");
        dosen3.ubahKeahlian("Metalurgi");
        dosen3.tampilkanInformasi();
    }
}
