package Lecture17;

public class BinaryTreeClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 18 true 24 true 38 false false true 10 false false true 32 true 44 false false false
		// 18 true 24 true 38 false false true 10 false false true 32 true 44 false false true 55 false false
		// 18 true 24 true 38 false false true 10 false false true 32 true 44 false false true 55 true 8 true 2 false false false true 11 false false
		// 50 true 25 true 12 false false true 37 false false true 75 true 62 false false true 87 false false
		BinaryTree tree = new BinaryTree();
		tree.display();
		System.out.println("**************************************");
		System.out.println(tree.size());
		
		System.out.println("**************************************");
		System.out.println(tree.size2());
		
		System.out.println("**************************************");
		System.out.println(tree.max());
		
		System.out.println("**************************************");
		System.out.println(tree.min());
		
		System.out.println("**************************************");
		System.out.println(tree.find(24));
		
		System.out.println("**************************************");
		System.out.println(tree.find(11));
		
		System.out.println("**************************************");
		tree.display();
		tree.mirror();
		System.out.println("**************************************");
		tree.display();
		tree.mirror();
		
		System.out.println("**************************************");
		System.out.println(tree.height());
		
		System.out.println("**************************************");
		tree.PreOrder();
		
		System.out.println("**************************************");
		tree.PostOrder();
		
		System.out.println("**************************************");
		tree.InOrder();
		
		System.out.println("**************************************");
		tree.LevelOrder();
		
		System.out.println("**************************************");
		tree.PreOrderI();
		
		System.out.println("**************************************");
		System.out.println(tree.LCA(75, 62));
		
		System.out.println("**************************************");
		System.out.println(tree.isBST());
		
		System.out.println("**************************************");
		System.out.println(tree.diameter());

	}

}
