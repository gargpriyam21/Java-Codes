package Lecture14and15;

public class Client1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		LinkedList list1 = new LinkedList();
		LinkedList list2 = new LinkedList();
		LinkedList list3 = new LinkedList();

		// list1.addFirst(10);
		// list1.addLast(20);
		// list1.addLast(30);
		// list1.addLast(40);
		// list1.addLast(50);
		// list1.display();
		//
		// list2.addFirst(25);
		// list2.addLast(35);
		// list2.addLast(70);
		// list2.display();
		//
		// list3 = list1.Merge(list2);
		// list3.display();

		list1.addFirst(40);
		list1.addLast(20);
		list1.addLast(10);
		list1.addLast(30);
		list1.addLast(50);
		list1.display();
		list1.MergeSortB();
		list1.display();

		// System.out.println(list1.NodeSearchR(30));
		// list3 = list1.MergeSort(list1, 0, list1.size() - 1);
		// list3.display();

	}

}
