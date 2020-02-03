package Extras;

public class SortingUsingRec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 40, 50, 55, 60, 65, 70, 75, 10 };
		display(arr);
		// Bubble Sort
		// bubblesort(arr);
		// System.out.println("Output Of Bubble Sort :");
		// display(arr);
		// bubblesortR(arr, 1, 0);
		// System.out.println("Output Of Bubble Sort Using Recursion:");
		// display(arr);
		// // Selection Sort
		// selectionsort(arr);
		// System.out.println("Output Of Selection Sort :");
		// display(arr);
		// selectionsortR(arr, 0, 1, 0);
		// System.out.println("Output Of Selection Sort Using Recursion:");
		// display(arr);
		// // Insertion Sort
		// insertionsort(arr);
		// System.out.println("Output Of Insertion Sort :");
		// display(arr);
		insertionsortR(arr, 1, 1);
		System.out.println("Output Of Insertion Sort Using Recursion:");
		display(arr);

	}

	public static void display(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
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

	public static int[] bubblesortR(int[] arr, int i, int j) {
		if (i == arr.length) {
			return arr;
		}
		if (j == arr.length - i) {
			bubblesortR(arr, i + 1, 0);
			return arr;
		}
		if (arr[j] > arr[j + 1]) {
			int temp = arr[j];
			arr[j] = arr[j + 1];
			arr[j + 1] = temp;
		}
		bubblesortR(arr, i, j + 1);
		return arr;
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

	public static int[] selectionsortR(int[] arr, int i, int j, int min_index) {
		if (i == arr.length) {
			return arr;
		}

		if (j != arr.length && arr[min_index] > arr[j]) {
			selectionsortR(arr, i, j + 1, j);
			return arr;
		}
		if (j == arr.length) {
			int temp = arr[min_index];
			arr[min_index] = arr[i];
			arr[i] = temp;
			selectionsortR(arr, i + 1, i + 1, i + 1);
			return arr;
		}
		selectionsortR(arr, i, j + 1, min_index);
		return arr;
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

	public static int[] insertionsortR(int[] arr, int i, int j) {
		if (i == arr.length) {
			return arr;
		}
		if (j == 0) {
			insertionsortR(arr, i + 1, i + 1);
			return arr;
		}
		if (arr[j - 1] > arr[j]) {
			int temp = arr[j - 1];
			arr[j - 1] = arr[j];
			arr[j] = temp;
		}
		insertionsortR(arr, i, j - 1);
		return arr;
	}

}
