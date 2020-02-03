package Lecture8;

public class RecursionPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(TOH("src", "dest", "helper", 3) - 1);
		System.out.println("***********************************************");
		System.out.println(isbracketbalanced("[a+{b+(c+d)+e}+f]", ""));
		System.out.println("***********************************************");
		System.out.println(getParentContent("abc(xyz)def", false));
		System.out.println("***********************************************");
		lexico(1000, 0);
		System.out.println("***********************************************");
		printlexicoGreater("bacd", "", "bacd", false);
		System.out.println("***********************************************");
		printlexicoSmaller("bacd", "", "bacd", false);
	}

	public static int TOH(String src, String dest, String helper, int discs) {
		if (discs == 0) {
			return 1;
		}
		int counter = 0;
		counter = counter + TOH(src, helper, dest, discs - 1);
		System.out.println("Move " + discs + " from " + src + " to " + dest);
		counter = counter + TOH(helper, dest, src, discs - 1);
		return counter;
	}

	public static boolean isbracketbalanced(String str, String ob) {
		if (str.length() == 0) {
			if (ob.length() == 0) {
				return true;
			} else {
				return false;
			}
		}

		char cc = str.charAt(0);
		String ros = str.substring(1);

		if (cc == '{' || cc == '(' || cc == '[') {
			return isbracketbalanced(ros, ob + cc);
		} else if (cc == '}' || cc == ')' || cc == ']') {
			if (ob.length() == 0) {
				return false;
			} else {
				char lc = ob.charAt(ob.length() - 1);
				if (cc == '}' && lc != '{' || cc == ']' && lc != '[' || cc == ')' && lc != '(') {
					return false;
				} else {
					return isbracketbalanced(ros, ob.substring(0, ob.length() - 1));
				}
			}
		} else {

			return isbracketbalanced(ros, ob);
		}

	}

	public static String getParentContent(String str, boolean startFound) {

		char cc = str.charAt(0);
		String ros = str.substring(1);

		if (cc == '(') {
			String recResult = (getParentContent(ros, true));
			String myResult = recResult;
			return myResult;
		} else if (cc == ')') {
			return "";
		} else {
			String recResult = getParentContent(ros, startFound);
			String myResult = "";
			if (startFound) {
				myResult = cc + recResult;
			} else {
				myResult = recResult;
			}
			return myResult;
		}
	}

	public static void lexico(int end, int curr) {
		if (curr > end) {
			return;
		}
		System.out.println(curr);
		if (curr == 0) {
			for (int i = 1; i < 10; i++) {
				lexico(end, curr * 10 + i);
			}
			return;
		} else {
			for (int i = 0; i < 10; i++) {
				lexico(end, curr * 10 + i);
			}
			return;
		}
	}

	public static void printlexicoGreater(String str, String res, String orig, boolean islarger) {
		if (str.length() == 0) {
			if (!res.equals(orig)) {
				System.out.println(res);
			}
			return;
		}

		for (int i = 0; i < str.length(); i++) {
			char cc = str.charAt(i);
			if (islarger) {
				String ros = str.substring(0, i) + str.substring(i + 1);
				printlexicoGreater(ros, res + cc, orig, islarger);
			} else {
				if (cc >= str.charAt(0)) {
					String ros = str.substring(0, i) + str.substring(i + 1);
					printlexicoGreater(ros, res + cc, orig, cc > str.charAt(0));
				}
			}
		}
	}

	public static void printlexicoSmaller(String str, String res, String orig, boolean issmaller) {
		if (str.length() == 0) {
			if (!res.equals(orig)) {
				System.out.println(res);
			}
			return;
		}

		for (int i = 0; i < str.length(); i++) {
			char cc = str.charAt(i);
			if (issmaller) {
				String ros = str.substring(0, i) + str.substring(i + 1);
				printlexicoSmaller(ros, res + cc, orig, issmaller);
			} else {
				if (cc <= str.charAt(0)) {
					String ros = str.substring(0, i) + str.substring(i + 1);
					printlexicoSmaller(ros, res + cc, orig, cc < str.charAt(0));
				}
			}
		}
	}
}
