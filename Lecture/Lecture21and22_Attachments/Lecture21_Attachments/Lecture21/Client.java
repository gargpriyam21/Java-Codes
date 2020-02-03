package Lecture21;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Trie trie=new Trie();
      trie.addWord("art");
      trie.addWord("arts");
      trie.addWord("bug");
      trie.addWord("buy");
      trie.addWord("sell");
      trie.addWord("see");
      trie.addWord("sea");
      trie.addWord("seen");
      
      trie.displayWords();
      
      System.out.println(trie.searchWord("arts"));
      System.out.println(trie.searchWord("seen"));
      System.out.println(trie.searchWord("seed"));
      System.out.println("******************************");
      trie.removeWord("art");
      trie.displayWords();
      System.out.println(trie.searchWord("arts"));
      System.out.println(trie.searchWord("art"));
      System.out.println("******************************");
      trie.removeWord("arts");
      trie.displayWords();
      System.out.println(trie.searchWord("arts"));
      System.out.println(trie.searchWord("art"));
      
      System.out.println("******************************");
      trie.displayAsTree();
      
	}

}
