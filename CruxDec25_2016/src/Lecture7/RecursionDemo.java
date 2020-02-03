package Lecture7;

import java.util.ArrayList;

public class RecursionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getSS("abc"));
		System.out.println("**********************************************************");
		System.out.println(getasciiSS("ab"));
		System.out.println("**********************************************************");
		System.out.println(getperSS("abc"));
		System.out.println("**********************************************************");
		System.out.println(getBoardPath(10, 0));
		System.out.println("----------------------------------------------------------");
		printSS("abc", " ");
		System.out.println("\n**********************************************************");
		printSSascii("ab", " ");
		System.out.println("\n**********************************************************");
		printSSper("abc", " ");
		System.out.println("\n**********************************************************");
		printBoardPath(10, 0, "");

	}

	public static ArrayList<String> getSS(String str) {
		if (str.length() == 0) {
			ArrayList<String> baseresult = new ArrayList<>();
			baseresult.add(" ");
			return baseresult;
		}

		char cc = str.charAt(0);
		String ros = str.substring(1);

		ArrayList<String> myresult = new ArrayList<>();
		ArrayList<String> recresult = getSS(ros);

		for (int i = 0; i < recresult.size(); i++) {
			myresult.add(recresult.get(i));
			myresult.add(cc + recresult.get(i));
		}
		return myresult;
	}

	public static ArrayList<String> getasciiSS(String str) {

		if (str.length() == 0) {
			ArrayList<String> baseresult = new ArrayList<>();
			baseresult.add(" ");
			return baseresult;
		}

		char cc = str.charAt(0);
		String ros = str.substring(1);

		ArrayList<String> myresult = new ArrayList<>();
		ArrayList<String> recresult = getasciiSS(ros);

		for (int i = 0; i < recresult.size(); i++) {
			myresult.add(recresult.get(i));
			myresult.add((int) (cc) + recresult.get(i));
			myresult.add(cc + recresult.get(i));
		}
		return myresult;

	}

	public static ArrayList<String> getperSS(String str) {
		if (str.length() == 0) {
			ArrayList<String> baseresult = new ArrayList<>();
			baseresult.add("");
			return baseresult;
		}

		char cc = str.charAt(0);
		String ros = str.substring(1);

		ArrayList<String> myresult = new ArrayList<>();
		ArrayList<String> recresult = getperSS(ros);

		for (int i = 0; i < recresult.size(); i++) {
			String recString = recresult.get(i);
			for (int j = 0; j <= recString.length(); j++) {
				String myString = recString.substring(0, j) + cc + recString.substring(j);
				myresult.add(myString);
			}
		}
		return myresult;
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

	public static void printSS(String str, String result) {
		if (str.length() == 0) {
			System.out.println(result);
			return;
		}
		char cc = str.charAt(0);
		String ros = str.substring(1);
		String s1 = result + cc;
		printSS(ros, result);
		printSS(ros, s1);

	}

	public static void printSSascii(String str, String result) {
		if (str.length() == 0) {
			System.out.println(result);
			return;
		}
		char cc = str.charAt(0);
		String ros = str.substring(1);
		String s1 = result + cc;
		String s2 = result + (int) cc;

		printSSascii(ros, result);
		printSSascii(ros, s1);
		printSSascii(ros, s2);
	}

	public static void printSSper(String str, String result) {
		if (str.length() == 0) {
			System.out.println(result);
			return;
		}
		for (int i = 0; i < str.length(); i++) {
			char cc = str.charAt(i);
			String ros = str.substring(0, i) + str.substring(i + 1);
			printSSper(ros, result + cc);
		}

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
