package Lecture2;

public class Pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int row = 1, i = 1;
		while (row <= n) {
			int col = 1;
			while (col <= row) {
				System.out.print(i + "\t");
				i++;
				col++;
			}
			System.out.print("\n");
			row++;
		}
		return;
	}

}
