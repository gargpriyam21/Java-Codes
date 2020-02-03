package Assignment6;

public class Q10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 2, 2, 3, 4, 5, 3 };
		display(allindices(arr, 2, 0, 0));

	}

	public static void display(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
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

}
