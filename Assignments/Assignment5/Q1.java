package Assignment5;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(palindrom("abcba"));

	}

	public static boolean palindrom(String str) {
		boolean retVal = true;
		int left = 0;
		int right = str.length() - 1;
		while (left < right) {
			if (str.charAt(left) != str.charAt(right)) {
				retVal = false;
				break;
			}
			left++;
			right--;
		}
		return retVal;
	}

}
