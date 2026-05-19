package pekan7_2511531016;

public class BubbleSort_2511531016 {
	public static void bubbleSort_1016(int[] arr_1016) {
		int n_1016 = arr_1016.length;
		for (int i_1016 = 0; i_1016 < n_1016; i_1016++) {
			for (int j_1016 = 0; j_1016 < n_1016 - i_1016 - 1; j_1016++) {
				if (arr_1016[j_1016] > arr_1016[j_1016 + 1]) {
					int temp_1016 = arr_1016[j_1016];
					arr_1016[j_1016] = arr_1016[j_1016 + 1];
					arr_1016[j_1016 + 1] = temp_1016;
					// System.out.println("data:"+arr[j]+" "+arr[j+1]);
				}
			}	
		}
	}
	public static void main(String[] args) {
		int arr_1016[] = { 23, 78, 45, 8, 32, 56, 1 };
		int n_1016 = arr_1016.length;
		System.out.print("array yang belum terurut: ");
		for (int i_1016 = 0; i_1016 < n_1016; i_1016++)
			System.out.print(arr_1016[i_1016] + " ");
		System.out.println ("");
		bubbleSort_1016(arr_1016);
		System.out.print("array yang terurut menggunakan BubbleSort: ");
		for (int i_1016 = 0; i_1016 < n_1016; i_1016++)
			System.out.print(arr_1016[i_1016] + " ");
		System.out.println("");
	}
}