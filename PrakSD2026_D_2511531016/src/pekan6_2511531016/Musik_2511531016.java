package pekan6_2511531016;
import java.util.Scanner;

public class Musik_2511531016 {
    Lagu_2511531016 head_1016 = null;
    Lagu_2511531016 tail_1016 = null;

    // tambah lagu di akhir playlist
    public void tambahLagu_1016(String judul_1016, String penyanyi_1016) {
        Lagu_2511531016 laguBaru_1016 = new Lagu_2511531016(judul_1016, penyanyi_1016);
        if (head_1016 == null) {
            head_1016 = laguBaru_1016;
            tail_1016 = laguBaru_1016;
        } else {
            tail_1016.next_1016 = laguBaru_1016;
            laguBaru_1016.prev_1016 = tail_1016;
            tail_1016 = laguBaru_1016;
        }
        System.out.println("Lagu berhasil ditambahkan!");
    }

    // hapus lagu pertama
    public void hapusLaguAwal_1016() {
        if (head_1016 == null) {
            System.out.println("Playlist kosong!");
            return;
        }
        System.out.println("Lagu yang dihapus: " + head_1016.judul_1016);
        if (head_1016 == tail_1016) {
            head_1016 = null;
            tail_1016 = null;
        } else {
            head_1016 = head_1016.next_1016;
            head_1016.prev_1016 = null;
        }
    }

    // tampil maju
    public void tampilMaju_1016() {
        if (head_1016 == null) {
            System.out.println("Playlist kosong!");
            return;
        }
        Lagu_2511531016 curr_1016 = head_1016;
        System.out.println("Playlist Maju:");
        while (curr_1016 != null) {
            System.out.println("Judul : " + curr_1016.judul_1016);
            System.out.println("Penyanyi : " + curr_1016.penyanyi_1016);
            curr_1016 = curr_1016.next_1016;
        }
    }

    // tampil mundur
    public void tampilMundur_1016() {
        if (tail_1016 == null) {
            System.out.println("Playlist kosong!");
            return;
        }
        Lagu_2511531016 curr_1016 = tail_1016;
        System.out.println("Playlist Mundur:");
        while (curr_1016 != null) {
            System.out.println("Judul : " + curr_1016.judul_1016);
            System.out.println("Penyanyi : " + curr_1016.penyanyi_1016);
            curr_1016 = curr_1016.prev_1016;
        }
    }

    // cari lagu
    public void cariLagu_1016(String judul_1016) {
        Lagu_2511531016 curr_1016 = head_1016;
        while (curr_1016 != null) {
            if (curr_1016.judul_1016.equalsIgnoreCase(judul_1016)) {
                System.out.println("Lagu ditemukan!");
                System.out.println("Judul : " + curr_1016.judul_1016);
                System.out.println("Penyanyi : " + curr_1016.penyanyi_1016);
                return;
            }
            curr_1016 = curr_1016.next_1016;
        }
        System.out.println("Lagu tidak ditemukan!");
    }

    public static void main(String[] args) {
        Scanner input_1016 = new Scanner(System.in);
        Musik_2511531016 playlist_1016 = new Musik_2511531016();
        int choice_1016;

        do {
            System.out.println("\n=== Playlist Musik NIM: 2511531016 ===");
            System.out.println("1. Tambah Lagu");
            System.out.println("2. Hapus Lagu Pertama");
            System.out.println("3. Lihat Playlist (Maju)");
            System.out.println("4. Lihat Playlist (Mundur)");
            System.out.println("5. Cari Lagu");
            System.out.println("6. Keluar");
            System.out.print("Pilihan: ");

            choice_1016 = input_1016.nextInt();
            input_1016.nextLine();

            switch (choice_1016) {
                case 1:
                    System.out.print("Judul Lagu: ");
                    String judul_1016 = input_1016.nextLine();
                    System.out.print("Penyanyi: ");
                    String penyanyi_1016 = input_1016.nextLine();
                    playlist_1016.tambahLagu_1016(judul_1016, penyanyi_1016);
                    break;
                case 2:
                    playlist_1016.hapusLaguAwal_1016();
                    break;
                case 3:
                    playlist_1016.tampilMaju_1016();
                    break;
                case 4:
                    playlist_1016.tampilMundur_1016();
                    break;
                case 5:
                    System.out.print("Masukkan judul lagu yang dicari: ");
                    String cari_1016 = input_1016.nextLine();
                    playlist_1016.cariLagu_1016(cari_1016);
                    break;
                case 6:
                    System.out.println("Program selesai.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }
            
        } while (choice_1016 != 6);
        input_1016.close();
    }
}