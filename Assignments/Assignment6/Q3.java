package Assignment6;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		printPatternRecursively(6, 6, 1);
	}

	public static void printPatternRecursively(int N, int row, int col) {
		if (row < 0) {
			return;
		}
		if (row < col) {
			System.out.println();
			printPatternRecursively(N, row - 1, 1);
			return;
		}
		System.out.print("*" + "\t");
		printPatternRecursively(N, row, col + 1);
	}

}
