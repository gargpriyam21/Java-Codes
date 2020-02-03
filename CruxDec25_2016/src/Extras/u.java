package Extras;

public class u {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char c1 = MaxOccuredChar("instanceofjava");
		System.out.println(c1);

		char c2 = MaxOccuredChar("aaaabbbccc");
		System.out.println(c2);

		char c3 = MaxOccuredChar("ssssiiinnn");
		System.out.println(c3);

		char c4 = MaxOccuredChar("jaaaavvvvvvvvaaaaaaaaaa");
		System.out.println(c4);

	}

	public static char MaxOccuredChar(String str) {

		char[] array = str.toCharArray();
		int maxCount = 1;
		char maxChar = array[0];

		for (int i = 0, j = 0; i < str.length() - 1; i = j) {
			int count = 1;
			while (++j < str.length() && array[i] == array[j]) {
				count++;
			}

			if (count > maxCount) {
				maxCount = count;
				maxChar = array[i];
			}

		}

		return (char)maxChar;
	}

}
