package Assignment2;

public class Q11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int row = 1, col = 1;
		boolean direction = true;
		while (row != 0) {
			col = 1;
			while (col <= (n / 2) + 1 - row) {
				System.out.print(" " + "\t");
				col++;
			}
			col = 1;
			while (col <= row) {
				System.out.print("*" + "\t");
				col++;
			}
			col = 1;
			while (col <= row - 1) {
				System.out.print("*" + "\t");
				col++;
			}
			if (row == (n / 2) + 1) {
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
//     *
//   * * *
// * * * * *
//   * * *
//     *
