package Assignment7;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abcd";
		String chk = "dcba";
		System.out.println(retVal(reverse(str), chk));

	}

	public static boolean retVal(String str1, String str2) {
		if (str1.equals(str2)) {
			return true;
		}
		return false;
	}

	public static String reverse(String str) {
		if (str.length() == 0) {
			return "";
		}
		char cc = str.charAt(0);
		String ros = str.substring(1);
		String myResult = null;

		String recResult = reverse(ros);
		myResult = recResult + cc;
		return myResult;
	}

}
