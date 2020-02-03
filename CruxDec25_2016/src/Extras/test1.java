package Extras;

import java.util.Scanner;

public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = takeInput();
		System.out.println("*********************");
		SpiralPrint(arr);
	}

	public static int[][] takeInput() {

		Scanner s = new Scanner(System.in);
		System.out.println("Please eneter the no of rows");
		int rows = s.nextInt();
		int[][] retVal = new int[rows][];
		for (int row = 0; row < retVal.length; row++) {
			System.out.println("Please enter the no of cols in " + row + "row");
			int cols = s.nextInt();
			retVal[row] = new int[cols];
			for (int col = 0; col < retVal[row].length; col++) {
				System.out.println("Please enter the data for " + row + "row" + "and" + col + "col");
				retVal[row][col] = s.nextInt();

			}

		}

		return retVal;
	}

	public static void SpiralPrint(int[][] arr) {
		int direction = 1;
		int top = 0;
		int bottom = arr.length - 1;
		int left = 0;
		int right = arr[0].length - 1;

		while (left <= right && top <= bottom) {
			if (direction == 1) {
				for (int i = left; i <= right; i++) {
					System.out.print(arr[top][i] + " ");
				}
				direction = 2;
				top++;
			}
			if (direction == 2) {
				for (int i = top; i <= bottom; i++) {
					System.out.print(arr[i][right] + " ");
				}
				direction = 3;
				right--;
			}
			if (direction == 3) {
				for (int i = right; i >= left; i--) {
					System.out.print(arr[bottom][i] + " ");
				}
				direction = 4;
				bottom--;
			}
			if (direction == 4) {
				for (int i = bottom; i >= top; i--) {
					System.out.print(arr[i][left] + " ");
				}
				direction = 1;
				left++;
			}

		}
	}

}
