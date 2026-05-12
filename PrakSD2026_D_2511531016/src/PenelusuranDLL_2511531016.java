package pekan6_2511531016;

public class PenelusuranDLL_2511531016 {
	// Fungsi penelusuran maju
	static void forwardTraversal_1016 (NodeDLL_2511531016 head_1016) {
        // Memulai penelusuran dari head
        NodeDLL_2511531016 curr_1016 = head_1016;
        // Lanjutkan sampai akhir
        while (curr_1016 != null) {
            // Print data
            System.out.print(curr_1016.data_1016 + " <-> ");
            // Pindah ke node berikutnya
            curr_1016 = curr_1016.next_1016;
        }
        // Print spasi
        System.out.println();
    }

    // Fungsi penelusuran mundur
    static void backwardTraversal_1016 (NodeDLL_2511531016 tail_1016) {
        // Mulai dari akhir
        NodeDLL_2511531016 curr_1016 = tail_1016;
        // Lanjut sampai head
        while (curr_1016 != null) {
            // Cetak data
            System.out.print(curr_1016.data_1016 + " <-> ");
            // Pindah ke node sebelumnya
            curr_1016 = curr_1016.prev_1016;
        }
        // Cetak spasi
        System.out.println();
    }
    
    public static void main(String[] args) {
        // Cetak DLL
        NodeDLL_2511531016 head_1016 = new NodeDLL_2511531016(1);
        NodeDLL_2511531016 second_1016 = new NodeDLL_2511531016(2);
        NodeDLL_2511531016 third_1016 = new NodeDLL_2511531016(3);

        head_1016.next_1016 = second_1016;
        second_1016.prev_1016 = head_1016;
        second_1016.next_1016 = third_1016;
        third_1016.prev_1016 = second_1016;

        System.out.println("Penelusuran maju:");
        forwardTraversal_1016(head_1016);

        System.out.println("Penelusuran mundur:");
        backwardTraversal_1016(third_1016);
    }
}