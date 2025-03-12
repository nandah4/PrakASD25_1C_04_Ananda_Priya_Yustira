package Pertemuan5;

import java.util.Scanner;

public class NilaiMahasiswaMain {
    public static void main(String[] args) {
        NilaiMahasiswa[] arrMhsScore = new NilaiMahasiswa[8];
        NilaiMahasiswa objekMahasiswa = new NilaiMahasiswa();
        arrMhsScore[0] = new NilaiMahasiswa("Ahmad", "220101001", "2022", 78, 82);
        arrMhsScore[1] = new NilaiMahasiswa("Budi", "220101002", "2022", 85, 88);
        arrMhsScore[2] = new NilaiMahasiswa("Cindy", "220101003", "2021", 90, 87);
        arrMhsScore[3] = new NilaiMahasiswa("Dian", "220101004", "2021", 76, 79);
        arrMhsScore[4] = new NilaiMahasiswa("Eko", "220101005", "2023", 92, 95);
        arrMhsScore[5] = new NilaiMahasiswa("Fajar", "220101006", "2020", 88, 85);
        arrMhsScore[6] = new NilaiMahasiswa("Gina", "220101007", "2023", 80, 83);
        arrMhsScore[7] = new NilaiMahasiswa("Hadi", "220101008", "2020", 82, 84);

        double[] arrScoreUTS = new double[arrMhsScore.length];
        double[] arrScoreUAS = new double[arrMhsScore.length];

        for (int i = 0; i < arrMhsScore.length; i++) {
            arrScoreUTS[i] += arrMhsScore[i].scoreUTS;
            arrScoreUAS[i] += arrMhsScore[i].scoreUAS;
        }

        System.out.println(
                "Nilai UTS tertinggi: " + objekMahasiswa.findHighestScore(arrScoreUTS, 0, arrMhsScore.length - 1));
        System.out.println(
                "Nilai UTS Terendah: " + objekMahasiswa.findLowestScore(arrScoreUAS, 0, arrMhsScore.length - 1));
        System.out.println("Rata-rata Nilai UAS: " + objekMahasiswa.avgValue(arrScoreUAS));
    }
}
