package Extras;

import java.util.Scanner;

class MAXEP1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int c = s.nextInt();
		int yon = 0;
		int op = 1;

		for (int i = 1; yon != 1; i++) {
			System.out.println("1 " + i);
			yon = s.nextInt();
			op = i;
		}
		System.out.println("2");
		System.out.println("3 " + op);
	}
}