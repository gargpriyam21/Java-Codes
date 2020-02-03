package Hacker_Rank_Questions;

import java.util.Scanner;

public class Substring_Comparision {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		int k = scan.nextInt();
		scan.close();

		System.out.println(getSmallestAndLargest(s, k));
	}

	public static String getSmallestAndLargest(String s, int k) {
		String smallest = "";
		String largest = "";

		String[] str = new String[s.length() - k + 1];

		for (int i = 0; i < str.length; i++) {
			str[i] = s.substring(i, i + k);
		}

		for (int i = 0; i <= str.length - 2; ++i) {
			for (int j = i + 1; j <= str.length - 1; ++j) {
				if (str[i].charAt(0) > str[j].charAt(0)) {
					String temp = str[i];
					str[i] = str[j];
					str[j] = temp;
				}
			}
		}

		smallest = str[0];
		largest = str[str.length - 1];

		return smallest + "\n" + largest;
	}

}
