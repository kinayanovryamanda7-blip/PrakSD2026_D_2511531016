package pekan9_2511531016;

public class Node_2511531016 {
	int data_1016;
	Node_2511531016 left_1016;
	Node_2511531016 right_1016;
	
	public Node_2511531016(int data_1016) {
		this.data_1016 = data_1016;
		left_1016 = null;
		right_1016 = null;
	}
	public void setLeft_1016(Node_2511531016 node_1016) {
		if (left_1016 == null)
			left_1016 = node_1016;
	}
	public void setRight_1016(Node_2511531016 node_1016) {
		if (right_1016 == null)
			right_1016 = node_1016;
	}
	public Node_2511531016 getLeft_1016() {
		return left_1016;
	}
	public Node_2511531016 getRight_1016() {
		return right_1016;
	}
	public int getData_1016() {
		return data_1016;
	}
	public void setData_1016(int data_1016) {
		this.data_1016 = data_1016;
	}
	
	void printPreorder_1016(Node_2511531016 node_1016) {
		if (node_1016 == null)
			return;
		System.out.print(node_1016.data_1016 + " ");
		printPreorder_1016(node_1016.left_1016);
		printPreorder_1016(node_1016.right_1016);
	}
	void printPostorder_1016(Node_2511531016 node_1016) {
		if (node_1016 == null)
			return;
		printPostorder_1016(node_1016.left_1016);
		printPostorder_1016(node_1016.right_1016);
		System.out.print(node_1016.data_1016 + " ");
	}
	void printInorder_1016(Node_2511531016 node_1016) {
		if (node_1016 == null)
			return;
		printInorder_1016(node_1016.left_1016);
		System.out.print(node_1016.data_1016 + " ");
		printInorder_1016(node_1016.right_1016);
	}
	public String print() {
		return this.print("",true,"");
	}
	public String print(String prefix_1016, boolean isTail_1016, String sb_1016) {
		if (right_1016 != null) {
			right_1016.print(prefix_1016 + (isTail_1016 ? "|  " : "   "), false, sb_1016);
		}
		System.out.println(prefix_1016+(isTail_1016 ? "\\-- " : "/--")+data_1016);
		if (left_1016 != null) {
			left_1016.print(prefix_1016+(isTail_1016 ? "   " : "|   "), true, sb_1016);
		}
		return sb_1016;
	}
}