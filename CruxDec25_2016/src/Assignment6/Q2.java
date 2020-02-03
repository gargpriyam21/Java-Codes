package Assignment6;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printPatternRecursively(5, 1, 1);

	}

	public static void printPatternRecursively(int N, int row, int col) {
		if (row > N) {
			return;
		}
		if (row < col) {
			System.out.println();
			printPatternRecursively(N, row + 1, 1);
			return;
		}
		System.out.print("*" + "\t");
		printPatternRecursively(N, row, col + 1);
	}

}
