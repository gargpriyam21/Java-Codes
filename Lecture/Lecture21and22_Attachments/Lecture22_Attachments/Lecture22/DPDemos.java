package Lecture22;

import Lecture10.ComplexityDemos;

public class DPDemos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N = 15;
		// ComplexityDemos.startAlgo();
		// System.out.println(Fib(N));
		// System.out.println(ComplexityDemos.endAlgo());

		int[][] strg = new int[N + 1][N + 1];
		// ComplexityDemos.startAlgo();
		// System.out.println(FibRS(N,strg));
		// System.out.println(ComplexityDemos.endAlgo());
		//
		// ComplexityDemos.startAlgo();
		// System.out.println(FibI(N));
		// System.out.println(ComplexityDemos.endAlgo());

		// ComplexityDemos.startAlgo();
		// System.out.println(cbp(N,0));
		// System.out.println(ComplexityDemos.endAlgo());
		//
		// ComplexityDemos.startAlgo();
		// System.out.println(cbpRS(N,0,strg));
		// System.out.println(ComplexityDemos.endAlgo());
		//
		// ComplexityDemos.startAlgo();
		// System.out.println(cbpI(N));
		// System.out.println(ComplexityDemos.endAlgo());

		// ComplexityDemos.startAlgo();
		// System.out.println(countMazePath(N, N, 0, 0));
		// System.out.println(ComplexityDemos.endAlgo());
		//
		// ComplexityDemos.startAlgo();
		// System.out.println(countMazePathRS(N, N, 0, 0,strg));
		// System.out.println(ComplexityDemos.endAlgo());
		//
		// ComplexityDemos.startAlgo();
		// System.out.println(countMazePathI(N, N));
		// System.out.println(ComplexityDemos.endAlgo());

		String s1 = "abgbnjnjddkjdfjdknknvdnvd", s2 = "aggbkdkdvkdvdndddkd";
		// ComplexityDemos.startAlgo();
		// System.out.println(LCS(s1, s2));
		// System.out.println(ComplexityDemos.endAlgo());

		// ComplexityDemos.startAlgo();
		// System.out.println(LCSI(s1, s2));
		// System.out.println(ComplexityDemos.endAlgo());
		s1 = "abdefghtdkjdkljdkjkldsj";
		s2 = "abddvvdsdvds";
		ComplexityDemos.startAlgo();
		System.out.println(editDistance(s1, s2));
		System.out.println(ComplexityDemos.endAlgo());

		ComplexityDemos.startAlgo();
		System.out.println(editDistanceI(s1, s2));
		System.out.println(ComplexityDemos.endAlgo());
	}

	public static int Fib(int n) {
		if (n == 0 || n == 1) {
			return n;
		}

		int fibnm1 = Fib(n - 1);
		int fibnm2 = Fib(n - 2);

		int fibn = fibnm1 + fibnm2;
		return fibn;
	}

	public static int FibRS(int n, int[] strg) {
		if (n == 0 || n == 1) {
			return n;
		}

		if (strg[n] != 0) {
			return strg[n];
		}

		int fibnm1 = FibRS(n - 1, strg);
		int fibnm2 = FibRS(n - 2, strg);

		int fibn = fibnm1 + fibnm2;

		strg[n] = fibn;
		return fibn;
	}

	public static int FibI(int n) {
		int[] strg = new int[n + 1];

		// seed
		strg[0] = 0;
		strg[1] = 1;

		for (int i = 2; i <= n; i++) {
			strg[i] = strg[i - 1] + strg[i - 2];
		}

		return strg[n];

	}

	public static int cbp(int end, int curr) {
		if (end == curr) {
			return 1;
		}
		if (curr > end) {
			return 0;
		}

		int count = 0;
		for (int i = 1; i <= 6; i++) {
			count += cbp(end, curr + i);
		}

		return count;
	}

	public static int cbpRS(int end, int curr, int[] strg) {
		if (end == curr) {
			return 1;
		}
		if (curr > end) {
			return 0;
		}
		if (strg[curr] != 0) {
			return strg[curr];
		}

		int count = 0;
		for (int i = 1; i <= 6; i++) {
			count += cbpRS(end, curr + i, strg);
		}

		strg[curr] = count;

		return count;
	}

	public static int cbpI(int end) {
		int[] strg = new int[end + 1];
		// seed
		strg[end] = 1;

		for (int i = end - 1; i >= 0; i--) {
			int sum = 0;
			for (int dice = 1; dice <= 6 && i + dice < strg.length; dice++) {
				sum = sum + strg[i + dice];
			}

			strg[i] = sum;
		}

		return strg[0];
	}

	public static int countMazePath(int endRow, int endCol, int currentRow, int currentCol) {

		if (currentRow == endRow && currentCol == endCol) {
			return 1;
		}

		if (currentRow > endRow || currentCol > endCol) {
			return 0;
		}

		int count = 0;
		count = count + countMazePath(endRow, endCol, currentRow, currentCol + 1);
		count = count + countMazePath(endRow, endCol, currentRow + 1, currentCol);

		return count;
	}

	public static int countMazePathRS(int endRow, int endCol, int currentRow, int currentCol, int[][] strg) {

		if (currentRow == endRow && currentCol == endCol) {
			return 1;
		}

		if (currentRow > endRow || currentCol > endCol) {
			return 0;
		}

		if (strg[currentRow][currentCol] != 0) {
			return strg[currentRow][currentCol];
		}

		int count = 0;
		count = count + countMazePathRS(endRow, endCol, currentRow, currentCol + 1, strg);
		count = count + countMazePathRS(endRow, endCol, currentRow + 1, currentCol, strg);

		strg[currentRow][currentCol] = count;
		return count;
	}

	public static int countMazePathI(int er, int ec) {
		int[][] strg = new int[er + 1][ec + 1];
		strg[er][ec] = 1;

		for (int row = er; row >= 0; row--) {
			for (int col = ec; col >= 0; col--) {
				if (row == er || col == ec) {
					strg[row][col] = 1;
				} else {
					strg[row][col] = strg[row + 1][col] + strg[row][col + 1];
				}
			}
		}
		return strg[0][0];

	}

	public static int LCS(String s1, String s2) {
		if (s1.length() == 0 || s2.length() == 0) {
			return 0;
		}
		char ch1 = s1.charAt(0);
		char ch2 = s2.charAt(0);
		String ros1 = s1.substring(1);
		String ros2 = s2.substring(1);
		int rv = 0;
		if (ch1 == ch2) {
			rv = 1 + LCS(ros1, ros2);
		} else {
			int f1 = LCS(ros1, s2);
			int f2 = LCS(s1, ros2);

			rv = Math.max(f1, f2);
		}

		return rv;
	}

	public static int LCSI(String s1, String s2) {
		int[][] strg = new int[s1.length() + 1][s2.length() + 1];

		strg[s1.length()][s2.length()] = 0;
		for (int s1l = s1.length(); s1l >= 0; s1l--) {
			for (int s2l = s2.length(); s2l >= 0; s2l--) {
				if (s1l == s1.length() || s2l == s2.length()) {
					strg[s1l][s2l] = 0;
					continue;
				}
				if (s1.charAt(s1l) == s2.charAt(s2l)) {
					strg[s1l][s2l] = 1 + strg[s1l + 1][s2l + 1];
				} else {
					strg[s1l][s2l] = Math.max(strg[s1l + 1][s2l], strg[s1l][s2l + 1]);
				}
			}
		}

		return strg[0][0];
	}

	public static int editDistance(String s1, String s2) {
		if (s1.length() == 0) {
			return s2.length();
		}
		if (s2.length() == 0) {
			return s1.length();
		}

		char cc1 = s1.charAt(0);
		char cc2 = s2.charAt(0);

		String ros1 = s1.substring(1);
		String ros2 = s2.substring(1);

		if (cc1 == cc2) {
			return editDistance(ros1, ros2);
		} else {
			int f1 = 1 + editDistance(ros1, ros2); // replacement
			int f2 = 1 + editDistance(s1, ros2); // removal
			int f3 = 1 + editDistance(ros1, s2); // addition

			int rv = Math.min(f1, Math.min(f2, f3));
			return rv;

		}
	}

	public static int editDistanceI(String s1, String s2) {

		int[][] storage = new int[s1.length() + 1][s2.length() + 1];

		for (int s1Idx = 0; s1Idx <= s1.length(); s1Idx++) {
			for (int s2Idx = 0; s2Idx <= s2.length(); s2Idx++) {
				if (s1Idx == 0) {
					storage[s1Idx][s2Idx] = s2Idx;
					continue;
				}
				if (s2Idx == 0) {
					storage[s1Idx][s2Idx] = s1Idx;
					continue;
				}

				if (s1.charAt(s1Idx - 1) == s2.charAt(s2Idx - 1)) {
					storage[s1Idx][s2Idx] = storage[s1Idx - 1][s2Idx - 1];
				} else {
					int f1 = storage[s1Idx - 1][s2Idx - 1] + 1;
					int f2 = storage[s1Idx][s2Idx - 1] + 1;
					int f3 = storage[s1Idx - 1][s2Idx] + 1;

					storage[s1Idx][s2Idx] = Math.min(f1, Math.min(f2, f3));

				}

			}
		}
		return storage[s1.length()][s2.length()];

	}

}
