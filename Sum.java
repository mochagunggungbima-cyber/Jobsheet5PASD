public class Sum {
    int[] keuntungan;

    // Konstruktor
    public Sum(int[] keuntungan) {
        this.keuntungan = keuntungan;
    }

    // Brute Force: penjumlahan iteratif satu per satu
    public int TotalBF() {
        int total = 0;
        for (int i = 0; i < keuntungan.length; i++) {
            total += keuntungan[i];
        }
        return total;
    }

    // Divide and Conquer: bagi array menjadi dua bagian, jumlahkan rekursif
    public int TotalDC(int left, int right) {
        if (left == right) {           // base case: 1 elemen
            return keuntungan[left];
        }
        int mid  = (left + right) / 2; // divide: cari titik tengah
        int lsum = TotalDC(left, mid); // conquer kiri
        int rsum = TotalDC(mid + 1, right); // conquer kanan
        return lsum + rsum;            // combine: gabungkan hasil
    }
}