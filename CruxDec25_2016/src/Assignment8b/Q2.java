package Assignment8b;

import java.util.ArrayList;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("*******************Q2A*******************");
		System.out.println(countMazePath(2, 2, 0, 0));
		System.out.println("*******************Q2B*******************");
		System.out.println(getMazePath(2, 2, 0, 0));
		System.out.println("*******************Q2C*******************");
		printMazePath(2, 2, 0, 0, "");

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

}
