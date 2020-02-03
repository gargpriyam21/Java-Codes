package Extras;

public class Patt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		int row = n;
		while (row >= 0) {
			int col = 1;
			while (col <= row) {
				System.out.print("*" + "\t");
				col++;
			}
			System.out.print("\n");
			row--;
		}
		return;

	}

}
