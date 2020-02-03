package Extras;

public class avl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
		int[] arr1 = new int[arr.length];
		avv(arr, arr1, 0, arr.length - 1, 0);

		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}

	}

	public static void avv(int[] arr, int[] arr1, int first, int last, int a) {

		if (last < first) {
			return;
		}

		int mid = (first + last) / 2;
		arr1[mid] = a;

		avv(arr, arr1, first, mid - 1, arr[mid]);
		avv(arr, arr1, mid + 1, last, arr[mid]);

	}

}
