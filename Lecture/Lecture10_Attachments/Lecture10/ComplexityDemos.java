package Lecture10;

public class ComplexityDemos {
	public static long start = 0;
	public static long end = 0;

	public static void startAlgo() {
		start = System.currentTimeMillis();
	}

	public static long endAlgo() {
		end = System.currentTimeMillis();
		return end - start;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Part 1 MergeSort
		// int[] arr = { 5, 8, 1, 3, 4, 6 };
		// int[] sortedArray = mergeSort(arr, 0, arr.length - 1);
		// for (int i = 0; i < sortedArray.length; i++) {
		// System.out.println(sortedArray[i]);
		// }

		// Part 2 Quicksort
		// quicksort(arr, 0, arr.length - 1);
		// display(arr);
		// int N = 1000000;
		// int[] arr = new int[N];
		// for (int i = 0; i < arr.length; i++) {
		// arr[i] = N - i;
		// }
		// startAlgo();
		// mergeSort(arr, 0, arr.length - 1);
		// System.out.println("The Merge sort took " + endAlgo() + "
		// milliseconds");
		//
		// for (int i = 0; i < arr.length; i++) {
		// arr[i] = N - i;
		// }
		// startAlgo();
		// BubbleSort(arr);
		// System.out.println("The Bubble sort took " + endAlgo() + "
		// milliseconds");

		System.out.println(getPolyVal(1, 1000));
		startAlgo();
		System.out.println(powerBtr(1, 10000000));
		System.out.println("The power better took " + endAlgo() + " milliseconds");

		startAlgo();
		System.out.println(Power(1, 10000000));
		System.out.println("The power normal took " + endAlgo() + " milliseconds");

		startAlgo();
		SOE(1000000);
		System.out.println("The Sieve took " + endAlgo() + " milliseconds");
		
		startAlgo();
		printPrime(1000000);
		System.out.println("The print prime normal took " + endAlgo() + " milliseconds");
	}

	public static int[] mergeSort(int[] arr, int low, int high) {
		if (low == high) {
			int[] baseResult = new int[1];
			baseResult[0] = arr[low];
			return baseResult;
		}
		int mid = (low + high) / 2;
		int[] fHalf = mergeSort(arr, low, mid);
		int[] sHalf = mergeSort(arr, mid + 1, high);

		int[] sortedArray = merge(fHalf, sHalf);

		return sortedArray;
	}

	public static int[] merge(int[] one, int[] two) {
		int[] retVal = new int[one.length + two.length];
		int i = 0, j = 0, k = 0;

		while (i < one.length && j < two.length) {
			if (one[i] < two[j]) {
				retVal[k] = one[i];
				i++;
				k++;
			} else {
				retVal[k] = two[j];
				j++;
				k++;
			}
		}

		while (i < one.length) {
			retVal[k] = one[i];
			i++;
			k++;
		}
		while (j < two.length) {
			retVal[k] = two[j];
			j++;
			k++;
		}
		return retVal;
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

	public static int getPolyVal(int x, int n) {
		int retVal = 0;
		int pox = x;
		while (n != 0) {
			retVal = retVal + pox * n;
			pox = pox * x;
			n--;
		}
		return retVal;
	}

	public static int Power(int x, int n) {
		int retVal = 1;
		while (n != 0) {
			retVal = retVal * x;
			n--;
		}
		return retVal;

	}

	public static int powerBtr(int x, int n) {

		if (n == 0) {
			return 1;
		}
		int powerN = 1;
		if (n % 2 == 0) {
			int powernb2 = powerBtr(x, n / 2);
			powerN = powernb2 * powernb2;
		} else {
			int powernb2 = powerBtr(x, n / 2);
			powerN = powernb2 * powernb2 * x;
		}
		return powerN;
	}

	public static void SOE(int N) {
		boolean[] primes = new boolean[N + 1];
		for (int i = 0; i < primes.length; i++) {
			primes[i] = true;
		}

		int n2test = 2;
		while (n2test * n2test <= N) {
			if (primes[n2test] == true) {
				for (int multiplier = 2; multiplier * n2test <= N; multiplier++) {
					primes[n2test * multiplier] = false;
				}
			}
			n2test++;
		}
		for (int i = 2; i < primes.length; i++) {
			if (primes[i] == true) {
				//System.out.println(i);
			}
		}
	}

	public static void printPrime(int N) {
		int counter = 2;
		boolean flag = true;
		while (counter <= N) {
			flag = true;
			int divisor = 2;
			while (divisor < counter) {
				if (counter % divisor == 0) {
					flag = false;
					break;
				}
				divisor++;
			}
			if (flag == true) {
				//System.out.println(counter);
			}
			counter++;
		}
	}
	
	public static String getConcatenatedValues(int N) {
		String retVal = "";

		for (int i = 0; i <= N; i++) {
			retVal = retVal + i + "\n";
		}

		return retVal;
	}

	public static String getConcatenatedValuesBtr(int N) {
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i <= N; i++) {
			sb.append(i + "\n");
		}

		return sb.toString();
	}

	public static void display(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
