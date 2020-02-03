package Lecture21;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Trie trie = new Trie();

		trie.addWord("art");
		trie.addWord("arts");
		trie.addWord("bug");
		trie.addWord("buy");
		trie.addWord("sell");
		trie.addWord("see");
		trie.addWord("sea");
		trie.addWord("seen");
		trie.displayWords();
		System.out.println("*************************");
		// System.out.println(trie.Search("art"));
		// System.out.println(trie.Search("are"));
		// System.out.println("*************************");
		// trie.remove("art");
		// trie.remove("arts");
		// trie.displayWords();
		// trie.displayastree();

	}

}
