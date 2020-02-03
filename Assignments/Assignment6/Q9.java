package Assignment6;

public class Q9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 2, 2, 3, 4, 5, 3 };
		System.out.println(lastindex(arr, 3, 0));

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

}
