package Assignment6;

public class Q14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 12, 34, 33, 1, 32, 45, 12, 89, 67, 17 };
		display(bubblesort(arr, 1, 0));

	}

	public static void display(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static int[] bubblesort(int[] arr, int i, int j) {
		if (i == arr.length) {
			return arr;
		}
		if (j == arr.length - i) {
			bubblesort(arr, i + 1, 0);
			return arr;
		}
		if (arr[j] > arr[j + 1]) {
			int temp = arr[j];
			arr[j] = arr[j + 1];
			arr[j + 1] = temp;
		}
		bubblesort(arr, i, j + 1);
		return arr;
	}

}
