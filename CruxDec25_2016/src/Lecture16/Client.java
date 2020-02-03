package Lecture16;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 80 3 40 2 110 0 120 0 60 0 70 1 140 0
		GenericTree tree = new GenericTree();
		tree.display();
		System.out.println("*******************************");
		System.out.println(tree.size2());
		System.out.println("*******************************");
		System.out.println(tree.max());
		System.out.println("*******************************");
		System.out.println(tree.height());
		System.out.println("*******************************");
		System.out.println(tree.find(80));
		System.out.println("*******************************");
		// tree.display();
		// tree.mirror();
		// System.out.println("*******************************");
		// tree.display();
		tree.printatlevel(2);
		System.out.println("*******************************");
		tree.printlevelorder();

	}

}
