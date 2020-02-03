package Assignment8a;

public class Q10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printlexicoSmaller("bacd", "", "bacd", false);
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
