import java.util.Scanner;

public class MainFaktorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai yang akan dicari faktorialnya: ");
        int n = sc.nextInt();

        Faktorial f = new Faktorial();
        System.out.println("Faktorial Brute Force    : " + f.faktorialBF(n));
        System.out.println("Faktorial Divide & Conquer: " + f.faktorialDC(n));
        sc.close();
    }
}