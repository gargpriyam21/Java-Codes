package Assignment8b;

import java.util.ArrayList;

public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean[][] board = new boolean[4][4];
		System.out.println("*******************Q6A*******************");
		System.out.println(countNKnights(board, 0));
		System.out.println("*******************Q6B*******************");
		System.out.println(getNKnights(board, 0));
		System.out.println("*******************Q6C*******************");
		printNKnights(board, 0);

	}

	public static boolean isItsafe(boolean[][] board, int row, int col) {
		if (row - 2 >= 0 && col - 1 >= 0) {
			if (board[row - 2][col - 1]) {
				return false;
			}
		}
		if (row - 1 >= 0 && col - 2 >= 0) {
			if (board[row - 1][col - 2]) {
				return false;
			}
		}
		if (row - 2 >= 0 && col + 1 < board.length) {
			if (board[row - 2][col + 1]) {
				return false;
			}
		}
		if (row - 1 >= 0 && col + 2 < board.length) {
			if (board[row - 1][col + 2]) {
				return false;
			}
		}
		return true;

	}

	public static int countNKnights(boolean[][] board, int row) {
		if (row == board.length) {
			return 1;
		}
		int count = 0;
		for (int col = 0; col < board[row].length; col++) {
			if (isItsafe(board, row, col)) {
				board[row][col] = true;
				count = count + countNKnights(board, row + 1);
				board[row][col] = false;
			}
		}
		return count;
	}

	public static void printNKnights(boolean[][] board, int row) {
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
				printNKnights(board, row + 1);
				board[row][col] = false;
			}
		}

	}

	public static ArrayList<String> getNKnights(boolean[][] board, int row) {
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
				recresult = getNKnights(board, row + 1);
				for (int i = 0; i < recresult.size(); i++) {
					myresult.add("{" + (row + 1) + "-" + (col + 1) + "} " + recresult.get(i));
				}
				board[row][col] = false;
			}
		}

		return myresult;
	}

}
