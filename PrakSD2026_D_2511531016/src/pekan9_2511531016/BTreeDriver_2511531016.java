package pekan9_2511531016;

public class BTreeDriver_2511531016 {
	public static void main(String[] args) {
		// Membuat pohon
		BTree_2511531016 tree_1016 = new BTree_2511531016();
		System.out.print("Jumlah Simpul awal pohon: ");
	    System.out.println(tree_1016.countNodes_1016());
	    // Menambahkan simpul data 1
	    Node_2511531016 root_1016 = new Node_2511531016(1);
	    // Menjadikan simpul 1 sebagai root
	    tree_1016.setRoot_1016(root_1016);
	    System.out.println("Jumlah simpul jika hanya ada root: ");
	    System.out.println(tree_1016.countNodes_1016());

	    Node_2511531016 node2 = new Node_2511531016(2);
	    Node_2511531016 node3 = new Node_2511531016(3);
	    Node_2511531016 node4 = new Node_2511531016(4);
	    Node_2511531016 node5 = new Node_2511531016(5);
	    Node_2511531016 node6 = new Node_2511531016(6);
	    Node_2511531016 node7 = new Node_2511531016(7);
	    Node_2511531016 node8 = new Node_2511531016(8);
	    Node_2511531016 node9 = new Node_2511531016(9);

	    root_1016.setLeft_1016(node2);
	    node2.setLeft_1016(node4);
	    node2.setRight_1016(node5);
	    node4.setRight_1016(node8);
	    root_1016.setRight_1016(node3);
	    node3.setLeft_1016(node6);
	    node3.setRight_1016(node7);
	    node6.setLeft_1016(node9);
	    
	    // Set root
	    tree_1016.setCurrent_1016(tree_1016.getRoot_1016());
	    System.out.println("Menampilkan simpul terakhir: ");
	    System.out.println(tree_1016.getCurrent_1016().getData_1016());
	    System.out.println("Jumlah simpul setelah simpul 7 ditambahkan");
	    System.out.println(tree_1016.countNodes_1016());
	    System.out.println("InOrder: ");
	    tree_1016.printInorder_1016();
	    System.out.println("\nPreorder: ");
	    tree_1016.printPreorder_1016();
	    System.out.println("\nPostorder: ");
	    tree_1016.printPostorder_1016();
	    System.out.println("\nMenampilkan simpul dalam bentuk pohon");
	    tree_1016.print_1016();
	}
}