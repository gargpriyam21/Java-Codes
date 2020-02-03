package Assignment3;

public class Q11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Take as input two numbers N1 and N2. Write a function which calculates and returns the GCD of two numbers. Print the value returned.
		System.out.println(GCD(18, 24));

	}

	public static int GCD(int n1, int n2) {
		int dividend = n1 > n2 ? n1 : n2;
		int divisor = n1 < n2 ? n1 : n2;
		int rem = 0;
		while (dividend % divisor != 0) {
			rem = dividend % divisor;
			dividend = divisor;
			divisor = rem;
		}
		return divisor;
	}

}
