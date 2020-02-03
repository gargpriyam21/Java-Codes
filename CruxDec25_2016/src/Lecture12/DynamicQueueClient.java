package Lecture12;

import Lecture11.QueueUsingArrays;

public class DynamicQueueClient {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		DynamicQueue queue = new DynamicQueue();
		for (int i = 1; i <= 5; i++) {
			queue.enqueue(i);
			displayQueueInfo(queue);
		}
		// queue.dequeue();
		// queue.dequeue();
		// displayQueueInfo(queue);
		// queue.enqueue(60);
		// queue.enqueue(70);
		// displayQueueInfo(queue);
		for (int i = 1; i <= 5; i++) {
			queue.enqueue(i * 10);
			displayQueueInfo(queue);
		}

		// while (!queue.isEmpty()) {
		// System.out.println(queue.front());
		// System.out.println(queue.size());
		// queue.dequeue();
		// displayQueueInfo(queue);
		// }
		// queue.dequeue();
		queue.display();
		ReverseQueue(queue);
		System.out.println("*************");
		queue.display();

	}

	public static void displayQueueInfo(QueueUsingArrays queue) throws Exception {
		System.out.println("************************");
		queue.display();
		System.out.println(queue.size());
		System.out.println(queue.isEmpty());
		System.out.println("************************");
	}

	public static void ReverseQueue(DynamicQueue queue) throws Exception {
		if (queue.isEmpty()) {
			return;
		}
		int item = queue.dequeue();
		ReverseQueue(queue);
		queue.enqueue(item);
	}

}
