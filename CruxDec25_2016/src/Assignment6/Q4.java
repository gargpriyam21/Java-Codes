package Assignment6;

public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printPattern2Recursively(5, 0, 0, 1);

	}

	public static void printPattern2Recursively(int N, int row, int col, int value) {
		if (row > N) {
			return;
		}
		if (row < col) {
			System.out.println();
			printPattern2Recursively(N, row + 1, 0, 1);
			return;
		}
		System.out.print(value + "\t");
		value = value * (row - col) / (col + 1);
		printPattern2Recursively(N, row, col + 1, value);

	}

}
