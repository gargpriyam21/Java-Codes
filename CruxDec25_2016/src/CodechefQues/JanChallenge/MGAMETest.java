package CodechefQues.JanChallenge;

import java.util.Scanner;

public class MGAMETest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		int NOTC = 4950;

		for (int N = 1; N <= 100; N++) {
			for (int P = 1; P <= 100; P++) {
				if (P <= N) {
					mgame(P, N);
//					System.out.println("**********************");
				}
			}
		}
	}

	public static void mgame(int N, int P) {

		System.out.println(N + " " + P);
		int M = Integer.MIN_VALUE;
		int count = 0;

		for (int i = 1; i <= P; i++) {
			for (int j = 1; j <= P; j++) {
				for (int k = 1; k <= P; k++) {

					int m = (((N % i) % j) % k) % N;
					if (m > M) {
						count = 0;
						M = m;
					}
					if (m == M) {
						count++;
					}
				}
			}
		}
		System.out.println(count);

	}
}
