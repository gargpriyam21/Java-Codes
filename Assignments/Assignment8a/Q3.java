package Assignment8a;

import java.util.ArrayList;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(countSSnokia("12", ""));
		System.out.println("**********************************");
		System.out.println(getSSnokia("12"));
		System.out.println("**********************************");
		printSSnokia("12", "");

	}

	public static String getCode(char c) {
		String[] Codes = { ".,", "abc", "def", "ghi", "jkl", "mno", "pqr", "stu", "vwx", "yz" };
		int Index = c - '0';
		return Codes[Index];
	}

	public static int countSSnokia(String str, String result) {
		if (str.length() == 0) {
			return 1;
		}
		int count = 0;
		char cc = str.charAt(0);
		String ros = str.substring(1);
		if (cc == '1') {
			String s1 = result + 'a';
			count = count + countSSnokia(ros, s1);
			s1 = result + 'b';
			count = count + countSSnokia(ros, s1);
			s1 = result + 'c';
			count = count + countSSnokia(ros, s1);
		}
		if (cc == '2') {
			String s1 = result + "d";
			count = count + countSSnokia(ros, s1);
			s1 = result + "e";
			count = count + countSSnokia(ros, s1);
			s1 = result + "f";
			count = count + countSSnokia(ros, s1);
		}
		if (cc == '3') {
			String s1 = result + 'g';
			count = count + countSSnokia(ros, s1);
			s1 = result + 'h';
			count = count + countSSnokia(ros, s1);
			s1 = result + 'i';
			count = count + countSSnokia(ros, s1);
		}
		if (cc == '4') {
			String s1 = result + "j";
			count = count + countSSnokia(ros, s1);
			s1 = result + "k";
			count = count + countSSnokia(ros, s1);
			s1 = result + "l";
			count = count + countSSnokia(ros, s1);
		}
		if (cc == '5') {
			String s1 = result + 'm';
			count = count + countSSnokia(ros, s1);
			s1 = result + 'n';
			count = count + countSSnokia(ros, s1);
			s1 = result + 'o';
			count = count + countSSnokia(ros, s1);
		}
		if (cc == '6') {
			String s1 = result + 'p';
			count = count + countSSnokia(ros, s1);
			s1 = result + 'q';
			count = count + countSSnokia(ros, s1);
			s1 = result + 'r';
			count = count + countSSnokia(ros, s1);
			s1 = result + 's';
			count = count + countSSnokia(ros, s1);
		}
		if (cc == '7') {
			String s1 = result + "t";
			count = count + countSSnokia(ros, s1);
			s1 = result + "u";
			count = count + countSSnokia(ros, s1);
			s1 = result + "v";
			count = count + countSSnokia(ros, s1);
		}
		if (cc == '8') {
			String s1 = result + "w";
			count = count + countSSnokia(ros, s1);
			s1 = result + "x";
			count = count + countSSnokia(ros, s1);
			s1 = result + "y";
			count = count + countSSnokia(ros, s1);
			s1 = result + "z";
			count = count + countSSnokia(ros, s1);
		}
		return count;
	}

	public static ArrayList<String> getSSnokia(String str) {
		if (str.length() == 0) {
			ArrayList<String> baseresult = new ArrayList<>();
			baseresult.add("");
			return baseresult;
		}

		char cc = str.charAt(0);
		String ros = str.substring(1);

		ArrayList<String> myresult = new ArrayList<>();
		ArrayList<String> recresult = getSSnokia(ros);
		String codes = getCode(cc);
		for (int i = 0; i < recresult.size(); i++) {
			String recString = recresult.get(i);
			for (int j = 0; j < codes.length(); j++) {
				myresult.add(codes.charAt(j) + recString);
			}
		}

		return myresult;
	}

	public static void printSSnokia(String str, String result) {
		if (str.length() == 0) {
			System.out.println(result);
			return;
		}
		char cc = str.charAt(0);
		String ros = str.substring(1);
		if (cc == '1') {
			String s1 = result + 'a';
			printSSnokia(ros, s1);
			s1 = result + 'b';
			printSSnokia(ros, s1);
			s1 = result + 'c';
			printSSnokia(ros, s1);
		}
		if (cc == '2') {
			String s1 = result + "d";
			printSSnokia(ros, s1);
			s1 = result + "e";
			printSSnokia(ros, s1);
			s1 = result + "f";
			printSSnokia(ros, s1);
		}
		if (cc == '3') {
			String s1 = result + 'g';
			printSSnokia(ros, s1);
			s1 = result + 'h';
			printSSnokia(ros, s1);
			s1 = result + 'i';
			printSSnokia(ros, s1);
		}
		if (cc == '4') {
			String s1 = result + "j";
			printSSnokia(ros, s1);
			s1 = result + "k";
			printSSnokia(ros, s1);
			s1 = result + "l";
			printSSnokia(ros, s1);
		}
		if (cc == '5') {
			String s1 = result + 'm';
			printSSnokia(ros, s1);
			s1 = result + 'n';
			printSSnokia(ros, s1);
			s1 = result + 'o';
			printSSnokia(ros, s1);
		}
		if (cc == '6') {
			String s1 = result + 'p';
			printSSnokia(ros, s1);
			s1 = result + 'q';
			printSSnokia(ros, s1);
			s1 = result + 'r';
			printSSnokia(ros, s1);
			s1 = result + 's';
			printSSnokia(ros, s1);
		}
		if (cc == '7') {
			String s1 = result + "t";
			printSSnokia(ros, s1);
			s1 = result + "u";
			printSSnokia(ros, s1);
			s1 = result + "v";
			printSSnokia(ros, s1);
		}
		if (cc == '8') {
			String s1 = result + "w";
			printSSnokia(ros, s1);
			s1 = result + "x";
			printSSnokia(ros, s1);
			s1 = result + "y";
			printSSnokia(ros, s1);
			s1 = result + "z";
			printSSnokia(ros, s1);
		}
	}

}
