package Assignment3;

public class Q12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Take as input two numbers N1 and N2. Write a function which calculates and returns the LCM of two numbers. Print the value returned.
		System.out.println(LCM(18, 24));

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

	public static int LCM(int n1, int n2) {
		int lcm;
		int gcd = GCD(n1, n2);
		lcm = (n1 * n2) / gcd;
		return lcm;
	}

}
