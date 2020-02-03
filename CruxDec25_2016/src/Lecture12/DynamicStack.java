package Lecture12;

import Lecture11.StackUsingArrays;

public class DynamicStack extends StackUsingArrays {

	public DynamicStack() {
		this(DEFAULT_CAPACITY);
	}

	public DynamicStack(int capacity) {
		super(capacity);
	}

	public void push(int item) throws Exception {
		if (this.size() == this.data.length) {
			int[] temp = new int[2 * this.data.length];
			for (int i = 0; i < this.data.length; i++) {
				temp[i] = this.data[i];
			}
			this.data = temp;
		}
		super.push(item);
	}

}
