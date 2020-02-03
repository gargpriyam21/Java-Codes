package Lecture2;

public class FibonacciLessThanN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N = 5;
		int fn = 0, sn = 1;
		while (fn < N) {
			System.out.print(fn + "\t");
			int next = fn + sn;
			fn = sn;
			sn = next;
		}

	}

}
