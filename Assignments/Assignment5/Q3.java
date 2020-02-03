package Assignment5;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		casechange("HeLlo");

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

}
