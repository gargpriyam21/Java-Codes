package Assignment13_BTandBST;

public class BST {

	private class Node {
		int data;
		Node left;
		Node right;

		public Node(int data, Node left, Node right) {
			this.data = data;
			this.left = left;
			this.right = right;
		}
	}

	private int size;
	private Node root;

	BST() {
		this.root = null;
		this.size = 0;
	}

	public BST(int... sortedArray) {
		this.root = construct(sortedArray, 0, sortedArray.length - 1);
	}

	private Node construct(int[] sa, int si, int li) {
		if (si > li) {
			return null;
		}
		int mid = (si + li) / 2;

		Node node = new Node(sa[mid], null, null);
		this.size++;

		node.left = construct(sa, si, mid - 1);
		node.right = construct(sa, mid + 1, li);

		return node;
	}

	public int size() {
		return this.size;
	}

	public boolean isEmpty() {
		return this.size() == 0;
	}

	public void add(int data) {
		if (this.isEmpty()) {
			this.root = new Node(data, null, null);
			this.size++;
		} else {
			this.add(this.root, data);
		}
	}

	private void add(Node node, int data) {
		if (data > node.data) {
			if (node.right == null) {
				node.right = new Node(data, null, null);
				this.size++;
			} else {
				add(node.right, data);
			}
		} else if (data < node.data) {
			if (node.left == null) {
				node.left = new Node(data, null, null);
				this.size++;
			} else {
				add(node.left, data);
			}
		}
	}

	public void display() {
		this.display(this.root);
	}

	private void display(Node node) {
		if (node.left != null) {
			System.out.print(node.left.data + "=>");
		} else {
			System.out.print("END=>");
		}
		System.out.print(node.data);
		if (node.right != null) {
			System.out.print("<=" + node.right.data);
		} else {
			System.out.print("<=END");
		}
		System.out.println();
		if (node.left != null) {
			display(node.left);
		}
		if (node.right != null) {
			display(node.right);
		}
	}

	public boolean find(int item) {
		return this.find(item, this.root);
	}

	private boolean find(int item, Node node) {
		if (item == node.data) {
			return true;
		}
		if (node.left != null) {
			if (find(item, node.left)) {
				return true;
			}
		}
		if (node.right != null) {
			if (find(item, node.right)) {
				return true;
			}
		}
		return false;
	}

	public void remove(int data) {
		this.root = this.remove(this.root, data);
	}

	private Node remove(Node node, int data) {
		if (node == null) {
			return null;
		}
		if (data > node.data) {
			node.right = remove(node.right, data);
			return node;
		} else if (data < node.data) {
			node.left = remove(node.left, data);
			return node;
		} else {
			if (node.left == null && node.right == null) {
				this.size--;
				return null;
			} else if (node.left == null) {
				this.size--;
				return node.right;
			} else if (node.right == null) {
				this.size--;
				return node.left;
			} else {
				int lmax = max(node.left);
				node.data = lmax;
				node.left = this.remove(node.left, lmax);
				return node;
			}
		}
	}

	public int max() {
		return this.max(this.root);
	}

	private int max(Node node) {
		if (node.right == null) {
			return node.data;
		}
		return max(node.right);
	}

	public int min() {
		return this.min(this.root);
	}

	private int min(Node node) {
		if (node.left == null) {
			return node.data;
		}
		return min(node.left);
	}

	public void insertleft() {
		insertleft(this.root);
	}

	private void insertleft(Node node) {
		if (node == null) {
			return;
		}
		if (node.left == null) {
			insertleft(node.left);
			insertleft(node.right);
			node.left = new Node(node.data, null, null);
		} else {
			insertleft(node.left);
			insertleft(node.right);
			node.left = new Node(node.data, node.left, null);
		}
	}

	public int LCA(int d1, int d2) {
		return this.LCA(this.root, d1, d2).data;
	}

	private Node LCA(Node node, int d1, int d2) {
		if (node == null) {
			return null;
		}
		if (node.data == d1 || node.data == d2) {
			return node;
		}
		Node llca = LCA(node.left, d1, d2);
		Node rlca = LCA(node.right, d1, d2);
		if (rlca != null && llca != null) {
			return node;
		} else if (llca == null) {
			return rlca;
		} else if (rlca == null) {
			return llca;
		} else {
			return null;
		}
	}

	private int sumoflargest(Node node) {
		int count = 0;
		if (node.left != null) {
			count = count + sumoflargest(node.left);
		}
		return count + node.data;
	}

	public void replacegreater() {
		this.root = this.replacegreater(this.root);
	}

	private Node replacegreater(Node node) {
		if (node == null) {
			return null;
		}
		node.data = sumoflargest(node);

		node.left = replacegreater(node.left);
		node.right = replacegreater(node.right);

		return node;
	}

	public void kdistance(int k) {
		kdistance(this.root, k);
	}

	private void kdistance(Node node, int k) {
		if (k == 0) {
			System.out.println(node.data);
		}
		if (node == null) {
			return;
		}
		kdistance(node.left, k - 1);
		kdistance(node.right, k - 1);

	}

	public int height() {
		return this.height(this.root);
	}

	private int height(Node node) {
		int rv = -1;
		if (node.left != null) {
			int ch = height(node.left);
			if (ch > rv) {
				rv = ch;
			}
		}
		if (node.right != null) {
			int ch = height(node.right);
			if (ch > rv) {
				rv = ch;
			}
		}
		rv = rv + 1;
		return rv;
	}

	public void route(int item) {
		route(this.root, item, " ");
	}

	private void route(Node node, int item, String path) {
		if (node == null) {
			System.out.println(path);
		}
	}

}
