package Assignment4;

import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = takeInput();
		System.out.println("The Reverse Of The Given Array Is: ");
		Reverse(arr);

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

	public static void Reverse(int[] arr) {
		int[] arr1;
		arr1 = new int[arr.length];
		int j = arr.length - 1;
		for (int i = 0; i < arr.length; i++, j--) {
			arr1[j] = arr[i];
		}
		for (j = 0; j < arr.length; j++) {
			System.out.println(arr1[j]);
		}

	}

}
