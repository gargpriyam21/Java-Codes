package Lecture5;

public class StringOps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printChars("Hello");
		System.out.println("*************************************");
		subString("Hello");
		System.out.println(isPalindrome("abba"));
		System.out.println(countPlaindromicSubstrings("Hello"));
		System.out.println(toggleCase("Hello"));
		System.out.println(insertAscii("acf"));

	}

	public static void printChars(String str) {
		for (int i = 0; i < str.length(); i++) {
			System.out.println(str.charAt(i));
		}
	}

	public static void subString(String str) {
		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j <= str.length(); j++) {
				System.out.println(str.substring(i, j));
			}
		}
	}

	public static boolean isPalindrome(String str) {
		int left = 0;
		int right = str.length() - 1;
		boolean retVal = true;
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

	public static int countPlaindromicSubstrings(String str) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j <= str.length(); j++) {
				String toCheck = str.substring(i, j);
				if (isPalindrome(toCheck)) {
					count++;
				}
			}
		}
		return count;
	}

	public static String toggleCase(String str) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < str.length(); i++) {
			char cc = str.charAt(i);
			if (cc >= 97 && cc <= 122) {
				char fc = (char) (cc - 32);
				sb.append(fc);
			} else {
				char fc = (char) (cc + 32);
				sb.append(fc);
			}
		}
		return sb.toString();
	}

	public static String insertAscii(String str) {
		StringBuilder sb = new StringBuilder();
		char prev = str.charAt(0);
		for (int i = 1; i < str.length(); i++) {
			char cc = str.charAt(i);
			sb.append(prev);
			sb.append(cc - prev);
			prev = cc;
		}
		sb.append(prev);
		return sb.toString();
	}

}
