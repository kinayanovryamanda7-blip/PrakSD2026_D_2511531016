package pekan8_2511531016;

public class QuickSort_2511531016 {
	static void swap_1016(int[] arr_1016, int i_1016, int j_1016) {
		int temp_1016 = arr_1016[i_1016];
		arr_1016[i_1016] = arr_1016[j_1016];
		arr_1016[j_1016] = temp_1016;
	}
	
	// Metode tambahan untuk mengatur pivot menggunakan Median-of-Three
	static void medianOfThree_1016(int[] arr_1016, int low_1016, int high_1016) {
		int mid_1016 = low_1016 + (high_1016 - low_1016) / 2;
		
		// Urutkan elemen low, mid, dan high
		if (arr_1016[low_1016] > arr_1016[mid_1016]) {
			swap_1016(arr_1016, low_1016, mid_1016);
		}
		if (arr_1016[low_1016] > arr_1016[high_1016]) {
			swap_1016(arr_1016, low_1016, high_1016);
		}
		if (arr_1016[mid_1016] > arr_1016[high_1016]) {
			swap_1016(arr_1016, mid_1016, high_1016);
		}
		swap_1016(arr_1016, mid_1016, high_1016);
	}
	
	static int partition_1016(int[] arr_1016, int low_1016, int high_1016) {
		// Panggil fungsi medianOfThree sebelum menentukan pivot
		medianOfThree_1016 (arr_1016, low_1016, high_1016);
		int pivot_1016 = arr_1016[high_1016]; // Sekarang arr[high] sudah berisi nilai median
		int i_1016 = (low_1016 - 1);
		
		for (int j_1016 = low_1016; j_1016 <= high_1016 - 1; j_1016++) {
			// Jika elemen saat ini lebih kecil dari atau sama dengan pivot
			if (arr_1016[j_1016] < pivot_1016) {
				// Increment indeks elemen yang lebih kecil
				i_1016++;
				swap_1016(arr_1016, i_1016, j_1016);
			}
		}
		swap_1016(arr_1016, i_1016 + 1, high_1016);
		return (i_1016 + 1);
	}
	
	static void quickSort_1016(int[] arr_1016, int low_1016, int high_1016) {
		if (low_1016 < high_1016) {
			int pi_1016 = partition_1016(arr_1016, low_1016, high_1016);
			quickSort_1016(arr_1016, low_1016, pi_1016 - 1);
			quickSort_1016(arr_1016, pi_1016 + 1, high_1016);
		}
	}
	
	public static void printArr_1016(int[] arr_1016) {
		for (int i_1016 = 0; i_1016 < arr_1016.length; i_1016++) {
			System.out.print(arr_1016[i_1016] + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		int[] arr_1016 = {10, 7, 8, 9, 1, 5};
		int N_1016 = arr_1016.length;
		System.out.print("data sebelum diurutkan: ");
		printArr_1016(arr_1016);
		
		quickSort_1016(arr_1016, 0, N_1016 - 1);
		
		System.out.print("data terurut quicksort: ");
		printArr_1016(arr_1016);
	}
}