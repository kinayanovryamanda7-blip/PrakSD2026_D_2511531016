package pekan9_2511531016;

public class BTree_2511531016 {
	private Node_2511531016 root_1016;
	private Node_2511531016 currentNode_1016;
	public BTree_2511531016() {
		root_1016 = null;
	}
	public boolean search_1016(int data_1016) {
		return search_1016(root_1016, data_1016);
	}
	private boolean search_1016(Node_2511531016 node_1016, int data_1016) {
		if (node_1016.getData_1016() == data_1016)
			return true;
		if (node_1016.getLeft_1016() != null)
			if (search_1016(node_1016.getLeft_1016(), data_1016))
				return true;
		if (node_1016.getRight_1016() != null)
			if (search_1016(node_1016.getRight_1016(), data_1016))
				return true;
		return false;
	}
	public void printInorder_1016() {
		root_1016.printInorder_1016(root_1016);
	}
	public void printPreorder_1016() {
		root_1016.printPreorder_1016(root_1016);
	}
	public void printPostorder_1016() {
		root_1016.printPostorder_1016(root_1016);
	}
	public Node_2511531016 getRoot_1016() {
		return root_1016;
	}
	public boolean isEmpty() {
		return root_1016 == null;
	}
	public int countNodes_1016() {
		return countNodes_1016(root_1016);
	}
	private int countNodes_1016(Node_2511531016 node_1016) {
		int count_1016 = 1;
		if (node_1016 == null) {
			return 0;
		} else {
			count_1016 += countNodes_1016(node_1016.getLeft_1016());
			count_1016 += countNodes_1016(node_1016.getRight_1016());
			return count_1016;
		}
	}
	public void print_1016() {
		root_1016.print();
	}
	public Node_2511531016 getCurrent_1016() {
		return currentNode_1016;
	}
	public void setCurrent_1016(Node_2511531016 node_1016) {
		this.currentNode_1016 = node_1016;
	}
	public void setRoot_1016(Node_2511531016 root_1016) {
		this.root_1016 = root_1016;
	}
}