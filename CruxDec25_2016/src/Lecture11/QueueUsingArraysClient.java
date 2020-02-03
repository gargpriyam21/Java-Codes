package Lecture11;

public class QueueUsingArraysClient {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		QueueUsingArrays queue = new QueueUsingArrays(5);

		for (int i = 1; i <= 5; i++) {
			queue.enqueue(i);
			displayQueueInfo(queue);
		}
		queue.dequeue();
		displayQueueInfo(queue);
		queue.enqueue(20);
		displayQueueInfo(queue);
		while (!queue.isEmpty()) {
			System.out.println(queue.front());
			System.out.println(queue.size());
			queue.dequeue();
			displayQueueInfo(queue);
		}
		queue.enqueue(30);
		displayQueueInfo(queue);
		//queue.dequeue();
		
	}

	public static void displayQueueInfo(QueueUsingArrays queue) throws Exception {
		System.out.println("************************");
		queue.display();
		System.out.println(queue.size());
		System.out.println(queue.isEmpty());
		System.out.println("************************");
	}

}
