package Lecture13;

import Lecture12.DynamicStack;

public class QUSDequeueEfficient {
	private DynamicStack sPrimary;
	private DynamicStack sSecondary;

	public QUSDequeueEfficient() {
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
		// Reverse(sPrimary, sSecondary, 0);
		this.sPrimary.display();
		// Reverse(sPrimary, sSecondary, 0);
	}

	private void Reverse(DynamicStack stack, DynamicStack helper, int idx) throws Exception {
		if (stack.isEmpty()) {
			return;
		}
		int item = stack.pop();
		Reverse(stack, helper, idx + 1);
		helper.push(item);
		if (idx == 0) {
			while (!helper.isEmpty()) {
				stack.push(helper.pop());
			}
		}
	}

}
