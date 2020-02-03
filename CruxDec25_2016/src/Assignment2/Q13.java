package Assignment2;

public class Q13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		int row = 1, col = 1, value = 1;
		while (row <= n) {
			col = 1;
			while (col <= n - row) {
				System.out.print(" " + "\t");
				col++;
			}
			value = row;
			col = 1;
			while (col <= row) {
				System.out.print(value + "\t");
				value++;
				col++;
			}
			value = value - 2;
			col = 1;
			while (col <= row - 1) {
				System.out.print(value + "\t");
				value--;
				col++;
			}
			System.out.println("");
			row++;

		}
		return;

	}

}
//      1
//    2 3 2
//  3 4 5 4 3
//4 5 6 7 6 5 4
