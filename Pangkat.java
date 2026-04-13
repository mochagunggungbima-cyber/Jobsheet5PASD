public class Pangkat {
    int nilai;    // bilangan dasar (basis)
    int pangkat;  // eksponen

    // Konstruktor berparameter
    public Pangkat(int nilai, int pangkat) {
        this.nilai   = nilai;
        this.pangkat = pangkat;
    }

    // Brute Force: kalikan nilai sebanyak pangkat kali (iteratif)
    public double PangkatBF(int nilai, int pangkat) {
        double hasil = 1;
        for (int i = 0; i < pangkat; i++) {
            hasil *= nilai;
        }
        return hasil;
    }

    // Divide and Conquer: bagi eksponen jadi dua secara rekursif
    public double PangkatDC(int nilai, int pangkat) {
        if (pangkat == 0) {                          // base case
            return 1;
        } else if (pangkat % 2 == 0) {               // pangkat genap -> divide
            double half = PangkatDC(nilai, pangkat / 2);
            return half * half;                      // combine
        } else {                                     // pangkat ganjil
            return nilai * PangkatDC(nilai, pangkat - 1);
        }
    }
}