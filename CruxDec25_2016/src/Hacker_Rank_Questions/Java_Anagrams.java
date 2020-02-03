package Hacker_Rank_Questions;

public class Java_Anagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(IsAnagrams("ACT", "TAC"));

	}

	public static boolean IsAnagrams(String a, String b) {
		if (a.length() != b.length()) {
			return false;
		}
		int ch = 0;
		int[] frequency = new int[100];
		int[] frequency2 = new int[100];
		for (int i = 0; i < a.length(); i++) {
			ch = a.charAt(i);
			if (a.charAt(i) > 96) {
				ch = ch - 32;
			}
			frequency[ch] += 1;
		}

		for (int i = 0; i < b.length(); i++) {
			ch = b.charAt(i);
			if (b.charAt(i) > 96) {
				ch = ch - 32;
			}
			frequency2[ch] += 1;
		}

		for (int i = 0; i < 100; i++) {
			if (frequency[i] != frequency2[i]) {
				return false;
			}
		}

		return true;
	}

}
