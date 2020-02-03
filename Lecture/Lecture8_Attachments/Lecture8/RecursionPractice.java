package Lecture8;

public class RecursionPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println(TOH("src", "dest", "helper", 3));
		System.out.println(isBracketBalanced("([a+{b+(c+d)+e}+f])]", ""));
		System.out.println(getParentContent("abc(xyz)def", false));
		lexico(1000, 0);
		System.out.println("**************************************");
		printLexicoGreater("bacd", "", "bacd", false);
		System.out.println("*************************************");
		printLexicoSmaller("bacd", "", "bacd", false);

	}

	public static int TOH(String src, String dest, String helper, int discs) {
		if (discs == 0) {
			return 0;
		}
		int count = 0;
		count += TOH(src, helper, dest, discs - 1);
		System.out.println("Move " + discs + " from " + src + " to " + dest);
		count++;
		count += TOH(helper, dest, src, discs - 1);
		return count;
	}

	public static boolean isBracketBalanced(String str, String ob) {
		if (str.length() == 0) {
			if (ob.length() == 0) {
				return true;
			} else {
				return false;
			}
		}

		char cc = str.charAt(0);
		String ros = str.substring(1);

		if (cc == '(' || cc == '{' || cc == '[') {
			return isBracketBalanced(ros, ob + cc);
		} else if (cc == ')' || cc == '}' || cc == ']') {
			if (ob.length() == 0) {
				return false;
			} else {
				char lc = ob.charAt(ob.length() - 1);
				if ((cc == ')' && lc != '(') || (cc == ']' && lc != '[') || (cc == '}' && lc != '{')) {
					return false;
				} else {
					return isBracketBalanced(ros, ob.substring(0, ob.length() - 1));
				}
			}
		} else {
			return isBracketBalanced(ros, ob);
		}

	}

	public static String getParentContent(String str, boolean startFound) {
		char cc = str.charAt(0);
		String ros = str.substring(1);

		if (cc == '(') {
			String recResult = getParentContent(ros, true);
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

		for (int i = (curr == 0 ? 1 : 0); i < 10; i++) {
			lexico(end, curr * 10 + i);
		}
	}

	public static void printLexicoGreater(String str, String result, String orig, boolean isLarger) {

		if (str.length() == 0) {
			if (!result.equals(orig)) {
				System.out.println(result);
			}
			return;
		}
		for (int i = 0; i < str.length(); i++) {
			char cc = str.charAt(i);

			if (isLarger) {
				String ros = str.substring(0, i) + str.substring(i + 1);
				printLexicoGreater(ros, result + cc, orig, isLarger);
			} else {
				if (cc >= str.charAt(0)) {
					String ros = str.substring(0, i) + str.substring(i + 1);
					printLexicoGreater(ros, result + cc, orig, cc > str.charAt(0));
				}
			}
		}

	}

	public static void printLexicoSmaller(String str, String result, String orig, boolean isSmaller) {
		if (str.length() == 0) {
			if (!result.equals(orig)) {
				System.out.println(result);
			}
			return;
		}
		for (int i = 0; i < str.length(); i++) {
			char cc = str.charAt(i);

			if (isSmaller) {
				String ros = str.substring(0, i) + str.substring(i + 1);
				printLexicoSmaller(ros, result + cc, orig, isSmaller);
			} else {
				if (cc <= str.charAt(0)) {
					String ros = str.substring(0, i) + str.substring(i + 1);
					printLexicoSmaller(ros, result + cc, orig, cc < str.charAt(0));
				}
			}
		}
	}

}
