package Extras;

import java.util.Scanner;

public class SUM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int[] arr1 = new int[N];
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = s.nextInt();
		}
		int n = s.nextInt();
		int[] arr2 = new int[n];
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = s.nextInt();
		}
		display(sum(arr1, arr2));
		System.out.print("END");

	}

	public static void display(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ", ");
		}
	}

	public static int[] sum(int[] one, int[] two) {
		int n;
		if (one.length == two.length && one[0] + two[0] >= 10) {
			n = one.length > two.length ? one.length + 1 : two.length + 1;
		} else {
			n = one.length > two.length ? one.length : two.length;
		}
		int[] rv = new int[n];
		int i = one.length - 1, j = two.length - 1, k = rv.length - 1;
		int carry = 0;
		while (i >= 0 && j >= 0) {
			int sum = one[i] + two[j] + carry;
			rv[k] = sum % 10;
			carry = sum / 10;
			i--;
			j--;
			k--;
		}
		while (i >= 0) {
			int sum = one[i] + carry;
			rv[k] = sum % 10;
			carry = sum / 10;
			i--;
			k--;
		}
		while (j >= 0) {
			int sum = two[j] + carry;
			rv[k] = sum % 10;
			carry = sum / 10;
			j--;
			k--;
		}
		if (carry != 0) {
			rv[0] = carry;
		}
		return rv;

	}

}
