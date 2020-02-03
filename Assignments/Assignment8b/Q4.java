package Assignment8b;

import java.util.ArrayList;

public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("*******************Q4A*******************");
		System.out.println(countMazePathD(2, 2, 0, 0));
		System.out.println("*******************Q4B*******************");
		System.out.println(getMazePathD(2, 2, 0, 0));
		System.out.println("*******************Q4C*******************");
		printMazePathD(2, 2, 0, 0, "");

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
		if (currentCol == currentRow) {
			count = count + countMazePathD(endRow, endCol, currentRow + 1, currentCol + 1);
		}

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

		for (int i = 0; i < hResult.size(); i++) {
			myresult.add("H" + hResult.get(i));
		}
		for (int i = 0; i < vResult.size(); i++) {
			myresult.add("V" + vResult.get(i));
		}
		if (currentCol == currentRow) {
			ArrayList<String> dResult = getMazePathD(endRow, endCol, currentRow + 1, currentCol + 1);
			for (int i = 0; i < dResult.size(); i++) {
				myresult.add("D" + dResult.get(i));
			}
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
		if (currentCol == currentRow) {
			printMazePathD(endRow, endCol, currentRow + 1, currentCol + 1, path + "D");
		}
	}

}
