package Assignment7;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = stringtointeger("123");
		int r = 0;
		int i = 0;
		while (n != 0) {
			r = n % 10;
			i = i * 10 + r;
			n = n / 10;
		}
		System.out.println(i);

	}

	public static int stringtointeger(String str) {
		if (str.length() == 1) {
			return str.charAt(0) - '0';
		}
		char cc = str.charAt(0);
		int myResult = 0;
		String ros = str.substring(1);

		int recResult = stringtointeger(ros);
		myResult = recResult * 10 + (cc - '0');
		return myResult;
	}

}
