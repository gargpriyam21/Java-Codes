package Lecture13;

import Lecture12.DynamicStack;

public class QueuesUsingStacks {
	private DynamicStack sPrimary;
	private DynamicStack sSecondary;

	public QueuesUsingStacks() {
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
		this.sPrimary.push(item);
	}

	public int dequeue() throws Exception {
		if (this.isEmpty()) {
			throw new Exception("Queue Is Empty");
		}

		while (this.sPrimary.size() != 1) {
			sSecondary.push(sPrimary.pop());
		}
		int retVal = sPrimary.pop();
		while (!this.sSecondary.isEmpty()) {
			sPrimary.push(sSecondary.pop());
		}
		return retVal;
	}

	public int front() throws Exception {
		if (this.isEmpty()) {
			throw new Exception("Queue Is Empty");
		}

		while (this.sPrimary.size() != 1) {
			sSecondary.push(sPrimary.pop());
		}
		int retVal = sPrimary.pop();
		this.sSecondary.push(retVal);
		while (!this.sSecondary.isEmpty()) {
			sPrimary.push(sSecondary.pop());
		}
		return retVal;

	}

	public void display() throws Exception {
		Reverse(sPrimary, sSecondary, 0);
		this.sPrimary.display();
		Reverse(sPrimary, sSecondary, 0);
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
