import java.util.Scanner;

public class MainSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan berapa bulan keuntungan yang akan dihitung: ");
        int n = sc.nextInt();

        // Buat objek Sum dengan array berukuran n
        int[] data = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan keuntungan bulan ke-" + (i + 1) + ": ");
            data[i] = sc.nextInt();
        }

        Sum s = new Sum(data);
        System.out.println("\nTotal keuntungan (Brute Force)       : " + s.TotalBF());
        System.out.println("Total keuntungan (Divide and Conquer): " + s.TotalDC(0, n - 1));
        sc.close();
    }
}