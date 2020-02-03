package Assignment8a;

public class Q9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		printlexicoGreater("bacd", "", "bacd", false);

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

}
