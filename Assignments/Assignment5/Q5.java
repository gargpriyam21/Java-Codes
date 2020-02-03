package Assignment5;

public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		insertascii("acf");

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
