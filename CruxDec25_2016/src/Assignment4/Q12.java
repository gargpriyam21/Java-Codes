package Assignment4;

import java.util.Arrays;
import java.util.Scanner;

public class Q12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = takeInput();
		Arrays.sort(arr);
		doubles(arr, 5);

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

	public static void doubles(int[] arr, int target) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] + arr[j] == target && arr[i] < arr[j] && arr[i] != arr[i + 1]) {
					System.out.println(arr[i] + " and " + arr[j]);
					break;
				}
			}
		}
	}

}
