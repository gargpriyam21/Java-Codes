package Assignment10_LinkedList;

public class LinkedList {
	private class Node {
		int data;
		Node next;

		public Node(int data, Node next) {
			this.data = data;
			this.next = next;
		}
	}

	private int size;
	private Node head;
	private Node tail;

	public LinkedList() {
		this.size = 0;
		this.head = null;
		this.tail = null;
	}

	public int size() {
		return this.size;
	}

	public boolean isEmpty() {
		return this.size == 0;
	}

	public void addFirst(int item) {
		Node node = new Node(item, head);
		this.head = node;
		if (this.isEmpty()) {
			this.tail = node;
		}
		this.size++;
	}

	public void addLast(int item) {
		Node node = new Node(item, null);

		if (this.isEmpty()) {
			this.head = node;
			this.tail = node;
		}
		tail.next = node;
		this.tail = node;
		this.size++;
	}

	private Node getNode(int index) throws Exception {
		if (index < 0 || index > this.size) {
			throw new Exception("Index Out Of Range");
		}
		Node temp = this.head;
		int counter = 0;
		while (counter < index) {
			temp = temp.next;
			counter++;
		}
		return temp;
	}

	public void addAt(int index, int item) throws Exception {
		if (index < 0 || index > this.size) {
			throw new Exception("Index Out Of Range");
		}
		if (index == 0) {
			this.addFirst(item);
			return;
		}
		if (index == this.size()) {
			this.addLast(item);
			return;
		} else {
			Node temp = getNode(index - 1);
			Node node = new Node(item, temp.next);
			temp.next = node;
			this.size++;
		}
	}

	public int getFirst() throws Exception {
		if (this.isEmpty()) {
			throw new Exception("The List Is Empty");
		}
		return this.head.data;
	}

	public int getLast() throws Exception {
		if (this.isEmpty()) {
			throw new Exception("The List Is Empty");
		}
		return this.tail.data;
	}

	public int getAt(int index) throws Exception {
		if (this.isEmpty()) {
			throw new Exception("The List Is Empty");
		}
		if (index == 0) {
			this.getFirst();
		}
		if (index == this.size() - 1) {
			this.getLast();
		}
		return getNode(index).data;

	}

	public int removefirst() throws Exception {
		if (this.isEmpty()) {
			throw new Exception("The List Is Empty");
		}
		Node rv = this.head;
		if (this.size == 1) {
			this.tail = null;
			this.head = null;
		} else {
			this.head = this.head.next;
		}
		this.size--;
		return rv.data;
	}

	public int removelast() throws Exception {
		if (this.isEmpty()) {
			throw new Exception("The List Is Empty");
		}
		Node rv = this.tail;
		if (this.size == 1) {
			this.tail = null;
			this.head = null;
		} else {
			Node temp = this.getNode(this.size() - 2);
			temp.next = null;
			this.tail = temp;
		}
		this.size--;
		return rv.data;
	}

	public int removeAt(int index) throws Exception {
		if (this.isEmpty()) {
			throw new Exception("The List Is Empty");
		}
		if (index < 0 || index >= this.size) {
			throw new Exception("Index Out Of Range");
		}
		if (index == 0) {
			return this.removefirst();
		}
		if (index == this.size() - 1) {
			return this.removelast();
		} else {
			Node rv = this.getNode(index);
			Node temp = this.getNode(index - 1);
			temp.next = temp.next.next;
			this.size--;
			return rv.data;
		}

	}

	public void display() throws Exception {
		if (this.isEmpty()) {
			throw new Exception("The List Is Empty");
		}
		Node temp = this.head;
		while (temp != null) {
			System.out.print(temp.data + "=>");
			temp = temp.next;
		}
		System.out.println("END");
		System.out.println("***********************");
	}

	public void swap(int i1, int i2) throws Exception {
		Node left = this.getNode(i1);
		Node right = this.getNode(i2);

		int temp = left.data;
		left.data = right.data;
		right.data = temp;
	}

