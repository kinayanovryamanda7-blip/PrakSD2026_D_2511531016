package pekan4_2511531016;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseData_251151016 {
	public static void main(String[] args) {
		Queue<Integer> q_1016 = new LinkedList<>();
		q_1016.add(1);
		q_1016.add(2);
		q_1016.add(3); // [1, 2, 3]
		System.out.println("Sebelum reverse" + q_1016);
		Stack<Integer> s_1016 = new Stack<Integer>();
		while (!q_1016.isEmpty()) { // Q -> S
			s_1016.push(q_1016.remove());
		}
		while (!s_1016.isEmpty()) { // S -> Q
			q_1016.add(s_1016.pop());
		}
		System.out.println("Sesudah reverse= " + q_1016); // [3, 2, 1]
	}
}