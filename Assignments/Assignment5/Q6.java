package Assignment5;

public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		maxfrequency("AAAAAAAAAAAAAAAAAAbbbbbbbbhhhhhhccccccccccccccccgggggg");

	}

	public static void maxfrequency(String str) {
		int[] counter = new int[20000];
		for (int j = 0; j < 20000; j++) {
			counter[j] = 1;
		}
		for (int i = 1; i < str.length(); i++) {
			int j = str.charAt(i);
			if (str.charAt(i - 1) == str.charAt(i)) {
				counter[j]++;
			} else {
				j++;
			}
		}
		int max = 0;
		int k = 0;
		for (int j = 65; j >= 65 && j <= 122; j++) {
			if (counter[j] > max) {
				max = counter[j];
				k = j;
			}
		}
		System.out.println((char) k);
	}
}
