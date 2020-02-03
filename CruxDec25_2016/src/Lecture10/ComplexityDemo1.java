package Lecture10;

public class ComplexityDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 5, 8, 1, 3, 4, 6 };
		// Part 1 Merge Sort
		display(mergeSort(arr, 0, arr.length - 1));
		// Part 2 Quick Sort
		System.out.println("*****************************");
		quicksort(arr, 0, arr.length - 1);
		display(arr);
		System.out.println("*****************************");
		System.out.println(polynomial(2, 3));
		System.out.println("*****************************");
		System.out.println(power(2, 10));
	}

	public static void display(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	public static int[] mergeSort(int[] arr, int low, int high) {
		if (low == high) {
			int[] baseresult = new int[1];
			baseresult[0] = arr[low];
			return baseresult;
		}
		int mid = (low + high) / 2;
		int[] fhalf = mergeSort(arr, low, mid);
		int[] shalf = mergeSort(arr, mid + 1, high);

		int[] SortedArray = merge(fhalf, shalf);

		return SortedArray;
	}

	public static int[] merge(int[] one, int[] two) {
		int i = 0, j = 0, k = 0;
		int[] arrs = new int[one.length + two.length];
		while (i < one.length && j < two.length) {
			if (one[i] < two[j]) {
				arrs[k] = one[i];
				k++;
				i++;
			} else if (two[j] < one[i]) {
				arrs[k] = two[j];
				k++;
				j++;
			} else {
				arrs[k] = one[i];
				k++;
				i++;
				arrs[k] = two[j];
				j++;
				k++;
			}
		}
		while (i < one.length) {
			arrs[k] = one[i];
			i++;
			k++;
		}
		while (j < two.length) {
			arrs[k] = two[j];
			j++;
			k++;
		}
		return arrs;

	}

	public static void quicksort(int[] arr, int low, int high) {
		if (low >= high) {
			return;
		}

		int mid = (low + high) / 2;
		int pivot = arr[mid];
		int left = low, right = high;

		while (left <= right) {
			while (arr[left] < pivot) {
				left++;
			}
			while (arr[right] > pivot) {
				right--;
			}
			if (left <= right) {
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
				left++;
				right--;
			}
		}
		quicksort(arr, low, right);
		quicksort(arr, left, high);
	}

	public static int polynomial(int x, int n) {
		int retVal = 0;
		int pox = x;
		while (n != 0) {
			retVal = retVal + pox * n;
			pox = pox * x;
			n--;
		}

		return retVal;
	}

	public static int power(int x, int n) {
		if (n == 0) {
			return 1;
		}
		int powerN = 1;
		if (n % 2 == 0) {
			int powernb2 = power(x, n / 2);
			powerN = powernb2 * powernb2;
		} else {
			int powernb2 = power(x, n / 2);
			powerN = powernb2 * powernb2 * x;
		}

		return powerN;
	}

	public static void SOE(int n) {
		boolean[] primes = new boolean[n + 1];
		for (int i = 0; i < primes.length; i++) {

		}
	}
}
