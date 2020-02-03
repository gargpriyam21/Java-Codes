package Assignment8b;

import java.util.ArrayList;

public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean[][] board = new boolean[8][8];
		System.out.println("*******************Q5A*******************");
		System.out.println(countNQueens(board, 0));
		System.out.println("*******************Q5B*******************");
		System.out.println(getNQueens(board, 0));
		System.out.println("*******************Q5C*******************");
		printNQueens(board, 0);

	}

	public static boolean isItsafe(boolean[][] board, int row, int col) {
		boolean retVal = true;
		for (int i = row; i >= 0; i--) {
			if (board[i][col]) {
				retVal = false;
			}
		}
		for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
			if (board[i][j]) {
				retVal = false;
			}
		}
		for (int i = row, j = col; i >= 0 && j < board.length; i--, j++) {
			if (board[i][j]) {
				retVal = false;
			}
		}
		return retVal;

	}

	public static int countNQueens(boolean[][] board, int row) {
		if (row == board.length) {
			return 1;
		}
		int count = 0;
		for (int col = 0; col < board[row].length; col++) {
			if (isItsafe(board, row, col)) {
				board[row][col] = true;
				count = count + countNQueens(board, row + 1);
				board[row][col] = false;
			}
		}
		return count;
	}

	public static void printNQueens(boolean[][] board, int row) {
		if (row == board.length) {
			for (int i = 0; i < board.length; i++) {
				for (int j = 0; j < board[i].length; j++) {
					if (board[i][j]) {
						System.out.print("{" + (i + 1) + "," + (j + 1) + "} , ");
					}
				}
			}
			System.out.println();
			return;
		}
		for (int col = 0; col < board[row].length; col++) {
			if (isItsafe(board, row, col)) {
				board[row][col] = true;
				printNQueens(board, row + 1);
				board[row][col] = false;
			}
		}

	}

	public static ArrayList<String> getNQueens(boolean[][] board, int row) {
		if (row == board.length) {
			ArrayList<String> baseresult = new ArrayList<>();
			baseresult.add("");
			return baseresult;
		}
		ArrayList<String> recresult = null;
		ArrayList<String> myresult = new ArrayList<>();
		for (int col = 0; col < board[row].length; col++) {
			if (isItsafe(board, row, col)) {
				board[row][col] = true;
				recresult = getNQueens(board, row + 1);
				for (int i = 0; i < recresult.size(); i++) {
					myresult.add("{" + (row + 1) + "-" + (col + 1) + "} " + recresult.get(i));
				}
				board[row][col] = false;
			}
		}

		return myresult;
	}

}
