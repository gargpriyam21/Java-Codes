package Aditya.Contest_29June;

import java.util.Scanner;

public class QB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);

		String str = s.next();
		int N = str.length();

		System.out.println(str.substring(0, 2));

		int[][] arr = new int[N][N];

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (i > j) {
					if (j == 0) {
						int e = 0;
						if (str.substring(i - 1, i + 1).equals("*!") || str.substring(i - 1, i + 1).equals("!*")) {
							e = 1;
						}
						arr[i][j] = arr[i - 1][j] + e;
					}

				}
			}
		}

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}

	}

}