	public void removeduplicates() throws Exception {
		for (int i = 0; i < this.size; i++) {
			for (int j = i + 1; j < this.size; j++) {
				int a = this.getAt(i);
				int b = this.getAt(j);
				if (a == b) {
					this.removeAt(j);
				}
			}
		}
	}

	public LinkedList Merge(LinkedList other) throws Exception {
		int i = 0, j = 0;
		LinkedList rList = new LinkedList();
		while (i < this.size && j < other.size) {
			if (this.getAt(i) < other.getAt(j)) {
				rList.addLast(this.getAt(i));
				i++;
			} else if (other.getAt(j) < this.getAt(i)) {
				rList.addLast(other.getAt(j));
				j++;
			} else {
				rList.addLast(this.getAt(i));
				i++;
				rList.addLast(other.getAt(j));
				j++;
			}
		}
		while (i < this.size) {
			rList.addLast(this.getAt(i));
			i++;
		}
		while (j < other.size) {
			rList.addLast(other.getAt(j));
			j++;
		}
		return rList;
	}

	public int midNote() {
		return this.mid().data;

	}

	private Node mid() {
		Node slow = this.head, fast = this.head;
		while (fast.next != null && fast.next.next != null) {
			fast = fast.next.next;
			slow = slow.next;
		}
		return slow;
	}

	public void bubblesortR() throws Exception {
		this.bubblesortR(1, 0).display();
	}

	private LinkedList bubblesortR(int i, int j) throws Exception {
		if (i == this.size) {
			return this;
		}
		if (j == this.size - i) {
			bubblesortR(i + 1, 0);
			return this;
		}
		if (this.getAt(j) > this.getAt(j + 1)) {
			this.swap(j, j + 1);
		}
		bubblesortR(i, j + 1);
		return this;
	}

	public void selectionsortR() throws Exception {
		this.selectionsortR(0, 1, 0).display();
	}

	private LinkedList selectionsortR(int i, int j, int min_index) throws Exception {
		if (i == this.size) {
			return this;
		}
		if (j != this.size && this.getAt(min_index) > this.getAt(j)) {
			selectionsortR(i, j, j);
			return this;
		}
		if (j == this.size) {
			this.swap(i, min_index);
			selectionsortR(i + 1, i + 1, i + 1);
			return this;
		}

		selectionsortR(i, j + 1, min_index);

		return this;
	}

	public void insertionsortR() throws Exception {
		this.insertionsortR(1, 1).display();
	}

	public LinkedList insertionsortR(int i, int j) throws Exception {
		if (i == this.size) {
			return this;
		}
		if (j == 0) {
			insertionsortR(i + 1, i + 1);
			return this;
		}
		if (this.getAt(j - 1) > this.getAt(j)) {
			this.swap(j, j - 1);
		}
		insertionsortR(i, j - 1);
		return this;
	}

	public void MergeSortR() throws Exception {
		this.MergeSortR(0, this.size - 1).display();
	}

	public LinkedList MergeSortR(int low, int high) throws Exception {
		if (low == high) {
			LinkedList baseresult = new LinkedList();
			baseresult.addFirst(this.getAt(low));
			return baseresult;
		}
		int mid = (low + high) / 2;
		LinkedList fhalf = this.MergeSortR(low, mid);
		LinkedList shalf = this.MergeSortR(mid + 1, high);

		LinkedList SortedList = fhalf.Merge(shalf);

		return SortedList;
	}

	public void bubblesort() throws Exception {
		for (int i = 1; i < this.size; i++) {
			for (int j = 0; j < this.size - i; j++) {
				if (this.getAt(j) > this.getAt(j + 1)) {
					this.swap(j, j + 1);
				}
			}
		}
	}

	public void selectionsort() throws Exception {
		for (int i = 0; i < this.size - 1; i++) {
			int min_index = i;
			for (int j = i + 1; j < this.size; j++) {
				if (getAt(min_index) > this.getAt(j)) {
					min_index = j;
				}
			}
			this.swap(i, min_index);
		}
	}

	public void insertionsort() throws Exception {
		for (int i = 1; i < this.size; i++) {
			for (int j = i; j > 0; j--) {
				if (this.getAt(j - 1) > this.getAt(j)) {
					this.swap(j, j - 1);
				}
			}
		}
	}

