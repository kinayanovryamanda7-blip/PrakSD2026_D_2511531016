package pekan5_2511531016;

public class HapusSLL_2511531016 {
	// Fungsi untuk menghapus head
	public static NodeSLL_2511531016 deleteHead_1016 (NodeSLL_2511531016 head_1016) {
		// Jika SLL kosong
		if (head_1016 == null)
			return null;
		// Pindahkan head ke node berikutnya
		head_1016 = head_1016.next_1016;
		// Return head baru
		return head_1016;
	}
	
	// Fungsi menghapus node terakhir SLL
	public static NodeSLL_2511531016 removeLastNode_1016 (NodeSLL_2511531016 head_1016) {
		// Jika list kosong, return null
		if (head_1016 == null) {
			return null;
		}
		// Jika list satu node, hapus node dan return null
		if (head_1016 == null) {
			return null;
		}
		// Temukan node terakhir ke dua
		NodeSLL_2511531016 secondLast = head_1016;
		while (secondLast.next_1016.next_1016 != null) {
			secondLast = secondLast.next_1016;
		}
		// Hapus node terakhir
		secondLast.next_1016 = null;
		return head_1016;
	}
	
	// Fungsi menghapus node di posisi tertentu
	public static NodeSLL_2511531016 deleteNode_1016 (NodeSLL_2511531016 head_1016, int position_1016) {
		NodeSLL_2511531016 temp_1016 = head_1016;
		NodeSLL_2511531016 prev_1016 = null;
		// Jika linked list null
		if (temp_1016 == null)
			return head_1016;
	    // Kasus 1: head dihapus
	    if (position_1016 == 1) {
	        head_1016 = temp_1016.next_1016;
	        return head_1016;
	        }

	    // Kasus 2: menghapus node di tengah
	    // Telusuri ke node yang dihapus
	    for (int i_1016 = 1; temp_1016 != null && i_1016 < position_1016; i_1016++) {
	         prev_1016 = temp_1016;
	         temp_1016 = temp_1016.next_1016;
	    }

	    // jika ditemukan, hapus node
	    if (temp_1016 != null) {
	         prev_1016.next_1016 = temp_1016.next_1016;
	    } else {
	            System.out.println("Data tidak ada");
	        }
	    return head_1016;
	    }

	    // Fungsi mencetak SLL
	    public static void printList_1016(NodeSLL_2511531016 head_1016) {
	        NodeSLL_2511531016 curr_1016 = head_1016;
	        while (curr_1016.next_1016 != null) {
	            System.out.print(curr_1016.data_1016 + "-->");
	            curr_1016 = curr_1016.next_1016;
	        }
	        System.out.print(curr_1016.data_1016);
	        System.out.println();
	    }

	    // Kelas main
	    public static void main(String[] args) {
	        // Buat SLL 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> null
	        NodeSLL_2511531016 head_1016 = new NodeSLL_2511531016(1);
	        head_1016.next_1016 = new NodeSLL_2511531016(2);
	        head_1016.next_1016.next_1016 = new NodeSLL_2511531016(3);
	        head_1016.next_1016.next_1016.next_1016 = new NodeSLL_2511531016(4);
	        head_1016.next_1016.next_1016.next_1016.next_1016 = new NodeSLL_2511531016(5);
	        head_1016.next_1016.next_1016.next_1016.next_1016.next_1016 = new NodeSLL_2511531016(6);

	        // Cetak list awal
	        System.out.println("List awal: ");
	        printList_1016(head_1016);

	        // Hapus head
	        head_1016 = deleteHead_1016(head_1016);
	        System.out.println("List setelah head dihapus: ");
	        printList_1016(head_1016);

	        // Hapus node terakhir
	        head_1016 = removeLastNode_1016(head_1016);
	        System.out.println("List setelah simpul terakhir dihapus: ");
	        printList_1016(head_1016);

	        // Hapus node di posisi 2
	        int position_1016 = 2;
	        head_1016 = deleteNode_1016(head_1016, position_1016);
	        System.out.println("List setelah posisi 2 dihapus: ");
	        printList_1016(head_1016);
	    }
	}