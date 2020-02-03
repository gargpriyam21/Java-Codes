package Lecture5;

public class TwoDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr;
		arr = new int[3][3];
		display(arr);
	}

	public static void display(int[][] arr) {
		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr.length; col++) {
				System.out.print(arr[row][col] + "\t");
			}
			System.out.println("\n");
		}
	}

}
