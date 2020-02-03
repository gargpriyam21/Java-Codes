package Assignment4;

import java.util.Scanner;

public class Q15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = takeInput();
		System.out.println("**************************");
		waverowprint(arr);

	}

	public static int[][] takeInput() {
		Scanner s = new Scanner(System.in);
		System.out.println("Please Enter The no. of rows ");
		int rows = s.nextInt();
		int[][] retVal = new int[rows][];
		for (int row = 0; row < retVal.length; row++) {
			System.out.println("Please Enter The no.of cols in " + row + " row");
			int cols = s.nextInt();
			retVal[row] = new int[cols];
			for (int col = 0; col < retVal[row].length; col++) {
				System.out.println("Please Enter The Data for " + row + " rows and " + col + " cols");
				retVal[row][col] = s.nextInt();
			}
		}
		return retVal;
	}

	public static void waverowprint(int[][] arr) {
		for (int row = 0; row < arr.length; row++) {
			if (row % 2 == 0) {
				for (int col = 0; col < arr[row].length; col++) {
					System.out.print(arr[row][col] + " ,");
				}
			} else {
				for (int col = arr[row].length - 1; col >= 0; col--) {
					System.out.print(arr[row][col] + " ,");
				}
			}

		}
		System.out.print("END ");
	}

}
