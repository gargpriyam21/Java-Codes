package Extras;

import java.util.LinkedList;

public class LL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<Integer> list = new LinkedList<>();
		LinkedList<Integer> elist = new LinkedList<>();
		LinkedList<Integer> olist = new LinkedList<>();

		for (int i = 0; i < 10; i++) {
			list.add(i);
		}

		for (Integer temp : list) {
			if (temp % 2 == 0) {
				elist.add(temp);
			} else {
				olist.add(temp);
			}
		}

		System.out.println(list + "\n" + elist + "\n" + olist);

	}

}
