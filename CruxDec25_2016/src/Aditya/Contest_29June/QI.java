package Aditya.Contest_29June;

import java.util.Arrays;
import java.util.Scanner;

public class QI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);

		int T = s.nextInt();

		// System.out.println(Math.exp(Math.pow(T, (0.1))));
		for (int t = 0; t < T; t++) {
			double n = s.nextDouble();

			int iy = 4;

			int IY = (int) n >> (int) Math.exp(Math.pow(n, (0.1)));

			System.out.println(Math.exp(Math.pow(14, (0.1))));

			System.out.println(IY);
		}

	}

}
