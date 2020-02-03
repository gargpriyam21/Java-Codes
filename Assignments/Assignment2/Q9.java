package Assignment2;

public class Q9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 6;
		int row = 0;
		while (row < n) {
			int col = 0, value = 1;
			while (col <= row) {
				System.out.print(value + "\t");
				value = value * (row - col) / (col + 1);
				col++;
			}
			System.out.println();
			row++;
		}
		return;
	}

}
// 1
// 1 1
// 1 2 1
// 1 3 3 1
// 1 4 6 4 1
// 1 5 10 10 5 1