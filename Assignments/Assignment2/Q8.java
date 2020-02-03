package Assignment2;

public class Q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int row = 1, value = 1;
		while (row <= n) {
			int col = 1;
			while (col == 1) {
				System.out.print(value + "\t");
				value++;
				col++;
			}
			while (col != 1 && col < row) {
				System.out.print("0" + "\t");
				col++;
			}
			while (col == row) {
				System.out.print(value - 1 + "\t");
				col++;
			}
			System.out.print("\n");
			row++;
		}
		return;
	}

}
// 1
// 2 2
// 3 0 3
// 4 0 0 4
// 5 0 0 0 5