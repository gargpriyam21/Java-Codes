package Lecture4;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr;
		arr = new int[5];
		int i;
		for (i = 0; i <= arr.length - 1; i++) {
			arr[i] = 10 * i;
		}
		for (i = 0; i <= arr.length - 1; i++) {
			System.out.println(arr[i]);
		}

		System.out.println("*********************************************");

		i = 2;
		int j = 3;
		System.out.println("ith element " + arr[i] + " jth element " + arr[j]);
		swap(arr, i, j);
		System.out.println("ith element " + arr[i] + " jth element " + arr[j]);

		System.out.println("*********************************************");

		System.out.println(arr[i] + "," + arr[j]);
		Swap(arr[i], arr[j]);
		System.out.println(arr[i] + "," + arr[j]);

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
