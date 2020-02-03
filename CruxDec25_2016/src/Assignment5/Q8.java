package Assignment5;

public class Q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stingcompression("aaabbccds");
	}

	public static void stingcompression(String str) {
		int[] counter = new int[200];
		for (int j = 0; j < 200; j++) {
			counter[j] = 1;
		}
		int j = 0;
		for (int i = 1; i < str.length(); i++) {
			if (str.charAt(i - 1) == str.charAt(i)) {
				counter[j]++;
			} else {
				System.out.print(str.charAt(j));
				if (counter[j] > 1) {
					System.out.print(counter[j]);
				}
				j = i;
			}
		}
		System.out.print(str.charAt(j));
		if (counter[j] > 1) {
			System.out.print(counter[j]);
		}
	}
}
