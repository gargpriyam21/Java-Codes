package Assignment9_SnQs;

import Lecture12.DynamicQueue;

public class Q2a {

	private DynamicQueue qPrimary;
	private DynamicQueue qSecondary;

	public Q2a() {
		this.qPrimary = new DynamicQueue();
		this.qSecondary = new DynamicQueue();
	}

	public int size() {
		return qPrimary.size();
	}

	public boolean isEmpty() {
		return this.size() == 0;
	}

	public void push(int item) throws Exception {
		this.qPrimary.enqueue(item);
	}

	public int pop() throws Exception {
		if (this.size() == 0) {
			throw new Exception("Stack Is Empty");
		}
		while (this.qPrimary.size() != 1) {
			qSecondary.enqueue(qPrimary.dequeue());
		}
		int retVal = qPrimary.dequeue();
		DynamicQueue temp = qPrimary;
		qPrimary = qSecondary;
		qSecondary = temp;

		return retVal;
	}

	public int top() throws Exception {
		if (this.size() == 0) {
			throw new Exception("Stack Is Empty");
		}
		while (this.qPrimary.size() != 1) {
			qSecondary.enqueue(qPrimary.dequeue());
		}
		int retVal = qPrimary.dequeue();
		qSecondary.enqueue(retVal);
		DynamicQueue temp = qPrimary;
		qPrimary = qSecondary;
		qSecondary = temp;
		return retVal;
	}

	public void display() throws Exception {
		ReverseQueue(qPrimary);
		this.qPrimary.display();
		ReverseQueue(qPrimary);

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
