package Lecture13.QUS;

import Lecture11.QueueUsingArrays;
import lecture12.DynamicQueue;

public class Client {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		QUSEnqueEfficient queue = new QUSEnqueEfficient();
		for (int i = 1; i <= 5; i++) {
			queue.enqueue(i);
			displayQueueInfo(queue);
		}
		while (!queue.isEmpty()) {
			System.out.println(queue.front());
			System.out.println(queue.size());
			queue.dequeue();
			displayQueueInfo(queue);

		}

		// Part - Show Exception
		// queue.dequeue();

	}

	public static void displayQueueInfo(QUSEnqueEfficient queue) throws Exception {
		System.out.println("*******************************");
		queue.display();
		System.out.println(queue.size());
		System.out.println(queue.isEmpty());
		System.out.println("*******************************");

	}

}
