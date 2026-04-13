public class NilaiMahasiswa {

    // =========================================================
    // a) Nilai UTS TERTINGGI menggunakan Divide and Conquer
    // =========================================================
    public static int maxUTS(int[] uts, int left, int right) {
        if (left == right) {               // base case
            return uts[left];
        }
        int mid   = (left + right) / 2;
        int maxL  = maxUTS(uts, left, mid);       // cari maks kiri
        int maxR  = maxUTS(uts, mid + 1, right);  // cari maks kanan
        return Math.max(maxL, maxR);               // combine: ambil yang lebih besar
    }

    // =========================================================
    // b) Nilai UTS TERENDAH menggunakan Divide and Conquer
    // =========================================================
    public static int minUTS(int[] uts, int left, int right) {
        if (left == right) {               // base case
            return uts[left];
        }
        int mid   = (left + right) / 2;
        int minL  = minUTS(uts, left, mid);
        int minR  = minUTS(uts, mid + 1, right);
        return Math.min(minL, minR);               // combine: ambil yang lebih kecil
    }

    // =========================================================
    // c) Rata-rata nilai UAS menggunakan Brute Force
    // =========================================================
    public static double avgUAS(int[] uas) {
        int total = 0;
        for (int i = 0; i < uas.length; i++) {    // iterasi satu per satu (BF)
            total += uas[i];
        }
        return (double) total / uas.length;
    }

    // =========================================================
    // Main
    // =========================================================
    public static void main(String[] args) {
        int[] uts = {78, 90, 65, 82, 88, 55, 75, 95};
        int[] uas = {85, 88, 70, 75, 92, 60, 80, 90};

        System.out.println("=== Hasil Latihan Praktikum ===");
        System.out.println("a) Nilai UTS Tertinggi (DC) : " + maxUTS(uts, 0, uts.length - 1));
        System.out.println("b) Nilai UTS Terendah  (DC) : " + minUTS(uts, 0, uts.length - 1));
        System.out.printf("c) Rata-rata UAS       (BF) : %.2f%n", avgUAS(uas));
    }
}