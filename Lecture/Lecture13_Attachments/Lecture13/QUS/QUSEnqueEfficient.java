package Lecture13.QUS;

import lecture12.DynamicStack;

public class QUSEnqueEfficient {

	private DynamicStack sPrimary;
	private DynamicStack sSecondary;

	public QUSEnqueEfficient() {
		this.sPrimary = new DynamicStack();
		this.sSecondary = new DynamicStack();
	}

	public int size() {
		return this.sPrimary.size();
	}

	public boolean isEmpty() {
		return this.size() == 0;
	}

	public void enqueue(int item) throws Exception {
		this.sPrimary.push(item);
	}

	public int dequeue() throws Exception {

		if (this.isEmpty()) {
			throw new Exception("Queue is Empty");
		}

		while (this.sPrimary.size() != 1) {
			sSecondary.push(sPrimary.pop());
		}
		int item = sPrimary.pop();

		while (!this.sSecondary.isEmpty()) {
			this.sPrimary.push(sSecondary.pop());
		}

		return item;
	}

	public int front() throws Exception {
		if (this.isEmpty()) {
			throw new Exception("Queue is Empty");
		}

		while (this.sPrimary.size() != 1) {
			sSecondary.push(sPrimary.pop());
		}
		int item = sPrimary.pop();
		this.sSecondary.push(item);

		while (!this.sSecondary.isEmpty()) {
			this.sPrimary.push(sSecondary.pop());
		}

		return item;
	}

	public void display() throws Exception {
		reverseStack(sPrimary, sSecondary, 0);
		this.sPrimary.display();
		reverseStack(sPrimary, sSecondary, 0);
	}

	private void reverseStack(DynamicStack stack, DynamicStack helper, int idx) throws Exception {
		if (stack.isEmpty()) {
			return;
		}

		int item = stack.pop();
		reverseStack(stack, helper, idx + 1);
		helper.push(item);
		if (idx == 0) {
			while (!helper.isEmpty()) {
				stack.push(helper.pop());
			}
		}

	}

}
