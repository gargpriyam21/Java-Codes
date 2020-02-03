package CodechefQues.DecChallenge;

import java.util.Scanner;

class CHFINTRO {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int NOTC = s.nextInt();
		int r = s.nextInt();

		for (int i = 0; i < NOTC; i++) {
			int R = s.nextInt();
			if (R < r) {
				System.out.println("Bad boi");
			} else {
				System.out.println("Good boi");
			}
		}
	}
}
