package Lecture5;

public class TwoDArraysDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr;
		// System.out.println(arr);
		//arr = new int[3][3];
		//display(arr);
		
		//arr=new int[][3];
		arr=new int[3][];
		
		
	}

	public static void display(int[][] arr) {
		for (int row = 0; row <= arr.length - 1; row++) {
			for (int col = 0; col < arr.length; col++) {
				System.out.print(arr[row][col] + "\t");
			}
			System.out.println();
		}
	}

}
