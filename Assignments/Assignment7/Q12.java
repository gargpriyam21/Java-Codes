package Assignment7;

public class Q12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printcodes("1123", "");
	}

	public static String getCode(int c) {
		String[] Codes = { ".", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q",
				"r", "s", "t", "u", "v", "w", "x", "y", "z " };

		return Codes[c];
	}

	public static void printcodes(String str, String result) {
		if (str.length() == 0) {
			System.out.println(result);
			return;
		}

		char cc1 = str.charAt(0);
		String ros1 = str.substring(1);
		String s1 = result + getCode(cc1 - '0');
		printcodes(ros1, s1);
		if (str.length() >= 2) {
			String ros2 = str.substring(2);
			char cc2 = str.charAt(1);
			String s2 = result + getCode(((((cc1 - '0') * 10) + cc2) - '0'));
			printcodes(ros2, s2);
		}

	}

}
