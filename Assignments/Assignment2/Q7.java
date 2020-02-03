package Assignment2;

public class Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
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
// 1
// 2 3
// 4 5 6
// 7 8 9 10
