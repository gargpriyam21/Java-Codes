package Assignment4;

import java.util.Arrays;
import java.util.Scanner;

public class Q13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = takeInput();
		Arrays.sort(arr);
		triples(arr, 10);

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

	public static void triples(int[] arr, int target) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				for (int k = 0; k < arr.length; k++) {
					if (arr[i] + arr[j] + arr[k] == target && arr[i] != arr[j] && arr[j] != arr[k] && arr[i] < arr[j]
							&& arr[j] < arr[k] && arr[i] != arr[i + 1] && arr[j] != arr[j + 1]) {
						System.out.println(arr[i] + ", " + arr[j] + " and " + arr[k]);
						break;
					}
				}
			}
		}
	}

}
