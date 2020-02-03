package CodechefQues.JanChallenge;

import java.util.Scanner;

class HP18 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int NOTC = s.nextInt();

		for (int n = 0; n < NOTC; n++) {
			int acount = 0, bcount = 0;
			int N = s.nextInt();
			int a = s.nextInt();
			int b = s.nextInt();
			int[] arr = new int[N];

			for (int i = 0; i < N; i++) {
				int element = s.nextInt();
				arr[i] = element;
			}

			for (int i = 0; i < N; i++) {
				if ((arr[i] % a == 0) && (arr[i] % b == 0)) {
					if (acount <= bcount) {
						acount++;
					} else {
						bcount++;
					}
					continue;
				}
				if (arr[i] % a == 0) {
					acount++;
				}

				if (arr[i] % b == 0) {
					bcount++;
				}
			}

			if (acount <= bcount) {
				System.out.println("ALICE");
			} else {
				System.out.println("BOB");
			}
		}
	}
}