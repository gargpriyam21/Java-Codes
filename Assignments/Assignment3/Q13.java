package Assignment3;

public class Q13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Take as input two numbers x and n. Write a function which calculates and returns the xn. Print the value returned.
		System.out.println(power(5, 2));

	}

	public static int power(int x, int n) {
		int z = 1;
		while (n > 0) {
			z = z * x;
			n--;
		}
		return z;
	}

}
