package Lecture2;

public class Basics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// System.out.println(Fibonacci(5));
		// nfibonaccinos(5);
		// Pattern1(5);
		// Pattern2(5);
		Pattern3(3);
	}

	public static int Fibonacci(int n) {
		int a1 = 0, a2 = 1, i = 0, c = 0;
		while (n >= i) {
			c = a1 + a2;
			a1 = a2;
			a2 = c;
			i++;
		}
		return c;
	}

	public static void nfibonaccinos(int n) {
		int a = 0, b = 1, c = 0;
		while (n > 0) {
			c = a + b;
			a = b;
			b = c;
			System.out.println(c);
			n--;
		}
	}

	public static void Pattern1(int n) {
		int value = 0;
		for (int i = 0; i < n; i++) {
			value = 1;
			for (int j = 0; j <= i; j++) {
				System.out.print(value + "\t");
				value++;
			}
			System.out.println();
		}
	}

	public static void Pattern2(int n) {
		int value = 1;
		for (int row = 1; row <= n; row++) {
			for (int col = 1; col <= n - row; col++) {
				System.out.print("\t");
			}
			value = row;
			for (int col = 1; col <= row; col++) {
				System.out.print(value + "\t");
				value++;
			}

			value = value - 2;
			for (int col = 1; col <= row - 1; col++) {
				System.out.print(value + "\t");
				value--;
			}
			System.out.println();
		}

	}

	public static void Pattern3(int n) {
		int row = 1, col = 1;
		boolean direction = true;
		while (row != 0) {
			for (col = 1; col <= n - row; col++) {
				System.out.print("\t");
			}
			for (col = 1; col <= row; col++) {
				System.out.print("*\t");
			}
			for (col = 1; col <= row - 1; col++) {
				System.out.print("*\t");
			}
			System.out.println();
			if (row == n) {
				direction = false;
			}
			if (direction) {
				row = row + 1;
			} else {
				row = row - 1;
			}
		}
	}

}
