package Lecture6;

public class RecusrsionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printDecreasing(5);
		System.out.println("*********************************");
		PrintIncreasing(5);
		System.out.println("*********************************");
		PDI(5);
		System.out.println("*********************************");
		PDISkip(5);
		System.out.println("*********************************");
		System.out.println(factorial(0));
		System.out.println("*********************************");
		System.out.println(power(2, 5));
		System.out.println("*********************************");
		System.out.println(fibonacci(5));
		System.out.println("*********************************");
		int[] arr = { 1, 2, 3, 4, 5, 60 };
		System.out.println(isSorted(arr, 0));
		System.out.println("*********************************");
		System.out.println(contains(arr, 95, 0));
		System.out.println("*********************************");
		int[] arr1 = { 1, 2, 2, 2, 3, 4, 5, 3 };
		System.out.println(firstIndex(arr1, 10, 0));
		System.out.println("*********************************");
		System.out.println(lastIndex(arr1, 90, 0));
		System.out.println("*********************************");
		int[] retVal = allIndices(arr1, 2, 0, 0);
		for (int i = 0; i < retVal.length; i++) {
			System.out.print(retVal[i] + " ");
		}
		System.out.println();
		System.out.println("*********************************");
		PrintPatternRecursively(4, 1, 1);
		System.out.println("*********************************");
		PrintPascalRecursively(4, 0, 0, 1);
	}

	public static void printDecreasing(int num) {
		if (num == 0) {
			return;
		}
		System.out.println(num);
		printDecreasing(num - 1);
	}

	public static void PrintIncreasing(int num) {

		if (num == 0) {
			return;
		}
		PrintIncreasing(num - 1);
		System.out.println(num);
	}

	public static void PDI(int num) {
		if (num == 0) {
			return;
		}
		System.out.println(num);
		PDI(num - 1);
		System.out.println(num);
	}

	public static void PDISkip(int num) {
		if (num == 0) {
			return;
		}
		if (num % 2 != 0) {
			System.out.println(num);
		}
		PDISkip(num - 1);
		if (num % 2 == 0) {
			System.out.println(num);
		}
	}

	public static int factorial(int num) {

		if (num == 0) {
			return 1;
		}
		int fnm1 = factorial(num - 1);
		int fact = num * fnm1;
		return fact;
	}

	public static int power(int x, int n) {
		if (n == 0) {
			return 1;
		}

		int xpnm1 = power(x, n - 1);
		int xpn = x * xpnm1;
		return xpn;

	}

	public static int fibonacci(int num) {
		if (num == 0 || num == 1) {
			return num;
		}

		int fibnm1 = fibonacci(num - 1);
		int fibnm2 = fibonacci(num - 2);
		int fib = fibnm1 + fibnm2;
		return fib;
	}

	public static boolean isSorted(int[] arr, int si) {
		if (si == arr.length - 1) {
			return true;
		}
		if (arr[si] > arr[si + 1]) {
			return false;
		} else {
			boolean flag = isSorted(arr, si + 1);
			return flag;
		}
	}

	public static boolean contains(int[] arr, int num, int si) {
		if (si == arr.length) {
			return false;
		}

		if (arr[si] == num) {
			return true;
		} else {
			boolean contain = contains(arr, num, si + 1);
			return contain;
		}

	}

	public static int firstIndex(int[] arr, int num, int si) {
		if (si == arr.length) {
			return -1;
		}

		if (arr[si] == num) {
			return si;
		} else {
			int index = firstIndex(arr, num, si + 1);
			return index;
		}

	}

	public static int lastIndex(int[] arr, int num, int si) {
		if (si == arr.length) {
			return -1;
		}

		int index = lastIndex(arr, num, si + 1);
		if (index != -1) {
			return index;
		} else {
			if (arr[si] == num) {
				return si;
			} else {
				return -1;
			}
		}

	}

	public static int[] allIndices(int[] arr, int num, int si, int count) {
		if (arr.length == si) {
			return new int[count];
		}
		int[] indices = null;
		if (arr[si] == num) {
			indices = allIndices(arr, num, si + 1, count + 1);
		} else {
			indices = allIndices(arr, num, si + 1, count);
		}
		if (arr[si] == num) {
			indices[count] = si;
		}
		return indices;

	}

	public static void PrintPatternRecursively(int N, int row, int col) {
		if (row > N) {
			return;
		}
		if (col > row) {
			System.out.println();
			PrintPatternRecursively(N, row + 1, 1);
			return;
		}

		System.out.print("*" + "\t");
		PrintPatternRecursively(N, row, col + 1);
	}

	public static void PrintPascalRecursively(int N, int row, int col, int value) {
		if (row == N) {
			return;
		}
		if (col > row) {
			System.out.println();
			PrintPascalRecursively(N, row + 1, 0, 1);
			return;
		}

		System.out.print(value + "\t");
		PrintPascalRecursively(N, row, col + 1, (value * (row - col)) / (col + 1));
	}
}
