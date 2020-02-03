package Lecture2;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N = 145;
		int rev = 0;
		while (N != 0) {
			int rem = N % 10;
			rev = rev * 10 + rem;
			N = N / 10;
		}
		System.out.println("The reverse is " + rev);

	}

}
