package pekan8_2511531016;

public class MergeSort_2511531016 {
    void merge_1016(int arr_1016[], int l_1016, int m_1016, int r_1016) {
        // Find sizes of two subarrays to be merged
        int n1_1016 = m_1016 - l_1016 + 1;
        int n2_1016 = r_1016 - m_1016;
        
        /* Create temp arrays */
        int L_1016[] = new int[n1_1016];
        int R_1016[] = new int[n2_1016];
        
        /* Copy data to temp arrays */
        for (int i_1016 = 0; i_1016 < n1_1016; ++i_1016)
            L_1016[i_1016] = arr_1016[l_1016 + i_1016];

        for (int j_1016 = 0; j_1016 < n2_1016; ++j_1016)
            R_1016[j_1016] = arr_1016[m_1016 + 1 + j_1016];

        int i_1016 = 0, j_1016 = 0;

        // Initial index of merged subarray array
        int k_1016 = l_1016;

        while (i_1016 < n1_1016 && j_1016 < n2_1016) {
            if (L_1016[i_1016] <= R_1016[j_1016]) {
                arr_1016[k_1016] = L_1016[i_1016];
                i_1016++;
            } else {
                arr_1016[k_1016] = R_1016[j_1016];
                j_1016++;
            }
            k_1016++;
        }

        /* Copy remaining elements of L[] if any */
        while (i_1016 < n1_1016) {
            arr_1016[k_1016] = L_1016[i_1016];
            i_1016++;
            k_1016++;
        }

        /* Copy remaining elements of R[] if any */
        while (j_1016 < n2_1016) {
            arr_1016[k_1016] = R_1016[j_1016];
            j_1016++;
            k_1016++;
        }
    }
    
    void sort_1016(int arr_1016[], int l_1016, int r_1016) {
        if (l_1016 < r_1016) {
            // Find the middle point
            int m_1016 = (l_1016 + r_1016) / 2;
            // Sort first and second halves
            sort_1016(arr_1016, l_1016, m_1016);
            sort_1016(arr_1016, m_1016 + 1, r_1016);
            // Merge the sorted halves
            merge_1016(arr_1016, l_1016, m_1016, r_1016);
        }
    }

    /* A utility function to print array of size n */
    static void printArray_1016(int arr_1016[]) {
        int n_1016 = arr_1016.length;
        for (int i_1016 = 0; i_1016 < n_1016; ++i_1016)
            System.out.print(arr_1016[i_1016] + " ");
        System.out.println();
    }

    public static void main(String args[]) {
        int arr_1016[] = {12, 11, 13, 5, 6, 7};

        System.out.println("Sebelum terurut");
        printArray_1016(arr_1016);

        MergeSort_2511531016 ob_1016 = new MergeSort_2511531016();
        ob_1016.sort_1016(arr_1016, 0, arr_1016.length - 1);

        System.out.println("\nSesudah Terurut menggunakan merge Sort");
        printArray_1016(arr_1016);
    }
}