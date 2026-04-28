package pekan4_2511531016;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class IterasiQueue_2511531016 {
	public static void main(String[] args) {
		Queue<String> q_1016 = new LinkedList<>();
		q_1016.add("Praktikum");
		q_1016.add("Struktur");
		q_1016.add("Data");
		q_1016.add("Dan");
		q_1016.add("Algoritma");
		Iterator<String> iterator = q_1016.iterator();
		while (iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}
	}
}