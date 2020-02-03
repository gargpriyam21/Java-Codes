package Aditya;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		int NT = s.nextInt();

		for (int nt = 0; nt < NT; nt++) {

			int n = s.nextInt();
			ArrayList<Integer> arr = prime(n);
			if (arr.size() == 2) {
				System.out.println(Arrays.toString(arr.toArray()).replace("[", "").replace(",", "").replace("]", ""));
			} else {
				System.out.println(-1);
			}
		}
	}

	public static ArrayList<Integer> prime(int N) {

		ArrayList<Integer> arr = new ArrayList<>();

		boolean flag = false;

		while (N % 2 == 0) {
			flag = true;
			N /= 2;
		}

		if (flag) {
			arr.add(2);
		}

		for (int i = 3; i <= Math.sqrt(N); i += 2) {
			flag = false;
			while (N % i == 0) {
				flag = true;
				N /= i;
			}
			if (flag) {
				arr.add(i);
			}
		}

		if (N > 2) {
			arr.add(N);
		}

		return arr;
	}

}
