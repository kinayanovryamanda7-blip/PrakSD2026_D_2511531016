package pekan3_2511531016;

public class StackArrayDriver_2511531016 {
	public static void main(String[] args) {
		StackArray_2511531016 s = new StackArray_2511531016();
		s.push_1016(10);
		s.push_1016(20);
		s.push_1016(30);
		System.out.println(s.pop_1016() + " dikeluarkan dari stack");
		System.out.println("Elemen teratas adalah :" + s.peek_1016());
		System.out.print("Element pada stack :");
		s.print();
	}
}