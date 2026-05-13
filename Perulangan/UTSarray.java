package Array;

import java.util.Scanner;

public class UTSarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] data = new int[100];
        int jumlahData = 0;
        int pilihan;

        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Tambah nilai");
            System.out.println("2. Hapus nilai");
            System.out.println("3. Tampilkan data");
            System.out.println("4. Hitung rata-rata");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilihan = sc.nextInt();

            if (pilihan == 1) {
                System.out.print("Masukkan nilai: ");
                data[jumlahData] = sc.nextInt();
                jumlahData++;
            } else if (pilihan == 2) {
                System.out.print("Masukkan nilai yang ingin dihapus: ");
                int hapus = sc.nextInt();
                boolean ketemu = false;

                for (int i = 0; i < jumlahData; i++) {
                    if (data[i] == hapus) {

                        for (int j = i; j < jumlahData - 1; j++) {
                            data[j] = data[j + 1];
                        }
                        jumlahData--;
                        ketemu = true;
                        break;
                    }
                }

                if (ketemu) {
                    System.out.println("Nilai berhasil dihapus");
                } else {
                    System.out.println("Nilai tidak ditemukan");
                }
            } else if (pilihan == 3) {
                System.out.print("Data: ");
                for (int i = 0; i < jumlahData; i++) {
                    System.out.print(data[i] + " ");
                }
                System.out.println();
            } else if (pilihan == 4) {
                if (jumlahData == 0) {
                    System.out.println("Data kosong");
                } else {
                    int total = 0;
                    for (int i = 0; i < jumlahData; i++) {
                        total += data[i];
                    }
                    double rata = (double) total / jumlahData;
                    System.out.println("Rata-rata: " + rata);
                }
            }

        } while (pilihan != 0);

        sc.close();
    }
}
