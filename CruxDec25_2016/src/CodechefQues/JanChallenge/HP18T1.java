package CodechefQues.JanChallenge;

import java.util.ArrayList;
import java.util.Scanner;

class HP18T1 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int NOTC = s.nextInt();

		for (int n = 0; n < NOTC; n++) {
			int acount = 0, bcount = 0;
			int N = s.nextInt();
			int a = s.nextInt();
			int b = s.nextInt();
			ArrayList<Integer> arr = new ArrayList<>();

			for (int i = 0; i < N; i++) {
				int element = s.nextInt();
				arr.add(element);
			}
			if (a == b || b % a == 0) {
				System.out.println("BOB");
				continue;
			}

			for (int i = 0; i < arr.size(); i++) {
				if (arr.get(i) % a == 0) {
					arr.remove(i);
					acount++;
					i--;
				}
			}

			for (int i = 0; i < arr.size(); i++) {
				if (arr.get(i) % b == 0) {
					arr.remove(i);
					bcount++;
					i--;
				}
			}

			if (acount == 0) {
				System.out.println("ALICE");
				continue;
			}

			if (bcount == 0) {
				System.out.println("BOB");
			} else {
				System.out.println("ALICE");
			}

		}

	}

}
