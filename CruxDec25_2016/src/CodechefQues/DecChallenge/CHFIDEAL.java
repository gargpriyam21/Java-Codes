package CodechefQues.DecChallenge;

import java.util.Random;
import java.util.Scanner;

class CHFIDEAL {

	public static void main(String[] args) {
		int abc[] = { 1, 2, 3 };
		Scanner s = new Scanner(System.in);
		Random r = new Random();
		int X = r.nextInt(3) + 1;
		abc[X - 1] = 0;
		System.out.println(X);
		int Y = s.nextInt();
		abc[Y - 1] = 0;
		for (int i = 0; i < 3; i++) {
			if (abc[i] != 0) {
				System.out.println(abc[i]);
			}
		}
	}
}
