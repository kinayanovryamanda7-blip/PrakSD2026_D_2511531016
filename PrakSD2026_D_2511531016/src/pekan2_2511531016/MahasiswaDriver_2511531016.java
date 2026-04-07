package pekan2_2511531016;
import java.util.ArrayList;
import java.util.Scanner;

public class MahasiswaDriver_2511531016 {
	// 1. Method untuk menampilkan menu
	public static void tampilkanMenu_2511531016() {
		System.out.println("\nMenu:");
		System.out.println("1. Tambah Mahasiswa");
		System.out.println("2. Tampilkan Semua Mahasiswa");
		System.out.println("3. Hapus Mahasiswa Berdasarkan NIM");
		System.out.println("4. Cari Mahasiswa Berdasarkan NIM");
		System.out.println("5. Keluar");
	}
	
	// 2. Method untuk tambah Mahasiswa
	public static void tambahMahasiswa_2511531016(ArrayList<Mahasiswa_2511531016> List, Scanner sc) {
		System.out.print("Masukkan NIM: ");
		String nim = sc.nextLine();
		System.out.print("Masukkan Nama: ");
		String nama = sc.nextLine();
		System.out.print("Masukkan Prodi: ");
		String prodi = sc.nextLine();
		List.add(new Mahasiswa_2511531016(nim, nama, prodi));
		System.out.println("Mahasiswa berhasil ditambahkan.");
	}
	
	// 3. Method untu tampilkan semua data
	public static void tampilkanSemuaMahasiswa_2511531016(ArrayList<Mahasiswa_2511531016> List) {
		if (List.isEmpty()) {
			System.out.println("Daftar mahasiswa kosong.");
		} else {
			System.out.println("Data Mahasiswa:");
			for (Mahasiswa_2511531016 mhs : List) {
				System.out.println(mhs);
			}
		}
	}
	
	// 4. Method untuk hapus mahasiswa berdasarkan NIM
	public static void hapusMahasiswa_2511531016(ArrayList<Mahasiswa_2511531016> List, Scanner sc) {
		System.out.print("Masukkan NIM yang akan dihapus: ");
		String nimHapus = sc.nextLine();
		boolean removed = List.removeIf(mhs -> mhs.nim.equals(nimHapus));
		
		if (removed) {
			System.out.println("Data dengan NIM " + nimHapus + " berhasil dihapus.");
		} else {
			System.out.println("NIM tidak ditemukan.");
		}
	}
	
	// 5. Method untuk cari mahasiswa berdasarkan NIM
	public static void cariMahasiswa_2511531016(ArrayList<Mahasiswa_2511531016> List, Scanner sc) {
		System.out.print("Masukkan NIM yang dicari: ");
		String nimCari = sc.nextLine();
		boolean ditemukan = false;
		
		for (Mahasiswa_2511531016 mhs : List) {
			if (mhs.nim.equals(nimCari)) {
				System.out.println("Hasil Pencarian: " + mhs);
				ditemukan = true;
				break;
			}
		}
		
		if (!ditemukan) {
			System.out.println("NIM tidak ada.");
		}
	}
	
	public static void main(String[] args) {
		ArrayList<Mahasiswa_2511531016> mahasiswaList = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		int choice;
		do {
			tampilkanMenu_2511531016();
			System.out.print("Pilih menu: ");
			choice = scanner.nextInt();
			scanner.nextLine(); // Consume newline
			
			switch (choice) {
			case 1:
				tambahMahasiswa_2511531016(mahasiswaList, scanner);
				break;
			case 2:
				tampilkanSemuaMahasiswa_2511531016(mahasiswaList);
				break;
			case 3:
				hapusMahasiswa_2511531016(mahasiswaList, scanner);
				break;
			case 4:
				cariMahasiswa_2511531016(mahasiswaList, scanner);
				break;
			case 5:
				System.out.println("Keluar dari program.");
				break;
			default:
				System.out.println("Pilihan tidak valid");
			}
		} while (choice != 5);
		scanner.close();
	}
}