	public boolean ispalindrome() throws Exception {
		LinkedList chk = this;

		this.ReverseDI();

		if (this == chk) {
			this.ReverseDI();
			return true;
		} else {
			this.ReverseDI();
			return false;
		}

	}

	public void evenafterodd() throws Exception {
		Node end = head;
		Node prev = null;
		Node curr = head;

		while (end.next != null) {
			end = end.next;
		}
		Node new_end = end;

		while (curr.data % 2 != 0 && curr != end) {
			new_end.next = curr;
			curr = curr.next;
			new_end.next.next = null;
			new_end = new_end.next;
		}

		if (curr.data % 2 == 0) {
			head = curr;

			while (curr != end) {
				if (curr.data % 2 == 0) {
					prev = curr;
					curr = curr.next;
				} else {
					prev.next = curr.next;
					curr.next = null;
					new_end.next = curr;
					new_end = curr;
					curr = prev.next;
				}
			}
		} else {
			prev = curr;
		}
		if (new_end != end && end.data % 2 != 0) {
			prev.next = end.next;
			end.next = null;
			new_end.next = end;
		}

	}

	public void ReverseDI() throws Exception {
		int si = 0, li = this.size() - 1;
		while (si <= li) {
			Node left = this.getNode(si);
			Node right = this.getNode(li);

			int temp = left.data;
			left.data = right.data;
			right.data = temp;

			si++;
			li--;
		}
	}

	public void lastntofirst(int n) throws Exception {
		for (int i = 1; i <= n; i++) {
			int j = this.size - 1;
			this.addFirst(this.removeAt(j));
		}
	}

	public void kreverse(int k) throws Exception {
		this.firstk(k);
		this.lastk(k);
	}

	private void firstk(int k) throws Exception {
		int si = 0, li = k - 1;
		while (si <= li) {
			Node left = this.getNode(si);
			Node right = this.getNode(li);

			int temp = left.data;
			left.data = right.data;
			right.data = temp;

			si++;
			li--;
		}
	}

	private void lastk(int k) throws Exception {
		int si = k, li = (2 * k) - 1;
		while (si <= li) {
			Node left = this.getNode(si);
			Node right = this.getNode(li);

			int temp = left.data;
			left.data = right.data;
			right.data = temp;

			si++;
			li--;
		}
	}

	public void ReverseDIR(int si, int li) throws Exception {
		if (si > li) {
			return;
		}
		Node left = this.getNode(si);
		Node right = this.getNode(li);

		int temp = left.data;
		left.data = right.data;
		right.data = temp;

		ReverseDIR(si + 1, li - 1);
	}

	public void reverseDR() {
		HeapMover left = new HeapMover(this.head);
		this.reverseDR(left, this.head, 0);
	}

	private void reverseDR(HeapMover left, Node right, int floor) {
		if (right == null) {
			return;
		}
		reverseDR(left, right.next, floor + 1);
		if (floor >= this.size / 2) {
			int temp = left.node.data;
			left.node.data = right.data;
			right.data = temp;

			left.node = left.node.next;
		}
	}

	public void ReversePI() throws Exception {
		Node prev = this.head;
		Node curr = prev.next;
		while (curr != null) {
			Node tempcurr = curr;
			Node tempprev = prev;
			prev = curr;
			curr = curr.next;
			tempcurr.next = tempprev;
		}
		Node temp = this.head;
		this.head = this.tail;
		this.tail = temp;

		this.tail.next = null;
	}

	public void ReversePIR() throws Exception {
		reverse(this.head);

		Node temp = this.head;
		this.head = this.tail;
		this.tail = temp;

		this.tail.next = null;

	}

	private void reverse(Node node) {
		if (node == this.tail) {
			return;
		}
		reverse(node.next);
		node.next.next = node;
	}

	private class HeapMover {
		Node node;

		public HeapMover(Node node) {
			// TODO Auto-generated constructor stub
			this.node = node;
		}
	}

}
