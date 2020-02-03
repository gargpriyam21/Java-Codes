package CodechefQues.DecChallenge;

import java.util.Scanner;

class MAXEP {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int c = s.nextInt();
		int start = 0, end = N;
		int money = 1000;

		System.out.println("1 1");
		if (s.nextInt() == 1) {
			System.out.println("2");
			System.out.println("3 1");
			return;
		}

		while (true) {
			int mid = (start + end) / 2;
			if (start + 1 == end) {
				System.out.println("3 " + (mid + 1));
				break;
			}
			System.out.println("1 " + mid);
			money -= 1;
			int yon = s.nextInt();
			if (yon == 0) {
				start = mid;
			} else if (yon == 1) {
				System.out.println("2");
				money -= c;
				end = mid;
			} else if (yon == -1) {
				break;
			}
			if (money == 0) {
				break;
			}
		}
	}
}
