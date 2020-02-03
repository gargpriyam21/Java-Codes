package Lecture18;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BST bst = new BST();

		bst.add(50);
		bst.add(75);
		bst.add(87);
		bst.add(25);
		bst.add(62);
		bst.add(12);
		bst.add(37);
		bst.display();

		System.out.println("********************************");
		System.out.println(bst.size());

		System.out.println("********************************");
		System.out.println(bst.max());

		System.out.println("********************************");
		System.out.println(bst.min());

		System.out.println("********************************");
		bst.remove(50);
		bst.display();
		System.out.println(bst.size());

		System.out.println("********************************");
		// int[] arr = { 12, 25, 37, 50, 62, 75, 87 };
		BST bst1 = new BST(12, 25, 37, 50, 62, 75, 87);
		bst1.display();
	}
}
