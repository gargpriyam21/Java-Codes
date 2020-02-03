package Lecture21;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Trie {
	private class Node {
		Character data;
		HashMap<Character, Node> children;
		boolean isTerminal;

		Node(Character data, boolean isTerminal) {
			this.data = data;
			this.isTerminal = isTerminal;
			this.children = new HashMap<>();
		}
	}

	private int numWords;
	private Node root;

	Trie() {
		this.root = new Node('\0', false);
		this.numWords = 0;
	}

	public int getNumWords() {
		return this.numWords;
	}

	public boolean isEmpty() {
		return this.getNumWords() == 0;
	}

	public void addWord(String word) {
		this.addWord(this.root, word);
	}

	private void addWord(Node parent, String word) {
		if (word.length() == 0) {
			if (parent.isTerminal) {
				// Word Already Exist
			} else {
				parent.isTerminal = true;
				this.numWords++;
			}
			return;
		}
		char cc = word.charAt(0);
		String ros = word.substring(1);
		Node child = parent.children.get(cc);
		if (child == null) {
			child = new Node(cc, false);
			parent.children.put(cc, child);
		}
		this.addWord(child, ros);

	}

	public void displayWords() {
		this.displayWord(this.root, "");
	}

	private void displayWord(Node node, String osf) {
		if (node.isTerminal) {
			String toPrint = osf.substring(1) + node.data;
			System.out.println(toPrint);
		}
		Set<Map.Entry<Character, Node>> entries = node.children.entrySet();
		for (Map.Entry<Character, Node> child : entries) {
			this.displayWord(child.getValue(), osf + node.data);
		}
	}

	public boolean Search(String word) {
		return Search(this.root, word);
	}

	private boolean Search(Node parent, String word) {
		if (word.length() == 0) {
			if (parent.isTerminal) {
				return true;
			} else {
				return false;
			}
		}
		char cc = word.charAt(0);
		String ros = word.substring(1);
		Node child = parent.children.get(cc);
		if (child != null) {
			return Search(child, ros);
		} else {
			return false;
		}
	}

	public void remove(String word) {
		remove(this.root, word);
	}

	private void remove(Node node, String word) {
		if (word.length() == 0) {
			if (node.isTerminal) {
				node.isTerminal = false;
				this.numWords--;
			}
			return;
		}

		char cc = word.charAt(0);
		String ros = word.substring(1);
		Node child = node.children.get(cc);
		if (child != null) {
			remove(child, ros);
			if (!child.isTerminal && child.children.size() == 0) {
				node.children.remove(cc);
			}
		} else {
			return;
		}
	}

	public void displayastree() {
		this.displayastree(this.root);
	}

	private void displayastree(Node node) {
		String str = "";
		str += node.data + "=>";
		Set<Map.Entry<Character, Node>> entries = node.children.entrySet();
		for (Map.Entry<Character, Node> entry : entries) {
			str += entry.getKey() + ",";
		}
		str += "END";
		System.out.println(str);
		for (Map.Entry<Character, Node> entry : entries) {
			this.displayastree(entry.getValue());
		}

	}
}
