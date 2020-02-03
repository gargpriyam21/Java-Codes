package CodechefQues.JunChallenge;

import java.util.Scanner;

class PROXYC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		int N = s.nextInt();

		for (int n = 0; n < N; n++) {
			int D = s.nextInt();
			String str = s.next();

			System.out.println(Solution(D, str));
		}
	}

	public static int Solution(int D, String str) {

		int cnt = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'P') {
				cnt++;
			}
		}

		int val = (int) Math.ceil(0.75 * D);
		int rv = val - cnt;

		int result = 0;
		if (rv < 0) {
			;
		} else if (D <= 4) {
			;
		} else {
			for (int i = 2; i < D - 2; i++) {
				if (rv == 0) {
					break;
				}
				if ((str.charAt(i) == 'A') && ((str.charAt(i + 1) == 'P' || str.charAt(i + 2) == 'P')
						&& (str.charAt(i - 1) == 'P' || str.charAt(i - 2) == 'P'))) {
					rv--;
					result++;
				}
			}
		}

		if (rv <= 0) {
			return result;
		} else {
			return -1;
		}
	}
}
