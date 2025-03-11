package Pertemuan5;

public class Faktorial04 {

    int faktorialBF(int n) {
        int fakto = 1;

        // for (int i = 1; i <= n; i++) {
        // fakto = fakto * i;
        // }
        int i = 1;
        while (i <= 5) {
            fakto = i * fakto;
            i++;
        }

        return fakto;
    }

    int faktorialDC(int n) {
        if (n == 1) {
            return n;
        }

        return n * faktorialDC(n - 1);
    }
}
