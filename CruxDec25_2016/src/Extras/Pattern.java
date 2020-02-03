package Extras;

import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Scanner s = new Scanner(System.in);
		int[] arr = takeInput();
		// int e = s.nextInt();
		LinearSearch(arr);
	}

	public static int[] takeInput() {
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int[] retVal = new int[N];
		for (int i = 0; i < retVal.length; i++) {
			retVal[i] = s.nextInt();
		}
		return retVal;
	}

	public static void LinearSearch(int[] arr) {
		Scanner s = new Scanner(System.in);
		int element = s.nextInt();
		int index = -1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == element) {
				index = i;
				break;
			}
		}
		System.out.println(index);
	}
}
