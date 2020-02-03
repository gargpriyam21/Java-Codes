package lecture12;

import Lecture11.QueueUsingArrays;

public class DynamicQueueClient {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		QueueUsingArrays queue = new DynamicQueue();
		for (int i = 1; i <= 5; i++) {
			queue.enqueue(i);
			displayQueueInfo(queue);
		}
		queue.dequeue();
		queue.dequeue();
		queue.enqueue(30);
		queue.enqueue(40);
		displayQueueInfo(queue);
		queue.enqueue(100);
		displayQueueInfo(queue);
		while (!queue.isEmpty()) {
			System.out.println(queue.front());
			System.out.println(queue.size());
			queue.dequeue();
			displayQueueInfo(queue);

		}

		// Part - Show Exception
		// queue.dequeue();

	}

	public static void displayQueueInfo(QueueUsingArrays queue) throws Exception {
		System.out.println("*******************************");
		queue.display();
		System.out.println(queue.size());
		System.out.println(queue.isEmpty());
		System.out.println("*******************************");

	}
}
