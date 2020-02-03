package Assignment4;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int e = 20;
		int[] arr = takeInput();
		System.out.println("The Index Of elemint is: " + BinarySearch(arr, e));

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

	public static int BinarySearch(int[] arr, int element) {
		int left = 0, right = arr.length - 1, mid = 0;
		while (left <= right) {
			mid = (left + right) / 2;
			if (arr[mid] == element) {
				return mid;
			} else if (arr[mid] < element) {
				left = mid + 1;
			} else if (arr[mid] > element) {
				right = mid - 1;
			}
		}
		return -1;
	}

}
