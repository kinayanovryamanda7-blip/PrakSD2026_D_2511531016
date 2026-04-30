package pekan4_2511531016;
import java.util.Scanner;

public class Queue_2511531016 {
    public static void main(String[] args) {
        Scanner input_1016 = new Scanner(System.in);
        AntrianLoket_2511531016 q_1016 = new AntrianLoket_2511531016(10);

        int choice_1016;
        String nama_1016;

        do {
            System.out.println("\n=== PROGRAM ANTRIAN LOKET ===");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Hapus Antrian");
            System.out.println("3. Tampilkan Antrian");
            System.out.println("4. Reverse");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            choice_1016 = input_1016.nextInt();
            input_1016.nextLine();

            switch (choice_1016) {
                case 1:
                    System.out.print("Masukkan nama pelanggan: ");
                    nama_1016 = input_1016.nextLine();
                    q_1016.enqueue_1016(nama_1016);
                    break;
                case 2:
                    q_1016.dequeue_1016();
                    break;
                case 3:
                    q_1016.display_1016();
                    break;
                case 4:
                    q_1016.reverse_1016();
                    break;
                case 5:
                    System.out.println("Program selesai");
                    break;
                default:
                    System.out.println("Pilihan tidak valid");
            }
        } while (choice_1016 != 5);
    }
}