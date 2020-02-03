package Lecture4;

import java.awt.DisplayMode;
import java.util.Scanner;

public class ArraysOps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = takeInput();
		display(arr);
		// int max = Max(arr);
		// System.out.println("Max element is " + max);
		// System.out.println(LinearSearch(arr, 50));
		// System.out.println(BinarySearch(arr, 20));
		// BubbleSort(arr);
		// System.out.println("Output of Bubble Sort");
		// display(arr);
		// System.out.println("Output of Selection Sort");
		// SelectionSort(arr);
		// display(arr);
		System.out.println("**************************************");
		InsertionSort(arr);
		display(arr);
	}

	public static int[] takeInput() {
		Scanner s = new Scanner(System.in);
		System.out.println("Please Enter the size of the array");
		int N = s.nextInt();
		int[] retVal = new int[N];
		for (int i = 0; i < retVal.length; i++) {
			System.out.println("Please enter the " + i + "th element");
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
			if (element == arr[i]) {
				index = i;
				break;
			}
		}
		return index;
	}

	public static int BinarySearch(int[] arr, int element) {
		int index = -1;
		int left = 0;
		int right = arr.length - 1;
		while (left <= right) {
			int mid = (left + right) / 2;
			if (arr[mid] == element) {
				index = mid;
				break;
			}
			if (arr[mid] < element) {
				left = mid + 1;
			}
			if (arr[mid] > element) {
				right = mid - 1;
			}
		}
		return index;
	}

	public static void BubbleSort(int[] arr) {
		for (int i = 1; i <= arr.length - 1; i++) {
			for (int j = 0; j < arr.length - i; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}

	public static void SelectionSort(int[] arr) {
		int min_index = 0;

		for (int i = 0; i < arr.length - 1; i++) {
			min_index = i;
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

	public static void InsertionSort(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			for (int j = i; j > 0; j--) {
				if (arr[j] < arr[j - 1]) {
					int temp = arr[j];
					arr[j] = arr[j - 1];
					arr[j - 1] = temp;
				}
			}
		}
	}

}
