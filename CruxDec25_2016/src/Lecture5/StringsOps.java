package Lecture5;

public class StringsOps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Scanner s = new Scanner(System.in);
		// String S = s.next();
		printChars("Hello");
		System.out.println("*****************");
		printsubstring("abc");
		System.out.println("*****************");
		System.out.println(palindrom("abcba"));
		System.out.println("*****************");
		palinsubstring("Hello");
		System.out.println("*****************");
		casechange("HelLo");
		System.out.println("*****************");
		oddandeven("abc");
		System.out.println("*****************");
		insertascii("acf");

	}

	public static void printChars(String str) {
		for (int i = 0; i < str.length(); i++) {
			System.out.println(str.charAt(i));
		}
	}

	public static void printsubstring(String str) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j <= str.length(); j++) {
				System.out.println(str.substring(i, j));
				count++;
			}
		}
		System.out.println(count);
	}

	public static boolean palindrom(String str) {
		boolean retVal = true;
		int left = 0;
		int right = str.length() - 1;
		while (left < right) {
			if (str.charAt(left) != str.charAt(right)) {
				retVal = false;
				break;
			}
			left++;
			right--;
		}
		return retVal;
	}

	public static void palinsubstring(String str) {
		int counter = 0;
		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j <= str.length(); j++) {
				String s1 = str.substring(i, j);
				if (palindrom(s1)) {
					counter++;
				}
			}
		}
		System.out.println(counter);
	}

	public static void casechange(String str) {
		StringBuilder sb = new StringBuilder(str);
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) >= 65 && str.charAt(i) <= 90) {
				sb.setCharAt(i, (char) (str.charAt(i) + 32));
			} else {
				sb.setCharAt(i, (char) (str.charAt(i) - 32));
			}
		}
		System.out.println(sb.toString());
	}

	public static void oddandeven(String str) {
		StringBuilder sb = new StringBuilder(str);
		int counter = 1;
		for (int i = 0; i < str.length(); i++, counter++) {
			if (counter % 2 == 0) {
				sb.setCharAt(i, (char) (str.charAt(i) - 1));
			} else {
				sb.setCharAt(i, (char) (str.charAt(i) + 1));
			}
		}
		System.out.println(sb.toString());
	}

	public static void insertascii(String str) {
		StringBuilder sb = new StringBuilder();
		char prev = str.charAt(0);
		for (int i = 1; i < str.length(); i++) {
			char cc = str.charAt(i);
			sb.append(prev);
			sb.append(cc - prev);
			prev = cc;
		}
		sb.append(prev);
		System.out.println(sb.toString());
	}

}
