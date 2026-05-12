package pekan6_2511531016;

public class InsertDLL_2511531016 {
	// Menambahkan node di awal DLL
	static NodeDLL_2511531016 insertBegin_1016 (NodeDLL_2511531016 head_1016, int data_1016) {
		// Buat node baru
		NodeDLL_2511531016 new_node = new NodeDLL_2511531016 (data_1016);
		// Jadikan pointer nextnya head
		new_node.next_1016 = head_1016;
		// Jadikan pointer prev head ke new_node
		if (head_1016 != null) {
			head_1016.prev_1016 = new_node;
		}
		return new_node;
	}
	
	// Fungsi menambahkan node di akhir
	public static NodeDLL_2511531016 insertEnd_1016 (NodeDLL_2511531016 head_1016, int newData_1016) {
		// Buat node baru
		NodeDLL_2511531016 newNode = new NodeDLL_2511531016 (newData_1016);
		// Jika d11 null jadikan head
		if (head_1016 == null) {
			head_1016 = newNode;
		}
		else {
			NodeDLL_2511531016 curr_1016 = head_1016;
			while (curr_1016.next_1016 != null) {
				curr_1016 = curr_1016.next_1016;
			}
				curr_1016.next_1016 = newNode;
				newNode.prev_1016 = curr_1016;
			}
			return head_1016;
		}

	// Fungsi menambahkan node di posisi tertentu
	public static NodeDLL_2511531016 insertAtPosition_1016 (NodeDLL_2511531016 head_1016, int pos_1016, int new_data) {
		// Buat node baru
		NodeDLL_2511531016 new_node = new NodeDLL_2511531016 (new_data);
		if (pos_1016 == 1) {
			new_node.next_1016 = head_1016;
			if (head_1016 != null) {
				head_1016.prev_1016 = new_node;
			}
			head_1016 = new_node;
			return head_1016;
			}
			NodeDLL_2511531016 curr_1016 = head_1016;
		for (int i_1016 = 1; i_1016 < pos_1016 - 1 && curr_1016 != null; ++i_1016) {
			curr_1016 = curr_1016.next_1016;
			}
			if (curr_1016 == null) {
				System.out.println ("Posisi tidak ada");
				return head_1016;
			}
			new_node.prev_1016 = curr_1016;
			new_node.next_1016 = curr_1016.next_1016;
			curr_1016 .next_1016 = new_node;
			if (new_node.next_1016 != null) {
				new_node.next_1016.prev_1016 = new_node;
			}
			return head_1016;
		}
	
	public static void printList_1016 (NodeDLL_2511531016 head_1016) {
		NodeDLL_2511531016 curr_1016 = head_1016;
		while (curr_1016 != null) {
			System.out.print(curr_1016.data_1016 + " <-> ");
			curr_1016 = curr_1016.next_1016;
		}
		System.out.println();
	}
		
	public static void main(String[] args) {
		// Membuat d11 2 <-> 3 <-> 5
		NodeDLL_2511531016 head_1016 = new NodeDLL_2511531016(2);
		head_1016.next_1016 = new NodeDLL_2511531016(3);
		head_1016.next_1016.prev_1016 = head_1016;
		head_1016.next_1016.next_1016 = new NodeDLL_2511531016(5);
		head_1016.next_1016.next_1016.prev_1016 = head_1016.next_1016;
		// Cetak DLL awal
		System.out.print("DLL Awal: ");
		printList_1016(head_1016);
		// Tambah 1 di awal
		head_1016 = insertBegin_1016(head_1016, 1);
		System.out.print("Simpul 1 ditambah di awal: ");
		printList_1016(head_1016);
		// Tambah 6 di akhir
		System.out.print("Simpul 6 ditambah di akhir: ");
		int data_1016 = 6;
		head_1016 = insertEnd_1016(head_1016, data_1016);
		printList_1016(head_1016);
		// Menambah node 4 di posisi 4
		System.out.print("Tambah node 4 di posisi 4: ");
		int data2 = 4;
		int pos_1016 = 4;
		head_1016 = insertAtPosition_1016(head_1016, pos_1016, data2);
		printList_1016(head_1016);
		}
	}