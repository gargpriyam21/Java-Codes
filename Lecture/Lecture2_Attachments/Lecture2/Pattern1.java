package Lecture2;

public class Pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N = 4;
		int row = 1, col = 1;
		int value = 1;
		while (row <= N) {
			col = 1;
			while (col <= row) {
				System.out.print(value + "\t");
				value++;
				col++;
			}
			System.out.println();
			row = row + 1;

		}

	}

}
