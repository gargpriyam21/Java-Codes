package Assignment6;

public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 2, 2, 3, 4, 5, 3 };
		System.out.println(issorted(arr, 0));

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
}
