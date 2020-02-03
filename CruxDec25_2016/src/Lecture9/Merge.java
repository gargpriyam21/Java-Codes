package Lecture9;

import java.util.Scanner;

public class Merge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = takeInput();
		int[] arr2 = takeInput();
		display(merge(arr1, arr2));

	}

	public static int[] takeInput() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter The size of the array");
		int N = s.nextInt();
		int[] retVal = new int[N];
		for (int i = 0; i < retVal.length; i++) {
			System.out.println("Please Enter the" + i + "th element");
			retVal[i] = s.nextInt();
		}
		return retVal;

	}

	public static void display(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	public static int[] merge(int[] one, int[] two) {
		int i = 0, j = 0, k = 0;
		int[] arrs = new int[one.length + two.length];
		while (i < one.length && j < two.length) {
			if (one[i] < two[j]) {
				arrs[k] = one[i];
				k++;
				i++;
			} else if (two[j] < one[i]) {
				arrs[k] = two[j];
				k++;
				j++;
			} else {
				arrs[k] = one[i];
				k++;
				i++;
				arrs[k] = two[j];
				j++;
				k++;
			}
		}
		while (i < one.length) {
			arrs[k] = one[i];
			i++;
			k++;
		}
		while (j < two.length) {
			arrs[k] = two[j];
			j++;
			k++;
		}
		return arrs;

	}

}
