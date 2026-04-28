package pekan4_2511531016;

public class QueueArray_2511531016 {
	int front_1016, rear_1016, size_1016;
	int capacity_1016;
	int array_1016[];
	
	public QueueArray_2511531016(int capacity) {
		this.capacity_1016 = capacity;
		front_1016 = this.size_1016 = 0;
		rear_1016 = capacity - 1;
		array_1016 = new int[this.capacity_1016];
	}
	
	boolean isFull_2511531016(QueueArray_2511531016 queue) {
		return (queue.size_1016 == queue.capacity_1016);
	}
	
	boolean isEmpty(QueueArray_2511531016 queue) {
		return (queue.size_1016 == 0);
	}
	
	void enqueue(int item) {
		if (isFull_2511531016(this))
			return;
		this.rear_1016 = (this.rear_1016 +1) % this.capacity_1016;
		this.array_1016[this.rear_1016]= item;
		this.size_1016 = this.size_1016 + 1;
		System.out.println(item + "enqueue to queue");
	}

	int dequeue_1016() {
		if (isEmpty(this))
			return Integer.MIN_VALUE;
		int item = this.array_1016[this.front_1016];
		this.front_1016 = (this.front_1016 + 1) % this.capacity_1016;
		this.size_1016 = this.size_1016 - 1;
		return item;
	}
	
	int front_1016() {
		if (isEmpty(this))
			return Integer.MIN_VALUE;
		return this.array_1016[this.front_1016];
	}
	
	int rear_1016() {
		if (isEmpty(this))
			return Integer.MIN_VALUE;
		return this.array_1016[this.rear_1016];
	}
	
	// Mencetak elemen antrian
	void display_1016() {
		int i;
		if (front_1016 == rear_1016) {
			System.out.printf("\nAntrian Kosong\n");
			return;
		}
		
	// Kunjungi dari belakang dan cetak
		for (i = front_1016; i < rear_1016; i++) {
			System.out.printf(" %d <-- ", array_1016[i]);
		}
		return;
	}
}