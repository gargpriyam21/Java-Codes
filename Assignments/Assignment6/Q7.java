package Assignment6;

public class Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 2, 2, 3, 4, 5, 3, 9 };
		System.out.println(contains(arr, 9, 0));

	}

	public static boolean contains(int[] arr, int x, int si) {
		if (si == arr.length) {
			return false;
		}
		if (arr[si] == x) {
			return true;
		}
		return contains(arr, x, si + 1);
	}

}
