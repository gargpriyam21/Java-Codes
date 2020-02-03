package Lecture5;

import java.util.Scanner;

public class TwoDArraysOps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = takeInput();
		System.out.println("**************************");
		display(arr);
		System.out.println("**************************");
		waverowprint(arr);
		System.out.println("**************************");
		wavecolprint(arr);
		System.out.println("**************************");
		spiralprint(arr);
		System.out.println("**************************");
		spiralprinta(arr);
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

	public static void display(int[][] arr) {
		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr.length; col++) {
				System.out.print(arr[row][col] + "\t");
			}
			System.out.println();
		}
	}

	public static void waverowprint(int[][] arr) {
		for (int row = 0; row < arr.length; row++) {
			if (row % 2 == 0) {
				for (int col = 0; col < arr.length; col++) {
					System.out.print(arr[row][col] + "\t");
				}
			} else {
				for (int col = arr.length - 1; col >= 0; col--) {
					System.out.print(arr[row][col] + "\t");
				}
			}
			System.out.println();
		}
	}

	public static void wavecolprint(int[][] arr) {
		for (int col = 0; col < arr.length; col++) {
			if (col % 2 == 0) {
				for (int row = 0; row < arr.length; row++) {
					System.out.print(arr[row][col] + "\t");
				}
			} else {
				for (int row = arr.length - 1; row >= 0; row--) {
					System.out.print(arr[row][col] + "\t");
				}
			}
			System.out.println();
		}
	}

	public static void spiralprint(int[][] arr) {
		int left = 0, top = 0, right = arr.length - 1, bottom = arr.length - 1;
		while (left <= right && top <= bottom) {
			int dir = 1;
			if (dir == 1) {
				for (int i = left; i <= right; i++) {
					System.out.print(arr[top][i] + " ");
				}
				dir = 2;
				top++;
			}
			if (dir == 2) {
				for (int i = top; i <= bottom; i++) {
					System.out.print(arr[i][right] + " ");
				}
				dir = 3;
				right--;
			}
			if (dir == 3) {
				for (int i = right; i >= left; i--) {
					System.out.print(arr[bottom][i] + " ");
				}
				dir = 4;
				bottom--;
			}
			if (dir == 4) {
				for (int i = bottom; i >= top; i--) {
					System.out.print(arr[i][left] + " ");
				}
				left++;
				dir = 1;
			}
		}
		System.out.println();
	}

	public static void spiralprinta(int[][] arr) {
		int left = 0, top = 0, right = arr.length - 1, bottom = arr.length - 1;
		while (left <= right && top <= bottom) {
			int dir = 1;
			if (dir == 1) {
				for (int i = top; i <= bottom; i++) {
					System.out.print(arr[i][left] + " ");
				}
				dir = 2;
				left++;
			}
			if (dir == 2) {
				for (int i = left; i <= right; i++) {
					System.out.print(arr[bottom][i] + " ");
				}
				dir = 3;
				bottom--;
			}
			if (dir == 3) {
				for (int i = bottom; i >= top; i--) {
					System.out.print(arr[i][right] + " ");
				}
				dir = 4;
				right--;
			}
			if (dir == 4) {
				for (int i = right; i >= left; i--) {
					System.out.print(arr[top][i] + " ");
				}
				top++;
				dir = 1;
			}
		}
	}
}
