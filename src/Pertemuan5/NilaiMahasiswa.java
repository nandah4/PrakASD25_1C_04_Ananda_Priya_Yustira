package Pertemuan5;

public class NilaiMahasiswa {
    String name;
    String nim;
    String yearOfEntry;
    double scoreUTS;
    double scoreUAS;

    NilaiMahasiswa() {

    }

    NilaiMahasiswa(String name, String nim, String yearOfEntry, double scoreUTS, double scoreUAS) {
        this.name = name;
        this.nim = nim;
        this.yearOfEntry = yearOfEntry;
        this.scoreUTS = scoreUTS;
        this.scoreUAS = scoreUAS;
    }

    double findHighestScore(double arr[], int left, int right) {

        if (left == right) {
            return arr[left];
        }

        int mid = (left + right) / 2;
        double leftSum = findHighestScore(arr, left, mid);
        double rightSum = findHighestScore(arr, mid + 1, right);

        return Math.max(leftSum, rightSum);
    }

    double findLowestScore(double arr[], int left, int right) {
        if (left == right) {
            return arr[left];
        }

        int mid = (left + right) / 2;
        double leftSum = findLowestScore(arr, left, mid);
        double rightSum = findLowestScore(arr, mid + 1, right);

        return Math.min(leftSum, rightSum);
    }

    double avgValue(double arr[]) {
        double total = 0;
        double avgScore;

        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
        }
        avgScore = total / arr.length;
        return avgScore;

    }

}
