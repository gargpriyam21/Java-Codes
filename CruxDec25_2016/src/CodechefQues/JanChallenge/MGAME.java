package CodechefQues.JanChallenge;

import java.util.Scanner;

class MGAME {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		int NOTC = s.nextInt();

		for (int nn = 0; nn < NOTC; nn++) {
			int N = s.nextInt();
			int P = s.nextInt();
			long count = 0;

			if (N == 1 || N == 2) {
				count = P * P * P;
			}

			if (N > 2) {
				int n = (((N - 2) / 2) + 1);
				int r = P - N + 1;
				
				count = 3 * r * r + ((3 * n) - 3) * r + ((n * n) - n + 1);
			}
			
			System.out.println(count);
		}
	}
}
