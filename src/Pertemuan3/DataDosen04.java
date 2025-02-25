package Pertemuan3;

public class DataDosen04 {
    void dataSemuaDosen(Dosen04[] arrOfDosen) {
        for (int i = 0; i < arrOfDosen.length; i++) {
            System.out.println("-------------------------------------------");
            System.out.println("Data Dosen ke-" + (i + 1));
            System.out.println("Kode            : " + arrOfDosen[i].kode);
            System.out.println("Nama            : " + arrOfDosen[i].nama);

            if (arrOfDosen[i].jenisKelamin) {
                System.out.println("Jenis Kelamin   : Wanita");
            } else {
                System.out.println("Jenis Kelamin   : Pria");
            }

            System.out.println("Usia            : " + arrOfDosen[i].usia);
            System.out.println("-------------------------------------------");
        }
    }

    void jumlahDosenPerJenisKelamin(Dosen04[] arrOfDosen) {
        int jmlDosenPria = 0, jmlDosenWanita = 0;
        for (int i = 0; i < arrOfDosen.length; i++) {
            if (arrOfDosen[i].jenisKelamin) {
                // System.out.println("Jenis Kelamin : Wanita");
                jmlDosenWanita++;
            } else {
                // System.out.println("Jenis Kelamin : Pria");
                jmlDosenPria++;
            }
        }
        System.out.println("-------------------------------------------");
        System.out.println("Jumlah Dosen Per Jenis Kelamin");
        if (jmlDosenPria > 0) {
            System.out.println("Dosen Pria      : " + jmlDosenPria);
        } else {
            System.out.println("Tidak ada data dosen pria.");
        }
        if (jmlDosenWanita > 0) {
            System.out.println("Dosen Wanita    : " + jmlDosenWanita);
        } else {
            System.out.println("Tidak ada data dosen Wanita.");
        }
        System.out.println("-------------------------------------------");
    }

    void rerataUsiaDosenPerJenisKelaminDosen(Dosen04[] arrOfDosen) {
        int jmlDosenPria = 0, jmlDosenWanita = 0;
        int totalUsiaPria = 0, totalUsiaWanita = 0;
        for (int i = 0; i < arrOfDosen.length; i++) {
            if (arrOfDosen[i].jenisKelamin) {
                totalUsiaWanita += arrOfDosen[i].usia;
                jmlDosenWanita++;

            } else {
                totalUsiaPria += arrOfDosen[i].usia;
                jmlDosenPria++;
            }
        }
        System.out.println("-------------------------------------------");
        System.out.println("Rata-rata usia dosen berdasarkan Jenis Kelamin");
        if (jmlDosenPria > 0) {
            System.out.println("Rerata Usia Dosen Pria      : " + ((double) totalUsiaPria / jmlDosenPria));
        } else {
            System.out.println("Tidak ada data dosen pria.");
        }

        if (jmlDosenWanita > 0) {
            System.out.println("Rerata Usia Dosen Wanita    : " + ((double) totalUsiaWanita / jmlDosenWanita));
        } else {
            System.out.println("Tidak ada data dosen wanita.");
        }
        System.out.println("-------------------------------------------");
    }

    void infoDosenPalingTua(Dosen04[] arrOfDosen) {
        if (arrOfDosen == null || arrOfDosen.length == 0) {
            System.out.println("Tidak ada data dosen.");
            return;
        }

        Dosen04 dataDosenPalingTua = arrOfDosen[0];
        for (int i = 0; i < arrOfDosen.length; i++) {
            if (arrOfDosen[i].usia > dataDosenPalingTua.usia) {
                dataDosenPalingTua = arrOfDosen[i];
            }
        }
        System.out.println("-------------------------------------------");
        System.out.println("Data Dosen Paling Tua : ");
        System.out.println("Kode             : " + dataDosenPalingTua.kode);
        System.out.println("Nama             : " + dataDosenPalingTua.nama);
        System.out.println("Jenis Kelamin    : " + dataDosenPalingTua.jenisKelamin);
        System.out.println("Usia             : " + dataDosenPalingTua.usia);
        System.out.println("-------------------------------------------");
    }

    void infoDosenPalingMuda(Dosen04[] arrOfDosen) {
        if (arrOfDosen == null || arrOfDosen.length == 0) {
            System.out.println("Tidak ada data dosen.");
            return;
        }

        Dosen04 dataDosenPalingMuda = arrOfDosen[0];
        for (int i = 0; i < arrOfDosen.length; i++) {
            if (arrOfDosen[i].usia < dataDosenPalingMuda.usia) {

                dataDosenPalingMuda = arrOfDosen[i];
            }
        }
        System.out.println("-------------------------------------------");
        System.out.println("Data Dosen Paling Muda : ");
        System.out.println("Kode             : " + dataDosenPalingMuda.kode);
        System.out.println("Nama             : " + dataDosenPalingMuda.nama);
        System.out.println("Jenis Kelamin    : " + dataDosenPalingMuda.jenisKelamin);
        System.out.println("Usia             : " + dataDosenPalingMuda.usia);
        System.out.println("-------------------------------------------");
    }

}
