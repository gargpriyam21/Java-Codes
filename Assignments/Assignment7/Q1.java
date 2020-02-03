package Assignment7;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sumofstring("123"));

	}

	public static int sumofstring(String str) {
		if (str.length() == 1) {
			return str.charAt(0) - '0';
		}
		char cc = str.charAt(0);
		int myResult = 0;
		String ros = str.substring(1);

		int recResult = sumofstring(ros);
		myResult = recResult + (cc - '0');
		return myResult;
	}
}
