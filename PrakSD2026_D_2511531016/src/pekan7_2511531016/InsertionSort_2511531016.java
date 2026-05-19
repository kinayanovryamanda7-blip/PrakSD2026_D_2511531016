package pekan7_2511531016;

public class InsertionSort_2511531016 {
	public static void insertionSort_1016(int[] arr_1016) {
		int n_1016 = arr_1016.length;
		for (int i_1016 = 1; i_1016 < n_1016; i_1016++) {
			int key_1016 = arr_1016[i_1016];
			int j_1016 = i_1016 - 1;
			while (j_1016 >= 0 && arr_1016[j_1016] > key_1016) {
				arr_1016[j_1016 + 1] = arr_1016[j_1016];
				j_1016--;
			}
			arr_1016[j_1016 + 1] = key_1016;
		}
	}
	public static void main(String[] args) {
		int arr_1016[] = { 23, 78, 45, 8, 32, 56, 1 };
		int n_1016 = arr_1016.length;
		System.out.printf("array yang belum terurut:\n");
		for (int i_1016 = 0; i_1016 < n_1016; i_1016++)
			System.out.print(arr_1016[i_1016] + " ");
		System.out.println ("");
		insertionSort_1016(arr_1016);
		System.out.printf("array yang terurut:\n");
		for (int i_1016 = 0; i_1016 < n_1016; i_1016++)
			System.out.print(arr_1016[i_1016] + " ");
		System.out.println("");
	}
}