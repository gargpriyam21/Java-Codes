package Assignment8a;

import java.util.ArrayList;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("*******************Q1A*******************");
		System.out.println(countSS("abc", " "));
		System.out.println("*******************Q1B*******************");		
		System.out.println(getSS("abc"));
		System.out.println("*******************Q1C*******************");		
		printSS("abc", " ");

	}

	public static int countSS(String str, String result) {
		if (str.length() == 0) {
			return 1;
		}
		int count = 0;
		char cc = str.charAt(0);
		String ros = str.substring(1);
		String s1 = result + cc;
		count = count + countSS(ros, result);
		count = count + countSS(ros, s1);
		return count;

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

}
