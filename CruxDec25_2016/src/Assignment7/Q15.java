package Assignment7;

public class Q15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isbracketbalanced("[a+{b+(c+d)+e}+f]", ""));

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

}
