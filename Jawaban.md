5.2.3 Pertanyaan

Jelaskan perbedaan bagian kode if dan else pada base case Algoritma Divide and Conquer untuk faktorial! javaint faktorialDC(int n) { if (n == 0 || n == 1) { // BASE CASE return 1; } else { // RECURSIVE CASE return n * faktorialDC(n - 1); } }
if → merupakan base case, yaitu kondisi berhenti. Ketika n = 0 atau n = 1, fungsi langsung mengembalikan nilai 1 tanpa rekursi lagi. Ini mencegah perulangan tak terbatas. else → merupakan recursive case, yaitu kondisi saat masalah dipecah menjadi sub-masalah lebih kecil. Fungsi memanggil dirinya sendiri dengan nilai n-1 hingga mencapai base case.

Apakah perulangan pada faktorialBF() bisa diubah selain for? Buktikan! Bisa. Perulangan for dapat diganti dengan while maupun do-while. Menggunakan while: javaint faktorialBF(int n) { int fakto = 1; int i = 1; while (i <= n) { fakto *= i; i++; } return fakto; } Menggunakan do-while: javaint faktorialBF(int n) { int fakto = 1; int i = 1; do { fakto *= i; i++; } while (i <= n); return fakto; } Ketiganya menghasilkan output yang sama karena logika perkaliannya identik.

Jelaskan perbedaan antara fakto *= i; dan int fakto = n * faktorialDC(n-1);! Aspekfakto *= i (BF)int fakto = n * faktorialDC(n-1) (DC)PendekatanIteratif (perulangan)Rekursif (memanggil diri sendiri)Cara kerjaMengalikan fakto dengan i satu per satu dari 1 hingga nMemecah masalah: kalikan n dengan hasil faktorial n-1Base caseTidak diperlukanDiperlukan agar rekursi berhentiCall stackTidak menggunakanMenumpuk di call stack setiap rekursi

Kesimpulan perbedaan cara kerja faktorialBF() dan faktorialDC()!

faktorialBF() bekerja secara iteratif menggunakan loop for. Proses perhitungan dilakukan secara langsung dari bawah ke atas (1 × 2 × 3 × ... × n) tanpa melibatkan pemanggilan fungsi berulang. Lebih efisien dalam penggunaan memori karena tidak membutuhkan call stack. faktorialDC() bekerja secara rekursif menggunakan prinsip Divide and Conquer. Masalah dipecah menjadi sub-masalah yang lebih kecil (n-1), diselesaikan hingga mencapai base case, lalu hasilnya digabungkan kembali. Lebih mudah dipahami secara logika namun membutuhkan memori lebih besar karena menumpuk pemanggilan di call stack.