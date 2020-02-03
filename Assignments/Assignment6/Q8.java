package Assignment6;

public class Q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 2, 2, 3, 4, 5, 3 };
		System.out.println(firstindex(arr, 3, 0));

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

}
