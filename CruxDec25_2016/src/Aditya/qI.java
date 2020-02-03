package Aditya;

import java.util.Scanner;

public class qI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);

		int NT = s.nextInt();
		int[] arr = new int[10000];
		arr[0] = 0;
		arr[1] = 1;
		arr[2] = 2;

		for (int nt = 0; nt < NT; nt++) {
			int n = s.nextInt();
			if (n == 1 || n == 2 || n == 3) {
				System.out.println(n - 1);
				continue;
			}

			if (arr[n - 1] != 0) {
				System.out.println(arr[n - 1]);
				continue;
			} else {
				int count = 3;
				while (count != n) {
					int num = 3;
					if (check(num)) {
						arr[num] = num;
						count++;
					} else {
						arr[num] = 0;
					}
					num++;
				}
				System.out.println(arr[n - 1]);
			}
		}

	}

	public static boolean check(int N) {
		for (int i = 2; i * i <= N; i++) {
			int count = 0;
			if (N % i == 0) {
				while (N % i == 0) {
					count++;
					N /= i;
				}
				if (i % 4 == 3 && count % 2 != 0)
					return false;
			}
		}
		return N % 4 != 3;
	}

}
