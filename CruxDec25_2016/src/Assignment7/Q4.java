package Assignment7;

public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abcba";
		System.out.println(palindrom(str, 0, str.length() - 1));

	}

	public static boolean palindrom(String str, int left, int right) {
		if (left >= right) {
			return true;
		}
		if (str.charAt(left) != str.charAt(right)) {
			return false;
		}
		return palindrom(str, left + 1, right - 1);

	}

}
