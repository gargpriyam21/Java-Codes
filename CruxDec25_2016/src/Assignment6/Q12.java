package Assignment6;

public class Q12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 2, 2, 3, 4, 5, 3 };
		int[] arr1 = new int[arr.length];
		display(reverse(arr, arr1, arr.length - 1, 0));

	}

	public static void display(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static int[] reverse(int[] arr, int[] a, int j, int i) {
		if (i == arr.length) {
			return a;
		}
		a[j] = arr[i];
		reverse(arr, a, j - 1, i + 1);
		return a;

	}

}
