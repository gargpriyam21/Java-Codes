package Assignment8b;

import java.util.ArrayList;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("*******************Q1A*******************");
		System.out.println(countBoardPath(10, 0, ""));
		System.out.println("*******************Q1B*******************");
		System.out.println(getBoardPath(10, 0));
		System.out.println("*******************Q1C*******************");
		printBoardPath(10, 0, "");

	}

	public static int countBoardPath(int end, int current, String path) {
		if (current > end) {
			return 0;
		}
		if (current == end) {
			return 1;
		}
		int count = 0;
		for (int i = 1; i <= 6; i++) {
			count = count + countBoardPath(end, current + i, path + i);
		}
		return count;
	}

	public static ArrayList<String> getBoardPath(int end, int curr) {
		if (curr > end) {
			ArrayList<String> baseresult = new ArrayList<>();
			return baseresult;
		}
		if (curr == end) {
			ArrayList<String> baseresult = new ArrayList<>();
			baseresult.add("");
			return baseresult;
		}

		ArrayList<String> recresult = null;
		ArrayList<String> myresult = new ArrayList<>();

		for (int i = 1; i <= 6; i++) {
			recresult = getBoardPath(end, curr + i);
			for (int j = 0; j < recresult.size(); j++) {
				myresult.add(recresult.get(j) + i);
			}
		}
		return myresult;
	}

	public static void printBoardPath(int end, int current, String path) {
		if (current > end) {
			return;
		}
		if (current == end) {
			System.out.println(path);
			return;
		}
		for (int i = 1; i <= 6; i++) {
			printBoardPath(end, current + i, path + i);
		}
	}

}
