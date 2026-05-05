package pekan5_2511531016;

public class TambahSLL_2511531016 {
	public static NodeSLL_2511531016 insertAtFront_1016(NodeSLL_2511531016 head_1016, int value_1016) {
		NodeSLL_2511531016 new_node = new NodeSLL_2511531016(value_1016);
		new_node.next_1016 = head_1016;
		return new_node;
	}
	
	// Fungsi menambahkan node di akhir SLL
	public static NodeSLL_2511531016 insertAtEnd_1016(NodeSLL_2511531016 head_1016, int value_1016) {
		// Buat sebuah node dengan sebuah nilai
		NodeSLL_2511531016 newNode = new NodeSLL_2511531016(value_1016);
		// Jika list kosong  maka node jadi head
		if (head_1016 == null) {
			return newNode;
		}
		// Simpan head ke variabel sementara
		NodeSLL_2511531016 last = head_1016;
		// Telusuri ke node akhir
		while (last.next_1016 != null) {
			last = last.next_1016;
		}
		// Ubah pointer
		last.next_1016 = newNode;
		return head_1016;
	}
	
	static NodeSLL_2511531016 GetNode_1016(int data_1016) {
		return new NodeSLL_2511531016(data_1016);
	}
	
	static NodeSLL_2511531016 insertPos_1016(NodeSLL_2511531016 headNode, int position_1016, int value_1016) {
		NodeSLL_2511531016 head_1016 = headNode;
		if (position_1016 < 1)
			System.out.print ("Invalid position");
		if (position_1016 == 1) {
			NodeSLL_2511531016 new_node = new NodeSLL_2511531016(value_1016);
			new_node.next_1016 = head_1016;
			return new_node;	
		} else {
			while (position_1016-- != 0) {
				if (position_1016 == 1) {
					NodeSLL_2511531016 newNode = GetNode_1016 (value_1016);
					newNode.next_1016 = headNode.next_1016;
					headNode.next_1016 = newNode;
					break;
				}
				headNode = headNode.next_1016;
				}
				if (position_1016 != 1)
					System.out.print("Posisi di luar jangkauan");          
					return head_1016;
		}
	}
	public static void printList_1016 (NodeSLL_2511531016 head_1016) {
		NodeSLL_2511531016 curr_1016 = head_1016;
		while (curr_1016.next_1016 != null) {
			System.out.print(curr_1016.data_1016+"-->");
			curr_1016 = curr_1016.next_1016;
		}
		if (curr_1016.next_1016==null) {
		System.out.print(curr_1016.data_1016);  }
		System.out.println();
		}
		
	public static void main (String[] args) {
		// Buat linked list 2->3->5->6
		NodeSLL_2511531016 head_1016 = new NodeSLL_2511531016(2);
		head_1016.next_1016 = new NodeSLL_2511531016(3);
		head_1016.next_1016.next_1016 = new NodeSLL_2511531016(5);
		head_1016.next_1016.next_1016.next_1016 = new NodeSLL_2511531016(6);
		// Cetak list asli
		System.out.print("Senarai berantai awal:");
		printList_1016 (head_1016);
		// Tambahkan node baru didepan
		System.out.print("tambah 1 simpul di depan: ");
		int data_1016 = 1;
		head_1016 = insertAtFront_1016(head_1016, data_1016);
		// Cetak update list
		printList_1016(head_1016);
		// Tambahkan node baru dibelakang
		System.out.print("tambah 1 simpul di belakang");
		int data2 = 7;
		head_1016 = insertAtEnd_1016 (head_1016, data2);
		// Cetak update list
		printList_1016 (head_1016);
		System.out.print("tambah 1 simpul ke data 4: ");
		int data3 = 4;
		int pos = 4;
		head_1016 = insertPos_1016 (head_1016, pos, data3);
		// Cetak update list
		printList_1016 (head_1016);
	}
}