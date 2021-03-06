package Lecture11;

public class StackUsingArrays {

	protected int[] data;
	protected int tos;

	public static final int DEFAULT_CAPACITY = 10;

	public StackUsingArrays() {
		this(DEFAULT_CAPACITY);
	}

	public StackUsingArrays(int capacity) {
		if (capacity < 1) {
			System.out.println("Invalid Input");
			return;
		}
		this.data = new int[capacity];
		this.tos = -1;
	}

	public int size() {
		return this.tos + 1;
	}

	public boolean isEmpty() {
		if (this.size() == 0) {
			return true;
		} else {
			return false;
		}
	}

	public void push(int item) throws Exception {
		if (this.size() == this.data.length) {
			throw new Exception("Overlapping");
		} else {
			this.tos++;
			this.data[tos] = item;
		}
	}

	public int pop() throws Exception {
		if (this.size() == 0) {
			throw new Exception("Stack Is Empty");
		}
		int retVal = this.data[tos];
		this.data[tos] = 0;
		this.tos--;
		return retVal;
	}

	public int top() throws Exception {
		if (this.size() == 0) {
			throw new Exception("Stack Is Empty");
		}
		int retVal = this.data[tos];
		return retVal;
	}

	public void display() {
		if (this.size() == 0) {
			System.out.println("Stack is empty");
			return;
		} else {
			for (int i = tos; i >= 0; i--) {
				System.out.print(this.data[i] + " ");
			}
			System.out.println("END");
		}
	}
}
