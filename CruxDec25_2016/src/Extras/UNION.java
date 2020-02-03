package Extras;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class UNION {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter The size of the array");
		int N = s.nextInt();
		int[] arr1 = new int[N];
		for (int i = 0; i < arr1.length; i++) {
			System.out.println("Please Enter the" + i + "th element");
			arr1[i] = s.nextInt();
		}
		Arrays.sort(arr1);
		int[] arr2 = new int[N];
		for (int i = 0; i < arr2.length; i++) {
			System.out.println("Please Enter the" + i + "th element");
			arr2[i] = s.nextInt();
		}
		Arrays.sort(arr2);
		System.out.println(merge(arr1, arr2));
	}

	public static int[] merge(int[] one, int[] two) {
		int i = 0, j = 0, k = 0;
		int[] arrs = new int[one.length + two.length];
		while (i < one.length && j < two.length) {
			if (one[i] < two[j]) {
				arrs[k] = two[i];
				k++;
				i++;
			} else if (two[j] <= one[i]) {
				arrs[k] = two[j];
				k++;
				j++;
			}
		}
		if (j == two.length) {
			while (i < one.length) {
				arrs[k] = one[i];
				i++;
				k++;
			}
		}
		if (i == one.length) {
			while (i < two.length) {
				arrs[k] = two[i];
				j++;
				k++;
			}
		}
		return arrs;

	}

}
