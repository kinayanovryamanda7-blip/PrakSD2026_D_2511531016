package pekan4_2511531016;

public class QueueArrayDriver_2511531016 {
	public static void main(String[] args) {
		QueueArray_2511531016 queue = new QueueArray_2511531016(1000);
		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30);
		queue.enqueue(40);
		System.out.println("Item di depan " + queue.front_1016());
		System.out.println("Item paling belakang " + queue.rear_1016());
		System.out.println("tampilan queue");
		queue.display_1016();
		System.out.println();
		System.out.println(queue.dequeue_1016() + " dihapus dari queue");
		System.out.println("Item di depan " + queue.front_1016());
		System.out.println("Item paling belakang " + queue.rear_1016());
		System.out.println("tampilan queue setelah satu data dihapus");
		queue.display_1016();
	}
}