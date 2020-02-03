package Assignment9_SnQs;

public class Q5 {
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
	}

	private Q2a stack1;
	private Q2b stack2;

	public Q5() {
		stack1 = new Q2a();
		stack2 = new Q2b();
	}

	public int size() {
		return stack2.size();
	}

	public boolean isEmpty() {
		return this.size() == 0;
	}

	public void push(int item) throws Exception {
		this.stack1.push(item);
	}

	public int pop() throws Exception {
		return this.stack2.pop();
	}

	public int getMinimum() throws Exception {
		int value = Integer.MAX_VALUE;
		while (this.size() == 0) {
			int v1 = this.pop();
			value = value < v1 ? value : v1;
			this.push(v1);
		}
		return value;
	}
}
