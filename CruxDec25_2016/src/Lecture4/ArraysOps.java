package Lecture4;

import java.util.Scanner;

public class ArraysOps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int e = 20;
		int[] arr = takeInput();
		display(arr);
		// Max
		int max = Max(arr);
		System.out.println("The max elemnt is " + max);
		// linear Search
		System.out.println("The Index Of elemint is: " + LinearSearch(arr, e));
		// Reverse
		System.out.println("The Reverse Of The Given Array Is: ");
		Reverse(arr);
		// Binary Search
		System.out.println("The Index Of element is: " + BinarySearch(arr, e));
		// Inverse
		System.out.println("The Inverse Of The Given Array Is: ");
		Inverse(arr);
		// Check Inverse
		System.out.println("The Inverse Of The Given Array Is: ");
		System.out.println("If The Array Is Mirror Inverse :" + ChkInverse(arr));
		// Bubble Sort
		bubblesort(arr);
		System.out.println("Output Of Bubble Sort :");
		display(arr);
		// Selection Sort
		selectionsort(arr);
		System.out.println("Output Of Selection Sort :");
		display(arr);
		// Insertion Sort
		insertionsort(arr);
		System.out.println("Output Of Insertion Sort :");
		display(arr);

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

	public static int Max(int[] arr) {
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}

	public static int LinearSearch(int[] arr, int element) {
		int index = -1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == element) {
				index = i;
				break;
			}
		}
		return index;
	}

	public static void Reverse(int[] arr) {
		int[] arr1;
		arr1 = new int[arr.length];
		int j = arr.length - 1;
		for (int i = 0; i < arr.length; i++, j--) {
			arr1[j] = arr[i];
		}
		for (j = 0; j < arr.length; j++) {
			System.out.println(arr1[j]);
		}

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

	public static void Inverse(int[] arr) {
		int[] arr1;
		int j = 0;
		arr1 = new int[arr.length];
		for (int i = 0; i < arr.length; i++, j++) {
			arr1[arr[i]] = j;
		}
		for (int k = 0; k < arr1.length; k++) {
			System.out.println(arr1[k]);
		}
	}

	public static boolean ChkInverse(int[] arr) {
		int[] chk = new int[arr.length];
		int counter = 0;
		for (int i = 0; i < arr.length; i++) {
			chk[i] = arr[i];
		}
		int[] arr1;
		int j = 0;
		arr1 = new int[arr.length];
		for (int i = 0; i < arr.length; i++, j++) {
			arr1[arr[i]] = j;
		}
		for (int k = 0; k < arr1.length; k++) {
			if (arr1[k] == chk[k]) {
				counter++;
			}
		}

		if (counter == arr.length) {
			return true;
		} else {
			return false;
		}

	}

	public static void bubblesort(int[] arr) {
		for (int i = 1; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - i; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}

	public static void selectionsort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			int min_index = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[min_index] > arr[j]) {
					min_index = j;
				}
			}
			int temp = arr[min_index];
			arr[min_index] = arr[i];
			arr[i] = temp;
		}
	}

	public static void insertionsort(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			for (int j = i; j > 0; j--) {
				if (arr[j - 1] > arr[j]) {
					int temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}

}
