package pekan3_2511531016;

public class StackArray_2511531016 {
	static final int MAX_1016 = 1000;
	int top_1016;
	int a_1016[] = new int[MAX_1016];
	boolean isEmpty_1016()
	{
		return (top_1016 < 0);
	}
	StackArray_2511531016()
	{
		top_1016 = -1;
	}
	boolean push_1016(int x)
	{
		if (top_1016 >= (MAX_1016 - 1)) {
			System.out.println("Stack Overlow");
			return false;
		}
		else {
			a_1016[++top_1016] = x;
			System.out.println(x + " dimasukkan dalam stack");
			return true;
		}
	}
	int pop_1016()
	{
		if (top_1016 < 0) {
			System.out.println("Stack Underflow");
			return 0;
		}
		else {
			int x = a_1016[top_1016--];
			return x;
		}
	}
	int peek_1016()
	{
		if (top_1016 < 0) {
			System.out.println("Stack Underflow");
			return 0;
		}
		else {
			int x = a_1016[top_1016];
			return x;
		}
	}
	void print () {
	for(int i = top_1016;i>-1;i--) {
		System.out.print(" "+ a_1016[i]);
	}
}
}