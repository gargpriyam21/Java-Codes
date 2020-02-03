package Lecture17;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BinaryTree {
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

	public BinaryTree() {
		Scanner s = new Scanner(System.in);
		this.root = takeInput(s, null, false);
	}

	private Node takeInput(Scanner s, Node parent, boolean IsLeftOrRight) {
		if (parent == null) {
			System.out.println("Enter The Data Of The Parent");
		} else {
			if (IsLeftOrRight) {
				System.out.println("Enter The Data For Left Child Of " + parent.data);
			} else {
				System.out.println("Enter The Data For Right Child Of " + parent.data);
			}
		}

		int nodeData = s.nextInt();
		Node node = new Node(nodeData, null, null);
		this.size++;

		boolean choice = false;
		System.out.println("Does " + node.data + " have a left child?");
		choice = s.nextBoolean();
		if (choice) {
			node.left = takeInput(s, node, true);
		}

		System.out.println("Does " + node.data + " have a right child?");
		choice = s.nextBoolean();
		if (choice) {
			node.right = takeInput(s, node, false);
		}
		return node;
	}

	public int size() {
		return this.size;
	}

	public boolean IsEmpty() {
		return this.size() == 0;
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

	public int size2() {
		return this.size2(this.root);
	}

	private int size2(Node node) {
		int count = 0;
		if (node.left != null) {
			count = count + size2(node.left);
		}
		if (node.right != null) {
			count = count + size2(node.right);
		}

		return count + 1;
	}

	public int max() {
		return this.max(this.root);
	}

	private int max(Node node) {
		int maxelement = node.data;
		if (node.left != null) {
			int ele2 = max(node.left);
			maxelement = maxelement > ele2 ? maxelement : ele2;
		}
		if (node.right != null) {
			int ele2 = max(node.right);
			maxelement = maxelement > ele2 ? maxelement : ele2;
		}
		return maxelement;
	}

	public int min() {
		return this.min(this.root);
	}

	private int min(Node node) {
		int minelement = node.data;
		if (node.left != null) {
			int ele2 = min(node.left);
			minelement = minelement < ele2 ? minelement : ele2;
		}
		if (node.right != null) {
			int ele2 = min(node.right);
			minelement = minelement < ele2 ? minelement : ele2;
		}
		return minelement;
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

	public void mirror() {
		this.mirror(this.root);
	}

	private void mirror(Node node) {
		Node temp = node.left;
		node.left = node.right;
		node.right = temp;

		if (node.left != null) {
			mirror(node.left);
		}
		if (node.right != null) {
			mirror(node.right);
		}
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

	public void PreOrder() {
		this.PreOrder(this.root);
		System.out.println("END");
	}

	private void PreOrder(Node node) {
		System.out.print(node.data + ",");
		if (node.left != null) {
			PreOrder(node.left);
		}
		if (node.right != null) {
			PreOrder(node.right);
		}
	}

	public void PostOrder() {
		this.PostOrder(this.root);
		System.out.println("END");
	}

	private void PostOrder(Node node) {
		if (node.left != null) {
			PostOrder(node.left);
		}
		if (node.right != null) {
			PostOrder(node.right);
		}
		System.out.print(node.data + ",");
	}

	public void InOrder() {
		this.InOrder(this.root);
		System.out.println("END");
	}

	private void InOrder(Node node) {
		if (node == null) {
			return;
		}
		InOrder(node.left);
		System.out.print(node.data + ",");
		InOrder(node.right);
	}

	public void LevelOrder() {
		Queue<Node> queue = new LinkedList<>();
		queue.add(this.root);
		while (!queue.isEmpty()) {
			Node node = queue.remove();
			System.out.print(node.data + ",");
			if (node.left != null) {
				queue.add(node.left);
			}
			if (node.right != null) {
				queue.add(node.right);
			}
		}
		System.out.println("END");
	}

	public void PreOrderI() {
		LinkedList<Node> stack = new LinkedList<>();
		stack.addFirst(this.root);
		while (!stack.isEmpty()) {
			Node node = stack.removeFirst();
			System.out.print(node.data + ",");
			if (node.right != null) {
				stack.addFirst(node.right);
			}
			if (node.left != null) {
				stack.addFirst(node.left);
			}
		}
		System.out.println("END");
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

	public boolean isBST() {
		return this.isBST(this.root, Integer.MAX_VALUE, Integer.MIN_VALUE);
	}

	private boolean isBST(Node node, int max, int min) {
		if (node == null) {
			return true;
		}
		if (node.data < max && node.data > min) {
			if (isBST(node.left, node.data, min) && isBST(node.right, max, node.data)) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}

	}

	public int diameter() {
		return this.diameter(this.root);
	}

	private int diameter(Node node) {
		if (node == null) {
			return 0;
		}

		int f1 = this.height(node.left) + this.height(node.right) + 2;
		int f2 = diameter(node.left);
		int f3 = diameter(node.right);

		return Math.max(f1, Math.max(f2, f3));
	}

}
