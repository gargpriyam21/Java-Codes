package Extras;

public class palinrecur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = { 1, 2, 2, 1 };
		System.out.println(palindrom(arr));

	}

	public static boolean palindrom(int[] arr) {
		boolean retVal = true;
		int left = 0;
		int right = arr.length - 1;
		while (left < right) {
			if (arr[left] != arr[right]) {
				retVal = false;
				break;
			}
			left++;
			right--;
		}
		return retVal;
	}

}
