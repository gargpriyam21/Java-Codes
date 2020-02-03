package Assignment8a;

import java.util.ArrayList;

public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("*******************Q4A*******************");
		System.out.println(countSSper("abc", " "));
		System.out.println("*******************Q4B*******************");
		System.out.println(getperSS("abc"));
		System.out.println("*******************Q4C*******************");
		printSSper("abc", " ");

	}

	public static int countSSper(String str, String result) {
		if (str.length() == 0) {
			return 1;
		}
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			char cc = str.charAt(i);
			String ros = str.substring(0, i) + str.substring(i + 1);
			count = count + countSSper(ros, result + cc);
		}
		return count;

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

}
