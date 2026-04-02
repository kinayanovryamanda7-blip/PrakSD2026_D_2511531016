package pekan1_2511531016;
import java.util.Scanner;

public class MobilDriver_2511531016 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mobil: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("\nData Mobil ke-" + (i + 1));

            System.out.print("Nama: ");
            String nama = sc.nextLine();

            System.out.print("Tahun: ");
            int tahun = sc.nextInt();

            System.out.print("CC: ");
            int cc = sc.nextInt();

            System.out.print("Harga: ");
            double harga = sc.nextDouble();
            sc.nextLine();

            System.out.print("Merk: ");
            String merk = sc.nextLine();

            ADTMobil_2511531016.tambahMobil(
                new ADTMobil_2511531016(nama, tahun, cc, harga, merk)
            );
        }

        System.out.println("\n=== Data Mobil ===");
        ADTMobil_2511531016.tampil();

        System.out.print("\nHapus index ke: ");
        int idx = sc.nextInt();
        ADTMobil_2511531016.hapusMobil(idx);

        System.out.println("\n=== Setelah Hapus ===");
        ADTMobil_2511531016.tampil();

        sc.close();
    }
}