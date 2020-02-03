package Assignment6;

public class Q13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 3, 2, 0 };
		int[] arr1 = new int[arr.length];
		display(inverse(arr, arr1, 0, 0));
	}

	public static void display(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static int[] inverse(int[] arr, int[] a, int j, int i) {
		if (i == arr.length) {
			return a;
		}
		a[arr[i]] = j;
		inverse(arr, a, j + 1, i + 1);
		return a;

	}

}
