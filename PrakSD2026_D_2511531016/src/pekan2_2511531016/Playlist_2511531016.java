package pekan2_2511531016;
import java.util.ArrayList;
import java.util.Scanner;

public class Playlist_2511531016 {
    public static void main(String[] args) {
        ArrayList<Musik_2511531016> playlist = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n=== Playlist Musik NIM: 2511531016 ===");
            System.out.println("1. Tambah Lagu");
            System.out.println("2. Lihat Playlist");
            System.out.println("3. Hapus Lagu");
            System.out.println("4. Cek Kapasitas");
            System.out.println("5. Keluar");
            System.out.print("Pilihan: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    // Tambah Lagu
                    System.out.print("Masukkan Judul: ");
                    String judul = sc.nextLine();
                    System.out.print("Masukkan Penyanyi: ");
                    String penyanyi = sc.nextLine();
                    System.out.print("Masukkan Durasi (detik): ");
                    int durasi = sc.nextInt();
                    sc.nextLine();

                    playlist.add(new Musik_2511531016(judul, penyanyi, durasi));
                    System.out.println("Data berhasil ditambahkan!");
                    break;

                case 2:
                    // Lihat Playlist
                    if (playlist.isEmpty()) {
                        System.out.println("Playlist kosong.");
                    } else {
                        System.out.println("Daftar Lagu:");
                        for (int i = 0; i < playlist.size(); i++) {
                            System.out.println((i+1) + ". " + playlist.get(i));
                        }
                    }
                    break;

                case 3:
                    // Hapus Lagu
                    System.out.print("Masukkan nomor lagu yang ingin dihapus: ");
                    int index = sc.nextInt();
                    sc.nextLine();

                    if (index > 0 && index <= playlist.size()) {
                        playlist.remove(index - 1);
                        System.out.println("Lagu berhasil dihapus.");
                    } else {
                        System.out.println("Index tidak valid.");
                    }
                    break;

                case 4:
                    // Cek Kapasitas
                    System.out.println("Jumlah lagu dalam playlist: " + playlist.size());
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