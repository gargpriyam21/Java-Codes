package Assignment9_SnQs;

import Lecture12.DynamicQueue;

public class Q2b {
	private DynamicQueue qPrimary;
	private DynamicQueue qSecondary;

	public Q2b() {
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
		this.qSecondary.enqueue(item);

		while (!this.qPrimary.isEmpty()) {
			qSecondary.enqueue(qPrimary.dequeue());
		}
		DynamicQueue temp = qPrimary;
		qPrimary = qSecondary;
		qSecondary = temp;
	}

	public int pop() throws Exception {
		if (this.size() == 0) {
			throw new Exception("Stack Is Empty");
		}

		int retVal = qPrimary.dequeue();

		return retVal;
	}

	public int top() throws Exception {
		if (this.size() == 0) {
			throw new Exception("Stack Is Empty");
		}
		int retVal = qPrimary.dequeue();
		this.push(retVal);

		return retVal;
	}

	public void display() throws Exception {
		this.qPrimary.display();
	}

}
