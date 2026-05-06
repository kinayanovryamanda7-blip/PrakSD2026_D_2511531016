package pekan5_2511531016;
import java.util.Scanner;

public class RumahSakit_2511531016 {
    Pasien_2511531016 head_1016 = null;
    int counter_1016 = 0;

    // insert at tail
    public void daftarkanPasien_1016(String nama_1016, String penyakit_1016) {
        counter_1016++;
        Pasien_2511531016 pasienBaru_1016 = new Pasien_2511531016(nama_1016, penyakit_1016, counter_1016);
        if (head_1016 == null) {
            head_1016 = pasienBaru_1016;
        } else {
            Pasien_2511531016 temp_1016 = head_1016;
            while (temp_1016.next_1016 != null) {
                temp_1016 = temp_1016.next_1016;
            }
            temp_1016.next_1016 = pasienBaru_1016;
        }
        System.out.println("Pasien berhasil didaftarkan! Nomor Antrian: " + counter_1016);
    }

    // delete head
    public void panggilPasien_1016() {
        if (head_1016 == null) {
            System.out.println("Antrian kosong!");
            return;
        }
        System.out.println("Memanggil Pasien:");
        System.out.println("Nama: " + head_1016.namaPasien_1016);
        System.out.println("Keluhan: " + head_1016.penyakit_1016);
        System.out.println("No Antrian: " + head_1016.noAntrian_1016);
        head_1016 = head_1016.next_1016;
    }

    // display
    public void tampilkanAntrian_1016() {
        if (head_1016 == null) {
            System.out.println("Antrian kosong!");
            return;
        }
        Pasien_2511531016 temp_1016 = head_1016;
        System.out.println("Daftar Antrian:");
        while (temp_1016 != null) {
        	System.out.println("No: " + temp_1016.noAntrian_1016);
        	System.out.println("Nama: " + temp_1016.namaPasien_1016);
        	System.out.println("Keluhan: " + temp_1016.penyakit_1016);
            temp_1016 = temp_1016.next_1016;
        }
    }
    // search
    public void cariPasien_1016(String nama_1016) {
        Pasien_2511531016 temp_1016 = head_1016;
        while (temp_1016 != null) {
            if (temp_1016.namaPasien_1016.equalsIgnoreCase(nama_1016)) {
                System.out.println("Pasien ditemukan!");
                System.out.println("No: " + temp_1016.noAntrian_1016);
            	System.out.println("Nama: " + temp_1016.namaPasien_1016);
            	System.out.println("Keluhan: " + temp_1016.penyakit_1016);
                return;
            }
            temp_1016 = temp_1016.next_1016;
        }
        System.out.println("Pasien tidak ditemukan!");
    }

    // status
    public void cekStatus_1016() {
        if (head_1016 == null) {
            System.out.println("Antrian kosong!");
            return;
        }
        int jumlah_1016 = 0;
        Pasien_2511531016 temp_1016 = head_1016;

        while (temp_1016 != null) {
            jumlah_1016++;
            temp_1016 = temp_1016.next_1016;
        }
        System.out.println("Jumlah pasien: " + jumlah_1016);
        System.out.println("Pasien terdepan: " + head_1016.namaPasien_1016);
        System.out.println("No: " + head_1016.noAntrian_1016);
    }

    public static void main(String[] args) {
        Scanner input_1016 = new Scanner(System.in);
        RumahSakit_2511531016 rs_1016 = new RumahSakit_2511531016();
        int choice_1016;
        
        do {
            System.out.println("\n=== Antrian Rumah Sakit NIM: 2511531016 ===");
            System.out.println("1. Daftarkan Pasien");
            System.out.println("2. Panggil Pasien");
            System.out.println("3. Tampilkan Antrian");
            System.out.println("4. Cari Pasien");
            System.out.println("5. Cek Status Antrian");
            System.out.println("6. Keluar");
            System.out.print("Pilihan: ");
            choice_1016 = input_1016.nextInt();
            input_1016.nextLine();
            
            switch (choice_1016) {
                case 1:
                    System.out.print("Masukkan Nama Pasien: ");
                    String nama_1016 = input_1016.nextLine();
                    System.out.print("Masukkan Keluhan: ");
                    String keluhan_1016 = input_1016.nextLine();
                    rs_1016.daftarkanPasien_1016(nama_1016, keluhan_1016);
                    break;
                case 2:
                    rs_1016.panggilPasien_1016();
                    break;
                case 3:
                    rs_1016.tampilkanAntrian_1016();
                    break;
                case 4:
                    System.out.print("Masukkan nama yang dicari: ");
                    String cari_1016 = input_1016.nextLine();
                    rs_1016.cariPasien_1016(cari_1016);
                    break;
                case 5:
                    rs_1016.cekStatus_1016();
                    break;
                case 6:
                    System.out.println("Terima kasih!");
                    break;
                    
                default:
                    System.out.println("Pilihan tidak valid!");
            }
            
        } while (choice_1016 != 6);
        input_1016.close();
    }
}