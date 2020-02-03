package Aditya;

import java.util.Scanner;

public class q8f {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);

		int NT = s.nextInt();
		for (int nt = 0; nt < NT; nt++) {
			int N = s.nextInt();

			int[] l = new int[N];
			int[] a = new int[N];
			int[] n = new int[N];
			int[] ll = new int[N];

			for (int i = 0; i < N; i++) {
				l[i] = s.nextInt();
				a[i] = s.nextInt();
				n[i] = s.nextInt();
				ll[i] = l[i] * n[i];
			}

			System.out.println(CRT(l, a) + LCM(ll));
		}

	}

	public static int CRT(int num[], int rem[]) {
		int element = 1;
		int n = rem.length;
		while (true) {
			int i;
			for (i = 0; i < n; i++) {
				if (element % num[i] != rem[i]) {
					break;
				}
			}
			if (i == n) {
				return element;
			}
			element++;
		}
	}

	public static long LCM(int[] arr) {
		long lcm = 1;
		int d = 2;

		while (true) {
			int count = 0;
			boolean flag = false;

			for (int i = 0; i < arr.length; i++) {

				if (arr[i] == 0) {
					return 0;
				}

				if (arr[i] == 1) {
					count++;
				}

				if (arr[i] % d == 0) {
					flag = true;
					arr[i] = arr[i] / d;
				}
			}
			if (flag) {
				lcm = lcm * d;
			} else {
				d++;
			}

			if (count == arr.length) {
				return lcm;
			}
		}
	}
}
