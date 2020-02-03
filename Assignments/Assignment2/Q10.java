package Assignment2;

public class Q10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		int row = 1, value1 = -1, value2 = 1,val=0;
		while (row <= n) {
			int col = 1;
			while (col <= row) {
//				System.out.print(value1);
				val = value1 + value2;
				value1 = value2;
				value2 = val;
				System.out.print(val + "\t");
				col++;
			}
			System.out.println();
			row++;
		}
		return;

	}

}
// 0
// 1 1
// 2 3 5
// 8 13 21 34