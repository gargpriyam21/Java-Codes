package CodechefQues;

import java.util.Scanner;

class PRDRG {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		int NOTC = s.nextInt();

		int[] TC = new int[NOTC];
		for (int i = 0; i < NOTC; i++) {
			TC[i] = s.nextInt();
		}

		for (int i = 0; i < NOTC; i++) {
			System.out.print(GetResult(TC[i]) + " " + (int) (Math.pow(2, TC[i])));
			if (i != NOTC - 1) {
				System.out.print(" ");
			}
		}
	}

	public static int GetResult(int n) {
		int xval[] = new int[n];
		xval[0] = xval[1] = 1;
		for (int i = 2; i < n; i++) {
			xval[i] = xval[i - 1] + (2 * xval[i - 2]);
		}
		return xval[n - 1];
	}
}
