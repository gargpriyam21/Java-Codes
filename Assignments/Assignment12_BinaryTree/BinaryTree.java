package Assignment12_BinaryTree;

import java.util.ArrayList;
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

	public int sum() {
		return this.sum(this.root);
	}

	private int sum(Node node) {
		int count = 0;
		if (node.left != null) {
			count = count + sum(node.left);
		}
		if (node.right != null) {
			count = count + sum(node.right);
		}

		return count + node.data;
	}

	public boolean structident(BinaryTree tree) {
		return structident(tree.root, this.root);
	}

	private boolean structident(Node tree, Node node) {
		if (node == null) {
			return true;
		}
		if (tree.data == node.data) {
			return (structident(tree.left, node.left) && structident(tree.right, node.right));
		}
		return false;
	}

	public boolean isbalanced() {
		return isbalanced(this.root);
	}

	private boolean isbalanced(Node node) {
		int lh = height(node.left);
		int rh = height(node.right);

		if (lh - rh <= 1 && lh - rh >= -1) {
			return true;
		}
		return false;
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

	public ArrayList<Lecture14and15.LinkedList> level() {
		ArrayList<Lecture14and15.LinkedList> arr = new ArrayList<>();
		level(this.root, 0, arr);
		return arr;
	}

	private void level(Node node, int level, ArrayList<Lecture14and15.LinkedList> arr) {
		if (node == null) {
			return;
		}
		if (arr.size() == level) {
			Lecture14and15.LinkedList ll = new Lecture14and15.LinkedList();
			arr.add(ll);
		}
		arr.get(level).addLast(node.data);
		level(node.left, level + 1, arr);
		level(node.right, level + 1, arr);
	}

	public void displayal(ArrayList<Lecture14and15.LinkedList> arr) throws Exception {
		for (int i = 0; i < 3; i++) {
			arr.get(i).display();
		}
	}

	public void nosiblings() {
		nosiblings(this.root);
	}

	private void nosiblings(Node node) {
		if (node == null) {
			return;
		}
		if (node.right == null && node.left != null) {
			System.out.println(node.left.data);
		} else if (node.right != null && node.left == null) {
			System.out.println(node.right.data);
		}
		nosiblings(node.left);
		nosiblings(node.right);
	}

	public void removeleaves() {
		removeleaves(this.root);
	}

	private Node removeleaves(Node node) {
		if (node == null) {
			return null;
		}
		if (node.left == null && node.right == null) {
			return null;
		}
		node.right = removeleaves(node.right);
		node.left = removeleaves(node.left);
		return node;

	}

	public void printatlevel() {
		for (int i = 0; i <= this.height(); i++) {
			printatlevel(this.root, i);
			System.out.println();
		}
	}

	private void printatlevel(Node node, int level) {
		if (node == null) {
			return;
		}
		if (level == 0) {
			System.out.print(node.data + "  ");
			return;
		}
		printatlevel(node.left, level - 1);
		printatlevel(node.right, level - 1);
	}

	public void printlevel() {
		for (int i = 0; i <= this.height(); i++) {
			printlevel(this.root, i, i);
			System.out.println();
		}
	}

	private void printlevel(Node node, int level, int lev) {
		if (node == null) {
			return;
		}
		if (level == 0) {
			System.out.print(node.data + "  ");
			return;
		}
		if (lev % 2 == 0) {
			printlevel(node.left, level - 1, lev);
			printlevel(node.right, level - 1, lev);
		} else {
			printlevel(node.right, level - 1, lev);
			printlevel(node.left, level - 1, lev);
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

	public void largestsubtree() {
		BinaryTree tree = largestsubtree(this.root);
		if (tree != null) {
			if (tree.isBST()) {
				tree.display();
			} else {
				System.out.println("null");
			}
		} else {
			System.out.println("null");
		}
	}

	private BinaryTree largestsubtree(Node node) {
		int lh = height(node.left);
		int rh = height(node.right);
		BinaryTree tree = new BinaryTree();
		if (lh == rh) {
			return null;
		}
		if (lh > rh) {
			tree.root = node.left;
		} else {
			tree.root = node.right;
		}
		return tree;
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

}