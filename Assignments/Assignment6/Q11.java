package Assignment6;

public class Q11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 2, 2, 1 };
		System.out.println(palindrom(arr, 0, arr.length - 1));

	}

	public static boolean palindrom(int[] arr, int left, int right) {
		if (left == arr.length) {
			return true;
		}
		if (arr[left] != arr[right]) {
			return false;
		}

		return palindrom(arr, left + 1, right - 1);
	}

}
