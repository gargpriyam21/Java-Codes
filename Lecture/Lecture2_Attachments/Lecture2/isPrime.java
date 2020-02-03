package Lecture2;

public class isPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N = 690;
		int divisor = 2;
		while (divisor < N) {
			if (N % divisor == 0) {
				System.out.println("Number is not prime");
				return;
			}
			divisor++;
		}
		System.out.println("Number is Prime");

	}

}
