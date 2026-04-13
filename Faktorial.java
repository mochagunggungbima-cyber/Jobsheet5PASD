public class Faktorial {

    // Metode Brute Force: menggunakan perulangan iteratif
    public int faktorialBF(int n) {
        int fakto = 1;
        for (int i = 1; i <= n; i++) {
            fakto *= i;
        }
        return fakto;
    }

    // Metode Divide and Conquer: menggunakan rekursif
    public int faktorialDC(int n) {
        if (n == 0 || n == 1) {   // base case
            return 1;
        } else {                   // recursive case
            return n * faktorialDC(n - 1);
        }
    }
}