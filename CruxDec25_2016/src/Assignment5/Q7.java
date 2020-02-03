package Assignment5;

public class Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		removedublicates("aabccba");

	}

	public static void removedublicates(String str) {
		int j = 0;
		for (int i = 1; i < str.length(); i++) {
			if (str.charAt(i - 1) != str.charAt(i)) {
				System.out.print(str.charAt(j));
				j = i;
			}
		}
		System.out.print(str.charAt(j));
	}

}
