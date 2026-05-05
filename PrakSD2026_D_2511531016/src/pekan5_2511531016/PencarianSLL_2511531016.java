package pekan5_2511531016;

public class PencarianSLL_2511531016 {
	static boolean searchKey_1016 (NodeSLL_2511531016 head_1016, int key_1016) {
		NodeSLL_2511531016 curr_1016 = head_1016;
		while (curr_1016 != null) {
			if (curr_1016.data_1016 == key_1016)
				return true;
			curr_1016 = curr_1016.next_1016;
			}
		return false;
		}
	
	public static void traversal_1016 (NodeSLL_2511531016 head_1016) {
		// Mulai dari head
		NodeSLL_2511531016 curr_1016 = head_1016;
		// Telusuri sampai pointer null
		while (curr_1016 != null)  {
			System.out.print(" " + curr_1016.data_1016);
			curr_1016 = curr_1016.next_1016;
			}
		System.out.println();
		}
	
	public static void main (String[] args) {
		NodeSLL_2511531016 head_1016 = new NodeSLL_2511531016(14);
		head_1016.next_1016 = new NodeSLL_2511531016(21);
		head_1016.next_1016.next_1016 = new NodeSLL_2511531016(13);
		head_1016.next_1016.next_1016.next_1016 = new NodeSLL_2511531016(30);
		head_1016.next_1016.next_1016.next_1016.next_1016 = new NodeSLL_2511531016(10);
		System.out.print ("Penelusuran SLL : ") ;
		traversal_1016 (head_1016);
		// Data yang akan dicari
		int key_1016 = 30;
		System.out.print("cari data " + key_1016 + "  =  ");
		if (searchKey_1016(head_1016, key_1016))
			System.out.println("ketemu");
		else
			System.out.println("tidak ada");	
	}
}