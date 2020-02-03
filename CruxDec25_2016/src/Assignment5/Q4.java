package Assignment5;

public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		oddandeven("abc");

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

}
