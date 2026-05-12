package pekan6_2511531016;

public class HapusDLL_2511531016 {
	// Fungsi menghapus node awal
	public static NodeDLL_2511531016 delHead_1016 (NodeDLL_2511531016 head_1016) {
		if (head_1016 == null) {
			return null;
		}
			NodeDLL_2511531016 temp_1016 = head_1016;
			head_1016 = head_1016.next_1016;
			if (head_1016 != null) {
				head_1016.prev_1016 = null;
			}
				return head_1016;
			}
	
	// Fungsi menghapus di akhir
	public static NodeDLL_2511531016 delLast_1016 (NodeDLL_2511531016 head_1016) {
		if (head_1016 == null) {
			return null;
		}
		if (head_1016.next_1016 == null) {
			return null;
		}
		NodeDLL_2511531016 curr_1016 = head_1016;
		while (curr_1016.next_1016 != null) {
			curr_1016 = curr_1016.next_1016;
		}
		
		// Update pointer previous node
		if (curr_1016.prev_1016 != null) {
			curr_1016.prev_1016.next_1016 = null;
		}
		return head_1016;
	}
	
	// Fungsi menghapus node posisi tertentu
	public static NodeDLL_2511531016 delPos_1016 (NodeDLL_2511531016 head_1016, int pos_1016) {
	    // Jika DLL kosong
	    if (head_1016 == null) {
	        return head_1016;
	    }
	    NodeDLL_2511531016 curr_1016 = head_1016;
	    // Telusuri sampai ke node yang akan dihapus
	    for (int i_1016 = 1; curr_1016 != null && i_1016 < pos_1016; ++i_1016) {
	        curr_1016 = curr_1016.next_1016;
	    }
	    // Jika posisi tidak ditemukan
	    if (curr_1016 == null) {
	        return head_1016;
	    }
	    // Update pointer
	    if (curr_1016.prev_1016 != null) {
	        curr_1016.prev_1016.next_1016 = curr_1016.next_1016;
	    }
	    if (curr_1016.next_1016 != null) {
	        curr_1016.next_1016.prev_1016 = curr_1016.prev_1016;
	    }
	    // Jika yang dihapus head
	    if (head_1016 == curr_1016) {
	        head_1016 = curr_1016.next_1016;
	    }
	    return head_1016;
	}

	// Fungsi mencetak DLL
	public static void printList_1016 (NodeDLL_2511531016 head_1016) {
	    NodeDLL_2511531016 curr_1016 = head_1016;
	    while (curr_1016 != null) {
	        System.out.print(curr_1016.data_1016 + " ");
	        curr_1016 = curr_1016.next_1016;
	    }
	    System.out.println();
	}
	
	public static void main(String[] args) {
		// Buat sebuah DLL
		NodeDLL_2511531016 head_1016 = new NodeDLL_2511531016(1);
		head_1016.next_1016 = new NodeDLL_2511531016(2);
		head_1016.next_1016.next_1016 = new NodeDLL_2511531016(3);
		head_1016.next_1016.next_1016.prev_1016 = head_1016.next_1016;
		head_1016.next_1016.next_1016.next_1016 = new NodeDLL_2511531016(4);
		head_1016.next_1016.next_1016.next_1016.prev_1016 = head_1016.next_1016.next_1016;
		head_1016.next_1016.next_1016.next_1016.next_1016 = new NodeDLL_2511531016(5);
		head_1016.next_1016.next_1016.next_1016.next_1016.prev_1016 = head_1016.next_1016.next_1016.next_1016;

		System.out.print("DLL Awal: ");
	    printList_1016(head_1016);

	    System.out.print("Setelah head dihapus: ");
	    head_1016 = delHead_1016(head_1016);
	    printList_1016(head_1016);

	    System.out.print("Setelah node terakhir dihapus: ");
	    head_1016 = delLast_1016(head_1016);
	    printList_1016(head_1016);

	    System.out.print("menghapus node ke 2: ");
	    head_1016 = delPos_1016(head_1016, 2);

	    printList_1016(head_1016);
	}
}