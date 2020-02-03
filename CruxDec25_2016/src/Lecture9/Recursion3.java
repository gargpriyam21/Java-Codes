package Lecture9;

import java.util.ArrayList;

public class Recursion3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(countMazePath(2, 2, 0, 0));
		System.out.println("**********************************");
		System.out.println(getMazePath(2, 2, 0, 0));
		System.out.println("**********************************");
		printMazePath(2, 2, 0, 0, "");
		System.out.println("**********************************");
		System.out.println(countMazePathD(2, 2, 0, 0));
		System.out.println("**********************************");
		System.out.println(getMazePathD(2, 2, 0, 0));
		System.out.println("**********************************");
		printMazePathD(2, 2, 0, 0, "");
		System.out.println("**********************************");
		System.out.println(appears("bdgaaarjdhbaaahf"));
		boolean[][] board = new boolean[4][4];
		System.out.println("**********************************");
		System.out.println(countNQueens(board, 0));
		System.out.println("**********************************");
		printNQueens(board, 0);
		System.out.println("**********************************");
		System.out.println(getNQueens(board, 0));

	}

	public static int countMazePath(int endRow, int endCol, int currentRow, int currentCol) {
		if (currentRow == endRow && currentCol == endCol) {
			return 1;
		}
		if (currentRow > endRow || currentCol > endCol) {
			return 0;
		}
		int count = 0;
		count = count + countMazePath(endRow, endCol, currentRow + 1, currentCol);
		count = count + countMazePath(endRow, endCol, currentRow, currentCol + 1);

		return count;
	}

	public static ArrayList<String> getMazePath(int endRow, int endCol, int currentRow, int currentCol) {
		if (currentRow == endRow && currentCol == endCol) {
			ArrayList<String> baseresult = new ArrayList<>();
			baseresult.add("");
			return baseresult;
		}
		if (currentRow > endRow || currentCol > endCol) {
			ArrayList<String> baseresult = new ArrayList<>();
			return baseresult;
		}
		ArrayList<String> myresult = new ArrayList<>();
		ArrayList<String> hResult = getMazePath(endRow, endCol, currentRow, currentCol + 1);
		ArrayList<String> vResult = getMazePath(endRow, endCol, currentRow + 1, currentCol);

		for (int i = 0; i < hResult.size(); i++) {
			myresult.add("H" + hResult.get(i));
		}
		for (int i = 0; i < vResult.size(); i++) {
			myresult.add("V" + vResult.get(i));
		}
		return myresult;
	}

	public static void printMazePath(int endRow, int endCol, int currentRow, int currentCol, String path) {
		if (currentRow == endRow && currentCol == endCol) {
			System.out.println(path);
			return;
		}
		if (currentRow > endRow || currentCol > endCol) {
			return;
		}
		printMazePath(endRow, endCol, currentRow, currentCol + 1, path + "H");
		printMazePath(endRow, endCol, currentRow + 1, currentCol, path + "V");
	}

	public static int countMazePathD(int endRow, int endCol, int currentRow, int currentCol) {
		if (currentRow == endRow && currentCol == endCol) {
			return 1;
		}
		if (currentRow > endRow || currentCol > endCol) {
			return 0;
		}
		int count = 0;
		count = count + countMazePathD(endRow, endCol, currentRow, currentCol + 1);
		count = count + countMazePathD(endRow, endCol, currentRow + 1, currentCol);
		count = count + countMazePathD(endRow, endCol, currentRow + 1, currentCol + 1);

		return count;
	}

	public static ArrayList<String> getMazePathD(int endRow, int endCol, int currentRow, int currentCol) {
		if (currentRow == endRow && currentCol == endCol) {
			ArrayList<String> baseresult = new ArrayList<>();
			baseresult.add("");
			return baseresult;
		}
		if (currentRow > endRow || currentCol > endCol) {
			ArrayList<String> baseresult = new ArrayList<>();
			return baseresult;
		}
		ArrayList<String> myresult = new ArrayList<>();
		ArrayList<String> hResult = getMazePathD(endRow, endCol, currentRow, currentCol + 1);
		ArrayList<String> vResult = getMazePathD(endRow, endCol, currentRow + 1, currentCol);
		ArrayList<String> dResult = getMazePathD(endRow, endCol, currentRow + 1, currentCol + 1);

		for (int i = 0; i < hResult.size(); i++) {
			myresult.add("H" + hResult.get(i));
		}
		for (int i = 0; i < vResult.size(); i++) {
			myresult.add("V" + vResult.get(i));
		}
		for (int i = 0; i < dResult.size(); i++) {
			myresult.add("D" + dResult.get(i));
		}
		return myresult;
	}

	public static void printMazePathD(int endRow, int endCol, int currentRow, int currentCol, String path) {
		if (currentRow == endRow && currentCol == endCol) {
			System.out.println(path);
			return;
		}
		if (currentRow > endRow || currentCol > endCol) {
			return;
		}
		printMazePathD(endRow, endCol, currentRow, currentCol + 1, path + "H");
		printMazePathD(endRow, endCol, currentRow + 1, currentCol, path + "V");
		printMazePathD(endRow, endCol, currentRow + 1, currentCol + 1, path + "D");
	}

	public static int appears(String str) {
		if (str.length() < 3) {
			return 0;
		}

		String chk = str.substring(0, 3);
		int myresult = 0;
		if (chk.equals("aaa")) {
			String ros = str.substring(3);
			int recresult = appears(ros);
			myresult = 1 + recresult;
		} else {
			String ros = str.substring(1);
			int recresult = appears(ros);
			myresult = recresult;

		}
		return myresult;
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
