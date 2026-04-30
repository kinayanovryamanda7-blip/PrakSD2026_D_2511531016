package pekan4_2511531016;
import java.util.Stack;

public class AntrianLoket_2511531016 {
    String queue_1016[];
    int front_1016, rear_1016, max_1016;

    public AntrianLoket_2511531016(int kapasitas) {
        max_1016 = kapasitas;
        queue_1016 = new String[max_1016];
        front_1016 = -1;
        rear_1016 = -1;
    }

    public boolean isEmpty_1016() {
        return (front_1016 == -1);
    }

    public boolean isFull_1016() {
        return (rear_1016 == max_1016 - 1);
    }

    public void enqueue_1016(String data_1016) {
        if (isFull_1016()) {
            System.out.println("Antrian penuh!");
            return;
        }
        if (isEmpty_1016()) {
            front_1016 = 0;
        }
        rear_1016++;
        queue_1016[rear_1016] = data_1016;
        System.out.println("Data berhasil ditambahkan ke antrian");
    }

    public void dequeue_1016() {
        if (isEmpty_1016()) {
            System.out.println("Antrian kosong!");
            return;
        }
        System.out.println(queue_1016[front_1016] + " telah dilayani");
        front_1016++;

        if (front_1016 > rear_1016) {
            front_1016 = rear_1016 = -1;
        }
    }

    public void display_1016() {
        if (isEmpty_1016()) {
            System.out.println("Antrian kosong");
            return;
        }
        System.out.println("Isi antrian:");
        for (int i_1016 = front_1016; i_1016 <= rear_1016; i_1016++) {
            System.out.println((i_1016 - front_1016 + 1) + ". " + queue_1016[i_1016]);
        }
    }

    public void reverse_1016() {
        if (isEmpty_1016()) {
            System.out.println("Antrian kosong");
            return;
        }

        Stack<String> stack_1016 = new Stack<>();

        for (int i_1016 = front_1016; i_1016 <= rear_1016; i_1016++) {
            stack_1016.push(queue_1016[i_1016]);
        }

        int i_1016 = front_1016;
        while (!stack_1016.isEmpty()) {
            queue_1016[i_1016++] = stack_1016.pop();
        }

        System.out.println("Antrian berhasil dibalik");
    }
}