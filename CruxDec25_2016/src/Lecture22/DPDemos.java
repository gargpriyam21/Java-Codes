package Lecture22;

import Lecture10.ComplexityDemos;

public class DPDemos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		int N = 15;
		ComplexityDemos.startAlgo();
		System.out.println(Fib(N));
		System.out.println(ComplexityDemos.endAlgo());

		// int[] strg = new int[N + 1];

		// ComplexityDemos.startAlgo();
		// System.out.println(FibRS(N, strg));
		// System.out.println(ComplexityDemos.endAlgo());

		// ComplexityDemos.startAlgo();
		// System.out.println(FibI(N));
		// System.out.println(ComplexityDemos.endAlgo());

		// ComplexityDemos.startAlgo();
		// System.out.println(cbp(N, 0));
		// System.out.println(ComplexityDemos.endAlgo());

		// ComplexityDemos.startAlgo();
		// System.out.println(cbpRS(N, 0, strg));
		// System.out.println(ComplexityDemos.endAlgo());

		// ComplexityDemos.startAlgo();
		// System.out.println(cbpI(N, 0));
		// System.out.println(ComplexityDemos.endAlgo());

		// ComplexityDemos.startAlgo();
		// System.out.println(countMazePath(N, N, 0, 0));
		// System.out.println(ComplexityDemos.endAlgo());

		// int[][] strg = new int[N + 1][N + 1];

		// ComplexityDemos.startAlgo();
		// System.out.println(countMazePathRS(N, N, 0, 0, strg));
		// System.out.println(ComplexityDemos.endAlgo());

		// ComplexityDemos.startAlgo();
		// System.out.println(countMazePathI(N, N, 0, 0));
		// System.out.println(ComplexityDemos.endAlgo());

		// String s1 = "abgb", s2 = "aggb";

		// ComplexityDemos.startAlgo();
		// System.out.println(LCS(s1, s2));
		// System.out.println(ComplexityDemos.endAlgo());

		// ComplexityDemos.startAlgo();
		// System.out.println(LCSI(s1, s2));
		// System.out.println(ComplexityDemos.endAlgo());

		// String s1 = "abcscdfad", s2 = "asfesfa";

		// ComplexityDemos.startAlgo();
		// System.out.println(editDistance(s1, s2));
		// System.out.println(ComplexityDemos.endAlgo());

		// ComplexityDemos.startAlgo();
		// System.out.println(editDistanceI(s1, s2));
		// System.out.println(ComplexityDemos.endAlgo());

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

	public static int cbpI(int end, int curr) {
		int[] strg = new int[end + 1];

		strg[end] = 1;
		for (int i = end - 1; i >= 0; i--) {
			int sum = 0;
			for (int dice = 1; dice <= 6 && (i + dice) < strg.length; dice++) {
				sum = sum + strg[i + dice];
			}
			strg[i] = sum;
		}

		return strg[curr];
	}

	public static int countMazePath(int endRow, int endCol, int currentRow, int currentCol) {
		if (currentRow == endRow && currentCol == endCol) {
			return 1;
		}
		if (currentRow > endRow || currentCol > endCol) {
			return 0;
		}
		int count = 0;
		count = count + countMazePath(endRow, endCol, currentRow + 1, currentCol);
		count = count + countMazePath(endRow, endCol, currentRow, currentCol + 1);

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
		count = count + countMazePathRS(endRow, endCol, currentRow + 1, currentCol, strg);
		count = count + countMazePathRS(endRow, endCol, currentRow, currentCol + 1, strg);

		strg[currentRow][currentCol] = count;

		return count;
	}

	public static int countMazePathI(int endRow, int endCol, int currentRow, int currentCol) {
		int[][] strg = new int[endRow + 1][endCol + 1];
		strg[endRow][endCol] = 1;

		for (int i = endRow; i >= 0; i--) {
			for (int j = endCol; j >= 0; j--) {
				if (j + 1 < strg.length) {
					strg[i][j] += strg[i][j + 1];
				}
				if (i + 1 < strg.length) {
					strg[i][j] += strg[i + 1][j];
				}
			}
		}

		return strg[currentRow][currentCol];
	}

	public static int LCS(String s1, String s2) {
		if (s1.length() == 0 || s2.length() == 0) {
			return 0;
		}
		if (s1.charAt(0) == s2.charAt(0)) {
			return 1 + LCS(s1.substring(1), s2.substring(1));
		} else {
			return Math.max(LCS(s1, s2.substring(1)), LCS(s1.substring(1), s2));
		}
	}

	public static int LCSI(String s1, String s2) {
		int[][] strg = new int[s1.length() + 1][s2.length() + 1];
		for (int i = s1.length() - 1; i >= 0; i--) {
			for (int j = s2.length() - 1; j >= 0; j--) {
				if (s1.charAt(i) == s2.charAt(j)) {
					strg[i][j] += 1 + strg[i + 1][j + 1];
				} else {
					strg[i][j] += Math.max(strg[i + 1][j], strg[i][j + 1]);
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
		if (s1.charAt(0) == s2.charAt(0)) {
			return editDistance(s1.substring(1), s2.substring(1));
		} else {
			return 1 + Math.min(editDistance(s1, s2.substring(1)),
					Math.min(editDistance(s1.substring(1), s2), editDistance(s1.substring(1), s2.substring(1))));
		}
	}

	public static int editDistanceI(String s1, String s2) {
		int[][] strg = new int[s1.length() + 1][s2.length() + 1];

		for (int i = 0; i <= s1.length(); i++) {
			for (int j = 0; j <= s2.length(); j++) {
				if (i == 0) {
					strg[i][j] = j;
					continue;
				}
				if (j == 0) {
					strg[i][j] = i;
					continue;
				}
				if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
					strg[i][j] = strg[i - 1][j - 1];
				} else {
					int f1 = strg[i - 1][j] + 1;
					int f2 = strg[i][j - 1] + 1;
					int f3 = strg[i - 1][j - 1] + 1;
					strg[i][j] = Math.min(f1, Math.min(f2, f3));
				}
			}
		}

		return strg[s1.length()][s2.length()];
	}

}
