package pekan8_2511531016;
import java.util.Scanner;

public class Sorting_2511531016 {
    static class Lagu_1016 {
        String judul_1016;
        String penyanyi_1016;
        int durasi_1016;

        public Lagu_1016(String judul_1016, String penyanyi_1016, int durasi_1016) {
            this.judul_1016 = judul_1016;
            this.penyanyi_1016 = penyanyi_1016;
            this.durasi_1016 = durasi_1016;
        }
    }

    static Lagu_1016[] buatDataLagu_1016() {
        return new Lagu_1016[] {
            new Lagu_1016("Sunday Morning", "Maroon 5", 244),
            new Lagu_1016("About You", "The 1975", 326),
            new Lagu_1016("Drop Dead", "Olivia Rodrigo", 224),
            new Lagu_1016("Bukan Orangnya", "Juicy Luicy", 190),
            new Lagu_1016("Monolog", "Pamungkas", 207),
            new Lagu_1016("Dulu Kita Masih Remaja", "The Panasdalam Bank", 189),
            new Lagu_1016("Yang Terdalam", "Noah", 199)
        };
    }

    static void tampilData_1016(Lagu_1016[] dataLagu_1016) {
        for (int i_1016 = 0; i_1016 < dataLagu_1016.length; i_1016++) {
            System.out.println((i_1016 + 1) + ". " + dataLagu_1016[i_1016].judul_1016 + " - " + dataLagu_1016[i_1016].durasi_1016 + " detik");
        }
    }
    
    static void shellSort_1016(Lagu_1016[] dataLagu_1016) {
        int n_1016 = dataLagu_1016.length;
        for (int gap_1016 = n_1016 / 2; gap_1016 > 0; gap_1016 /= 2) {
            for (int i_1016 = gap_1016; i_1016 < n_1016; i_1016++) {
                Lagu_1016 temp_1016 = dataLagu_1016[i_1016];
                int j_1016 = i_1016;
                while (j_1016 >= gap_1016 && dataLagu_1016[j_1016 - gap_1016].judul_1016 .compareToIgnoreCase(temp_1016.judul_1016) > 0) {
                    dataLagu_1016[j_1016] = dataLagu_1016[j_1016 - gap_1016];
                    j_1016 -= gap_1016;
                }
                dataLagu_1016[j_1016] = temp_1016;
            }
        }
    }
    
    static void swap_1016(Lagu_1016[] dataLagu_1016, int i_1016, int j_1016) {
        Lagu_1016 temp_1016 = dataLagu_1016[i_1016];
        dataLagu_1016[i_1016] = dataLagu_1016[j_1016];
        dataLagu_1016[j_1016] = temp_1016;
    }

    static int partition_1016(Lagu_1016[] dataLagu_1016, int low_1016, int high_1016) {
        int pivot_1016 = dataLagu_1016[high_1016].durasi_1016;
        int i_1016 = low_1016 - 1;
        for (int j_1016 = low_1016; j_1016 < high_1016; j_1016++) {
            if (dataLagu_1016[j_1016].durasi_1016 < pivot_1016) {
                i_1016++;
                swap_1016(dataLagu_1016, i_1016, j_1016);
            }
        }
        swap_1016(dataLagu_1016, i_1016 + 1, high_1016);
        return i_1016 + 1;
    }

    static void quickSort_1016(Lagu_1016[] dataLagu_1016, int low_1016, int high_1016) {
        if (low_1016 < high_1016) {
            int pi_1016 = partition_1016(dataLagu_1016, low_1016, high_1016);
            quickSort_1016(dataLagu_1016, low_1016, pi_1016 - 1);
            quickSort_1016(dataLagu_1016, pi_1016 + 1, high_1016);
        }
    }
    
    static void merge_1016(Lagu_1016[] dataLagu_1016, int left_1016, int mid_1016, int right_1016) {
    	int n1_1016 = mid_1016 - left_1016 + 1;
    	int n2_1016 = right_1016 - mid_1016;
    	Lagu_1016[] L_1016 = new Lagu_1016[n1_1016];
        Lagu_1016[] R_1016 = new Lagu_1016[n2_1016];
        for (int i_1016 = 0; i_1016 < n1_1016; i_1016++) {
            L_1016[i_1016] = dataLagu_1016[left_1016 + i_1016];
        }
        for (int j_1016 = 0; j_1016 < n2_1016; j_1016++) {
            R_1016[j_1016] = dataLagu_1016[mid_1016 + 1 + j_1016];
        }
        int i_1016 = 0;
        int j_1016 = 0;
        int k_1016 = left_1016;
        while (i_1016 < n1_1016 && j_1016 < n2_1016) {
            if (L_1016[i_1016].judul_1016.compareToIgnoreCase(R_1016[j_1016].judul_1016) <= 0) {
                dataLagu_1016[k_1016] = L_1016[i_1016];
                i_1016++;
            } else {
                dataLagu_1016[k_1016] = R_1016[j_1016];
                j_1016++;
            }
            k_1016++;
        }
        while (i_1016 < n1_1016) {
            dataLagu_1016[k_1016] = L_1016[i_1016];
            i_1016++;
            k_1016++;
        }
        while (j_1016 < n2_1016) {
            dataLagu_1016[k_1016] = R_1016[j_1016];
            j_1016++;
            k_1016++;
        }
    }

    static void mergeSort_1016(Lagu_1016[] dataLagu_1016, int left_1016, int right_1016) {
        if (left_1016 < right_1016) {
            int mid_1016 = (left_1016 + right_1016) / 2;
            mergeSort_1016(dataLagu_1016, left_1016, mid_1016);
            mergeSort_1016(dataLagu_1016, mid_1016 + 1, right_1016);
            merge_1016(dataLagu_1016, left_1016, mid_1016, right_1016);
        }
    }

    public static void main(String[] args) {
        Scanner input_1016 = new Scanner(System.in);
        Lagu_1016[] dataLagu_1016 = buatDataLagu_1016();
        System.out.println("=== Sorting Playlist NIM: 2511531016 ===");
        System.out.print("Pilih Algoritma (1=Shell, 2=Quick, 3=Merge): ");
        int pilih_1016 = input_1016.nextInt();
        System.out.println("\nData Sebelum Sorting:");
        tampilData_1016(dataLagu_1016);

        switch (pilih_1016) {
        
        case 1:
            shellSort_1016(dataLagu_1016);
            System.out.println("\nData Setelah Shell Sort (Judul A-Z):");
            tampilData_1016(dataLagu_1016);
            break;
            
        case 2:
            quickSort_1016(dataLagu_1016, 0, dataLagu_1016.length - 1);
            System.out.println("\nData Setelah Quick Sort (Durasi Asc):");
            tampilData_1016(dataLagu_1016);
            break;
            
        case 3:
            mergeSort_1016(dataLagu_1016, 0, dataLagu_1016.length - 1);
            System.out.println("\nData Setelah Merge Sort (Judul A-Z):");
            tampilData_1016(dataLagu_1016);
            break;
            
        default:
            System.out.println("\nPilihan tidak valid!");
        }
    input_1016.close();
    }
}