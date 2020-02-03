package Assignment5;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		palinsubstring("abc");

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

	public static void palinsubstring(String str) {
		int counter = 0;
		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j <= str.length(); j++) {
				String s1 = str.substring(i, j);
				if (palindrom(s1)) {
					counter++;
				}
			}
		}
		System.out.println(counter);
	}

}
