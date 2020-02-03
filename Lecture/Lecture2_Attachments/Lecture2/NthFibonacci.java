package Lecture2;

public class NthFibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N = 5;
		int fn = 0, sn = 1;
		int counter = 1;
		while (counter <= N) {
			int next = fn + sn;
			fn = sn;
			sn = next;
			counter++;
		}
		System.out.println("The Nth Fibonacci is "+fn);

	}

}
