import java.util.Scanner;

public class MainPangkat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah elemen yang akan dihitung pangkatnya: ");
        int n = sc.nextInt();

        // Instansiasi Array of Object
        Pangkat[] arr = new Pangkat[n];

        // Pengisian nilai dan pangkat untuk setiap objek
        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan nilai ke-" + (i + 1) + ": ");
            int nilai = sc.nextInt();
            System.out.print("Masukkan pangkat ke-" + (i + 1) + ": ");
            int pkt = sc.nextInt();
            arr[i] = new Pangkat(nilai, pkt);
        }

        // Tampilkan hasil BF dan DC untuk setiap objek
        System.out.println("\n--- Hasil ---");
        for (int i = 0; i < n; i++) {
            double hasilBF = arr[i].PangkatBF(arr[i].nilai, arr[i].pangkat);
            double hasilDC = arr[i].PangkatDC(arr[i].nilai, arr[i].pangkat);
            System.out.println(arr[i].nilai + "^" + arr[i].pangkat
                + " => BF: " + (long) hasilBF
                + " | DC: " + (long) hasilDC);
        }
        sc.close();
    }
}