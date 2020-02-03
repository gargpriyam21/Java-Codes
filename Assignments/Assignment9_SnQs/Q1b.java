package Assignment9_SnQs;

import Lecture12.DynamicStack;

public class Q1b {

	private DynamicStack sPrimary;
	private DynamicStack sSecondary;

	public Q1b() {
		this.sPrimary = new DynamicStack();
		this.sSecondary = new DynamicStack();
	}

	public int size() {
		return sPrimary.size();
	}

	public boolean isEmpty() {
		return this.size() == 0;
	}

	public void enqueue(int item) throws Exception {

		while (!this.sPrimary.isEmpty()) {
			sSecondary.push(sPrimary.pop());
		}
		this.sPrimary.push(item);
		while (!this.sSecondary.isEmpty()) {
			sPrimary.push(sSecondary.pop());
		}

	}

	public int dequeue() throws Exception {
		if (this.isEmpty()) {
			throw new Exception("Queue Is Empty");
		}
		int retVal = this.sPrimary.pop();
		return retVal;
	}

	public int front() throws Exception {
		if (this.isEmpty()) {
			throw new Exception("Queue Is Empty");
		}
		int retVal = this.sPrimary.pop();
		this.sPrimary.push(retVal);
		return retVal;

	}

	public void display() throws Exception {
		this.sPrimary.display();
	}

}