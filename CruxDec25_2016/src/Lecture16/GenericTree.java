package Lecture16;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class GenericTree {
	private class Node {
		int data;
		ArrayList<Node> children;

		public Node(int data) {
			this.data = data;
			this.children = new ArrayList<>();
		}
	}

	Node root;
	int size = 0;

	public GenericTree() {
		Scanner s = new Scanner(System.in);
		this.root = takeInput(s, null, 0);
	}

	private Node takeInput(Scanner s, Node parent, int ithchild) {
		if (parent == null) {
			System.out.println("Enter The Root Node");
		} else {
			System.out.println("Enter the data for " + ithchild + " child of " + parent.data);
		}

		int Nodedata = s.nextInt();
		Node node = new Node(Nodedata);
		this.size++;

		System.out.println("Enter The Number Of Children For " + node.data);
		int numChild = s.nextInt();

		for (int i = 0; i < numChild; i++) {
			Node child = takeInput(s, node, i);
			node.children.add(child);
		}
		return node;
	}

	public int size() {
		return this.size;
	}

	public boolean isEmpty() {
		return this.size() == 0;
	}

	public void display() {
		this.display(this.root);
	}

	private void display(Node node) {
		System.out.print(node.data + "=>");
		for (int i = 0; i < node.children.size(); i++) {
			System.out.print(node.children.get(i).data + ",");
		}
		System.out.println("END");

		for (int i = 0; i < node.children.size(); i++) {
			this.display(node.children.get(i));
		}
	}

	public int size2() {
		return this.size2(this.root);
	}

	private int size2(Node node) {
		int count = 0;
		for (int i = 0; i < node.children.size(); i++) {
			count = count + size2(node.children.get(i));
		}
		return count + 1;
	}

	public int max() {
		return this.max(this.root);
	}

	private int max(Node node) {
		int maxelement = node.data;
		for (int i = 0; i < node.children.size(); i++) {
			int ele2 = max(node.children.get(i));
			maxelement = maxelement > ele2 ? maxelement : ele2;
		}
		return maxelement;
	}

	public int height() {
		return this.height(this.root);
	}

	private int height(Node node) {
		int rv = -1;
		for (int i = 0; i < node.children.size(); i++) {
			int ch = height(node.children.get(i));

			if (ch > rv) {
				rv = ch;
			}
		}
		rv = rv + 1;
		return rv;

	}

	public boolean find(int item) {
		return this.find(item, this.root);
	}

	private boolean find(int item, Node node) {
		if (item == node.data) {
			return true;
		}
		for (int i = 0; i < node.children.size(); i++) {
			if (find(item, node.children.get(i))) {
				return true;
			}
		}
		return false;
	}

	public void mirror() {
		this.mirror(this.root);
	}

	private void mirror(Node node) {
		for (int i = 0, j = node.children.size() - 1; i <= j; i++, j--) {
			Node temp = node.children.get(i);
			node.children.set(i, node.children.get(j));
			node.children.set(j, temp);
		}
		for (int i = 0; i < node.children.size(); i++) {
			mirror(node.children.get(i));
		}

	}

	public void printatlevel(int level) {
		printatlevel(this.root, level);
	}

	private void printatlevel(Node node, int level) {
		if (level == 0) {
			System.out.println(node.data);
			return;
		}
		for (int i = 0; i < node.children.size(); i++) {
			printatlevel(node.children.get(i), level - 1);
		}
	}

	public void printlevelorder() {
		Queue<Node> queue = new LinkedList<>();
		queue.add(this.root);
		while (!queue.isEmpty()) {
			Node node = queue.remove();
			System.out.println(node.data);
			for (int i = 0; i < node.children.size(); i++) {
				queue.add(node.children.get(i));
			}
		}
		System.out.println("END");
	}

}
