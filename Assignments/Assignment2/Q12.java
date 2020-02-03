package Assignment2;

public class Q12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3;
		int row = 1;
		boolean direction = true;
		while (row != 0) {
			int col = 1;
			while (col <= n - row + 1) {
				System.out.print("*" + "\t");
				col++;
			}
			col = 1;
			while (col < row + 1) {
				System.out.print(" " + "\t");
				col++;
			}
			col = 1;
			while (col < row) {
				System.out.print(" " + "\t");
				col++;
			}
			col = 1;
			while (col <= n - row + 1) {
				System.out.print("*" + "\t");
				col++;
			}
			if (row == n) {
				direction = false;
			}
			if (direction) {
				row++;
			} else {
				row--;
			}
			System.out.println();

		}

	}

}
// *** ***
// **   **
// *     *
// **   **
// *** ***
