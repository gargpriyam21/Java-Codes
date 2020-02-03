package Assignment11_GenericTree;

import java.util.ArrayList;
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

	public int sum() {
		return this.sum(this.root);
	}

	private int sum(Node node) {
		int count = 0;
		for (int i = 0; i < node.children.size(); i++) {
			count = count + sum(node.children.get(i));
		}
		return count + node.data;
	}

	public boolean isstructidentical(GenericTree tree) {
		return this.isstructidentical(tree.root, this.root);
	}

	private boolean isstructidentical(Node treenode, Node node) {
		return false;
	}

	public int nextlarger(int item) {
		return nextlarger(item, this.root);
	}

	private int nextlarger(int item, Node node) {
		int maxelement = node.data;
		int rv = 0;
		for (int i = 0; i < node.children.size(); i++) {
			int ele2 = nextlarger(item, node.children.get(i));
			maxelement = maxelement > ele2 ? maxelement : ele2;
			if (ele2 > item) {
				maxelement = maxelement < ele2 ? maxelement : ele2;
				return maxelement;
			}
			rv = ele2;
		}
		return rv;
	}

	public int secondlargest() {
		return secondlargest(this.root, this.max());
	}

	private int secondlargest(Node node, int maxelement) {
		int smaxelement = node.data;
		for (int i = 0; i < node.children.size(); i++) {
			int ele2 = secondlargest(node.children.get(i), maxelement);
			if (ele2 != maxelement)
				smaxelement = smaxelement > ele2 ? smaxelement : ele2;
		}
		return smaxelement;
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

	public void nodewithdepth() {
		nodewithdepth(this.root);
	}

	private void nodewithdepth(Node node) {
		node.data = height(node);
		for (int i = 0; i < node.children.size(); i++) {
			nodewithdepth(node.children.get(i));
		}
	}

	public int countleaf() {
		return countleaf(this.root);
	}

	private int countleaf(Node node) {
		int count = 0;
		if (node.children.size() == 0) {
			return 1;
		}
		for (int i = 0; i < node.children.size(); i++) {
			count = count + countleaf(node.children.get(i));
		}
		return count;
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
}
