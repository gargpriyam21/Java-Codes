package Lecture2;

public class Pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N = 4;
		int row = 1, col = 1;
		while (row <= N) {
			col = 1;
			while (col <= N - row) {
				System.out.print(" " + "\t");
				col++;
			}
			col = 1;
			int value = row;
			while (col <= row) {
				System.out.print(value + "\t");
				value++;
				col++;
			}
			col = 1;
			value = value - 2;
			while (col <= row - 1) {
				System.out.print(value + "\t");
				col++;
				value--;
			}
			System.out.println();
			row++;
		}

	}

}
