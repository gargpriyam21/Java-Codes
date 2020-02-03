package Assignment8a;

import java.util.ArrayList;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("*******************Q2A*******************");
		System.out.println(countasciiSS("ab", " "));
		System.out.println("*******************Q2B*******************");
		System.out.println(getasciiSS("ab"));
		System.out.println("*******************Q2C*******************");
		printSSascii("ab", " ");

	}

	public static int countasciiSS(String str, String result) {
		if (str.length() == 0) {
			return 1;
		}
		int count = 0;
		char cc = str.charAt(0);
		String ros = str.substring(1);
		String s1 = result + cc;
		String s2 = result + (int) cc;

		count = count + countasciiSS(ros, result);
		count = count + countasciiSS(ros, s1);
		count = count + countasciiSS(ros, s2);
		return count;
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

}
