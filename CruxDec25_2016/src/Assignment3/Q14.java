package Assignment3;

public class Q14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Take as input two numbers x and n. Write a function which calculates and returns the Logn(x) of two numbers. Print the value returned. Assume that values of x and n are such that the result is going to be a whole number.
		System.out.println(log(25, 5));

	}

	public static int log(int x, int n) {
		int counter = 0;
		while (x != 1) {
			counter++;
			x = x / n;
		}
		return counter;
	}

}
