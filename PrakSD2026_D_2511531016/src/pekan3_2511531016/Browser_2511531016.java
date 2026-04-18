package pekan3_2511531016;
import java.util.Scanner;
import java.util.Stack;

public class Browser_2511531016 {
    public static void main(String[] args) {
        Stack<Website_2511531016> history = new Stack<>();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n=== Browser History NIM: 2511531016 ===");
            System.out.println("1. Kunjungi Website (Push)");
            System.out.println("2. Tombol Back (Pop)");
            System.out.println("3. Lihat Halaman Aktif (Peek)");
            System.out.println("4. Cek Status History");
            System.out.println("5. Keluar");
            System.out.print("Pilihan: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    // Push
                    System.out.print("Masukkan Judul: ");
                    String judul = sc.nextLine();
                    System.out.print("Masukkan URL: ");
                    String url = sc.nextLine();

                    history.push(new Website_2511531016(judul, url));
                    System.out.println("Berhasil mengunjungi halaman!");
                    break;

                case 2:
                    // Pop
                    if (!history.isEmpty()) {
                        Website_2511531016 removed = history.pop();
                        System.out.println("Kembali dari: " + removed.getJudul_1016());
                    } else {
                        System.out.println("History kosong.");
                    }
                    break;

                case 3:
                    // Peek
                    if (!history.isEmpty()) {
                        System.out.println("Halaman aktif: " + history.peek());
                    } else {
                        System.out.println("Tidak ada halaman aktif.");
                    }
                    break;

                case 4:
                    // Status
                    System.out.println("Jumlah history: " + history.size());
                    if (history.isEmpty()) {
                        System.out.println("History kosong.");
                    }
                    break;

                case 5:
                    System.out.println("Keluar dari program.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
            }

        } while (choice != 5);

        sc.close();
    }
}