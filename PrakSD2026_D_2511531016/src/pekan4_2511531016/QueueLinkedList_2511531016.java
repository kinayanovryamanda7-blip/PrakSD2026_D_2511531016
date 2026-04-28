package pekan4_2511531016;
import java.util.Queue;
import java.util.LinkedList;

public class QueueLinkedList_2511531016 {
	public static void main(String[] args) {
		Queue<Integer> q_1016 = new LinkedList<>();
		// Tambah elemen {0, 1, 2, 3, 4, 5} ke antrian
		for (int i = 0; i < 6; i++)
			q_1016.add(i);
		// Menampilkan isi antrian
		System.out.println("Elemen Antrian " + q_1016);
		// Untuk menghapus kepala antrian
		int hapus_1016 = q_1016.remove();
		System.out.println("Hapus Elemen = " + hapus_1016);
		System.out.println(q_1016);
		// Untuk melihat antrian terdepan
		int depan_1016 = q_1016.peek();
		System.out.println("Kepala Antrian = " + depan_1016);

		int banyak_1016 = q_1016.size();
		System.out.println("Size Antrian = " + banyak_1016);
	}
}