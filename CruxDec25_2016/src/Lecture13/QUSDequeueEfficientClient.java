package Lecture13;

public class QUSDequeueEfficientClient {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		// TODO Auto-generated method stub
		QUSDequeueEfficient queue = new QUSDequeueEfficient();
		for (int i = 1; i <= 5; i++) {
			queue.enqueue(i);
			displayQueueInfo(queue);
		}
		queue.dequeue();
		// queue.dequeue();
		displayQueueInfo(queue);
		queue.enqueue(60);
		// queue.enqueue(70);
		displayQueueInfo(queue);
		// for (int i = 1; i <= 5; i++) {
		// queue.enqueue(i * 10);
		// displayQueueInfo(queue);
		// }

		while (!queue.isEmpty()) {
			System.out.println(queue.front());
			System.out.println(queue.size());
			queue.dequeue();
			displayQueueInfo(queue);
		}
		// queue.dequeue();

	}

	public static void displayQueueInfo(QUSDequeueEfficient queue) throws Exception {
		System.out.println("************************");
		queue.display();
		System.out.println(queue.size());
		System.out.println(queue.isEmpty());
		System.out.println("************************");
	}
}
