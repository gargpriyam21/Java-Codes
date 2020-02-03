package Aditya;

import java.util.Arrays;

public class q8ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num[] = { 5, 3, 2 };
		int rem[] = { 1, 1, 1 };
		int lcm[] = { 10, 12, 6 };

		// System.out.println(CRT(num, rem, 3));
		// System.out.println(lcm_of_array_elements(lcm));

		int result1 = CRT(num, rem, 3);
		long result2 = lcm_of_array_elements(lcm);

		System.out.println(result1 + result2);

		System.out.println(Arrays.toString(num));
		System.out.println(Arrays.toString(rem));
		System.out.println(Arrays.toString(lcm));

	}

	static int CRT(int num[], int rem[], int k) {

		int x = 1;

		while (true) {
			int j;
			for (j = 0; j < k; j++) {
				if (x % num[j] != rem[j]) {
					break;
				}
			}

			if (j == k) {
				return x;
			}

			x++;
		}

	}

	public static long lcm_of_array_elements(int[] element_array) {
		long lcm_of_array_elements = 1;
		int divisor = 2;

		while (true) {
			int counter = 0;
			boolean divisible = false;

			for (int i = 0; i < element_array.length; i++) {

				if (element_array[i] == 0) {
					return 0;
				} else if (element_array[i] < 0) {
					element_array[i] = element_array[i] * (-1);
				}
				if (element_array[i] == 1) {
					counter++;
				}

				if (element_array[i] % divisor == 0) {
					divisible = true;
					element_array[i] = element_array[i] / divisor;
				}
			}
			if (divisible) {
				lcm_of_array_elements = lcm_of_array_elements * divisor;
			} else {
				divisor++;
			}

			if (counter == element_array.length) {
				return lcm_of_array_elements;
			}
		}
	}

}
