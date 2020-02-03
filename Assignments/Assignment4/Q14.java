package Assignment4;

import java.util.Scanner;

public class Q14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = takeInput();
		int[] arr2 = takeInput();
		display(sum(arr1, arr2));

	}

	public static int[] takeInput() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter The size of the array");
		int N = s.nextInt();
		int[] retVal = new int[N];
		for (int i = 0; i < retVal.length; i++) {
			System.out.println("Please Enter the" + i + "th element");
			retVal[i] = s.nextInt();
		}
		return retVal;
	}

	public static void display(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	public static int[] sum(int[] one, int[] two) {
		int n;
		if (one.length == two.length && one[0] + two[0] >= 10) {
			n = one.length > two.length ? one.length + 1 : two.length + 1;
		} else {
			n = one.length > two.length ? one.length : two.length;
		}
		int[] rv = new int[n];
		int i = one.length - 1, j = two.length - 1, k = rv.length - 1;
		int carry = 0;
		while (i >= 0 && j >= 0) {
			int sum = one[i] + two[j] + carry;
			rv[k] = sum % 10;
			carry = sum / 10;
			i--;
			j--;
			k--;
		}
		while (i >= 0) {
			int sum = one[i] + carry;
			rv[k] = sum % 10;
			carry = sum / 10;
			i--;
			k--;
		}
		while (j >= 0) {
			int sum = two[j] + carry;
			rv[k] = sum % 10;
			carry = sum / 10;
			j--;
			k--;
		}
		if (carry != 0) {
			rv[0] = carry;
		}
		return rv;

	}

}
