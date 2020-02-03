package Lecture9;

import java.util.ArrayList;

public class RecursionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(countMazePath(2, 2, 0, 0));
		System.out.println(getMazePath(2, 2, 0, 0));
		printMazePath(2, 2, 0, 0, "");

		System.out.println("**********************************");
		System.out.println(countMazeWithDiagnol(2, 2, 0, 0));
		System.out.println(getMazePathWithDiagnol(2, 2, 0, 0));
		printMazePathWithDiagnol(2, 2, 0, 0, "");

		boolean[][] board = new boolean[4][4];
		System.out.println(countNQueens(board, 0));
		printNQueens(board, 0, "");
		System.out.println(getNQueens(board, 0));

		int[] one = { 2, 6, 10, 15, 20, Integer.MAX_VALUE };
		int[] two = { 1, 4, 8, 11 , Integer.MAX_VALUE};
		System.out.println("**************************************");
		int[] retVal = merge(one, two);
		for (int i = 0; i < retVal.length; i++) {
			System.out.println(retVal[i]);
		}
	}

	public static int countMazePath(int endRow, int endCol, int currentRow, int currentCol) {

		if (currentRow == endRow && currentCol == endCol) {
			return 1;
		}

		if (currentRow > endRow || currentCol > endCol) {
			return 0;
		}

		int count = 0;
		count = count + countMazePath(endRow, endCol, currentRow, currentCol + 1);
		count = count + countMazePath(endRow, endCol, currentRow + 1, currentCol);

		return count;
	}

	public static ArrayList<String> getMazePath(int endRow, int endCol, int currentRow, int currentCol) {
		if (currentRow == endRow && currentCol == endCol) {
			ArrayList<String> baseResult = new ArrayList<>();
			baseResult.add("");
			return baseResult;
		}

		if (currentRow > endRow || currentCol > endCol) {
			ArrayList<String> baseResult = new ArrayList<>();
			return baseResult;
		}
		ArrayList<String> myResult = new ArrayList<>();

		ArrayList<String> hResult = getMazePath(endRow, endCol, currentRow, currentCol + 1);
		ArrayList<String> vResult = getMazePath(endRow, endCol, currentRow + 1, currentCol);

		for (int i = 0; i < hResult.size(); i++) {
			myResult.add("H" + hResult.get(i));
		}

		for (int i = 0; i < vResult.size(); i++) {
			myResult.add("V" + vResult.get(i));
		}

		return myResult;
	}

	public static void printMazePath(int endRow, int endCol, int currentRow, int currentCol, String path) {
		if (currentRow == endRow && currentCol == endCol) {
			System.out.println(path);
			return;
		}

		if (currentRow > endRow || currentCol > endCol) {
			return;
		}

		printMazePath(endRow, endCol, currentRow, currentCol + 1, "H" + path);
		printMazePath(endRow, endCol, currentRow + 1, currentCol, "V" + path);
	}

	public static int countMazeWithDiagnol(int endRow, int endCol, int currentRow, int currentCol) {

		if (currentRow == endRow && currentCol == endCol) {
			return 1;
		}

		if (currentRow > endRow || currentCol > endCol) {
			return 0;
		}

		int count = 0;
		count = count + countMazeWithDiagnol(endRow, endCol, currentRow, currentCol + 1);
		count = count + countMazeWithDiagnol(endRow, endCol, currentRow + 1, currentCol);
		count = count + countMazeWithDiagnol(endRow, endCol, currentRow + 1, currentCol + 1);

		return count;
	}

	public static ArrayList<String> getMazePathWithDiagnol(int endRow, int endCol, int currentRow, int currentCol) {
		if (currentRow == endRow && currentCol == endCol) {
			ArrayList<String> baseResult = new ArrayList<>();
			baseResult.add("");
			return baseResult;
		}

		if (currentRow > endRow || currentCol > endCol) {
			ArrayList<String> baseResult = new ArrayList<>();
			return baseResult;
		}
		ArrayList<String> myResult = new ArrayList<>();

		ArrayList<String> hResult = getMazePathWithDiagnol(endRow, endCol, currentRow, currentCol + 1);
		ArrayList<String> vResult = getMazePathWithDiagnol(endRow, endCol, currentRow + 1, currentCol);
		ArrayList<String> dResult = getMazePathWithDiagnol(endRow, endCol, currentRow + 1, currentCol + 1);

		for (int i = 0; i < hResult.size(); i++) {
			myResult.add("H" + hResult.get(i));
		}

		for (int i = 0; i < vResult.size(); i++) {
			myResult.add("V" + vResult.get(i));
		}
		for (int i = 0; i < dResult.size(); i++) {
			myResult.add("D" + dResult.get(i));
		}

		return myResult;
	}

	public static void printMazePathWithDiagnol(int endRow, int endCol, int currentRow, int currentCol, String path) {
		if (currentRow == endRow && currentCol == endCol) {
			System.out.println(path);
			return;
		}

		if (currentRow > endRow || currentCol > endCol) {
			return;
		}

		printMazePathWithDiagnol(endRow, endCol, currentRow, currentCol + 1, "H" + path);
		printMazePathWithDiagnol(endRow, endCol, currentRow + 1, currentCol, "V" + path);
		printMazePathWithDiagnol(endRow, endCol, currentRow + 1, currentCol + 1, "D" + path);
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

	public static void printNQueens(boolean[][] board, int row, String path) {
		if (row == board.length) {
			System.out.println(path);
			return;
		}
		int count = 0;
		for (int col = 0; col < board[row].length; col++) {
			if (isItsafe(board, row, col)) {
				board[row][col] = true;
				printNQueens(board, row + 1, path + "{" + (row + 1) + "-" + (col + 1) + "};");
				board[row][col] = false;
			}
		}

	}

	public static ArrayList<String> getNQueens(boolean[][] board, int row) {
		if (row == board.length) {
			ArrayList<String> baseResult = new ArrayList<>();
			baseResult.add("");
			return baseResult;
		}
		ArrayList<String> myResult = new ArrayList<>();
		for (int col = 0; col < board[row].length; col++) {
			if (isItsafe(board, row, col)) {
				board[row][col] = true;
				ArrayList<String> recResult = getNQueens(board, row + 1);
				for (int i = 0; i < recResult.size(); i++) {
					myResult.add("{" + (row + 1) + "-" + (col + 1) + "};" + recResult.get(i));
				}
				board[row][col] = false;
			}
		}

		return myResult;
	}

	public static boolean isItsafe(boolean[][] board, int row, int col) {

		for (int i = row; i >= 0; i--) {
			if (board[i][col] == true) {
				return false;
			}
		}

		for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
			if (board[i][j] == true) {
				return false;
			}
		}

		for (int i = row, j = col; i >= 0 && j < board.length; i--, j++) {
			if (board[i][j] == true) {
				return false;
			}
		}
		return true;

	}

	public static int[] merge(int[] one, int[] two) {
		int[] retVal = new int[one.length + two.length];
		int i = 0, j = 0, k = 0;

		while (i < one.length && j < two.length) {
			if (one[i] < two[j]) {
				retVal[k] = one[i];
				i++;
				k++;
			} else {
				retVal[k] = two[j];
				j++;
				k++;
			}
		}

		while (i < one.length) {
			retVal[k] = one[i];
			i++;
			k++;
		}
		while (j < two.length) {
			retVal[k] = two[j];
			j++;
			k++;
		}
		return retVal;
	}
}
