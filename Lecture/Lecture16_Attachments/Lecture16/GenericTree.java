package Lecture16;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class GenericTree {

	private class Node {
		int data;
		ArrayList<Node> children;

		Node(int data) {
			this.data = data;
			children = new ArrayList<>();
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
			System.out.println("Enter the Data for root node");
		} else {
			System.out.println("Enter the data for " + ithchild + " child of " + parent.data);
		}

		int nodeData = s.nextInt();
		Node node = new Node(nodeData);
		this.size++;

		System.out.println("Enter the number of children for " + node.data);
		int numChild = s.nextInt();

		for (int i = 0; i < numChild; i++) {
			Node child = this.takeInput(s, node, i);
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
		int rv = this.size2(this.root);
		return rv;

	}

	private int size2(Node node) {
		int rv = 0;
		for (int i = 0; i < node.children.size(); i++) {
			int childSize = this.size2(node.children.get(i));
			rv = rv + childSize;

		}

		rv = rv + 1;

		return rv;
	}

	public int max() {
		return this.max(this.root);
	}

	private int max(Node node) {
		int max = node.data;
		for (int i = 0; i < node.children.size(); i++) {
			int childMax = this.max(node.children.get(i));
			if (childMax > max) {
				max = childMax;
			}

		}

		return max;
	}

	public int height() {
		return this.height(this.root);
	}

	private int height(Node node) {
		int retVal = -1;

		for (int i = 0; i < node.children.size(); i++) {
			int childHeight = this.height(node.children.get(i));

			if (childHeight > retVal) {
				retVal = childHeight;
			}
		}

		retVal = retVal + 1;
		return retVal;

	}

	public boolean find(int item) {
		return this.find(this.root, item);
	}

	private boolean find(Node node, int item) {
		if (node.data == item) {
			return true;
		}

		for (int i = 0; i < node.children.size(); i++) {
			boolean foundInChild = this.find(node.children.get(i), item);

			if (foundInChild) {
				return true;
			}

		}

		return false;
	}

	public void mirror() {
		this.mirror(this.root);
	}

	private void mirror(Node node) {
		int left = 0, right = node.children.size() - 1;
		while (left <= right) {
			Node temp = node.children.get(left);
			node.children.set(left, node.children.get(right));
			node.children.set(right, temp);
			left++;
			right--;
		}

		for (int i = 0; i < node.children.size(); i++) {
			this.mirror(node.children.get(i));
		}
	}

	public void printAtlevel(int level) {
		this.printAtlevel(this.root, level);
	}

	public void printAtlevel(Node node, int level) {
		if (level == 0) {
			System.out.println(node.data);
			return;
		}

		for (int i = 0; i < node.children.size(); i++) {
			this.printAtlevel(node.children.get(i), level - 1);

		}
	}

	public void levelOrder() {
		
		Queue<Node> queue = new LinkedList<>();
		queue.add(this.root);
		while(!queue.isEmpty()){
			Node node=queue.remove();
			System.out.println(node.data);
			
			for(int i=0;i<node.children.size();i++){
				queue.add(node.children.get(i));
			}
		}
		System.out.println("END");
	}
}
