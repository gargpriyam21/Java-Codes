package Lecture4;

public class ArraysDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr;
		// System.out.println(arr);

		arr = new int[5];
		System.out.println(arr[0]);
		System.out.println(arr[4]);
		System.out.println(arr[2]);
		System.out.println("******************************************");
		// Part 2
		for (int i = 0; i <= arr.length - 1; i++) {
			System.out.println(arr[i]);
		}

		System.out.println("******************************************");

		// Part 3
		arr[0] = 10;
		arr[1] = 20;
		arr[3] = 30;

		for (int i = 0; i <= arr.length - 1; i++) {
			arr[i] = 10 * i;
		}

		for (int i = 0; i <= arr.length - 1; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("************************************");
		// Part 4 Working Swap
		int i = 2, j = 3;
		System.out.println("ith element" + arr[i] + "jth element" + arr[j]);
		swap(arr, i, j);
		System.out.println("ith element" + arr[i] + "jth element" + arr[j]);

		// part 5
		int[] two = { 10, 20, 30, 40 };
		System.out.println(two.length);

		// Part 6
		System.out.println(arr[i] + ", " + arr[j]);
		Swap(arr[i], arr[j]);
		System.out.println(arr[i] + ", " + arr[j]);

	}

	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public static void Swap(int i, int j) {
		int temp = i;
		i = j;
		j = temp;
	}

}
