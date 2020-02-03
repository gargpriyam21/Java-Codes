package lecture12;

import Lecture11.QueueUsingArrays;

public class DynamicQueue extends QueueUsingArrays {

	public DynamicQueue() {
		this(DEFAULT_CAPACITY);
	}

	public DynamicQueue(int capacity) {
		super(capacity);
	}

	public void enqueue(int item) throws Exception {
		if (this.size() == this.data.length) {
			int[] temp = new int[2 * this.data.length];
			for (int i = 0; i < this.data.length; i++) {
				temp[i] = this.data[(this.front + i) % this.data.length];

			}
			this.data = temp;
			this.front = 0;
		}

		super.enqueue(item);
	}
}
