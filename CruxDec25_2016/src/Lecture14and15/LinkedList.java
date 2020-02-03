package Lecture14and15;

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
		} else {
			tail.next = node;
			this.tail = node;
		}
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
		}
		if (index == this.size()) {
			this.addLast(item);
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

	private Node mid() {
		Node slow = this.head, fast = this.head;
		while (fast.next != null && fast.next.next != null) {
			fast = fast.next.next;
			slow = slow.next;
		}
		return slow;

	}

	public int midNote() {
		return this.mid().data;

	}

	public int kfromend(int k) throws Exception {
		if (k < 1 || k > this.size) {
			throw new Exception("Invalid Index");
		}
		Node slow = this.head, fast = this.head;
		for (int i = 0; i < k; i++) {
			fast = fast.next;
		}
		while (fast != null) {
			fast = fast.next;
			slow = slow.next;
		}
		return slow.data;
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

	public LinkedList MergeSort(LinkedList other, int low, int high) throws Exception {
		if (low == high) {
			LinkedList baseresult = new LinkedList();
			baseresult.addFirst(other.getAt(low));
			return baseresult;
		}
		int mid = (low + high) / 2;
		LinkedList fhalf = MergeSort(other, low, mid);
		LinkedList shalf = MergeSort(other, mid + 1, high);

		LinkedList SortedList = fhalf.Merge(shalf);

		return SortedList;
	}

	public int NodeSearch(int item) throws Exception {
		for (int i = 0; i < this.size; i++) {
			if (this.getAt(i) == item) {
				return i;
			}
		}
		return -1;

	}

	public int NodeSearchR(int item) {
		Node i = this.head;
		return Search(i, item, 0);

	}

	private int Search(Node i, int item, int k) {
		if (i == null) {
			return -1;
		}
		if (i.data == item) {
			return k;
		}
		return Search(i.next, item, k + 1);
	}

	public void MergeSortB() throws Exception {
		LinkedList sorted = MergeHelper(this.head, this.tail);

		this.head = sorted.head;
		this.tail = sorted.tail;
		this.size = sorted.size;

	}

	private LinkedList(Node head, Node tail, int size) {
		this.head = head;
		this.tail = tail;
		this.size = size;
	}

	private LinkedList MergeHelper(Node low, Node high) throws Exception {
		if (this.size == 1) {
			return this;
		}
		Node mid = this.mid();
		Node midnext = mid.next;
		mid.next = null;

		LinkedList first = new LinkedList(low, mid, (this.size + 1) / 2);
		LinkedList second = new LinkedList(midnext, high, this.size / 2);

		first.MergeSortB();
		second.MergeSortB();

		LinkedList ans = first.Merge(second);
		return ans;
	}

	private class HeapMover {
		Node node;

		public HeapMover(Node node) {
			// TODO Auto-generated constructor stub
			this.node = node;
		}
	}

}
