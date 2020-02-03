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
				// Word already exist
			} else {
				parent.isTerminal = true;
				this.numWords++;
			}

			return;
		}

		char ch = word.charAt(0);
		String ros = word.substring(1);

		Node child = parent.children.get(ch);
		if (child == null) {
			child = new Node(ch, false);
			parent.children.put(ch, child);
		}

		this.addWord(child, ros);
	}

	public void displayWords() {
		this.displayWords(this.root, "");
	}

	private void displayWords(Node node, String osf) {
		if (node.isTerminal) {
			String toPrint = osf.substring(1) + node.data;
			System.out.println(toPrint);
		}
		Set<Map.Entry<Character, Node>> entries = node.children.entrySet();
		for (Map.Entry<Character, Node> child : entries) {
			this.displayWords(child.getValue(), osf + node.data);
		}
	}

	public boolean searchWord(String word) {
		return this.searchWord(this.root, word);
	}

	private boolean searchWord(Node parent, String word) {
		if (word.length() == 0) {
			if (parent.isTerminal) {
				return true;
			} else {
				return false;
			}

		}

		char ch = word.charAt(0);
		String ros = word.substring(1);

		Node child = parent.children.get(ch);
		if (child == null) {
			return false;
		}

		return this.searchWord(child, ros);
	}

	public void removeWord(String word) {
		this.removeWord(this.root, word);
	}

	private void removeWord(Node parent, String word) {
		if (word.length() == 0) {
			if (parent.isTerminal) {
				parent.isTerminal = false;
				this.numWords--;
			} else {

			}
			return;
		}

		char ch = word.charAt(0);
		String ros = word.substring(1);

		Node child = parent.children.get(ch);
		if (child == null) {
			return;
		}

		this.removeWord(child, ros);
		if (!child.isTerminal && child.children.size() == 0) {
			parent.children.remove(ch);
		}
	}

	public void displayAsTree() {
		this.displayAsTree(this.root);
	}

	private void displayAsTree(Node node) {
       String str="";
       str+=node.data+"=>";
       Set<Map.Entry<Character,Node>> entries=node.children.entrySet();
       for(Map.Entry<Character, Node> entry:entries){
    	   str+=entry.getKey()+", ";
       }
       str+="END";
       System.out.println(str);
       for(Map.Entry<Character, Node> entry:entries){
    	  this.displayAsTree(entry.getValue());
       }
	}
	

}
