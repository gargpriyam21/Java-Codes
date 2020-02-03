package Lecture6;

public class RecursionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PD(5);
		System.out.println("**********************");
		PI(5);
		System.out.println("**********************");
		PDI(5);
		System.out.println("**********************");
		PDIOE(5);
		System.out.println("**********************");
		System.out.println(factorial(5));
		System.out.println("**********************" + "\n" + power(5, 5));
		System.out.println("**********************" + "\n" + fib(5));
		System.out.println("**********************");
		int[] arr = { 1, 2, 2, 2, 3, 4, 5, 3 };
		System.out.println(issorted(arr, 0));
		System.out.println("**********************");
		System.out.println(contains(arr, 4, 0));
		System.out.println("**********************");
		System.out.println(firstindex(arr, 3, 0));
		System.out.println("**********************");
		System.out.println(lastindex(arr, 3, 0));
		System.out.println("**********************");
		display(allindices(arr, 2, 0, 0));
		System.out.println("\n" + "**********************");
		printPatternRecursively(4, 1, 1);
		System.out.println("\n" + "**********************");
		printPattern2Recursively(5, 0, 0, 1);

	}

	public static int fib(int num) {
		if (num == 1) {
			return 1;
		}
		if (num == 0) {
			return 0;
		}
		int fib1 = fib(num - 1);
		int fib2 = fib(num - 2);
		int fib = fib1 + fib2;
		return fib;
	}

	public static void PD(int num) {
		if (num == 0) {
			return;
		}
		System.out.println(num);
		PD(num - 1);
	}

	public static void PI(int num) {
		if (num == 0) {
			return;
		}
		PI(num - 1);
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

	public static void PDIOE(int num) {
		if (num == 0) {
			return;
		}
		if (num % 2 != 0) {
			System.out.println(num);
			PDIOE(num - 1);
		}
		if (num % 2 == 0) {
			PDIOE(num - 1);
			System.out.println(num);
		}

	}

	public static int factorial(int num) {
		int fact;
		if (num == 0) {
			return 1;
		}
		fact = num * factorial(num - 1);
		return fact;
	}

	public static void display(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static int power(int num, int p) {
		if (p == 0) {
			return 1;
		}

		return num * power(num, p - 1);
	}

	public static boolean issorted(int[] arr, int i) {
		if (i == arr.length - 1) {
			return true;
		}
		if (arr[i] > arr[i + 1]) {
			return false;
		}
		return issorted(arr, i + 1);
	}

	public static int lastindex(int[] arr, int x, int si) {
		if (si == arr.length) {
			return -1;
		}
		int index = lastindex(arr, x, si + 1);
		if (index != -1) {
			return index;
		} else {
			if (arr[si] == x) {
				return si;
			} else {
				return -1;
			}
		}
	}

	public static int firstindex(int[] arr, int x, int si) {
		if (si == arr.length) {
			return -1;
		}
		if (arr[si] == x) {
			return si;
		}
		return firstindex(arr, x, si + 1);
	}

	public static boolean contains(int[] arr, int x, int si) {
		if (si == arr.length) {
			return true;
		}
		if (arr[si] == x) {
			return true;
		}
		return contains(arr, x, si + 1);
	}

	public static int[] allindices(int[] arr, int x, int si, int count) {
		if (si == arr.length) {
			return new int[count];
		}
		int[] a = null;
		if (arr[si] == x) {
			a = allindices(arr, x, si + 1, count + 1);
		} else {
			a = allindices(arr, x, si + 1, count);
		}
		if (arr[si] == x) {
			a[count] = si;
		}
		return a;
	}

	public static void printPatternRecursively(int N, int row, int col) {
		if (row > N) {
			return;
		}
		if (row < col) {
			System.out.println();
			printPatternRecursively(N, row + 1, 1);
			return;
		}
		System.out.print("*" + "\t");
		printPatternRecursively(N, row, col + 1);
	}

	public static void printPattern2Recursively(int N, int row, int col, int value) {
		if (row > N) {
			return;
		}
		if (row < col) {
			System.out.println();
			printPattern2Recursively(N, row + 1, 0, 1);
			return;
		}
		System.out.print(value + "\t");
		value = value * (row - col) / (col + 1);
		printPattern2Recursively(N, row, col + 1, value);

	}
}
