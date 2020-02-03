package Assignment13_BTandBST;

import Assignment12_BinaryTree.BinaryTree;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BST bst = new BST();
		// System.out.println("Is Tree Empty: " + bst.isEmpty());
		bst.add(50);
		bst.add(75);
		bst.add(87);
		bst.add(25);
		bst.add(62);
		bst.add(12);
		bst.add(37);
		bst.display();

		// Q1
		// System.out.print("Size: ");
		// System.out.println(bst.size());
		// System.out.println("Is Tree Empty: " + bst.isEmpty());
		// System.out.println("Find: " + bst.find(87));
		// bst.remove(62);
		// bst.display();

		// Q2
		// System.out.println("********************************");
		// bst.add(2);
		// bst.add(1);
		// bst.add(3);
		// bst.display();
		// System.out.println("********************************");
		// bst.insertleft();
		// bst.display();

		// Q3

		// Q4
		// BinaryTree Btree = new BinaryTree();
		// // 18 true 24 true 38 false false true 10 false false true 32 true 4
		// false false false
		// System.out.println(Btree.LCA(32, 24));

		// Q5
		// System.out.println(bst.LCA(25, 62));

		// Q6
		// BinaryTree Btree = new BinaryTree();
		// // 5 true 2 true 1 false false true 3 false false true 4 false false
		// Btree.largestsubtree();

		// Q7
		// System.out.println("*************************");
		// bst.replacegreater();
		// bst.display();

		// Q8
		// bst.kdistance(1);

		// Q9

		// Q10

	}

}
