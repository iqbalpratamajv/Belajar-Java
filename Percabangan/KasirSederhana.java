package FungsiPercabangan;
import java.util.Scanner;
public class KasirSederhana {
    public static void main(String[] args)throws Exception{
        Scanner sc = new Scanner(System.in);

        System.out.println("== Menu Makanan ==");
        System.out.println("1. Ayam Goreng");
        System.out.println("2. Sate Kambing");
        System.out.println("3. Bakso");
        System.out.print("Pilih No Makanan: ");
        byte menu = sc.nextByte();
        System.out.println(" ");

        switch (menu) {
            case 1:
                int harga1 = 20000;
                System.out.println("Anda Memilih Ayam Goreng");
                System.out.println("Total Harga Yang Harus Anda Bayar Adalah Rp " + harga1);
                break;
            case 2:
                int harga2 = 25000;
                System.out.println("Anda Memilih Sate Kambing");
                System.out.println("Total Harga Yang Harus Anda Bayar Adalah Rp " + harga2);
                break;
            case 3:
                int harga3 = 10000;
                System.out.println("Anda Memilih Bakso");
                System.out.println("Total Harga Yang Harus Anda Bayar Adalah Rp " + harga3);
                break;
            default:
                System.out.println("Pilihan Menu Tidak Ada");
                break;
        }
        sc.close();
    }
}
