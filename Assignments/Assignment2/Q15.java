package Assignment2;

public class Q15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		int row = 1, value = 1;
		while (row <= n) {
			int col = 1;
			value = 1;
			while (col <= row) {
				System.out.print(value + "\t");
				col++;
				value++;
			}
			col = n;
			while (col > row) {
				System.out.print(" " + "\t");
				col--;
			}
			col = n;
			while (col > row + 1) {
				System.out.print(" " + "\t");
				col--;
			}
			if (value - 1 != n) {
				col = 1;
				value = value - 1;
				while (col <= row) {
					System.out.print(value + "\t");
					col++;
					value--;
				}
			}
			if (value - 1 == n) {
				col = 2;
				value = value - 2;
				while (col <= row) {
					System.out.print(value + "\t");
					col++;
					value--;
				}
			}
			System.out.println();
			row++;
		}

	}

}
// 1     1
// 12   21
// 123 321
// 1234321