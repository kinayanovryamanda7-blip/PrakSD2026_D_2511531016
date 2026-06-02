package pekan8_2511531016;

public class ShellSort_2511531016 {
	public static void shellSort_1016(int[] A_1016) {
		int n_1016 = A_1016.length;
		int gap_1016 = n_1016 / 2;
		while (gap_1016 > 0) {
			for (int i_1016 = gap_1016; i_1016 < n_1016; i_1016++) {
				int temp_1016 = A_1016[i_1016];
				int j_1016 = i_1016;
				while (j_1016 >= gap_1016 && A_1016[j_1016 - gap_1016] > temp_1016) {
					A_1016[j_1016] = A_1016[j_1016 - gap_1016];
					j_1016 = j_1016 - gap_1016;
				}
				 A_1016[j_1016] = temp_1016;
			}
			gap_1016 = gap_1016 / 2;
		}
	}
	public static void main(String[] args) {
		int[] data_1016 = {3, 10, 4, 6, 8, 9, 7, 2, 1, 5};
		System.out.print("Sebelum: ");
		printArray_1016(data_1016);
		
		shellSort_1016(data_1016);
		
		System.out.print("Sesudah (Shell Sort): ");
		printArray_1016(data_1016);
	}
	
	public static void printArray_1016(int[] arr_1016) {
		for (int i_1016 : arr_1016) System.out.print(i_1016 + " ");
		System.out.println();
	}
}