package Lecture16;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		// 80 3 40 2 110 0 120 0 60 0 70 1 140 0
		GenericTree tree = new GenericTree();

		tree.display();
		System.out.println(tree.size2());
		System.out.println(tree.max());
		System.out.println(tree.height());
		System.out.println(tree.find(60));
		System.out.println(tree.find(75));
//		tree.mirror();
//		tree.display();
		
		tree.printAtlevel(1);
		System.out.println("********************");
		tree.levelOrder();
	}

}
